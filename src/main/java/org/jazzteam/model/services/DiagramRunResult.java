package org.jazzteam.model.services;

import org.jazzteam.model.Diagram;

/**
 * @author Den
 * @version 1.0
 * @created 16-���-2012 17:00:31
 */
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