package com.example.callrecorderproto1;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

	Audio_Recorder_Class ar;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd MM yyyy_HH mm ss");
		String currentDateandTime = sdf.format(new Date());

		ar = new Audio_Recorder_Class(currentDateandTime);
	}
	
	public void start(View v) throws IOException {
			Toast.makeText(this, "Record Started", 10000).show();
			ar.start();
	}
	
	public void stop(View v) throws IOException {
		Toast.makeText(this, "Record Stoped", 10000).show();
		ar.stop();
}

}
