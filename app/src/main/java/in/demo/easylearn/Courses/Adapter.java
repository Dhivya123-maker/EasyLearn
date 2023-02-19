package in.demo.easylearn.Courses;

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

import java.util.ArrayList;

import in.demo.easylearn.Courses.CourseUnit;
import in.demo.easylearn.R;

public class Adapter extends ArrayAdapter<CourseUnit> {
    int progress;
    ProgressBar progressBar,progressBar1;

    public static OnItemClickListener mListener;

    public interface OnItemClickListener{
        void onItemClick(int position);
    }

    public void setOnItemClickListener(OnItemClickListener listener){

        mListener = listener;

    }

    public Adapter(@NonNull Context context, ArrayList<CourseUnit> arrayList) {
        super(context, 0, arrayList);
    }

    @SuppressLint("ResourceAsColor")
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View itemView = convertView;
        CourseUnit course_position = getItem(position);


        if (itemView == null) {
            itemView = LayoutInflater.from(getContext()).inflate(R.layout.course_unit_item, parent, false);
        }


        TextView unit_no,title,percentage;
        RelativeLayout relativeLayout;

        unit_no = itemView.findViewById(R.id.unit);
        title = itemView.findViewById(R.id.title);
        percentage = itemView.findViewById(R.id.percentage);
        relativeLayout = itemView.findViewById(R.id.relative_layout);
        progressBar = itemView.findViewById(R.id.progressBar);
         progressBar1 = itemView.findViewById(R.id.progressBar1);

        unit_no.setText(course_position.getUnitNo());
        title.setText(course_position.getTitle());
        percentage.setText(course_position.getPercentage()+"%");

        if(course_position.id.equals("1") || course_position.id.equals("3") || course_position.id.equals("5") || course_position.id.equals("7")){
            relativeLayout.setBackgroundResource(R.drawable.violet_bg);
        }else{
            relativeLayout.setBackgroundResource(R.drawable.pink_bg);
        }

         progress = Integer.parseInt(course_position.percentage);


        if(course_position.id.equals("1") || course_position.id.equals("3") || course_position.id.equals("5") || course_position.id.equals("7")) {
            if (progress <= 90) {

                progress = Integer.parseInt(course_position.percentage);
                p_bar_pink();


            }
            if (progress >= 10) {
                progress = Integer.parseInt(course_position.percentage);

                p_bar_pink();
            }
        }

        else {
            if (progress <= 90) {

                progress = Integer.parseInt(course_position.percentage);
                p_bar_violet();


            }
            if (progress >= 10) {
                progress = Integer.parseInt(course_position.percentage);

                p_bar_violet();
            }
        }

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mListener != null) {
                        mListener.onItemClick(position);
                }


            }
        });

        return itemView;
    }

    public  void p_bar_pink(){
        progressBar.setProgress(progress);
        progressBar1.setVisibility(View.GONE);
        progressBar.setVisibility(View.VISIBLE);

    }
    public  void p_bar_violet(){
        progressBar.setVisibility(View.GONE);
        progressBar1.setVisibility(View.VISIBLE);
        progressBar1.setProgress(progress);

    }

}