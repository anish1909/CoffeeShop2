package com.example.user.coffeeshop;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Toast;

public class RateApp extends AppCompatActivity {
Button btn;
RatingBar ratingBar;
EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate_app);
        ratingBar=(RatingBar)findViewById(R.id.ratingBar);
        editText=(EditText)findViewById(R.id.editTe);
        btn=(Button)findViewById(R.id.butt);
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                editText.setText(String.valueOf(rating));
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_SEND);
                intent.setData(Uri.parse("mailto:"));
                String [] to={"as0160895@gmail.com","hacker19091998@gmail.com"};
                intent.putExtra(Intent.EXTRA_EMAIL,to);
                intent.putExtra(Intent.EXTRA_SUBJECT,"hii this email is sent from my app");
                intent.putExtra(intent.EXTRA_TEXT,"i rated your app"+String.valueOf(ratingBar.getRating()));
                intent.setType("message/rfc822");
               Intent chooser=Intent.createChooser(intent,"Send Email");
               startActivity(intent);

                Toast.makeText(RateApp.this,String.valueOf(ratingBar.getRating()), Toast.LENGTH_SHORT).show();

            }
        });
    }
}
