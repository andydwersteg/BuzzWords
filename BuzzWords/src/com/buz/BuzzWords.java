package com.buz;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;

public class BuzzWords extends Activity {
	
	private EditText in;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        in = (EditText)findViewById(R.id.input);
        
        in.setOnEditorActionListener(new OnEditorActionListener() {
			@Override
			public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
				String currSentence = v.getText().toString();
				TextView out = (TextView)findViewById(R.id.results); // for debug
		    	String[] words = currSentence.split(" ");
		    	String together = "";
		    	for(String i : words) {
		    		//get the audio for each word
		    		together += i;
		    	}
				out.setText((CharSequence)together);   
				return true;
			} 
		});        
    }   
}