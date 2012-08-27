package org.jazzteam.model.uiElements;

import org.jazzteam.model.uiElements.AbstractUiElement;

/**
 * @author Den
 * @version 1.0
 * @created 16-���-2012 17:00:31
 */
public interface Drawable {

	/**
	 * 
	 * @param e
	 */
	public void draw(AbstractUiElement e);

	/**
	 * 
	 * @param e
	 */
	public void drawBorder(AbstractUiElement e);

}