package org.jazzteam.model.elements;

import org.jazzteam.model.AbstractElement;

import java.util.List;

/**
 * @author Den
 * @version 1.0
 * @created 16-���-2012 17:00:31
 */
public class Figure extends AbstractElement {

	private List<ConnectorPlace> connectorPlaces;
	private double stateNumber;

	public Figure(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	public List<Cable> getCables(){
		return null;
	}

    public List<ConnectorPlace> getConnectorPlaces() {
        return connectorPlaces;
    }

    public void setConnectorPlaces(List<ConnectorPlace> connectorPlaces) {
        this.connectorPlaces = connectorPlaces;
    }

    public double getStateNumber() {
        return stateNumber;
    }

    public void setStateNumber(double stateNumber) {
        this.stateNumber = stateNumber;
    }
}