package com.ttngo.guitargam;

import java.util.ArrayList;
import java.util.List;

import com.ttngo.guitargam.data.SongListItem;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.Menu;

public class MainActivity extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// create data list
		// TODO: get from db / server?
		List<SongListItem> songList = new ArrayList<SongListItem>();
		songList.add(new SongListItem(1, "song 1"));
		songList.add(new SongListItem(2, "song 2"));
		songList.add(new SongListItem(3, "song 3"));
		
		// build view with list addapter
		setListAdapter(new SongListAdapter(this, songList));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
