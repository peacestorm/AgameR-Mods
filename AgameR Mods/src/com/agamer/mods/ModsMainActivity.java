package com.agamer.mods;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.view.View.*;
import android.util.*;
import android.nfc.*;
import android.content.*;

public class ModsMainActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modsmain);
		
		setupModsMainButtons();
    }
	
	private void setupModsMainButtons(){
		// 1. Get a reference to the button.

		/*File javaScriptFile2Import = new File("/sdcard/AgameR Mods/morethanmobspe.js");
		Intent i = new Intent();*/
		
		Button setupModsMainButton1 = (Button) findViewById(R.id.modsMainButton1);
		Button setupModsMainButton2 = (Button) findViewById(R.id.modsMainButton2);

		// 2. Set the click listener fo run my code

		setupModsMainButton1.setOnClickListener(new View.OnClickListener(){

				@Override
				public void onClick(View v){
					/*i.setAction(android.content.Intent.ACTION_VIEW);
					i.setDataAndType(Uri.fromFile(javaScriptFile2Import), "text/javascript");
					startActivity(i);*/
					startActivity(new Intent("com.agamer.mods.ModsOfficialActivity"));
				}
			});

		setupModsMainButton2.setOnClickListener(new View.OnClickListener(){

				@Override
				public void onClick(View v){
					startActivity(new Intent("com.agamer.mods.ModsPCPortedActivity"));
				}
			});
	}
}