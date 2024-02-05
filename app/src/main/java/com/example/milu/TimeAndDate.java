package com.example.milu;

import java.util.Calendar;

public class TimeAndDate {
    private Calendar calendar = Calendar.getInstance();
    private int current_year, current_month, current_day, current_hour, current_minute;
    private void getCurrentDateAndtime() {
        current_year = calendar.get(Calendar.YEAR);
        current_month = calendar.get(Calendar.MONTH);
        current_day = calendar.get(Calendar.DAY_OF_MONTH);
        current_hour = calendar.get(Calendar.HOUR);
        current_minute = calendar.get(Calendar.MINUTE);
    }

    private int year;
    private int month;
    private int day;

    private int hourStart;
    private int minuteStart;
    private int hourEnd;
    private int minuteEnd;

    TimeAndDate() {

    }

    public Calendar getCalendar() {
        return calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }

    public int getCurrent_year() {
        return current_year;
    }

    public void setCurrent_year(int current_year) {
        this.current_year = current_year;
    }

    public int getCurrent_month() {
        return current_month;
    }

    public void setCurrent_month(int current_month) {
        this.current_month = current_month;
    }

    public int getCurrent_day() {
        return current_day;
    }

    public void setCurrent_day(int current_day) {
        this.current_day = current_day;
    }

    public int getCurrent_hour() {
        return current_hour;
    }

    public void setCurrent_hour(int current_hour) {
        this.current_hour = current_hour;
    }

    public int getCurrent_minute() {
        return current_minute;
    }

    public void setCurrent_minute(int current_minute) {
        this.current_minute = current_minute;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getHourStart() {
        return hourStart;
    }

    public void setHourStart(int hourStart) {
        this.hourStart = hourStart;
    }

    public int getMinuteStart() {
        return minuteStart;
    }

    public void setMinuteStart(int minuteStart) {
        this.minuteStart = minuteStart;
    }

    public int getHourEnd() {
        return hourEnd;
    }

    public void setHourEnd(int hourEnd) {
        this.hourEnd = hourEnd;
    }

    public int getMinuteEnd() {
        return minuteEnd;
    }

    public void setMinuteEnd(int minuteEnd) {
        this.minuteEnd = minuteEnd;
    }

    public void setTimeAndDateYear(int day, int month, int year,
                                   int hourStart, int minuteStart, int hourEnd, int minuteEnd) {
        this.day = day;
        this.month = month;
        this.year = year;

        this.hourStart = hourStart;
        this.minuteStart = minuteStart;
        this.hourEnd = hourEnd;
        this.minuteEnd = minuteEnd;
    }

    public void setTimeAndDateMonth(int day, int month,
                                   int hourStart, int minuteStart, int hourEnd, int minuteEnd) {
        this.day = day;
        this.month = month;
        this.year = current_year;

        this.hourStart = hourStart;
        this.minuteStart = minuteStart;
        this.hourEnd = hourEnd;
        this.minuteEnd = minuteEnd;
    }

    public void setTimeAndDateDay(int day,
                                   int hourStart, int minuteStart, int hourEnd, int minuteEnd) {
        this.day = day;
        this.month = current_month;
        this.year = current_year;

        this.hourStart = hourStart;
        this.minuteStart = minuteStart;
        this.hourEnd = hourEnd;
        this.minuteEnd = minuteEnd;
    }

    public void setTime(int hourStart, int minuteStart, int hourEnd, int minuteEnd) {
        this.day = current_day;
        this.month = current_month;
        this.year = current_year;

        this.hourStart = hourStart;
        this.minuteStart = minuteStart;
        this.hourEnd = hourEnd;
        this.minuteEnd = minuteEnd;
    }

    public static void changeYear(TimeAndDate timeAndDate, int year) {
        timeAndDate.year = year;
    }
    public static void changeMonth(TimeAndDate timeAndDate, int month) {
        timeAndDate.month = month;
    }
    public static void changeDay(TimeAndDate timeAndDate, int day) {
        timeAndDate.day = day;
    }

    public static void changeHourStart(TimeAndDate timeAndDate, int hourStart) {
        timeAndDate.hourStart = hourStart;
    }
    public static void changeHourEnd(TimeAndDate timeAndDate, int hourEnd) {
        timeAndDate.hourEnd = hourEnd;
    }
    public static void changeMinuteStart(TimeAndDate timeAndDate, int minuteStart) {
        timeAndDate.minuteStart = minuteStart;
    }
    public static void changeMinuteEnd(TimeAndDate timeAndDate, int minuteEnd) {
        timeAndDate.minuteEnd = minuteEnd;
    }
}
