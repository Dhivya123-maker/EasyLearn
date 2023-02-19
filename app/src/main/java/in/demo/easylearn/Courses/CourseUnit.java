package in.demo.easylearn.Courses;

import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class CourseUnit {
    String id;
    String unitNo;
    String title;
    String percentage;

    public CourseUnit(String id, String unitNo, String title, String percentage) {
        this.id = id;
        this.unitNo = unitNo;
        this.title = title;
        this.percentage = percentage;


    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUnitNo() {
        return unitNo;
    }

    public void setUnitNo(String unitNo) {
        this.unitNo = unitNo;
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


    public CourseUnit(){}


}
