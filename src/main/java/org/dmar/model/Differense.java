package org.dmar.model;

/**
 * @author Den
 * @version 1.0
 * @created 16-���-2012 17:00:31
 */
public class Differense {

	private Diagram diagram;
	private String discription;

	public Differense(){

	}

	public void finalize() throws Throwable {

	}

    public Diagram getDiagram() {
        return diagram;
    }

    public void setDiagram(Diagram diagram) {
        this.diagram = diagram;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }
}