package com.example.milu;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.util.Pair;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateValidatorPointForward;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener;

import java.text.DecimalFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZoneOffset;

public class CompensationActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText serviceDays;
    private CheckBox fighter, kidsBelow14, specialNeedsKids, selfEmployed, student;
    private AppCompatButton dateRange, submit;
    private TextView compensationTxt;

    private LocalDate recruitmentDate, releaseDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_compensation);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        dateRange = findViewById(R.id.dateRangeBtn);

        serviceDays = findViewById(R.id.serviceDaysInput);

        fighter = findViewById(R.id.fighter);
        kidsBelow14 = findViewById(R.id.hasKidsBelow14);
        specialNeedsKids = findViewById(R.id.hasSpecialNeedsKids);
        selfEmployed = findViewById(R.id.selfEmployed);
        student = findViewById(R.id.student);

        submit = findViewById(R.id.submitBtn);
        compensationTxt = findViewById(R.id.compensationsTxt);

        submit.setOnClickListener(this);
        dateRange.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.submitBtn) {
            try {
                Compensation compensation = new Compensation(
                        fighter.isChecked(), kidsBelow14.isChecked(), specialNeedsKids.isChecked(),
                        selfEmployed.isChecked(), student.isChecked(), Integer.parseInt(serviceDays.getText().toString()),
                        recruitmentDate, releaseDate);
                compensationTxt.setText(new DecimalFormat("#,###").format(compensation.calculateCompensation()) + "₪");

            } catch (Exception e) {
                Log.e("CALCULATOR", "calc", e);
            }
        }

        if (view.getId() == R.id.dateRangeBtn) {
            long octoberSeventhMilli = LocalDate.of(2023, 10, 07).atStartOfDay(ZoneOffset.UTC).toInstant().toEpochMilli();

            MaterialDatePicker dateRangePicker = MaterialDatePicker.Builder.dateRangePicker().setTitleText("Select dates")
                    .setCalendarConstraints(new CalendarConstraints.Builder().setValidator(DateValidatorPointForward.from(octoberSeventhMilli)).build())
                    .setSelection(
                            new Pair<>(octoberSeventhMilli,
                            MaterialDatePicker.todayInUtcMilliseconds()))
                    .build();

            dateRangePicker.addOnPositiveButtonClickListener((MaterialPickerOnPositiveButtonClickListener<Pair<Long, Long>>) selection -> {
                recruitmentDate = Instant.ofEpochMilli(selection.first).atZone(ZoneId.systemDefault()).toLocalDate();
                releaseDate = Instant.ofEpochMilli(selection.second).atZone(ZoneId.systemDefault()).toLocalDate();
            });

            dateRangePicker.show(getSupportFragmentManager(), "DATE_RANGE_PICKER");
        }
    }
}