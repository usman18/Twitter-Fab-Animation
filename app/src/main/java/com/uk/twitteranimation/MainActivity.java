package com.uk.twitteranimation;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
	
	private FloatingActionButton fab;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		fab = findViewById(R.id.floatingActionButton);
		
		findViewById(R.id.tvAnimate)
			.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					
					fab.animate()
						.rotationBy(360)
						.setDuration(500)
						.start();
					
				}
			});
	}
}
