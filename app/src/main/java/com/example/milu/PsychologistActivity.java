package com.example.milu;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.TimePicker;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;
import java.util.Random;

public class PsychologistActivity extends AppCompatActivity {
    Context context;
    Calendar calendar = Calendar.getInstance();
    int current_year, current_month, current_day, current_hour, current_minute;
    private void getCurrentDateAndtime() {
        current_year = calendar.get(Calendar.YEAR);
        current_month = calendar.get(Calendar.MONTH);
        current_day = calendar.get(Calendar.DAY_OF_MONTH);
        current_hour = calendar.get(Calendar.HOUR);
        current_minute = calendar.get(Calendar.MINUTE);
    }

    View appointmentsVerticalLayout;
    View appointmentsFragmentsScrollView, appointmentFragmentsLayout;
    View pointingOutTheTimeAndTheDateHeader;
    TimePicker theTime;
    CalendarView theCalendar;
    View psychologistsInterfaceButton, matchingByPsychologistsInterfaceButton, matchingByTimesInterfaceButton, timetableInterfaceButton;
    View fragmentPsychologistsList, fragmentMatchingByPsychologists, fragmentMatchingByTimes, fragmentTimetable;
    View appointmentButtonsHorizontalLayout;

    View psychologist;

    TimeAndDate userTimeAndDate;
    int insertTimeAndDate = 0;
    Random rnd = new Random();
    String[] doctors= new String[]{"אריאל כהן", "מנשה ליבוביץ'", "דניאל גרינברגר", "אפרים אביקסיס", "יהודה רוזן", "טל יהושע", "ישראל ברוט", "תום גורדן", "יובל קורנינסקי", "מרדכי אליעד", "יאיר מרקוביץ'", "יקוטיאל ולק"};
    int doctor;
    int timePickerHour, timePickerMinute, datePickerDay, datePickerMonth, datePickerYear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_psychologist);

        context = PsychologistActivity.this;

        userTimeAndDate = new TimeAndDate();

        initComponents();

        fragmentTimetable.setVisibility(View.VISIBLE);


            theCalendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
                @Override
                public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                    Toast.makeText(context, ""+dayOfMonth, Toast.LENGTH_LONG).show();
                    userTimeAndDate.setDay(dayOfMonth);
                    userTimeAndDate.setMonth(month);
                    userTimeAndDate.setYear(year);
                    insertTimeAndDate += 1;
                }
            });
            theTime.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
                @Override
                public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                    Toast.makeText(context,""+hourOfDay+" "+minute, Toast.LENGTH_LONG).show();
                    userTimeAndDate.setHourStart(hourOfDay);
                    userTimeAndDate.setMinuteStart(minute);
                    insertTimeAndDate += 1;
                }
            });


        //insertTimeAndDate = 0; // איפוס
        psychologist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doctor = rnd.nextInt(doctors.length);
                new AlertDialog.Builder(context)
                        .setTitle("קיבלת הצעת לפגישה עם פסיכולוג מקצועי")
                        .setMessage("התור שלך בתאריך: " + userTimeAndDate.getDay() + "." + userTimeAndDate.getMonth() + "." + userTimeAndDate.getYear() +
                                "\n" + "בשעה: " + userTimeAndDate.getHourStart() + ":" + userTimeAndDate.getMinuteStart()
                                + "\n" + "עם הדוקטור: "+ doctors[doctor]
                                + "\n" + "\n"+ "הודעת SMS תישלח עם קישור לפגישה בזום בתאריך שנקבע")
                        .setNeutralButton("OK", new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        })
                        .setIcon(R.drawable.milulogo)
                        .show();
            }
        });





    }

        /*public void setOnClickListener(View.OnClickListener(theCalendar));

        DatePickerDialog datePickerDialog = new DatePickerDialog(this.context, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                datePickerYear = year;
                datePickerMonth = month;
                datePickerDay = dayOfMonth;

            }
        }, current_year, current_month, current_day);
        datePickerDialog.show();
        TimePickerDialog timePickerDialog = new TimePickerDialog(this.context,
                new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        timePickerHour = hourOfDay;
                        timePickerMinute = minute;
                    }
                }, current_hour, current_minute, true);
        timePickerDialog.show();*/



    protected void initComponents() {
        appointmentsVerticalLayout = findViewById(R.id.appointmentsVerticalLayout);

        appointmentFragmentsLayout = findViewById(R.id.appointmentFragmentsLayout);

        pointingOutTheTimeAndTheDateHeader = findViewById(R.id.pointingOutTheTimeAndTheDateHeader);
        theCalendar = (CalendarView)  findViewById(R.id.theCalendar);
        theTime = (TimePicker) findViewById(R.id.theTime);

        fragmentPsychologistsList = findViewById(R.id.fragmentPsychologistsList);
        fragmentMatchingByPsychologists = findViewById(R.id.fragmentMatchingByPsychologists);
        fragmentMatchingByTimes = findViewById(R.id.fragmentMatchingByTimes);
        fragmentTimetable = findViewById(R.id.fragmentTimetable);

        psychologist = findViewById(R.id.psychologist);


    }




}