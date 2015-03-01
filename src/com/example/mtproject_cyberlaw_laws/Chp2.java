package com.example.mtproject_cyberlaw_laws;

import com.example.mtproject_cyberlaw.R;
import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;


public class Chp2 extends Activity {
	private TextView View2;
    private TextView Head2;
    @Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_chp2);
		View2 = (TextView) findViewById(R.id.view2);
		Head2 = (TextView) findViewById(R.id.head2);
	
		String no1 = (String) View2.getText();
		View2.setText(no1);
		String no2 = (String) Head2.getText();
		Head2.setText(Html.fromHtml("<b>"+no2+"</b>"));
	}

	
}
