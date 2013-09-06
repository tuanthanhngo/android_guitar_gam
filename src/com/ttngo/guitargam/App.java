package com.ttngo.guitargam;

import android.app.Application;
import android.content.Context;

public class App extends Application {
	
	public static App INSTANCE;
	public Context mContext;

	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();

		INSTANCE = this;
		mContext = getApplicationContext();
	}


	public Context getContext() {
		return mContext;
	}
}
