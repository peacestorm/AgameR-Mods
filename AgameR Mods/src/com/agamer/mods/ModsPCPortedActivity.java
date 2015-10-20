package com.agamer.mods;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.view.View.*;
import android.util.*;
import android.nfc.*;
import android.content.*;

public class ModsPCPortedActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modspcported);
		
		setupModsPCPortedButtons();
    }
	
	private void setupModsPCPortedButtons(){
		// 1. Get a reference to the button.

		/*File javaScriptFile2Import = new File("/sdcard/AgameR Mods/morethanmobspe.js");
		Intent i = new Intent();*/
		
		Button setupModsPCPortedButton1 = (Button) findViewById(R.id.modsPCPortedButton1);
		Button setupModsPCPortedButton2 = (Button) findViewById(R.id.modsPCPortedButton2);

		// 2. Set the click listener fo run my code

		setupModsPCPortedButton1.setOnClickListener(new View.OnClickListener(){

				@Override
				public void onClick(View v){
					/*i.setAction(android.content.Intent.ACTION_VIEW);
					i.setDataAndType(Uri.fromFile(javaScriptFile2Import), "text/javascript");
					startActivity(i);*/
					
				}
			});

		setupModsPCPortedButton2.setOnClickListener(new View.OnClickListener(){

				@Override
				public void onClick(View v){
					
				}
			});
	}
}