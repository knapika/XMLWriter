package entities;

public class ForumPost extends AbstractEntity {
    private final String author;
    private final int postID;

    public ForumPost(String content, int size, String author, int postID) {
        super(content, size);
        this.author = author;
        this.postID = postID;
    }
}
