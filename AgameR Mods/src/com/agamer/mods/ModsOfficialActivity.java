package com.agamer.mods;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.view.View.*;
import android.util.*;
import android.nfc.*;
import android.content.*;
import java.io.*;
import android.net.*;

public class ModsOfficialActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modsofficial);
		
		setupModsOfficialButtons();
    }
	
	private void setupModsOfficialButtons(){
		// 1. Get a reference to the button.

		/*File javaScriptFile2Import = new File("/sdcard/AgameR Mods/morethanmobspe.js");
		Intent i = new Intent();*/
		
		Button setupModsOfficialButton1 = (Button) findViewById(R.id.modsOfficialButton1);
		Button setupModsOfficialButton2 = (Button) findViewById(R.id.modsOfficialButton2);
		Button setupModsOfficialButton3 = (Button) findViewById(R.id.modsOfficialButton3);
		Button setupModsOfficialButton4 = (Button) findViewById(R.id.modsOfficialButton4);
		Button setupModsOfficialButton5 = (Button) findViewById(R.id.modsOfficialButton5);
		Button setupModsOfficialButton6 = (Button) findViewById(R.id.modsOfficialButton6);
		
		// 2. Set the click listener fo run my code

		setupModsOfficialButton1.setOnClickListener(new View.OnClickListener(){

				@Override
				public void onClick(View v){
					Intent intent = new Intent();
					intent.setAction(android.content.Intent.ACTION_VIEW);
					File file = new File("/sdcard/AgameR Mods/Mods/AgameR MoreThanMobs PE.js");
					intent.setDataAndType(Uri.fromFile(file), "text/js");
					startActivity(intent);
				}
			});

		setupModsOfficialButton2.setOnClickListener(new View.OnClickListener(){

				@Override
				public void onClick(View v){
					Intent intent = new Intent();
					intent.setAction(android.content.Intent.ACTION_VIEW);
					File file = new File("/sdcard/AgameR Mods/Mods/AgameR Paint Mod PE.js");
					intent.setDataAndType(Uri.fromFile(file), "text/js");
					startActivity(intent);
				}
			});
			
		setupModsOfficialButton3.setOnClickListener(new View.OnClickListener(){

				@Override
				public void onClick(View v){
					Intent intent = new Intent();
					intent.setAction(android.content.Intent.ACTION_VIEW);
					File file = new File("/sdcard/AgameR Mods/Mods/AgameR Hats Mod PE.js");
					intent.setDataAndType(Uri.fromFile(file), "text/js");
					startActivity(intent);
				}
			});
			
		setupModsOfficialButton4.setOnClickListener(new View.OnClickListener(){

				@Override
				public void onClick(View v){
					Intent intent = new Intent();
					intent.setAction(android.content.Intent.ACTION_VIEW);
					File file = new File("/sdcard/AgameR Mods/Mods/AgameR MoreThanBlocks PE.js");
					intent.setDataAndType(Uri.fromFile(file), "text/js");
					startActivity(intent);
				}
			});
			
		setupModsOfficialButton5.setOnClickListener(new View.OnClickListener(){

				@Override
				public void onClick(View v){
					Intent intent = new Intent();
					intent.setAction(android.content.Intent.ACTION_VIEW);
					File file = new File("/sdcard/AgameR Mods/Mods/AgameR Modpack PE.modpkg");
					intent.setDataAndType(Uri.fromFile(file), "*/*");
					startActivity(intent);
				}
			});
			
		setupModsOfficialButton6.setOnClickListener(new View.OnClickListener(){

				@Override
				public void onClick(View v){
					Intent intent = new Intent();
					intent.setAction(android.content.Intent.ACTION_VIEW);
					File file = new File("/sdcard/AgameR Mods/Mods/AgameR MoreOptions PE.js");
					intent.setDataAndType(Uri.fromFile(file), "text/js");
					startActivity(intent);
				}
			});
	}
}