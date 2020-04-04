package com.example.xml.converter;

import com.example.xml.domain.XMLSheetRoot;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.StringWriter;

public final class JAXBXmlConverter {

    public static void jaxbObjectToXML(XMLSheetRoot root, String xmlFileName) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(XMLSheetRoot.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            StringWriter sw = new StringWriter();

            jaxbMarshaller.marshal(root, sw);

            File file = new File(xmlFileName);
            jaxbMarshaller.marshal(root, file);

            String xmlContent = sw.toString();
            System.out.println("object to xml converted");
            System.out.println(xmlContent);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public static void jaxbXmlFileToObject(String fileName) {
        File xmlFile = new File(fileName);

        JAXBContext jaxbContext;
        try {
            jaxbContext = JAXBContext.newInstance(XMLSheetRoot.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            XMLSheetRoot root = (XMLSheetRoot) jaxbUnmarshaller.unmarshal(xmlFile);

            System.out.println("xml to object converted");
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
