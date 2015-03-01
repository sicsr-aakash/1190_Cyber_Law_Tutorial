package com.example.mtproject_cyberlaw_laws;

import com.example.mtproject_cyberlaw.R;
import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;


public class Chp12a extends Activity {

	private TextView View12a;
    private TextView Head12a;
    @Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_chp12a);
		View12a = (TextView) findViewById(R.id.view12a);
		Head12a = (TextView) findViewById(R.id.head12a);
	
		String no1 = (String) View12a.getText();
		View12a.setText(no1);
		String no2 = (String) Head12a.getText();
		Head12a.setText(Html.fromHtml("<b>"+no2+"</b>"));
	}

	
}
