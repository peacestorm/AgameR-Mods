package com.agamer.mods;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.view.View.*;
import android.util.*;
import android.nfc.*;
import android.content.*;
import android.graphics.*;
import java.io.*;
import java.net.*;
import org.apache.http.util.*;
import android.net.*;

public class MainActivity extends Activity
{
	private final String TAG = "DemoButtonApp";
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		setupButtons();
		fileDownload("https://raw.githubusercontent.com/peacestorm/AgameR-Mods/master/AgameR%20MoreThanMobs%20PE.js","AgameR MoreThanMobs PE.js");
  	    fileDownload("https://raw.githubusercontent.com/peacestorm/AgameR-Mods/master/AgameR%20Paint%20Mod%20PE.js","AgameR Paint Mod PE.js");
        fileDownload("https://raw.githubusercontent.com/peacestorm/AgameR-Mods/master/AgameR%20Hats%20Mod%20PE.js","AgameR Hats Mod PE.js");
        fileDownload("https://raw.githubusercontent.com/peacestorm/AgameR-Mods/master/AgameR%20MoreThanBlocks%20PE.js","AgameR MoreThanBlocks PE.js");
		fileDownload("https://raw.githubusercontent.com/peacestorm/AgameR-Mods/master/AgameR%20Modpack%20PE.modpkg","AgameR Modpack PE.modpkg");
		fileDownload("https://raw.githubusercontent.com/peacestorm/AgameR-Mods/master/AgameR%20MoreOptions%20PE.js","AgameR MoreOptions PE.js");
    }
	
	protected void launchApp(String packageName) {
		
        Intent mIntent = getPackageManager().getLaunchIntentForPackage(
			
		packageName);
		
        if (mIntent != null) {
			
            try {
				
                startActivity(mIntent);
				
            } catch (ActivityNotFoundException err) {
				
                Toast t = Toast.makeText(getApplicationContext(),
										 
				"This app cannot be launched!", Toast.LENGTH_SHORT);
				
                t.show();
				
            }
			
        }
		
    }
	
	public void fileDownload(String url, String fileName) {

        //SET CUSTOM PATH HERE. Example:

        File direct = new File(Environment.getExternalStorageDirectory() + "/AgameR Mods/mods");

      //The code above will save the file to /sdcard/Mods

 

      if (!direct.exists()) {

            direct.mkdirs();

       }

 

        DownloadManager mgr = (DownloadManager) this.getSystemService(Context.DOWNLOAD_SERVICE);

 

        Uri downloadUri = Uri.parse(url);

       DownloadManager.Request request = new DownloadManager.Request(downloadUri);

 

        request.setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI | DownloadManager.Request.NETWORK_MOBILE)

                .setAllowedOverRoaming(false).setTitle("Downloading Mod")

                .setDestinationInExternalPublicDir("/AgameR Mods/mods", fileName);

                //Make the string above the same as you did before. In this case, it was "/Mods"

 

        mgr.enqueue(request);

}

 

//To download a file, call

// fileDownload(URL_HERE);
	
	private void setupButtons(){
		// 1. Get a reference to the button.
		
		Button setupButton1 = (Button) findViewById(R.id.button1);
		Button setupButton2 = (Button) findViewById(R.id.button2);
		Button setupButton3 = (Button) findViewById(R.id.smallButton1);
		Button setupButton4 = (Button) findViewById(R.id.smallButton2);
		
		// 2. Set the click listener fo run my code
		
		setupButton1.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View v){
				startActivity(new Intent("com.agamer.mods.ModsMainActivity"));
			}
		});
		
		setupButton2.setOnClickListener(new View.OnClickListener(){
			
			@Override
			public void onClick(View v){
				startActivity(new Intent("com.agamer.mods.InfoActivity"));
			}
		});
		
		setupButton3.setOnClickListener(new View.OnClickListener(){

				@Override
				public void onClick(View v){
					launchApp("net.zhuoweizhang.mcpelauncher");
				}
			});
			
		setupButton4.setOnClickListener(new View.OnClickListener(){

				@Override
				public void onClick(View v){
					launchApp("net.zhuoweizhang.mcpelauncher.pro");
				}
			});
	}
}