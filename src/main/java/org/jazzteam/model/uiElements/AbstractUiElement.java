package org.jazzteam.model.uiElements;

import org.jazzteam.model.AbstractElement;

/**
 * @author Den
 * @version 1.0
 * @created 16-���-2012 17:00:30
 */
public class AbstractUiElement extends AbstractElement implements Drawable {

	private AbstractElement abstractElement;
	private double cordX;
	private double cordY;
	public UiManager uiManager;

    public AbstractElement getAbstractElement() {
        return abstractElement;
    }

    public void setAbstractElement(AbstractElement abstractElement) {
        this.abstractElement = abstractElement;
    }

    public double getCordX() {
        return cordX;
    }

    public void setCordX(double cordX) {
        this.cordX = cordX;
    }

    public double getCordY() {
        return cordY;
    }

    public void setCordY(double cordY) {
        this.cordY = cordY;
    }

    public UiManager getUiManager() {
        return uiManager;
    }

    public void setUiManager(UiManager uiManager) {
        this.uiManager = uiManager;
    }

    public String getBorder() {
        return border;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    private String border;

	public AbstractUiElement(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	/**
	 * 
	 * @param e
	 */
	public void draw(AbstractUiElement e){

	}

	/**
	 * 
	 * @param e
	 */
	public void drawBorder(AbstractUiElement e){

	}
}