package com.uk.twitteranimation;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;

public class MainActivity extends AppCompatActivity {
	
	private FloatingActionButton fab;
	
	private int drawableId = R.drawable.feather;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		fab = findViewById(R.id.floatingActionButton);
		
		findViewById(R.id.button)
			.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					
					fab.setImageResource(drawableId);
					
					
					fab.animate()
						.rotationBy(180)
						.setDuration(180)
						.scaleX(1.2f)           //Scaling to 120%
						.scaleY(1.2f)
						.withEndAction(new Runnable() {
							@Override
							public void run() {
								
								fab.animate()
									.rotationBy(180)
									.setDuration(180)
									.scaleX(1)              //Scaling back to what it was
									.scaleY(1).start();
								
								
								drawableId = (drawableId == R.drawable.feather) ? R.drawable.ic_mail_outline : R.drawable.feather;
							}
						})
						.start();
					
					//Changing drawable Id
				}
			});
	}
}
