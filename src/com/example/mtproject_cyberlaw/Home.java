package com.example.mtproject_cyberlaw;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class Home extends Activity {
	private Button Laws;
	private Button KeyNotes;
	private Button Videos;
	private Button Quiz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Laws = (Button) findViewById(R.id.laws);
        KeyNotes = (Button) findViewById(R.id.keynotes);
        Videos = (Button) findViewById(R.id.videos);
        Quiz = (Button) findViewById(R.id.quiz);
        
        OnClickListener listener1 = new OnClickListener() {

        	@Override
        	public void onClick(View arg0) {
        		// TODO Auto-generated method stub
        		
        		Intent intent=new Intent(getApplicationContext(), Laws.class);
                startActivity(intent);
        	}
        	
        };
          Laws.setOnClickListener(listener1);

          OnClickListener listener2 = new OnClickListener() {

        		@Override
        		public void onClick(View arg0) {
        			// TODO Auto-generated method stub
        			
        			Intent intent=new Intent(getApplicationContext(), KeyNotes.class);
        	        startActivity(intent);
        	        
        		}
        		
        	};
        	  KeyNotes.setOnClickListener(listener2);
        	  
        	  OnClickListener listener3 = new OnClickListener() {

        			@Override
        			public void onClick(View arg0) {
        				// TODO Auto-generated method stub
        				
        				Intent intent=new Intent(getApplicationContext(), Videos.class);
        		        startActivity(intent);
        		        
        			}
        			
        		};
        		  Videos.setOnClickListener(listener3);
        		  
        		  OnClickListener listener4 = new OnClickListener() {

        				@Override
        				public void onClick(View arg0) {
        					// TODO Auto-generated method stub
        					
        					Intent intent=new Intent(getApplicationContext(), QuizPage.class);
        			        startActivity(intent);
        				}
        				
        			};
        			  Quiz.setOnClickListener(listener4);
           
    }
}
