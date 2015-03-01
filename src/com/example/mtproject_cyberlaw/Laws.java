package com.example.mtproject_cyberlaw;

import com.example.mtproject_cyberlaw_laws.Chp1;
import com.example.mtproject_cyberlaw_laws.Chp10;
import com.example.mtproject_cyberlaw_laws.Chp11;
import com.example.mtproject_cyberlaw_laws.Chp12;
import com.example.mtproject_cyberlaw_laws.Chp12a;
import com.example.mtproject_cyberlaw_laws.Chp13;
import com.example.mtproject_cyberlaw_laws.Chp2;
import com.example.mtproject_cyberlaw_laws.Chp3;
import com.example.mtproject_cyberlaw_laws.Chp4;
import com.example.mtproject_cyberlaw_laws.Chp5;
import com.example.mtproject_cyberlaw_laws.Chp6;
import com.example.mtproject_cyberlaw_laws.Chp7;
import com.example.mtproject_cyberlaw_laws.Chp8;
import com.example.mtproject_cyberlaw_laws.Chp9;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Laws extends Activity {
	private Button Chapter1;
    private Button Chapter2;
    private Button Chapter3;
    private Button Chapter4;
    private Button Chapter5;
    private Button Chapter6;
    private Button Chapter7;
    private Button Chapter8;
    private Button Chapter9;
    private Button Chapter10;
    private Button Chapter11;
    private Button Chapter12;
    private Button Chapter12A;
    private Button Chapter13;
    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_laws);
		
		Chapter1 = (Button) findViewById(R.id.Chp1);
		Chapter2 = (Button) findViewById(R.id.Chp2);
		Chapter3 = (Button) findViewById(R.id.Chp3);
		Chapter4 = (Button) findViewById(R.id.Chp4);
		Chapter5 = (Button) findViewById(R.id.Chp5);
		Chapter6 = (Button) findViewById(R.id.Chp6);
		Chapter7 = (Button) findViewById(R.id.Chp7);
		Chapter8 = (Button) findViewById(R.id.Chp8);
		Chapter9 = (Button) findViewById(R.id.Chp9);
		Chapter10 = (Button) findViewById(R.id.Chp10);
		Chapter11 = (Button) findViewById(R.id.Chp11);
		Chapter12 = (Button) findViewById(R.id.Chp12);
		Chapter12A = (Button) findViewById(R.id.Chp12a);
		Chapter13 = (Button) findViewById(R.id.Chp13);
		
		OnClickListener listener1 = new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent intent1=new Intent(getApplicationContext(), Chp1.class);
                startActivity(intent1);
			}
			
			
		};
		Chapter1.setOnClickListener(listener1);
		
		OnClickListener listener2 = new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent intent2=new Intent(getApplicationContext(), Chp2.class);
                startActivity(intent2);
				
			}
			
			
		};
		Chapter2.setOnClickListener(listener2);
		
		OnClickListener listener3 = new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent intent3=new Intent(getApplicationContext(), Chp3.class);
                startActivity(intent3);
				
			}
			
			
		};
		Chapter3.setOnClickListener(listener3);
		
		OnClickListener listener4 = new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent intent4=new Intent(getApplicationContext(), Chp4.class);
                startActivity(intent4);
				
			}
			
			
		};
		Chapter4.setOnClickListener(listener4);
		
		OnClickListener listener5 = new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent intent5=new Intent(getApplicationContext(), Chp5.class);
                startActivity(intent5);
				
			}
			
			
		};
		Chapter5.setOnClickListener(listener5);
		
		OnClickListener listener6 = new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent intent6=new Intent(getApplicationContext(), Chp6.class);
                startActivity(intent6);
				
			}
			
			
		};
		Chapter6.setOnClickListener(listener6);
		
		OnClickListener listener7 = new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent intent7=new Intent(getApplicationContext(), Chp7.class);
                startActivity(intent7);
				
			}
			
			
		};
		Chapter7.setOnClickListener(listener7);
		
		OnClickListener listener8 = new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent intent8=new Intent(getApplicationContext(), Chp8.class);
                startActivity(intent8);
				
			}
			
			
		};
		Chapter8.setOnClickListener(listener8);
		
		OnClickListener listener9 = new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent intent9=new Intent(getApplicationContext(), Chp9.class);
                startActivity(intent9);
				
			}
			
			
		};
		Chapter9.setOnClickListener(listener9);
		
		OnClickListener listener10 = new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent intent10=new Intent(getApplicationContext(), Chp10.class);
                startActivity(intent10);
				
			}
			
			
		};
		Chapter10.setOnClickListener(listener10);
		
		OnClickListener listener11 = new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent intent11=new Intent(getApplicationContext(), Chp11.class);
                startActivity(intent11);
				
			}
			
			
		};
		Chapter11.setOnClickListener(listener11);
		
		OnClickListener listener12 = new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent intent12=new Intent(getApplicationContext(), Chp12.class);
                startActivity(intent12);
				
			}
			
			
		};
		Chapter12.setOnClickListener(listener12);
		
		OnClickListener listener12A = new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent intent12A=new Intent(getApplicationContext(), Chp12a.class);
                startActivity(intent12A);
				
			}
			
			
		};
		Chapter12A.setOnClickListener(listener12A);
		
		OnClickListener listener13 = new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent intent13=new Intent(getApplicationContext(), Chp13.class);
                startActivity(intent13);
				
			}
			
			
		};
		Chapter13.setOnClickListener(listener13);
		
		
	}
}