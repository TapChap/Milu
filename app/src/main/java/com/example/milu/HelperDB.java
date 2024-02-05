package com.example.milu;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

class HelperDB extends SQLiteOpenHelper {

    public static final String DB_FILE="all_users.db";

    public static final String TABLE_USERS="Users";
    public static final String NAME="Name";
    public static final String SURNAME="Surname";
    public static final String TEUDAT_ZEHUT="TeudatZehut";
    public static final String TELEPHONE_NUMBER="TelephoneNumber";
    //public static final String PRICE="Price";

    public HelperDB(Context context) {
        super(context, DB_FILE, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String st="CREATE TABLE IF NOT EXISTS "+TABLE_USERS+" ( ";
        st+=NAME+" TEXT, "+SURNAME+" TEXT, "+TEUDAT_ZEHUT+" TEXT, "+TELEPHONE_NUMBER+" INTEGER);";
        db.execSQL(st);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}

