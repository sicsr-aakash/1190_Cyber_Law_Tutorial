package com.example.mtproject_cyberlaw_laws;

import com.example.mtproject_cyberlaw.R;
import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class Chp4 extends Activity {
	private TextView View4;
    private TextView Head4;
    @Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_chp4);
		View4 = (TextView) findViewById(R.id.view4);
		Head4 = (TextView) findViewById(R.id.head4);
	
		String no1 = (String) View4.getText();
		View4.setText(no1);
		String no2 = (String) Head4.getText();
		Head4.setText(Html.fromHtml("<b>"+no2+"</b>"));
	}

	
}
