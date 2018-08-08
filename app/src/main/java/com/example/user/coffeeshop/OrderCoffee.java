package com.example.user.coffeeshop;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class OrderCoffee extends AppCompatActivity {
    AutoCompleteTextView autoCompleteTextView;
    String [] coffee={"latte ","assam ","american cola","phizzan cola"};
    Button btn;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_coffee);
        autoCompleteTextView=(AutoCompleteTextView)findViewById(R.id.autoCompleteTextView) ;
        editText=(EditText)findViewById(R.id.editt) ;
        btn=(Button)findViewById(R.id.but);
        ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.select_dialog_item,coffee);
        autoCompleteTextView.setThreshold(1);
        autoCompleteTextView.setAdapter(adapter);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(OrderCoffee.this,autoCompleteTextView.getText()+"\n"+editText.getText(), Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(Intent.ACTION_SEND);
                intent.setData(Uri.parse("mailto:"));
                String [] to={"as0160895@gmail.com","hacker19091998@gmail.com"};
                intent.putExtra(Intent.EXTRA_EMAIL,to);
                intent.putExtra(Intent.EXTRA_SUBJECT,"hii this email is sent from my app");
                intent.putExtra(intent.EXTRA_TEXT,"there is order of"+autoCompleteTextView.getText()+"\n and price is "+editText.getText());
                intent.setType("message/rfc822");
                Intent chooser=Intent.createChooser(intent,"Send Email");
                startActivity(intent);
            }
        });


    }
}
