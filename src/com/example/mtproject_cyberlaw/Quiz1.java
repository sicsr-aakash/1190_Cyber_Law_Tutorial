package com.example.mtproject_cyberlaw;


import com.example.mtproject_cyberlaw.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

public class Quiz1 extends Activity {
	private RadioButton A;
	private RadioButton B;
	private RadioButton C;
	private RadioButton A1;
	private RadioButton B1;
	private RadioButton C1;
	private RadioGroup Ans1;
	private RadioGroup Ans2;
	private RadioGroup Ans3;
	private RadioButton A2;
	private RadioButton B2;
	private RadioButton C2;
	private Button NextQ2;
	int sum=0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_quiz1);
		
		A = (RadioButton) findViewById(R.id.a);
		B = (RadioButton) findViewById(R.id.b);
		C = (RadioButton) findViewById(R.id.c);
		A1 = (RadioButton) findViewById(R.id.a3);
		B1 = (RadioButton) findViewById(R.id.b3);
		C1 = (RadioButton) findViewById(R.id.c3);
		A2 = (RadioButton) findViewById(R.id.a2);
		B2 = (RadioButton) findViewById(R.id.b2);
		C2 = (RadioButton) findViewById(R.id.c2);
		Ans1 = (RadioGroup) findViewById(R.id.ans);
		Ans2 = (RadioGroup) findViewById(R.id.ans2);
		Ans3 = (RadioGroup) findViewById(R.id.ans3);
		NextQ2 = (Button) findViewById(R.id.submit);
		

		
	
		
		OnCheckedChangeListener listener = new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				if (A.isChecked()) {
					sum++;
                } 
				/*else if (A.isChecked() == false) {
					sum=sum+0;
                } 
				
                else if (Ans1.getCheckedRadioButtonId() == -1) {
                	sum = sum+0;}*/
				
				/*if (B2.isChecked()) {
                        sum++;
                     }
                	else if (B2.isChecked() == false) {
    					sum=sum+0;
                    } 
                	 else if (Ans2.getCheckedRadioButtonId() == -1) {
                     	sum = sum+ 0;
                     }*/
                	
				/*if (B1.isChecked()) {
                        sum++;
                     }
                	/*else if (B1.isChecked() == false) {
    					sum=sum+0;
                    } 
                     else if (Ans3.getCheckedRadioButtonId() == -1) {
                     	sum = sum+ 0;
                     }*/
                	
                	
     				
                }
				
			
		};
		Ans1.setOnCheckedChangeListener(listener);
OnCheckedChangeListener listener2 = new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				
				
				if (B2.isChecked()) {
                        sum++;
                     }
                	/*else if (B2.isChecked() == false) {
    					sum=sum+0;
                    } 
                	 else if (Ans2.getCheckedRadioButtonId() == -1) {
                     	sum = sum+ 0;
                     }*/
                	
				
                	
     				
                }
				
			
		};
		Ans2.setOnCheckedChangeListener(listener2);
OnCheckedChangeListener listener3 = new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				
				
				
                	
				if (B1.isChecked()) {
                        sum++;
                     }
                	/*else if (B1.isChecked() == false) {
    					sum=sum+0;
                    } 
                     else if (Ans3.getCheckedRadioButtonId() == -1) {
                     	sum = sum+ 0;
                     }*/
                	
                	
     				
                }
				
			
		};
		Ans3.setOnCheckedChangeListener(listener3);
		OnClickListener listener1 = new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent6 = new Intent(getApplicationContext(),Submit.class);
				startActivity(intent6);
				/* intent is just the message passed */
				//or
				Bundle bundle = new Bundle();
				bundle.putInt("sumstring", sum);
				intent6.putExtras(bundle);
				//extrasss as plural
				startActivity(intent6);
				//Toast.makeText(getApplicationContext(), sum,Toast.LENGTH_LONG).show();
			}
			
		};
		NextQ2.setOnClickListener(listener1);
		
					
	}
	
	
}
	
	


