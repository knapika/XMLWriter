package entities;

public abstract class AbstractEntity {
    final String content;
    final int size;

    public AbstractEntity(String content, int size) {
        this.content = content;
        this.size = size;
    }

    public String getContent() {
        return content;
    }

    public int getSize() {
        return size;
    }
}
