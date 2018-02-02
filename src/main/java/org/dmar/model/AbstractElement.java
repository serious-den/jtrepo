package org.dmar.model;

import org.dmar.model.uiElements.IElement;
import org.dmar.model.uiElements.UiManager;

import java.util.Map;

/**
 * @author Den
 * @version 1.0
 * @created 16-���-2012 17:00:30
 */
public abstract class AbstractElement implements IElement {

	private String name;
	private Map properties;
	private UiManager uiManager;

	public AbstractElement(){

	}

	public void finalize() throws Throwable {

	}

	public String getElementName(){
		return "";
	}

    public Map getProperties() {
        return properties;
    }

    public void setProperties(Map properties) {
        this.properties = properties;
    }

    public UiManager getUiManager() {
        return uiManager;
    }

    public void setUiManager(UiManager uiManager) {
        this.uiManager = uiManager;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}