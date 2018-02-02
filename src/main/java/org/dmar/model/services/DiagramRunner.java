package org.dmar.model.services;

import org.dmar.model.Diagram;
import org.dmar.model.elements.Figure;

/**
 * @author Den
 * @version 1.0
 * @created 16-���-2012 17:00:31
 */
public class DiagramRunner {

    public static final String GREEN_COLOR = "greenColor";

    public DiagramRunner() {

    }

    public void runDiagram(Diagram d) {
        for (int i = 0; i < d.getFigures().size(); i++)
            d.getFigures().get(i).getUiManager().getUiElement(d.getFigures().get(i)).setBorder(GREEN_COLOR);
    }

    public void finalize() throws Throwable {

    }

    /**
     * @param s
     * @param m
     */
    public DiagramRunResult runDiagram(Diagram s, RunMode m) {
        return null;
    }

    /**
     * Сортирует фигуры по приоритету выполнения
     *
     * @param d
     * @return
     */
    public static Diagram sortFiguresBySteps(Diagram d) {
        for (Integer j = 0; j < d.getFigures().size() - 1; j++) {
            for (Integer i = 0; i < d.getFigures().size() - 1; i++) {
                if (d.getFigures().get(i).getStateNumber() > d.getFigures().get(i + 1).getStateNumber()) {
                    Figure o = d.getFigures().get(i);
                    d.getFigures().set(i, d.getFigures().get(i + 1));
                    d.getFigures().set(i + 1, o);
                }
            }
        }
        return d;
    }
}