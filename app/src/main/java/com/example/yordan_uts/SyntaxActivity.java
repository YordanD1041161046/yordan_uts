package com.example.yordan_uts;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SyntaxActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syntax);

        TextView javaDetailt = findViewById(R.id.javaDetail);
        TextView layoutDetailt = findViewById(R.id.layoutDetail);
        String[] javaDetails = getResources().getStringArray(R.array.java_details);
        String[] layoutDetails = getResources().getStringArray(R.array.layout_details);

        javaDetailt.setText(javaDetails[getIntent().getIntExtra("pos",1)]);
        layoutDetailt.setText(layoutDetails[getIntent().getIntExtra("pos",1)]);
    }

    public void launchDetailActivity(View view) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra("pos", getIntent().getIntExtra("pos",0));
        startActivity(intent);
    }

}