package ru.vniief.bpms.codepractice.api;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.File;
import java.io.FileReader;

import com.google.gson.Gson;

/**
 *
 * This class provides access to EcoreJsonModel.
 * This class supports PropertyChangeListener that notifies when model has been changed
 */
public enum EcoreTableModelProvider {
    INSTANCE;

    public static final String JSON_EMF_MODEL = "jsonEmfModel";
    private EcoreJsonModel model;
    private PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    private EcoreTableModelProvider() {
        model = new EcoreJsonModel(new EPackage());
    }

    /**
     * @return EcoreJsonModel
     */
    public EcoreJsonModel getModel() {
        return model;
    }

    /**
     * Updates model by reading JSON file
     * @param file - specifies a file for JSON to be read
     */
    public void updateModel(File file) {
        model.setEpackage(readJSON(file));
        propertyChangeSupport.firePropertyChange(JSON_EMF_MODEL, null, this.model);
    }

    /**
     * Adds addPropertyChangeListener to subscriber to be notified when change occurred
     * @param propertyName - name of property to watch for
     * @param listener - a PropertyChangeListener to be invoked when even occurred
     */
    public void addPropertyChangeListener(String propertyName, PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(propertyName, listener);
    }

    /**
     * Removes PropertyChangeListener to the list of subscribers
     * @param listener PropertyChangeListener to be removed from the list of subscribers
     */
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }

    private EPackage readJSON(File file) {
        Gson gson = new Gson();

        EPackage ePackage = new EPackage();

        try(FileReader fileReader = new FileReader(file)) {
            ePackage = gson.fromJson(fileReader, EPackage.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ePackage;
    }
}
