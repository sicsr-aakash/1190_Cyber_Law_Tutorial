package com.example.mtproject_cyberlaw_laws;

import com.example.mtproject_cyberlaw.R;
import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;


public class Chp3 extends Activity {

	private TextView View3;
    private TextView Head3;
    @Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_chp3);
		View3 = (TextView) findViewById(R.id.view3);
		Head3 = (TextView) findViewById(R.id.head3);
	
		String no1 = (String) View3.getText();
		View3.setText(no1);
		String no2 = (String) Head3.getText();
		Head3.setText(Html.fromHtml("<b>"+no2+"</b>"));
	}

	
}
