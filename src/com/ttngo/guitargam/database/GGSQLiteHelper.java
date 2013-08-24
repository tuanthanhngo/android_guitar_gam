package com.ttngo.guitargam.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class GGSQLiteHelper extends SQLiteOpenHelper {
	private static final String DBNAME = "guitagam_db";

	// constructor
	public GGSQLiteHelper(Context context) {
		super(context, DBNAME, null, 1);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// Execute create table SQL
		db.execSQL("CREATE TABLE songs (_id INTEGER PRIMARY KEY AUTOINCREMENT, song TEXT NOT NULL);");
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVer, int newVer) {
		// DROP table
		db.execSQL("DROP TABLE IF EXISTS songs");

		// Recreate table
		onCreate(db);
	}
}