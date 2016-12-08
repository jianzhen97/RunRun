package com.example.runrun;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class FlsanActivity extends Activity {

	private RelativeLayout relativeLayout;
	private ImageView imageView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_flsan);
		relativeLayout = (RelativeLayout) findViewById(R.id.flash_layout);
		imageView = (ImageView) findViewById(R.id.flash_imageView1);
		exeAnim();
	}

	private void exeAnim() {
		AnimationSet animationSet = new AnimationSet(false);

		RotateAnimation rotateAnimation = new RotateAnimation(0, 360,
				RotateAnimation.RELATIVE_TO_SELF, 0.5f,
				RotateAnimation.RELATIVE_TO_SELF, 0.5f);
		rotateAnimation.setDuration(3000);
		rotateAnimation.setFillAfter(true);

		AlphaAnimation alphaAnimation = new AlphaAnimation(0.4f, 1);
		alphaAnimation.setDuration(3000);

		ScaleAnimation scaleAnimation = new ScaleAnimation(0, 1, 0, 1,
				Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF,
				0.5f);
		scaleAnimation.setDuration(3000);

		animationSet.addAnimation(rotateAnimation);
		animationSet.addAnimation(alphaAnimation);
		animationSet.addAnimation(scaleAnimation);
		animationSet.setAnimationListener(new AnimationListener() {
			
			@Override
			public void onAnimationStart(Animation animation) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onAnimationRepeat(Animation animation) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onAnimationEnd(Animation animation) {
            startActivity(new Intent(FlsanActivity.this, GuideActivity.class));				
			}
		});
   
		imageView.startAnimation(animationSet);
	}
}
