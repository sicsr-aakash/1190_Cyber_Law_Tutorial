package com.example.cyberlawtabletguide;

import android.app.Activity;
import android.os.Bundle;
import android.net.Uri;
import android.util.Log;
import android.widget.MediaController;
import android.widget.VideoView;
 
public class Videos extends Activity {
 
	VideoView videoView;
	String storage_file_path, video_filename;
	
	
 
	
 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// Get the layout from video_main.xml
		setContentView(R.layout.activity_videos);
		storage_file_path =  "android.resource://"+  getPackageName() + "/raw/u";
		VideoView videoView = (VideoView) this.findViewById(R.id.VideoView);
		video_filename = getIntent().getStringExtra("video_filename");
		Log.e("video store path", storage_file_path); 
		//String path = "android.resource://" + getPackageName() + "/" + R.raw.test7;		
        Uri uri = Uri.parse(storage_file_path);
        
        MediaController vidControl = new MediaController(this);
        vidControl.setAnchorView(videoView);
        videoView.setMediaController(vidControl);
        videoView.setVideoURI(uri);
        videoView.requestFocus();   

	
 
}}

