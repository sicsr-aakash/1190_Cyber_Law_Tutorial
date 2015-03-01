package com.example.mtproject_cyberlaw;

import java.util.concurrent.TimeUnit;



import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


@SuppressLint("ClickableViewAccessibility") public class QuizPage extends Activity {
	private Button StartQuiz;
	private TextView Time;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_quizzzzzz);
		
		StartQuiz = (Button) findViewById(R.id.startquiz);
		Time = (TextView) findViewById(R.id.time);
		OnTouchListener listener1 = new OnTouchListener() {

			@Override
			public boolean onTouch(View arg0, MotionEvent arg1) {
				// TODO Auto-generated method stub
				// TODO Auto-generated method stub
				Intent intent2 = new Intent(getApplicationContext(), Quiz1.class);
				startActivity(intent2);
			
			
				// TODO Auto-generated method stub
				new CountDownTimer(80000, 1000) { // adjust the milli seconds here

			        public void onTick(long millisUntilFinished) {
			        Time.setText(""+String.format("%d min, %d sec", 
			                        TimeUnit.MILLISECONDS.toMinutes( millisUntilFinished),
			                        TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished) - 
			                        TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished))));
			        }

			        public void onFinish() {
			           Toast.makeText(getApplicationContext(), "DONE",Toast.LENGTH_LONG).show();
			           //Intent i = new Intent(getApplicationContext(), Submit.class);
			           //startActivity(i);
			           
			           
			        }
			     }.start();

				return false;
			}
		};
		StartQuiz.setOnTouchListener(listener1);
		
	}
	

	
}