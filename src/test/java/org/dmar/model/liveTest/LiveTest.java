package org.dmar.model.liveTest;


import org.dmar.model.Diagram;
import org.dmar.model.Square;
import org.dmar.model.Triangle;
import org.dmar.model.elements.Cable;
import org.dmar.model.elements.Connector;
import org.dmar.model.elements.ConnectorPlace;
import org.dmar.model.elements.Figure;
import org.dmar.model.services.DiagramRunner;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class LiveTest {
    private static final String CONNECTOR_PLACE = "connectorPlace";
    private static final String NAME_PROPERTY = "name";
    private static final String TRIANGLE_FIGURE_TYPE = "triangle";
    private static final String SQUARE_FIGURE_TYPE = "square";
    private static final String CONNECTOR_NAME = "connector";
    private static final String CABLE_NAME = "cable";
    public static final String CURRENT_ELENEN_TEXT = "текущий элемент ";
    public static final String CHECK_CONNECTION_TEST_START_TEXT = "checkConnectionTest start";
    public static final String CHECK_CONNECTION_TEST_END_TEXT = "checkConnectionTest end";
    public static final int COUNT_FIGURES_OF_DIAGRAM = 10;
    public static final int MAX_VALUE_FOR_GENERATE_DOUBLE = 30;
    private Figure triangle;
    private Figure square;
    private Cable cable;
    private Connector connectorA;
    private Connector connectorB;
    private List<ConnectorPlace> connectorPlacesTriangle;
    private List<ConnectorPlace> connectorPlacesSquare;

    @Test
    public void runLiveTest() {
        createElements();
        figureConnector();
        /**
         * test
         */
        checkConnectionTest();
        /**
         * test
         */
        sortElementByStepNumberTest();

    }

    public void createElements() {
        triangle = new Triangle();
        square = new Square();

        connectorPlacesSquare = createConnectorPlace();
        connectorPlacesTriangle = createConnectorPlace();

        connectorPlacesTriangle.get(0).setFigure(triangle);
        connectorPlacesSquare.get(0).setFigure(square);

        connectorPlacesTriangle.get(0).setName(CONNECTOR_PLACE);
        connectorPlacesSquare.get(0).setName(CONNECTOR_PLACE);


        triangle.setProperties(createProperties(NAME_PROPERTY, TRIANGLE_FIGURE_TYPE));
        triangle.setName(TRIANGLE_FIGURE_TYPE);
        triangle.setConnectorPlaces(connectorPlacesTriangle);

        square.setProperties(createProperties(NAME_PROPERTY, SQUARE_FIGURE_TYPE));
        square.setName(SQUARE_FIGURE_TYPE);
        square.setConnectorPlaces(connectorPlacesSquare);

        connectorA = new Connector();
        connectorB = new Connector();

        connectorA.setName(CONNECTOR_NAME);
        connectorB.setName(CONNECTOR_NAME);

        cable = new Cable();
        cable.setName(CABLE_NAME);
    }

    public void runDiagram() {
    }

    public void compareDiagram() {
    }

    public void saveDiagram() {
    }

    public void loadDiagram() {
    }

    public void drawDiagram() {
    }

    public Map createProperties(String key, String value) {
        Map map = new HashMap<String, String>();
        map.put(key, value);
        return map;
    }

    public List<ConnectorPlace> createConnectorPlace() {
        List connectorPlaces = new ArrayList<ConnectorPlace>();
        ConnectorPlace connectorPlace = new ConnectorPlace();
        connectorPlaces.add(connectorPlace);
        return connectorPlaces;
    }

    public void figureConnector() {
        connectorA.setCable(cable);
        connectorB.setCable(cable);
        cable.setConnectorA(connectorA);
        cable.setConnectorB(connectorB);
        triangle.getConnectorPlaces().get(0).setConnector(connectorA);
        square.getConnectorPlaces().get(0).setConnector(connectorB);
        connectorA.setConnectorPlace(connectorPlacesTriangle.get(0));
        connectorB.setConnectorPlace(connectorPlacesSquare.get(0));

        triangle.getConnectorPlaces().get(0).getConnector().getCable().getConnectorB().getConnectorPlace().getFigure();
        square.getConnectorPlaces().get(0).getConnector().getCable().getConnectorB().getConnectorPlace();
    }

    @Test
    public void sortElementByStepNumberTest() {
        Diagram diagram = new Diagram();
        List figures = new ArrayList<Figure>();
        for (int i = 0; i < COUNT_FIGURES_OF_DIAGRAM; i++) {
            Figure f = new Figure();
            f.setStateNumber(new Random().nextInt(MAX_VALUE_FOR_GENERATE_DOUBLE));
            figures.add(f);
        }
        diagram.setFigures(figures);

        diagram = DiagramRunner.sortFiguresBySteps(diagram);
        //todo: заменить на assert(например найти мин макс элемент и сравнить)
        for (int i = 0; i < diagram.getFigures().size(); i++) {
            System.out.println(diagram.getFigures().get(i).getStateNumber());
        }
    }

    @Test
    public void performanceTest() {
        Integer k = 0;
        for (Integer i = 0; i < Integer.MAX_VALUE/4; i++) {
            k++;
        }
    }

    private void checkConnectionTest() {
        Assert.assertNotNull(triangle.getConnectorPlaces().get(0).getConnector().getCable().getConnectorB().getConnectorPlace().getFigure());
        Assert.assertNotNull(square.getConnectorPlaces().get(0).getConnector().getCable().getConnectorB().getConnectorPlace().getFigure());

        System.out.println(CHECK_CONNECTION_TEST_START_TEXT);
        System.out.println(CURRENT_ELENEN_TEXT + triangle.getName());
        System.out.println(CURRENT_ELENEN_TEXT + triangle.getConnectorPlaces().get(0).getName() + " of " + triangle
                .getName());
        System.out.println(CURRENT_ELENEN_TEXT + triangle.getConnectorPlaces().get(0).getConnector().getName()
                + " of " + triangle.getConnectorPlaces().get(0).getConnector().getCable().getName());
        System.out.println(CURRENT_ELENEN_TEXT + triangle.getConnectorPlaces().get(0).getConnector().getCable()
                .getName() + " connectorA [" + cable.getConnectorA().getName() + "] connectorB ["
                + cable.getConnectorB().getName() + "]");
        System.out.println(CURRENT_ELENEN_TEXT + triangle.getConnectorPlaces().get(0).getConnector().getCable()
                .getConnectorB().getName() + " of " + triangle.getConnectorPlaces().get(0).getConnector().getCable().getName());
        System.out.println(CURRENT_ELENEN_TEXT + triangle.getConnectorPlaces().get(0).getConnector().getCable()
                .getConnectorB().getConnectorPlace().getName() + " of " + triangle.getConnectorPlaces().get(0)
                .getConnector().getCable().getConnectorB().getConnectorPlace().getFigure().getName());
        System.out.println(CURRENT_ELENEN_TEXT + triangle.getConnectorPlaces().get(0).getConnector().getCable
                ().getConnectorB().getConnectorPlace().getFigure().getName());
        System.out.println(CHECK_CONNECTION_TEST_END_TEXT);
    }
}