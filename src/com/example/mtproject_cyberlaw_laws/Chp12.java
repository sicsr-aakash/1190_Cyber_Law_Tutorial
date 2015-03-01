package com.example.mtproject_cyberlaw_laws;

import com.example.mtproject_cyberlaw.R;
import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;


public class Chp12 extends Activity {

	private TextView View12;
    private TextView Head12;
    @Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_chp12);
		View12 = (TextView) findViewById(R.id.view12);
		Head12 = (TextView) findViewById(R.id.head12);
	
		String no1 = (String) View12.getText();
		View12.setText(no1);
		String no2 = (String) Head12.getText();
		Head12.setText(Html.fromHtml("<b>"+no2+"</b>"));
	}


}
