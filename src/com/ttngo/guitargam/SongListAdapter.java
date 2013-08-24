package com.ttngo.guitargam;

import java.util.List;

import com.ttngo.guitargam.data.SongListItem;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class SongListAdapter extends ArrayAdapter<SongListItem> {

	// context
	private final Context context;
	
	// values
	private final List<SongListItem> list;

	public SongListAdapter(Context context, List<SongListItem> list) {
		super(context, R.layout.activity_main, list);
		this.context = context;
		this.list = list;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// dynamic load layout
		LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

		// create row view
		View rowView = inflater.inflate(R.layout.activity_main, parent, false);

		// set name text
		TextView nameText = (TextView) rowView.findViewById(R.id.songListItemText);
		nameText.setText(list.get(position).getName());

		// return actual view item (actual/builded row view)
		return rowView;
	}
}
