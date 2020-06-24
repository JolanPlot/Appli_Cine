package com.example.app_cine.data;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.graphics.Movie;

public class MoviesDbHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "movies.db";

    private static final int DATABASE_VERSION = 1;

    public MoviesDbHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }



    @Override
    public void onCreate(SQLiteDatabase db) {

        // Création de la structure de la requete SQL
        final String SQL_CREATE_MOVIES_TABLE =

                "CREATE TABLE " + MoviesCols.COLUMN_MOVIE_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                        MoviesCols.TABLE_NAME + " (" +
                        MoviesCols.COLUMN_TITLE + "STRING," +
                        MoviesCols.COLUMN_DATE + "INTERGER," +
                        MoviesCols.COLUMN_TIMES + "INTERGER," +

                        MoviesCols.COLUMN_GRADE_SCENARIO + "INTERGER," +
                        MoviesCols.COLUMN_GRADE_REALISATION + "INTERGER," +
                        MoviesCols.COLUMN_GRADE_MUSIC + "INTERGER," +
                        MoviesCols.COLUMN_DESCRIPTION + "STRING" + ");";

        db.execSQL(SQL_CREATE_MOVIES_TABLE);  // Excécution de la requete SQL
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + MoviesCols.TABLE_NAME);
        onCreate(db);
    }


    public void addMovie(Movie movie){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

    }




}
