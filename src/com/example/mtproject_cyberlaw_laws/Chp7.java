package com.example.mtproject_cyberlaw_laws;

import com.example.mtproject_cyberlaw.R;
import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;


public class Chp7 extends Activity {

	private TextView View7;
    private TextView Head7;
    @Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_chp7);
		View7 = (TextView) findViewById(R.id.view7);
		Head7 = (TextView) findViewById(R.id.head7);
	
		String no1 = (String) View7.getText();
		View7.setText(no1);
		String no2 = (String) Head7.getText();
		Head7.setText(Html.fromHtml("<b>"+no2+"</b>"));
	}

	
}
