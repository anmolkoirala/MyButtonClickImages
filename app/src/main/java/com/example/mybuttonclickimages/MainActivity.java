package com.example.mybuttonclickimages;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button btnone;
    ImageView imageone, imagetwo, imagethree, imagefour;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnone     = findViewById(R.id.viewImagebtn);
        imageone   = findViewById(R.id.imageone);
        imagetwo   = findViewById(R.id.imagetwo);
        imagethree = findViewById(R.id.imagethree);
        imagefour  = findViewById(R.id.imagefour);

        btnone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(counter > 3){
                    counter = 0;
                }

                if(counter == 0)
                {
                    imageone.setImageResource(R.drawable.bird);
                    imagetwo.setImageResource(R.drawable.ic_launcher_background);
                    imagethree.setImageResource(R.drawable.ic_launcher_background);
                    imagefour.setImageResource(R.drawable.ic_launcher_background);
                }

                if (counter == 1)
                {
                    imageone.setImageResource(R.drawable.ic_launcher_background);
                    imagetwo.setImageResource(R.drawable.bird2);
                    imagethree.setImageResource(R.drawable.ic_launcher_background);
                    imagefour.setImageResource(R.drawable.ic_launcher_background);
                }

                if (counter == 2)
                {
                    imageone.setImageResource(R.drawable.ic_launcher_background);
                    imagetwo.setImageResource(R.drawable.ic_launcher_background);
                    imagethree.setImageResource(R.drawable.bird3);
                    imagefour.setImageResource(R.drawable.ic_launcher_background);
                }

                if(counter == 3)
                {
                    imageone.setImageResource(R.drawable.ic_launcher_background);
                    imagetwo.setImageResource(R.drawable.ic_launcher_background);
                    imagethree.setImageResource(R.drawable.ic_launcher_background);
                    imagefour.setImageResource(R.drawable.bird4);
                }
                counter++;
            }
        });
    }
}

