package itvdn_homeworks.itvdn_xml.hw_3;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;


import java.io.File;

public class XMLCreator {

    public static void main(String argv[]) {

        try {
            DocumentBuilderFactory dbFactory =
                    DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.newDocument();

            Element rootElement = doc.createElement("addresses_list");
            doc.appendChild(rootElement);

            Element address1 = doc.createElement("address");
            rootElement.appendChild(address1);

            Element city1 = doc.createElement("city");
            city1.setAttribute("size","small");
            city1.setTextContent("Kyiv");
            address1.appendChild(city1);

            Element street1 = doc.createElement("street");
            street1.setTextContent("Khreshchatyk");
            address1.appendChild(street1);

            Element house1 = doc.createElement("house_number");
            house1.setTextContent("86");
            address1.appendChild(house1);

            Element address2 = doc.createElement("address");
            rootElement.appendChild(address2);

            Element city2 = doc.createElement("city");
            city2.setAttribute("size","small");
            city2.setTextContent("Ternopil");
            address2.appendChild(city2);

            Element street2 = doc.createElement("street");
            street2.setTextContent("Faina");
            address2.appendChild(street2);

            Element house2 = doc.createElement("house_number");
            house2.setTextContent("76/3");
            address2.appendChild(house2);

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("/Users/nsovi/Desktop/itvdn_hw/src/itvdn_homeworks.itvdn_xml/address.xml"));
            transformer.transform(source, result);

       //      Output to console for testing
            StreamResult consoleResult = new StreamResult(System.out);
            transformer.transform(source, consoleResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}