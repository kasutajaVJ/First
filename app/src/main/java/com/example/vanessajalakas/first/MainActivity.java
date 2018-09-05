package com.example.vanessajalakas.first;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button nupp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nupp = findViewById(R.id.activity2);
        nupp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "http://tallinnzoo.ee";
                Intent zoo = new Intent(Intent.ACTION_VIEW);
                zoo.setData(Uri.parse(url));
                startActivity(zoo);
            }
        });
    }

    public void vajutus(View view) {
        Intent pildid = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(pildid);
    }
}
