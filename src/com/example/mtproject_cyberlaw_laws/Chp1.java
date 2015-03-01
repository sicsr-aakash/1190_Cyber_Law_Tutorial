package com.example.mtproject_cyberlaw_laws;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import com.example.mtproject_cyberlaw.R;


public class Chp1 extends Activity {
    private TextView View1;
    private TextView Head1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_chp1);
		
		View1 = (TextView) findViewById(R.id.view1);
		Head1 = (TextView) findViewById(R.id.head1);
	
		String no1 = (String) View1.getText();
		View1.setText(no1);
		String no2 = (String) Head1.getText();
		Head1.setText(Html.fromHtml("<b>"+no2+"</b>"));
		
		
	}

	
}
