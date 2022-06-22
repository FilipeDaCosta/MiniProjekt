import java.util.List;

public class Comment {
    private String comment;
    private List<String> commentList;

    public Comment(String comment){
        this.comment = comment;
        addToList(comment);
    }

    private void addToList(String section){
        commentList.add(section);
    }

    public List<String> getSectionList() {
        return commentList;
    }
}
