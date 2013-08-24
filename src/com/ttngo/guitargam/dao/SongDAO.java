package com.ttngo.guitargam.dao;

import java.util.List;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.ttngo.guitargam.data.SongDetailItem;
import com.ttngo.guitargam.data.SongListItem;
import com.ttngo.guitargam.database.GGSQLiteHelper;

public class SongDAO {
	
	private static final String TABLE_NAME = "songs";

	private SQLiteDatabase db;
	private GGSQLiteHelper dbHelper;

	/**
	 * constructor
	 * open & get writeable db
	 */
	public SongDAO(Context context) {
		dbHelper = new GGSQLiteHelper(context);
		db = dbHelper.getWritableDatabase();
	}

	/**
	 * close db
	 */
	public void close() {
		db.close();
	}

	/**
	 * get detail by id
	 * @param id
	 * @return
	 */
	public SongDetailItem get(int id) {
		// column get
		String[] columns = new String[] {"_id", "name"};

		// where value
		String[] params = new String[] {String.valueOf(id)};

		// query
		Cursor cursor = db.query(TABLE_NAME, columns, "_id = ?", params, null, null, null);

		// return
		SongDetailItem ret = new SongDetailItem();
		ret.setId(cursor.getInt(cursor.getColumnIndex("_id")));
		ret.setName(cursor.getString(cursor.getColumnIndex("name")));
		// TODO: more...
		return ret;
	}

	/**
	 * find all
	 * @param pageIndex
	 * @param pageSize
	 * @return
	 */
	public List<SongListItem> findAll(int pageIndex, int pageSize) {
		//TODO
		return null;
	}

	/**
	 * find by name
	 * @param text
	 * @param pageIndex
	 * @param pageSize
	 * @return
	 */
	public List<SongListItem> find(String text, int pageIndex, int pageSize) {
		//TODO
		return null;
	}

	/**
	 * add a detail song
	 * @param song
	 * @return
	 */
	public int add(SongDetailItem song) {
		// create data
		ContentValues contentValues = new ContentValues();
		contentValues.put("name", song.getName());
		// TODO: more...

		// insert to db
		long rowId = db.insert(TABLE_NAME, null, contentValues);

		// get item by row id for just _id
		String[] columns = new String[] {"_id"};
		String[] params = new String[] {String.valueOf(rowId)};
		Cursor cursor = db.query(TABLE_NAME, columns, "rowid = ?", params, null, null, null);

		// return
		int ret = cursor.getInt(cursor.getColumnIndex("_id"));
		return ret;
	}

	/**
	 * delete by id
	 * @param id
	 */
	public void delete(int id) {
		db.delete(TABLE_NAME, "_id = " + id, null);
	}
}
