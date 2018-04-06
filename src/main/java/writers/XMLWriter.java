package writers;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import entities.AbstractEntity;

import javax.xml.bind.JAXB;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;

public class XMLWriter implements IWriter {
    @Override
    public void write(AbstractEntity entity) {
//        StringWriter sw = new StringWriter();
//        JAXB.marshal(entity, sw);
//        String xmlString = sw.toString();
        XStream mapping = new XStream(new DomDriver());
        String xml = mapping.toXML(entity);
        try {
            FileWriter writer = new FileWriter("xml.xml");
            writer.write(xml);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
