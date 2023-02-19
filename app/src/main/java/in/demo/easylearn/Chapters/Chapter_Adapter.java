package in.demo.easylearn.Chapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.w3c.dom.Text;

import java.util.ArrayList;

import in.demo.easylearn.Courses.CourseUnit;
import in.demo.easylearn.R;

public class Chapter_Adapter extends ArrayAdapter<Chapter_Model> {


    public Chapter_Adapter(@NonNull Context context, ArrayList<Chapter_Model> arrayList) {
        super(context, 0, arrayList);
    }

    @SuppressLint("ResourceAsColor")
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View itemView = convertView;
        Chapter_Model chapter_position = getItem(position);

        if (itemView == null) {
            itemView = LayoutInflater.from(getContext()).inflate(R.layout.chapter_item, parent, false);
        }


        TextView chapter,topics,percentage;
        chapter = itemView.findViewById(R.id.chapter);
        topics = itemView.findViewById(R.id.topic);
        percentage = itemView.findViewById(R.id.percent);

        chapter.setText("Chapter "+chapter_position.id);
        topics.setText(chapter_position.title);
        percentage.setText(chapter_position.percentage+"%");


        return itemView;
    }



}
