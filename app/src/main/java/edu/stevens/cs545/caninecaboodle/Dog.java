package edu.stevens.cs545.caninecaboodle;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.drawable.AnimationDrawable;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.Log;
import android.widget.ImageView;
import android.view.View;
import androidx.core.content.ContextCompat;

import java.util.Objects;
import java.util.Random;
import android.os.Handler;

public class Dog {
    private ImageView img;
    private int screenWidth = Resources.getSystem().getDisplayMetrics().widthPixels;
    private int screenHeight = Resources.getSystem().getDisplayMetrics().heightPixels;

    public Dog(ImageView imageView) {
        this.img = imageView;
        /*imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainGameFragment) getParentFragment()).navigateTo("nextScreen");
            }
        });*/
    }

    public void idleAround() {
        Random rand = new Random();
        int startX = rand.nextInt(screenWidth - img.getWidth() - 100);
        int startY = rand.nextInt(screenHeight - img.getHeight() - 100);
        img.setX(startX);
        img.setY(startY);

        // implement other dog animations as necessary
        if (img.getId() == R.id.image_dog1) {
            img.setBackgroundResource(R.drawable.dog1_walk);
        }

        AnimationDrawable dogAnimation = (AnimationDrawable) img.getBackground();
        dogAnimation.start();
    }

    private void walk() {
        // implement other dog animations as necessary
        //if (img.getId() == R.id.image_dog1) {
            img.setBackgroundResource(R.drawable.dog1_walk);
        //}
        AnimationDrawable dogAnimation = (AnimationDrawable) img.getBackground();
        dogAnimation.start();

        // Doesn't work, fix if there's time

        // Get start position
        float startX = img.getX();
        float startY = img.getY();

        // Set random end position of dog
        Random rand = new Random();
        int endX = rand.nextInt(screenWidth - img.getWidth() - 100);
        int endY = rand.nextInt(screenHeight - img.getHeight() - 100);

        // Calculate distance between start and end position
        float distance = (float) Math.sqrt(Math.pow(endX - startX, 2) + Math.pow(endY - startY, 2));
        // Calculate duration of animation based on distance
        int duration = (int) (distance / 0.5f);

        // Create animation and start
        ObjectAnimator animX = ObjectAnimator.ofFloat(img, "x", endX);
        ObjectAnimator animY = ObjectAnimator.ofFloat(img, "y", endY);
        AnimatorSet animSetXY = new AnimatorSet();
        animSetXY.playTogether(animX, animY);
        animSetXY.setDuration(duration);
        animSetXY.start();
        animSetXY.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
                if (rand.nextBoolean()) {
                    walk();
                } else {
                    idle();
                }
            }
        });
    }

    private void idle() {

        // implement other dog animations as necessary
        //if (img.getId() == R.id.image_dog1) {
            img.setBackgroundResource(R.drawable.dog1_sleep);
        //}
        AnimationDrawable dogAnimation = (AnimationDrawable) img.getBackground();
        dogAnimation.start();

        int delayMillis = new Random().nextInt(4000) + 1000;

        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                walk();
            }
        }, delayMillis);
    }

    public void sit() {

        // implement other dog animations as necessary
        //if (img.getId() == R.id.image_dog1) {
            img.setBackgroundResource(R.drawable.dog1_tail);
        //}
        AnimationDrawable dogAnimation = (AnimationDrawable) img.getBackground();
        dogAnimation.start();

    }

}
