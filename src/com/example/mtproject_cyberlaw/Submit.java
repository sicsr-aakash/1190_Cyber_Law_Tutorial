package com.example.mtproject_cyberlaw;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Submit extends Activity {
	private Button Home;
	private TextView Total;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_submit);
		Total = (TextView) findViewById(R.id.totalmarks);
		int un= getIntent().getExtras().getInt("sumstring");
	       Total.setText("TOTAL MARKS GAINED: " + un);
	       
		Home = (Button) findViewById(R.id.home);

		OnClickListener listener1 = new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent6 = new Intent(getApplicationContext(),Home.class);
				startActivity(intent6);
				Submit.this.finish();
			}
			
		};
		Home.setOnClickListener(listener1);
	}}

