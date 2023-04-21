package edu.stevens.cs545.caninecaboodle;

import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import java.util.HashMap;

public class MainGameFragment extends Fragment {

    private Button journal;
    private Button settings;
    private ImageView dog1_image;
    private Dog dog1;
    private HashMap<String, Object> dog1_data;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main_game, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        MainActivity activity = (MainActivity) getActivity();
        dog1_data = activity.dog1;

        journal = view.findViewById(R.id.button_journal);
        settings = view.findViewById(R.id.button_settings);
        dog1_image = view.findViewById(R.id.image_dog1);
        if ((Boolean) dog1_data.get("unlocked")){
            dog1_image.setVisibility(view.VISIBLE);
            dog1 = new Dog(dog1_image);
            dog1.idleAround();
        } else {
            dog1_image.setVisibility(view.GONE);
        }

        dog1_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //navigate to a random minigame
                //add more minigame options and use Random if time
                activity.setCurrentDog(1);
                NavHostFragment.findNavController(MainGameFragment.this).navigate(R.id.action_mainGameFragment_to_miniGame1Fragment);
            }
        });

        journal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //navigate from main game to journal fragment
                NavHostFragment.findNavController(MainGameFragment.this).navigate(R.id.action_mainGameFragment_to_journalFragment);
            }
        });

        //setOnClickListener for settings
        //navigate from main game to account settings fragment (not a priority)
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}
