package in.demo.easylearn;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.shape.CornerFamily;

public class Start_Screen extends AppCompatActivity {
    ShapeableImageView image;
    Button start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_screen);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        image = findViewById(R.id.image);
        start = (Button)findViewById(R.id.start_btn);

        float radius = getResources().getDimension(R.dimen.start_bend);
        image.setShapeAppearanceModel(image.getShapeAppearanceModel()
                .toBuilder()
                .setBottomRightCorner(CornerFamily.ROUNDED,radius)
                .build());


        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Start_Screen.this,Course_Screen.class));
            }
        });

    }
}