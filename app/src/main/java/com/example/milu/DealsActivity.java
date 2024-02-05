package com.example.milu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class DealsActivity extends AppCompatActivity implements View.OnClickListener {

    public android.widget.Button btnBack, btnDeal1, btnDeal2, btnDeal3, btnDeal4, btnDeal5, btnDeal6,
            btnDeal7, btnDeal8, btnDeal9, btnDeal10, btnDeal11, btnDeal12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deals);

        btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(this);

        btnDeal1 = (android.widget.Button) findViewById(R.id.btnDeal1);
        btnDeal1.setOnClickListener(this);

        btnDeal2 = (android.widget.Button) findViewById(R.id.btnDeal2);
        btnDeal2.setOnClickListener(this);

        btnDeal3 = (android.widget.Button) findViewById(R.id.btnDeal3);
        btnDeal3.setOnClickListener(this);

        btnDeal4 = (android.widget.Button) findViewById(R.id.btnDeal4);
        btnDeal4.setOnClickListener(this);

        btnDeal5 = (android.widget.Button) findViewById(R.id.btnDeal5);
        btnDeal5.setOnClickListener(this);

        btnDeal6 = (android.widget.Button) findViewById(R.id.btnDeal6);
        btnDeal6.setOnClickListener(this);

        btnDeal7 = (android.widget.Button) findViewById(R.id.btnDeal7);
        btnDeal7.setOnClickListener(this);

        btnDeal8 = (android.widget.Button) findViewById(R.id.btnDeal8);
        btnDeal8.setOnClickListener(this);

        btnDeal9 = (android.widget.Button) findViewById(R.id.btnDeal9);
        btnDeal9.setOnClickListener(this);

        btnDeal10 = (android.widget.Button) findViewById(R.id.btnDeal10);
        btnDeal10.setOnClickListener(this);

        btnDeal11 = (android.widget.Button) findViewById(R.id.btnDeal11);
        btnDeal11.setOnClickListener(this);

        btnDeal12 = (android.widget.Button) findViewById(R.id.btnDeal12);
        btnDeal12.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        Intent intent;

        if (view.getId() == btnBack.getId()) {
            startActivity(new Intent(this, MainActivity.class));
        }

        if (view.getId() == btnDeal1.getId()) {
            intent = new Intent(this, Cinema.class);
            intent.putExtra("DATA1", "1+1 בסינמה סיטי");
            intent.putExtra("DATA2", "קופון ל1+1 על כרטיסים לכל סרט בסינמה סיטי באמצעות הקופון");
            intent.putExtra("DATA3", "12345678");
            intent.putExtra("DATA4", "1");

            startActivity(intent);
        }
        if (view.getId() == btnDeal2.getId()) {
            intent = new Intent(this, Cinema.class);
            intent.putExtra("DATA1", "50% הנחה במקדונלדס");
            intent.putExtra("DATA2", "50% הנחה על כל התפריט בכל סניפי מקדונלדס");
            intent.putExtra("DATA3", "23456781");
            intent.putExtra("DATA4", "2");

            startActivity(intent);
        }
        if (view.getId() == btnDeal3.getId()) {
            intent = new Intent(this, Cinema.class);
            intent.putExtra("DATA1", "ספא זוגי בחינם");
            intent.putExtra("DATA2", "קופון לספא זוגי מפנק ללא עלות בכלל");
            intent.putExtra("DATA3", "34567812");
            intent.putExtra("DATA4", "3");

            startActivity(intent);
        }
        if (view.getId() == btnDeal4.getId()) {
            intent = new Intent(this, Cinema.class);
            intent.putExtra("DATA1", "הגדלת משקה בריבר");
            intent.putExtra("DATA2", "קופון להגדלת משקה בריבר בחינם");
            intent.putExtra("DATA3", "45678123");
            intent.putExtra("DATA4", "4");

            startActivity(intent);
        }
        if (view.getId() == btnDeal5.getId()) {
            intent = new Intent(this, Cinema.class);
            intent.putExtra("DATA1", "גלידה בחינם בגולדה");
            intent.putExtra("DATA2", "קופון לכדור גלידה בחינם ברשת גולדה");
            intent.putExtra("DATA3", "56781234");
            intent.putExtra("DATA4", "5");

            startActivity(intent);
        }
        if (view.getId() == btnDeal6.getId()) {
            intent = new Intent(this, Cinema.class);
            intent.putExtra("DATA1", "קפה ומאפה בארומה");
            intent.putExtra("DATA2", "קופון לקפה ומאפה בחינם ברשת ארומה");
            intent.putExtra("DATA3", "67812345");
            intent.putExtra("DATA4", "6");

            startActivity(intent);
        }
        if (view.getId() == btnDeal7.getId()) {
            intent = new Intent(this, Cinema.class);
            intent.putExtra("DATA1", "מנוי להולמס פלייס");
            intent.putExtra("DATA2", "קופון למנוי חודשי בחינם ברשת הולמס פלייס");
            intent.putExtra("DATA3", "78123456");
            intent.putExtra("DATA4", "7");

            startActivity(intent);
        }
        if (view.getId() == btnDeal8.getId()) {
            intent = new Intent(this, Cinema.class);
            intent.putExtra("DATA1", "100 שקלים לריקושט");
            intent.putExtra("DATA2", "קופון ל100 שקלים למימוש בחנויות ריקושט");
            intent.putExtra("DATA3", "81234567");
            intent.putExtra("DATA4", "8");

            startActivity(intent);
        }

        if (view.getId() == btnDeal9.getId()) {
            intent = new Intent(this, Cinema.class);
            intent.putExtra("DATA1", "כניסה חינם לקיפצובה");
            intent.putExtra("DATA2", "קופון לכניסה חינם לכל המשפחה לקיפצובה");
            intent.putExtra("DATA3", "384754389");
            intent.putExtra("DATA4", "9");

            startActivity(intent);
        }

        if (view.getId() == btnDeal10.getId()) {
            intent = new Intent(this, Cinema.class);
            intent.putExtra("DATA1", "מגש פיצה אנג'ל חינם");
            intent.putExtra("DATA2", "מגש פיצה משפחתית חינם באנג'ל");
            intent.putExtra("DATA3", "985648697");
            intent.putExtra("DATA4", "10");

            startActivity(intent);
        }

        if (view.getId() == btnDeal11.getId()) {
            intent = new Intent(this, Cinema.class);
            intent.putExtra("DATA1", "תיקון לסמארטפון בחינם באייפרו");
            intent.putExtra("DATA2", "קופון לתיקון לכל מכשירי הטלפון בחינם באייפרו");
            intent.putExtra("DATA3", "658756445");
            intent.putExtra("DATA4", "11");

            startActivity(intent);
        }

        if (view.getId() == btnDeal12.getId()) {
            intent = new Intent(this, Cinema.class);
            intent.putExtra("DATA1", "50 שקלים לקניוני עזריאלי");
            intent.putExtra("DATA2", "קופון ל50 שקלים למימוש בקניוני עזריאלי");
            intent.putExtra("DATA3", "234578075");
            intent.putExtra("DATA4", "12");

            startActivity(intent);
        }
    }
}