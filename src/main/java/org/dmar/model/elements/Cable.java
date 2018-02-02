package org.dmar.model.elements;

import org.dmar.model.AbstractElement;


public class Cable extends AbstractElement {

	private Connector connectorA;
	private Connector connectorB;
	private Figure figureA;
	private Figure figureB;

	public Cable(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

    public Connector getConnectorA() {
        return connectorA;
    }

    public void setConnectorA(Connector connectorA) {
        this.connectorA = connectorA;
    }

    public Connector getConnectorB() {
        return connectorB;
    }

    public void setConnectorB(Connector connectorB) {
        this.connectorB = connectorB;
    }

    public Figure getFigureA() {
        return figureA;
    }

    public void setFigureA(Figure figureA) {
        this.figureA = figureA;
    }

    public Figure getFigureB() {
        return figureB;
    }

    public void setFigureB(Figure figureB) {
        this.figureB = figureB;
    }
}