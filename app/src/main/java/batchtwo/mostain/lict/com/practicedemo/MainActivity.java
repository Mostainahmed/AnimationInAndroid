package batchtwo.mostain.lict.com.practicedemo;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView,imageView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Requesting for full screen activity
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageview);
        imageView1 = findViewById(R.id.imagemoney);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //animate image to get bigger and fade away after tapping the image
                imageView.animate().scaleYBy(7f).scaleXBy(7f).alpha(0f).setDuration(3000);

                //animate image to get visible by fading in after tapping the previous image and also rotate the image by 180 degree
                imageView1.animate().alpha(1f).rotation(180).setDuration(3000);

            }
        });

    }
}
