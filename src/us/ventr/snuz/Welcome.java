package us.ventr.snuz;

//import android.animation.AnimatorInflater;
//import android.animation.AnimatorSet;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

@SuppressLint("Registered")
public class Welcome extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }

    public void alarm_settings_onClick(View view){
    	// open alarm settings activity intent
    	Intent intent = new Intent(this, Alarm_settings.class);
    	
    	startActivity(intent);
    	
    }
    public void info_onClick(View view){
    	// open alarm settings activity intent
    	Intent intent = new Intent(this, Info.class);
    	//AnimatorSet set = (AnimatorSet) AnimatorInflater.loadAnimator();
    	startActivity(intent);
    	
    }
    public void account_settings_onClick(View view){
    	// open alarm settings activity intent
    	Intent intent = new Intent(this, Account_settings2.class);
    	
    	startActivity(intent);
    	
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.welcome, menu);
        return true;
    }
    
    
    
}

