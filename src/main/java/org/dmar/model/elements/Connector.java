package org.dmar.model.elements;

import org.dmar.model.AbstractElement;


public class Connector extends AbstractElement {

	private boolean isConnected;
	public Cable cable;
	public ConnectorPlace connectorPlace;

	public Connector(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

    public boolean isConnected() {
        return isConnected;
    }

    public void setConnected(boolean connected) {
        isConnected = connected;
    }

    public Cable getCable() {
        return cable;
    }

    public void setCable(Cable cable) {
        this.cable = cable;
    }

    public ConnectorPlace getConnectorPlace() {
        return connectorPlace;
    }

    public void setConnectorPlace(ConnectorPlace connectorPlace) {
        this.connectorPlace = connectorPlace;
    }
}