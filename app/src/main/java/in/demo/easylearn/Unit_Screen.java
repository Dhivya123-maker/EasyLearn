package in.demo.easylearn;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.shape.CornerFamily;

import java.util.ArrayList;
import java.util.List;

import in.demo.easylearn.Chapters.Chapter_Adapter;
import in.demo.easylearn.Chapters.Chapter_Model;
import in.demo.easylearn.Courses.Adapter;
import in.demo.easylearn.Courses.CourseUnit;

public class Unit_Screen extends AppCompatActivity {
    String unit,title,percentage;
    TextView unit_no,unit_title,unit_percentage;
    ProgressBar progressBar;
    int progress;
    ListView listView;
    TextView general;
    ImageView back;
    ArrayList<Chapter_Model> arrayList = new ArrayList<Chapter_Model>();

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.unit_screen);

        Intent intent = getIntent();
        unit = intent.getStringExtra("unit");
        title = intent.getStringExtra("title");
        percentage = intent.getStringExtra("percentage");


        unit_no = findViewById(R.id.unit_no);
        unit_title = findViewById(R.id.unit_title);
        unit_percentage = findViewById(R.id.percentage);
        progressBar = findViewById(R.id.progressBar);
        listView = findViewById(R.id.listView);
        general = findViewById(R.id.general_exercise);
        back = findViewById(R.id.back_unit);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               onBackPressed();
            }
        });

            unit_no.setText(unit);
            unit_title.setText(title);
            unit_percentage.setText(percentage+"%");


        progress = Integer.parseInt(percentage);
        if (progress <= 90) {
            progress = Integer.parseInt(percentage);
            progressBar.setProgress(progress);


        }
        if (progress >= 10) {
            progress = Integer.parseInt(percentage);
            progressBar.setProgress(progress);


        }
        if(unit.equals("Unit 1")){
            arrayList.add(new Chapter_Model("1", "Introduction","50"));
            arrayList.add(new Chapter_Model("2", "Definition","50"));
            arrayList.add(new Chapter_Model("3", "Architecture","25"));
            arrayList.add(new Chapter_Model("4", "Uses","20"));
            arrayList.add(new Chapter_Model("5", "Theory and practical","0"));

            general.setText("General Exercises "+unit);

        }
        else if(unit.equals("Unit 2")){
            arrayList.add(new Chapter_Model("1", "Introduction","100"));
            arrayList.add(new Chapter_Model("2", "Jobs and school","47"));
            arrayList.add(new Chapter_Model("3", "School","34"));
            arrayList.add(new Chapter_Model("4", "Jobs","12"));
            arrayList.add(new Chapter_Model("5", "Job Interview","55"));
            general.setText("General Exercises "+unit);


        }
        else if(unit.equals("Unit 3")){
            arrayList.add(new Chapter_Model("1", "Introduction","90"));
            arrayList.add(new Chapter_Model("2", "Foods and drinks","26"));
            arrayList.add(new Chapter_Model("3", "Activities","10"));
            arrayList.add(new Chapter_Model("4", "Habits","68"));
            arrayList.add(new Chapter_Model("5", "Health","18"));

            general.setText("General Exercises "+unit);


        }
        else if(unit.equals("Unit 4")){
            arrayList.add(new Chapter_Model("1", "Introduction","80"));
            arrayList.add(new Chapter_Model("2", "Places and directions","86"));
            arrayList.add(new Chapter_Model("3", "Environment","60"));
            arrayList.add(new Chapter_Model("4", "Pollutions","0"));
            arrayList.add(new Chapter_Model("5", "Atmosphere","13"));
            general.setText("General Exercises "+unit);


        }
        else if(unit.equals("Unit 5")){
            arrayList.add(new Chapter_Model("1", "Introduction","100"));
            arrayList.add(new Chapter_Model("2", "Lifestyle","96"));
            arrayList.add(new Chapter_Model("3", "Diet","70"));
            arrayList.add(new Chapter_Model("4", "Workout","0"));
            arrayList.add(new Chapter_Model("5", "Sleep","37"));
            general.setText("General Exercises "+unit);

        }
        else if(unit.equals("Unit 6")){
            arrayList.add(new Chapter_Model("1", "Introduction","47"));
            arrayList.add(new Chapter_Model("2", "Physics","68"));
            arrayList.add(new Chapter_Model("3", "Angular momentum","56"));
            arrayList.add(new Chapter_Model("4", "Inertia","91"));
            arrayList.add(new Chapter_Model("5", "Speed","72"));

            general.setText("General Exercises "+unit);
        }
        else if(unit.equals("Unit 7")){
            arrayList.add(new Chapter_Model("1", "Introduction","88"));
            arrayList.add(new Chapter_Model("2", "Definition and uses ","92"));
            arrayList.add(new Chapter_Model("3", "Reactions","15"));
            arrayList.add(new Chapter_Model("4", "Heat","19"));
            arrayList.add(new Chapter_Model("5", "Equilibirium","58"));
            general.setText("General Exercises "+unit);

        }
        else if(unit.equals("Unit 8")){
            arrayList.add(new Chapter_Model("1", "Introduction","93"));
            arrayList.add(new Chapter_Model("2", "Botany","31"));
            arrayList.add(new Chapter_Model("3", "Zoology","46"));
            arrayList.add(new Chapter_Model("4", "Evolution","98"));
            arrayList.add(new Chapter_Model("5", "Anatomy","77"));
            general.setText("General Exercises "+unit);

        }


        Chapter_Adapter chapter_adapter = new Chapter_Adapter(this, arrayList);
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(chapter_adapter);


    }
}