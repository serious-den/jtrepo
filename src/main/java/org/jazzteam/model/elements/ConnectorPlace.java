package org.jazzteam.model.elements;

import org.jazzteam.model.AbstractElement;

/**
 * @author Den
 * @version 1.0
 * @created 16-���-2012 17:00:31
 */
public class ConnectorPlace extends AbstractElement{
    private Connector connector;
	private double cordX;
	private double cordY;
	private boolean isBusy;
	public Figure figure;

	public ConnectorPlace(){

	}

	public void finalize() throws Throwable {

	}

    public Connector getConnector() {
        return connector;
    }

    public void setConnector(Connector connector) {
        this.connector = connector;
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

    public Figure getFigure() {
        return figure;
    }

    public void setFigure(Figure figure) {
        this.figure = figure;
    }

    public boolean isBusy() {
        return isBusy;
    }

    public void setBusy(boolean busy) {
        isBusy = busy;
    }

}