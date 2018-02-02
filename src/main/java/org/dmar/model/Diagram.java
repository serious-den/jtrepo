package org.dmar.model;

import org.dmar.model.elements.Figure;

import java.util.List;

public class Diagram {

	private String discription;
	private List<Figure> figures;
	private boolean isIntegrity;
	private int level;
	private String name;

	public Diagram(){

	}

	public void finalize() throws Throwable {

	}

    public String getDescription() {
        return discription;
    }

    public void setDescription(String description) {
        this.discription = discription;
    }

    public List<Figure> getFigures() {
        return figures;
    }

    public void setFigures(List<Figure> figures) {
        this.figures = figures;
    }

    public boolean isIntegrity() {
        return isIntegrity;
    }

    public void setIntegrity(boolean integrity) {
        isIntegrity = integrity;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}