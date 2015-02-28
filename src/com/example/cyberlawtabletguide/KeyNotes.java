package com.example.cyberlawtabletguide;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.example.cyberlawtabletguideimptopics.Topic1;
import com.example.cyberlawtabletguideimptopics.Topic2;
import com.example.cyberlawtabletguideimptopics.Topic3;
import com.example.cyberlawtabletguideimptopics.Topic4;
import com.example.cyberlawtabletguideimptopics.Topic5;

public class KeyNotes extends Activity {
    private Button top1;
    private Button top2;
    private Button top3;
    private Button top4;
    private Button top5;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_key_notes);
		top1 = (Button) findViewById(R.id.Top1);
		top2 = (Button) findViewById(R.id.Top2);
		top3 = (Button) findViewById(R.id.Top3);
		top4 = (Button) findViewById(R.id.Top4);
		top5 = (Button) findViewById(R.id.Top5);
		
		OnClickListener listener1 = new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent intent1=new Intent(getApplicationContext(), Topic1.class);
                startActivity(intent1);
			}
			
			
		};
		top1.setOnClickListener(listener1);
		
		OnClickListener listener2 = new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent intent2=new Intent(getApplicationContext(), Topic2.class);
                startActivity(intent2);
				
			}
			
			
		};
		top2.setOnClickListener(listener2);
		
		OnClickListener listener3 = new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent intent3=new Intent(getApplicationContext(), Topic3.class);
                startActivity(intent3);
				
			}
			
			
		};
		top3.setOnClickListener(listener3);
		
		OnClickListener listener4 = new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent intent4=new Intent(getApplicationContext(), Topic4.class);
                startActivity(intent4);
				
			}
			
			
		};
		top4.setOnClickListener(listener4);
		
		OnClickListener listener5 = new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent intent5=new Intent(getApplicationContext(), Topic5.class);
                startActivity(intent5);
				
			}
			
			
		};
		top5.setOnClickListener(listener5);
	}

	
}
