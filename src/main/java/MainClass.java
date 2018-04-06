import entities.AbstractEntity;
import entities.Mail;
import readers.IReader;
import readers.XMLReader;
import writers.IWriter;
import writers.XMLWriter;

import java.time.LocalDateTime;

public class MainClass {
    public static void main(String[] args) {
        AbstractEntity entity = new Mail("Pozdrawiam, AK", 15, "Andrzej@K", "knsads",
                LocalDateTime.now().toString());
        IWriter writer = new XMLWriter();
        writer.write(entity);

        IReader reader = new XMLReader();
        AbstractEntity entity1 = reader.read("xml.xml");
        System.out.println(entity1.getContent());
    }
}
