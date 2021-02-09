package ru.vniief.bpms.codepractice.datatransfer.ui.wizards;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IExportWizard;
import org.eclipse.ui.IWorkbench;
import org.emfjson.jackson.resource.JsonResourceFactory;

import ru.vniief.bpms.codepractice.api.EcoreTableModelProvider;


public class ExportJsonWizard extends Wizard implements IExportWizard {
    public final String STATUS_FAILED_MESSAGE = "Failed to export";
    public final String UTF8 = "UTF-8";
    public final String ECORE_FILE_EXTENTION = ".ecore";
    public final String JSON_FILE_EXTENTION = ".json";

    private ExportJsonWizardPage page;


    @Override
    public void init(IWorkbench workbench, IStructuredSelection selection) {
        page = new ExportJsonWizardPage();
    }

    @Override
    public void addPages() {
        addPage(page);
        super.addPages();
    }

    @Override
    public boolean performFinish() {
        File file = page.getFile();
        try {
            File exportFile = emfToJson(file);
            EcoreTableModelProvider.INSTANCE.updateModel(exportFile);
        }  catch (IOException e) {
            InvocationTargetException ite = new InvocationTargetException(e);
            new ReportInvocationTarget(this::getWindowTitle, this::getShell, STATUS_FAILED_MESSAGE).accept(ite);
            return false;
        }
        return true;
    }

    private File emfToJson(File file) throws IOException {
        XMIResource resource = new XMIResourceImpl();
        resource.load(new FileInputStream(file), new HashMap<>());

        ResourceSet resourceSet = new ResourceSetImpl();
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new JsonResourceFactory());

        File jsonFile = new File(file.getPath().replace(ECORE_FILE_EXTENTION, JSON_FILE_EXTENTION));

        URI uri = URI.createFileURI(jsonFile.getPath());
        Resource res = resourceSet.createResource(uri);
        res.getContents().addAll(EcoreUtil.copyAll(resource.getContents()));

        Map<Object, Object> options = new HashMap<>();
        options.put(XMLResource.OPTION_ENCODING, UTF8);

        res.save(options);

        return jsonFile;
    }
}
