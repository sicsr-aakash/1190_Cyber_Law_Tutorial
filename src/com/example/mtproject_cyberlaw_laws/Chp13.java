package com.example.mtproject_cyberlaw_laws;

import com.example.mtproject_cyberlaw.R;
import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;


public class Chp13 extends Activity {

	private TextView View13;
    private TextView Head13;
    @Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_chp13);
		View13 = (TextView) findViewById(R.id.view13);
		Head13 = (TextView) findViewById(R.id.head13);
	
		String no1 = (String) View13.getText();
		View13.setText(no1);
		String no2 = (String) Head13.getText();
		Head13.setText(Html.fromHtml("<b>"+no2+"</b>"));
	}

	
}
