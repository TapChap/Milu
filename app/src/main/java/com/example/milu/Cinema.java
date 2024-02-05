package com.example.milu;

import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Cinema extends AppCompatActivity implements View.OnClickListener {

    String name;
    String discrip;
    String cup;
    String number;
    int num=0;
    public TextView bName;
    public TextView bDiscrip;
    public TextView bCup;
    public ImageButton image,back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cinema);

        image=(ImageButton) findViewById(R.id.image);
        image.setOnClickListener(this);

        back=(ImageButton) findViewById(R.id.back);
        back.setOnClickListener(this);

        bDiscrip=(TextView) findViewById(R.id.bDiscrip);
        bDiscrip.setOnClickListener(this);

        bName=(TextView) findViewById(R.id.bName);
        bName.setOnClickListener(this);

        bCup=(TextView) findViewById(R.id.bCup);
        bCup.setOnClickListener(this);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width= dm.widthPixels;
        int hight= dm.heightPixels;

        getWindow().setLayout((int)(width*0.9),(int)(hight*0.7));

        Intent in = getIntent();
        if (in != null && in.getExtras() != null)
        {
            Bundle xtras = in.getExtras();
            name = xtras.getString("DATA1");
            discrip = xtras.getString("DATA2");
            cup= xtras.getString("DATA3");
            number= xtras.getString("DATA4");
            num=Integer.parseInt(number);

        }
        bCup.setText(cup);
        bDiscrip.setText(discrip);
        bName.setText(name);

        if(num==1)
        {
            image.setBackgroundResource(R.drawable.cinema);
        }
        if(num==12)
        {
            image.setBackgroundResource(R.drawable.mcdonalds);
        }
        if(num==123)
        {
            image.setBackgroundResource(R.drawable.spa);
        }
        if(num==1234)
        {
            image.setBackgroundResource(R.drawable.rebar);
        }
        if(num==12345)
        {
            image.setBackgroundResource(R.drawable.golda);
        }
        if(num==123456)
        {
            image.setBackgroundResource(R.drawable.aroma);
        }
        if(num==1234567)
        {
            image.setBackgroundResource(R.drawable.holmesplace);
        }
        if(num==12345678)
        {
            image.setBackgroundResource(R.drawable.rikoshet);
        }
    }

    @Override
    public void onClick(View view) {

        if(view.getId()==back.getId())
        {
            Intent intent;
            intent = new Intent(this, DealsActivity.class);
            startActivity(intent);
        }

    }
}