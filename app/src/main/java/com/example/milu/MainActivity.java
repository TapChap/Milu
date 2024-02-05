package com.example.milu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public Button btnDeals, btnHelp, btnCalc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDeals = (Button) findViewById(R.id.btnDeals);
        btnDeals.setOnClickListener(this);

        btnHelp = (Button) findViewById(R.id.btnHelp);
        btnHelp.setOnClickListener(this);

        btnCalc = (Button) findViewById(R.id.btnCalc);
        btnCalc.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (btnDeals.getId() == view.getId()) {
            startActivity(new Intent(this, DealsActivity.class));
        }

        if (btnCalc.getId() == view.getId()){
            startActivity(new Intent(this, CompensationActivity.class));
        }

        if (btnHelp.getId() == view.getId()){
            startActivity(new Intent(this, PsychologistActivity.class));
        }
    }
}