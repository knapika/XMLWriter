package readers;

import entities.AbstractEntity;
import entities.FileObject;

public interface IReader {
    public AbstractEntity read(String path);
}
