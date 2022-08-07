package itvdn_homeworks.itvdn_xml.hw_4;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        AddressesList catal = new AddressesList();
        catal.add(new Address("Kyiv","Khreshchatyk","56"));
        
        try {

            File file = new File("/Users/nsovi/Desktop/itvdn_hw/src/itvdn_homeworks/itvdn_xml/hw_4/adresses1.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Catalog.class);
            // Возвращает объект класса Marshaller, для того чтобы трансформировать объект
            Marshaller mar = jaxbContext.createMarshaller();

            mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            mar.marshal(catal, file);
            mar.marshal(catal, System.out);

            Unmarshaller unmar = jaxbContext.createUnmarshaller();
            catal = (Catalog) unmar.unmarshal(file);
            System.out.println(catal);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
