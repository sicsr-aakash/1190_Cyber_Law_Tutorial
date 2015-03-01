package com.example.mtproject_cyberlaw_keynotes;

import com.example.mtproject_cyberlaw.R;
import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;


public class Topic3 extends Activity {

	private TextView Topic3;
    private TextView Top3;
    @Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_topic3);
		Topic3 = (TextView) findViewById(R.id.topic3);
		Top3 = (TextView) findViewById(R.id.top3);
	
		String no1 = (String) Topic3.getText();
		Topic3.setText(no1);
		String no2 = (String) Top3.getText();
		Top3.setText(Html.fromHtml("<b>"+no2+"</b>"));
	}
}