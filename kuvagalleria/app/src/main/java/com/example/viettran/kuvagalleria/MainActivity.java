package com.example.viettran.kuvagalleria;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener((v) {
            Intent intent = new Intent( createPackageContext(MainActivity.this), ToinenSivu.class);
            StartActivity(intent);
        });
    }

}
