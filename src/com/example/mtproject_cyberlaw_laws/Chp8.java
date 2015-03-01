package com.example.mtproject_cyberlaw_laws;

import com.example.mtproject_cyberlaw.R;
import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;


public class Chp8 extends Activity {

	private TextView View8;
    private TextView Head8;
    @Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_chp8);
		View8 = (TextView) findViewById(R.id.view8);
		Head8 = (TextView) findViewById(R.id.head8);
	
		String no1 = (String) View8.getText();
		View8.setText(no1);
		String no2 = (String) Head8.getText();
		Head8.setText(Html.fromHtml("<b>"+no2+"</b>"));
	}

	
}
