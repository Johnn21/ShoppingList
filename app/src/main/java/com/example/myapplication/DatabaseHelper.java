package com.example.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "application.db";


    public static final String MONEY_TABLE = "money_table";

    public static final String MONEY_COL1 = "money_id";
    public static final String MONEY_COL2 = "money_sum";

    public DatabaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTable = "CREATE TABLE " + MONEY_TABLE + " (money_id INTEGER PRIMARY KEY AUTOINCREMENT,  " + " money_sum INTEGER)";
        db.execSQL(createTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP IF TABLE EXISTS " + MONEY_TABLE);
        onCreate(db);
    }


    public boolean addData(int money_sum){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(MONEY_COL2, money_sum);

        long result = db.insert(MONEY_TABLE, null, contentValues);

        if(result == -1){
            return false;
        }else{
            return true;
        }


    }

}
