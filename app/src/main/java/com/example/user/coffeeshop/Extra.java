package com.example.user.coffeeshop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Extra extends AppCompatActivity{
  ListView l;
  String[] movies={"deadpool","avengers infinity war","Race 3","Bhahubali2","Vishwaroopam2","Sarkar","Bharat","SANJU_one man many livees"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extra);
        ListView l=(ListView)findViewById(R.id.listview);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,movies);
        l.setAdapter(adapter);
        l.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0)
                {
                    Toast.makeText(Extra.this, "ticket is on 25 sep of$1", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


}
