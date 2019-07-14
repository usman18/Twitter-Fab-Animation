package com.uk.twitteranimation;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
	
	private FloatingActionButton fab;
	private TextView tvAnimate;
	
	private int nextDrawableId = R.drawable.ic_mail_outline;            //Default
	private int rotation = 180;                                         //Default
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		fab = findViewById(R.id.floatingActionButton);
		tvAnimate = findViewById(R.id.button);
	
		tvAnimate.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					
					//Rise
					fab.animate()
						.rotationBy(rotation)
						.setDuration(100)
						.scaleX(1.1f)           //Scaling to 110%
						.scaleY(1.1f)
						.withEndAction(new Runnable() {
							@Override
							public void run() {
								
								fab.setImageResource(nextDrawableId);
								
								//Shrink Animation
								fab.animate()
									.rotationBy(rotation)
									.setDuration(100)
									.scaleX(1)              //Scaling back to what it was
									.scaleY(1)
									.start();

//
								nextDrawableId = (nextDrawableId == R.drawable.feather) ? R.drawable.ic_mail_outline : R.drawable.feather;
								rotation = -rotation;
								
							}
						})
						.start();
					
				}
			});
	}
}
