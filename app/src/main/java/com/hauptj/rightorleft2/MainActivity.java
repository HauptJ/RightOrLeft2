package com.hauptj.rightorleft2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView left = (ImageView) findViewById(R.id.imageViewLeftArrow);
        final ImageView right = (ImageView) findViewById(R.id.imageViewRightArrow);
        final Button clickMe = (Button) findViewById(R.id.button);

        final Annimation fadeOut = new AlphaAnimation(1, 0);
        fadeOut.setStartOffset(1000);
        faceOut.setDuration(1000);
        left.setAnimation(fadeOut);
        right.setAnimation(fadeOut);

        fadeOut.setAnimationListener(new Animation.AnimationListener() {
            @Overide
            public void onAnimationStart(Animation animation) {

            }

            @Overide
            public void onAnimationEnd(Animation animation) {
                left.setVisibility(View.GONE);
                right.setVisibility(View.GONE);
                clickMe.setVisibility(View.Visible);
            }

            @Overide
            public void onAnimationRepeat(Animation animation) {

            }
        });

        clickMe.setOnCLickListener(new view.OnClickListener() {
            @Overide
            public void onCLick(view v){
                //choose direction
                Random r = new Random();
                int i = r.Int(2);
                clickMe.setVisibility(View.GONE);
                if (i == 0){
                    left.setVisibility(View.VISIBLE);
                    left.startAnimation(fadeOut);
                } else {
                    right.setVisibility(View.VISIBLE);
                    right.startAnimation(fadeOut);
                }
        }
    });
}
