package com.example.cyberlawtabletguide;

import com.example.cyberlawtabletguide.R;
import com.example.cyberlawtabletguide.SplashScreen;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


public class SplashScreen extends Activity{ 
	public ProgressDialog myDialog; 

@Override
public void onCreate(Bundle savedInstanceState) {

    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_splash_screen);

    new Handler().postDelayed(new Runnable() {

        public void run() { 
            myDialog = ProgressDialog.show(SplashScreen.this,"", "Loading", true);

            Intent intent=new Intent(SplashScreen.this, HomePage.class);
            SplashScreen.this.startActivity(intent);
            myDialog.dismiss();
            SplashScreen.this.finish();     
        }

    }, 5000);// 3 Seconds
}

};

