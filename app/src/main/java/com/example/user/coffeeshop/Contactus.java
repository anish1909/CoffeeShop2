package com.example.user.coffeeshop;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Contactus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactus);
        ImageButton i1=(ImageButton) findViewById(R.id.imageButton1);
        ImageButton i2=(ImageButton) findViewById(R.id.imageButton2);
        ImageButton i3=(ImageButton) findViewById(R.id.imageButton3);
        ImageButton i4=(ImageButton) findViewById(R.id.imageButton4);
        ImageButton i5=(ImageButton) findViewById(R.id.imageButton5);
        ImageButton i6=(ImageButton) findViewById(R.id.imageButton6);
        ImageButton i7=(ImageButton) findViewById(R.id.imageButton7);

    }
    public void contact(View view){
    ImageButton i1=(ImageButton) findViewById(R.id.imageButton1);
    ImageButton i2=(ImageButton) findViewById(R.id.imageButton2);
    ImageButton i3=(ImageButton) findViewById(R.id.imageButton3);
    ImageButton i4=(ImageButton) findViewById(R.id.imageButton4);
    ImageButton i5=(ImageButton) findViewById(R.id.imageButton5);
    ImageButton i6=(ImageButton) findViewById(R.id.imageButton6);
    ImageButton i7=(ImageButton) findViewById(R.id.imageButton7);


        if(view==i1)
        {
            Intent fb=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.facebook.com/anishkumar.srivastav.73"));
   startActivity(fb);

        }
        if(view==i2)
        {
            Intent fb=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.facebook.com/anishkumar.srivastav.73"));
            startActivity(fb);

        }
        if(view==i3)
        {
            Intent fb=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.facebook.com/anishkumar.srivastav.73"));
            startActivity(fb);

        }
        if(view==i4)
        {
            Intent fb=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.facebook.com/anishkumar.srivastav.73"));
            startActivity(fb);

        }
        if(view==i5)
        {
            Intent fb=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.facebook.com/anishkumar.srivastav.73"));
            startActivity(fb);

        } if(view==i6)
        {
            Intent fb=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.facebook.com/anishkumar.srivastav.73"));
            startActivity(fb);

        }
        if(view==i7)
        {
            Intent fb=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.facebook.com/anishkumar.srivastav.73"));
            startActivity(fb);

        }


    }

}
