package com.example.mtproject_cyberlaw_keynotes;

import com.example.mtproject_cyberlaw.R;
import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;


public class Topic1 extends Activity {

	private TextView Topic1;
    private TextView Top1;
    @Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_topic1);
		Topic1 = (TextView) findViewById(R.id.topic1);
		Top1 = (TextView) findViewById(R.id.top1);
	
		String no1 = (String) Topic1.getText();
		Topic1.setText(no1);
		String no2 = (String) Top1.getText();
		Top1.setText(Html.fromHtml("<b>"+no2+"</b>"));
	}

	
}
