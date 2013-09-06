package com.ttngo.guitargam.dao;

import com.ttngo.guitargam.App;
import com.ttngo.guitargam.data.SongDetailItem;

import junit.framework.TestCase;
import android.content.Context;
import android.test.AndroidTestCase;
import android.test.ApplicationTestCase;
import android.test.mock.MockApplication;
import android.test.mock.MockContext;
import android.test.suitebuilder.annotation.SmallTest;

public class SongDAOTest extends /*TestCase*/ /*AndroidTestCase*/ ApplicationTestCase<App> {
	private Context context;
	private SongDAO dao;
	
    public SongDAOTest() {
        super(App.class);
    }

	@Override
	protected void setUp() throws Exception {
	    super.setUp();

	    // init & open connection
	    context = getContext();
	    dao = new SongDAO(context);
	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();

		// close connection
		dao.close();
	}

	@SmallTest
    public void testAdd() {
        // configure a mock implementation for the java.sql.Connection interface
//        final /*Mock*/Context mockContext = getContext();

        // replacing the real Connection implementation with
        // a mock implementation
        //SongDAO dao = new SongDAO(mockContext);

        // exercise the class under test and assert expectations
        SongDetailItem songAdd = new SongDetailItem();
        songAdd.setName("song 1");
        songAdd.setLyrics("song lyric 1");
        // TODO: more...

        SongDetailItem songRet = dao.add(songAdd);
        assertNotNull(songRet);
        assertEquals("song 1", songRet.getName());
        assertEquals("song lyric 1", songRet.getLyrics());
        // ...

        // afterwards, we can check with the mock implementation that the
        // class under test collaborated with it as expected
        //mock.verify();
    }
}
