package entities;

import java.time.LocalDateTime;

public class Mail extends AbstractEntity {
    private final String author;
    private final String receiver;
    private final String sendTime;

    public Mail(String content, int size, String author, String receiver, String sendTime) {
        super(content, size);
        this.author = author;
        this.receiver = receiver;
        this.sendTime = sendTime;
    }

    public String getAuthor() {
        return author;
    }

    public String getReceiver() {
        return receiver;
    }

    public String getSendTime() {
        return sendTime;
    }
}
