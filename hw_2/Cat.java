package itvdn_homeworks.itvdn_xml.hw_2;

import java.io.*;

public class Cat {
    public static void main(String[] args) {
        Animal animal = new Animal();
        File f = new File("/Users/nsovi/Desktop/itvdn_hw/src/itvdn_homeworks/itvdn_xml/hw_2/serlialization.txt");

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(f));
             ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(f))) {
            outputStream.writeObject(animal);
            animal = null;
            animal = (Animal) inputStream.readObject();
            System.out.println(animal);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
