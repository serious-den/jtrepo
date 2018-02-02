package org.dmar.model;


public class Difference {

	private Diagram diagram;
	private String discription;

	public Difference(){

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