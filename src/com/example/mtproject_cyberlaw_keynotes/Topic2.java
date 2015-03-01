package com.example.mtproject_cyberlaw_keynotes;

import com.example.mtproject_cyberlaw.R;
import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;


public class Topic2 extends Activity {

	private TextView Topic2;
    private TextView Top2;
    @Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_topic2);
		Topic2 = (TextView) findViewById(R.id.topic2);
		Top2 = (TextView) findViewById(R.id.top2);
	
		String no1 = (String) Topic2.getText();
		Topic2.setText(no1);
		String no2 = (String) Top2.getText();
		Top2.setText(Html.fromHtml("<b>"+no2+"</b>"));
	}
}