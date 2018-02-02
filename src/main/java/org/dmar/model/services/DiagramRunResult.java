package org.dmar.model.services;

import org.dmar.model.Diagram;


public class DiagramRunResult {

	private String description;
	private Diagram diagram;

	public DiagramRunResult(){

	}

	public void finalize() throws Throwable {

	}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Diagram getDiagram() {
        return diagram;
    }

    public void setDiagram(Diagram diagram) {
        this.diagram = diagram;
    }
}