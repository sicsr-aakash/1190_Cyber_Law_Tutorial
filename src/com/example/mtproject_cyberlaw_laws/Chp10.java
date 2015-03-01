package com.example.mtproject_cyberlaw_laws;

import com.example.mtproject_cyberlaw.R;
import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;


public class Chp10 extends Activity {

	private TextView View10;
    private TextView Head10;
    @Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_chp10);
		View10 = (TextView) findViewById(R.id.view10);
		Head10 = (TextView) findViewById(R.id.head10);
	
		String no1 = (String) View10.getText();
		View10.setText(no1);
		String no2 = (String) Head10.getText();
		Head10.setText(Html.fromHtml("<b>"+no2+"</b>"));
	}

	
}
