package com.ttngo.guitargam;

import android.app.ListActivity;
import android.content.Intent;
import android.test.ActivityTestCase;
import android.test.ActivityUnitTestCase;
import android.test.suitebuilder.annotation.SmallTest;
import android.view.View;

public class MainActivityUnitTest extends ActivityUnitTestCase<MainActivity> /*ActivityTestCase*/ {

	private MainActivity activity;
	
	public MainActivityUnitTest() {
	    super(MainActivity.class);
	  }

	@Override
	  protected void setUp() throws Exception {
	    super.setUp();
	    Intent intent = new Intent(getInstrumentation().getTargetContext(),
	        MainActivity.class);
	    startActivity(intent, null, null);
	    activity = getActivity();
	  }
	
	  @SmallTest
	  public void testLayout() {
//	    buttonId = com.vogella.android.test.simpleactivity.R.id.button1;
//	    assertNotNull(activity.findViewById(buttonId));
//	    Button view = (Button) activity.findViewById(buttonId);
//	    assertEquals("Incorrect label of the button", "Start", view.getText());
	  }
	  
	  @SmallTest
	  public void testIntentTriggerViaOnClick() {
		  View view = null;

//	    buttonId = com.vogella.android.test.simpleactivity.R.id.button1;
//	    Button view = (Button) activity.findViewById(buttonId);
//	    assertNotNull("Button not allowed to be null", view);

	    // You would call the method directly via
		  activity.onClick(view);
	    
	    // TouchUtils cannot be used, only allowed in 
	    // InstrumentationTestCase or ActivityInstrumentationTestCase2 
	  
	    // Check the intent which was started
	    Intent triggeredIntent = getStartedActivityIntent();
	    assertNotNull("Intent was null", triggeredIntent);
	    String data = triggeredIntent.getExtras().getString("URL");

	    assertEquals("Incorrect data passed via the intent",
	        "http://www.vogella.com", data);
	  }

	  @Override
	  protected void tearDown() throws Exception {
	    super.tearDown();
	  }
}
