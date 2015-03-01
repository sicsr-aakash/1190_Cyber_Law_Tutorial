package com.example.mtproject_cyberlaw_laws;

import com.example.mtproject_cyberlaw.R;
import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class Chp6 extends Activity {
	private TextView View6;
    private TextView Head6;
    @Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_chp6);
		View6 = (TextView) findViewById(R.id.view6);
		Head6 = (TextView) findViewById(R.id.head6);
	
		String no1 = (String) View6.getText();
		View6.setText(no1);
		String no2 = (String) Head6.getText();
		Head6.setText(Html.fromHtml("<b>"+no2+"</b>"));
	}

	
}
