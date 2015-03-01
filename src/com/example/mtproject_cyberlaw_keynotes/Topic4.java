package com.example.mtproject_cyberlaw_keynotes;

import com.example.mtproject_cyberlaw.R;
import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;


public class Topic4 extends Activity {

	private TextView Topic4;
    private TextView Top4;
    @Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_topic4);
		Topic4 = (TextView) findViewById(R.id.topic4);
		Top4 = (TextView) findViewById(R.id.top4);
	
		String no1 = (String) Topic4.getText();
		Topic4.setText(no1);
		String no2 = (String) Top4.getText();
		Top4.setText(Html.fromHtml("<b>"+no2+"</b>"));
	}
}