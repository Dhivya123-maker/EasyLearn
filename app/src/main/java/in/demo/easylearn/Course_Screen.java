package in.demo.easylearn;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.shape.CornerFamily;

import java.util.ArrayList;

import in.demo.easylearn.Courses.Adapter;
import in.demo.easylearn.Courses.CourseUnit;

public class Course_Screen extends AppCompatActivity implements Adapter.OnItemClickListener {

    ShapeableImageView image;
    ImageView back;
     ArrayList<CourseUnit> arrayList = new ArrayList<CourseUnit>();


    @SuppressLint({"MissingInflatedId", "ClickableViewAccessibility"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.course_screen);

        image = findViewById(R.id.image);
        back = findViewById(R.id.back_course);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });


        float radius = getResources().getDimension(R.dimen.course_bend);
        image.setShapeAppearanceModel(image.getShapeAppearanceModel()
                .toBuilder()
                .setBottomRightCorner(CornerFamily.ROUNDED,radius)
                .build());


        arrayList.add(new CourseUnit("1", "Unit 1","Introduction","50"));
        arrayList.add(new CourseUnit("2", "Unit 2","Jobs and school","50"));
        arrayList.add(new CourseUnit("3", "Unit 3","Foods and drinks","25"));
        arrayList.add(new CourseUnit("4", "Unit 4","Places and directions","20"));
        arrayList.add(new CourseUnit("5", "Unit 5","Lifestyle","0"));
        arrayList.add(new CourseUnit("6", "Unit 6","Physics","50"));
        arrayList.add(new CourseUnit("7", "Unit 7","Chemistry","60"));
        arrayList.add(new CourseUnit("8", "Unit 8","Biology","90"));



        Adapter courseAdapter = new Adapter(this, arrayList);
       ListView listView = findViewById(R.id.listView);
        listView.setAdapter(courseAdapter);
        courseAdapter.setOnItemClickListener(Course_Screen.this);


    }

    @Override
    public void onItemClick(int position) {
        CourseUnit model = arrayList.get(position);
        String unit_no = model.getUnitNo();
        String title = model.getTitle();
        String percentage = model.getPercentage();
        Intent intent = new Intent(Course_Screen.this, Unit_Screen.class);
        intent.putExtra("unit",unit_no);
        intent.putExtra("title",title);
        intent.putExtra("percentage",percentage);
        startActivity(intent);
    }
}