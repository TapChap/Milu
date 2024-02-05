package com.example.milu;

import android.util.Log;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Compensation {
    boolean fighter, hasKidsBelow14, hasSpecialNeedsKids, selfEmployed, student;
    int reserveDaysBeforeOct7th;
    LocalDate recruitmentDate, releaseDate;

    public Compensation(
            boolean fighter, boolean hasKidsBelow14, boolean hasSpecialNeedsKids,
            boolean selfEmployed, boolean student, int reserveDaysBeforeOct7th,
            LocalDate recruitmentDate, LocalDate releaseDate) {

//        if (recruitmentDate.after(releaseDate)) throw new IllegalArgumentException("Recruitment date cannot be after release date");
//        if (recruitmentDate.before(new Date(2023, 10, 7)))
//            throw new IllegalArgumentException("Recruitment date cannot be before october seventh 2023");

        this.fighter = fighter;
        this.hasKidsBelow14 = hasKidsBelow14;
        this.hasSpecialNeedsKids = hasSpecialNeedsKids;
        this.selfEmployed = selfEmployed;
        this.student = student;

        this.reserveDaysBeforeOct7th = reserveDaysBeforeOct7th;
        this.recruitmentDate = recruitmentDate;
        this.releaseDate = releaseDate;
    }

    public int calculateCompensation() {
        int compensation = 1250;
        int daysInService = getDaysInService(recruitmentDate, releaseDate);

        Log.d("Compensation", "Days in service: " + daysInService);

        if (daysInService >= 8) compensation += Math.max(40, daysInService) * 133;

        if (daysInService >= 40)
            compensation += (int) (((daysInService - 40) / 10.0) * (fighter ? 466 : 266));

        if (reserveDaysBeforeOct7th >= 20) compensation += 1250;

        if (hasKidsBelow14 && daysInService >= 8 && daysInService <= 40) compensation += 2000;
        if (hasKidsBelow14 && daysInService > 40) compensation += (int) ((daysInService / 10.0) * (fighter ? 500 : 833));

        if (hasSpecialNeedsKids && daysInService >= 45) compensation += 2000;

        if (student) {
            if (daysInService >= 5 && daysInService <= 10) compensation += 500;
            if (daysInService > 10 && daysInService <= 20) compensation += 1000;
            if (daysInService > 20) compensation += 2000;
        }

        return (int) (compensation * 1.2);
    }

    private int getDaysInService(LocalDate recruitmentDate, LocalDate releaseDate){
//        return Period.between(recruitmentDate, releaseDate).getDays();
        return (int) ChronoUnit.DAYS.between(recruitmentDate, releaseDate);
    }
}