package com.example.mtproject_cyberlaw_laws;

import com.example.mtproject_cyberlaw.R;
import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;


public class Chp11 extends Activity {

	private TextView View11;
    private TextView Head11;
    @Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_chp11);
		View11 = (TextView) findViewById(R.id.view11);
		Head11 = (TextView) findViewById(R.id.head11);
	
		String no1 = (String) View11.getText();
		View11.setText(no1);
		String no2 = (String) Head11.getText();
		Head11.setText(Html.fromHtml("<b>"+no2+"</b>"));
	}

}
