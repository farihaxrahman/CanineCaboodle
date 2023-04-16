package edu.stevens.cs545.caninecaboodle;

import android.graphics.drawable.AnimationDrawable;
import android.widget.ImageView;
import android.view.View;
import androidx.core.content.ContextCompat;

public class Dog {
    private ImageView imageView;

    public Dog(ImageView imageView) {
        this.imageView = imageView;
        //this.imageView.setImageDrawable(ContextCompat.getDrawable(imageView.getContext(), R.drawable.dog_idle_animation));
        ((AnimationDrawable) this.imageView.getDrawable()).start();
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // navigate to mini game
            }
        });
    }
}
