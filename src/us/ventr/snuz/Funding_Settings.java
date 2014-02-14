package us.ventr.snuz;

import android.os.Bundle;
import android.view.Menu;

//import android.os.Bundle;
//import android.app.Activity;
//import android.content.Intent;
//import android.view.Menu;
//import android.view.View;

public class Funding_Settings extends Welcome{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.funding_settings);
    } /* public void Funding_Settings_Event(View view){
    	// open alarm settings activity intent
    	
    	
    	startActivity(intent);
    	
    	
    }*/

	//TODO
	// set global variable to amount input by user
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.welcome, menu);
        return true;
    }
}