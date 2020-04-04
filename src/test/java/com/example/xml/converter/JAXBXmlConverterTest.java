package com.example.xml.converter;

import com.example.xml.domain.Figure;
import com.example.xml.domain.Painter;
import com.example.xml.domain.RGBColor;
import com.example.xml.domain.XMLSheetRoot;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class JAXBXmlConverterTest {
    private final static String XML_FILE_NAME = "encrypted.xml";

    @Test
    public void jaxbObjectToXML() {
        Figure figure = new Figure("square", 45, 15);
        Painter painter = new Painter("Monet", "Tapered", 15);
        RGBColor color = new RGBColor(45, 17, 198);
        XMLSheetRoot root = new XMLSheetRoot();

        root.setColor(color);
        root.setFigure(figure);
        root.setPainter(painter);
        root.setSheetHeight(80);
        root.setSheetWidth(25);
        root.setEncryption(true);

        JAXBXmlConverter.jaxbObjectToXML(root, XML_FILE_NAME);
        JAXBXmlConverter.jaxbXmlFileToObject(XML_FILE_NAME);
    }

    @Test
    public void jaxbXmlFileToObject() {
        Figure figure = new Figure("square", 45, 15);
        Painter painter = new Painter("Monet", "Tapered", 15);
        RGBColor color = new RGBColor(45, 17, 198);
        XMLSheetRoot root = new XMLSheetRoot();

        root.setColor(color);
        root.setFigure(figure);
        root.setPainter(painter);
        root.setSheetHeight(80);
        root.setSheetWidth(25);
        root.setEncryption(true);

        JAXBXmlConverter.jaxbObjectToXML(root, XML_FILE_NAME);
        JAXBXmlConverter.jaxbXmlFileToObject(XML_FILE_NAME);
    }
}
