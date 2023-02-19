package in.demo.easylearn.Chapters;

public class Chapter_Model {
    String id;
    String title;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPercentage() {
        return percentage;
    }

    public void setPercentage(String percentage) {
        this.percentage = percentage;
    }

    public Chapter_Model(String id, String title, String percentage) {
        this.id = id;
        this.title = title;
        this.percentage = percentage;
    }

    String percentage;


    public Chapter_Model(){}
}
