import java.util.List;

public class Section {
    private String section;
    private List<String> sectionList;

    public Section(String section){
        this.section = section;
        addToList(section);
    }

    private void addToList(String section){
        sectionList.add(section);
    }

    public List<String> getSectionList() {
        return sectionList;
    }
}
