package com.example.mtproject_cyberlaw_laws;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import com.example.mtproject_cyberlaw.R;


public class Chp9 extends Activity {
	private TextView View9;
    private TextView Head9;
    @Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_chp9);
		View9 = (TextView) findViewById(R.id.view9);
		Head9 = (TextView) findViewById(R.id.head9);
	
		String no1 = (String) View9.getText();
		View9.setText(no1);
		String no2 = (String) Head9.getText();
		Head9.setText(Html.fromHtml("<b>"+no2+"</b>"));
	}

	
}
