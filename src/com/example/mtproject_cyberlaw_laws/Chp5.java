package com.example.mtproject_cyberlaw_laws;

import com.example.mtproject_cyberlaw.R;
import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class Chp5 extends Activity {
	private TextView View5;
    private TextView Head5;
    @Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_chp5);
		View5 = (TextView) findViewById(R.id.view5);
		Head5 = (TextView) findViewById(R.id.head5);
	
		String no1 = (String) View5.getText();
		View5.setText(no1);
		String no2 = (String) Head5.getText();
		Head5.setText(Html.fromHtml("<b>"+no2+"</b>"));
	}

	
}
