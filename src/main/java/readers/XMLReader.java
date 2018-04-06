package readers;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import entities.AbstractEntity;
import entities.FileObject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class XMLReader implements IReader {

    @Override
    public AbstractEntity read(String path) {
        String xmlString = "";
        StringBuilder sb = new StringBuilder("");
        try {
            List<String> lines = Files.readAllLines(Paths.get(path));
            lines.stream().forEach(line -> sb.append(line));
            xmlString = sb.toString();
            AbstractEntity entity  = getEntity(lines.get(0), xmlString);
            return entity;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private AbstractEntity getEntity(String s, String xmlString) {
        XStream xStream = new XStream(new DomDriver());
        switch (s.toLowerCase()){
            case "<entities.mail>": return (AbstractEntity) xStream.fromXML(xmlString);
            case "<<entities.forumpost>": return (AbstractEntity) xStream.fromXML(xmlString);
        }
        return null;
    }
}
