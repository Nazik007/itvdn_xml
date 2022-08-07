package itvdn_homeworks.itvdn_xml.hw_4;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

//@XmlRootElement(name = "catalog")

public class AddressesList {

    @XmlElement(name = "addresses")
    private List<Address> addresses = new ArrayList<>();

    public void add(Address address) {
        addresses.add(address);
    }

    @Override
    public String toString() {
        return Arrays.deepToString(addresses.toArray());
    }
}
