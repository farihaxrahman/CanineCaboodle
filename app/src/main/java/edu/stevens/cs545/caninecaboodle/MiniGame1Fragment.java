package edu.stevens.cs545.caninecaboodle;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import java.util.HashMap;

// minigame1 is true or false minigame
public class MiniGame1Fragment extends Fragment {

    private Button btn_true;
    private Button btn_false;
    private ImageView dog_image;
    private HashMap<String, Object> dog_data;
    private Dog dog;
    private Boolean solution;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_mini_game_1, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        MainActivity activity = (MainActivity) getActivity();
        btn_true = view.findViewById(R.id.button_true);
        btn_false = view.findViewById(R.id.button_false);
        dog_image = view.findViewById(R.id.image_dog1);

        Context context = getContext();

        // get the right dog and set the question
        if (activity.currentDog == 1) {
            dog = new Dog(dog_image);
            dog.sit();
            // set labrador questions
            solution = true;
        }

        btn_true.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // give user feedback, toast is probably not the best way
                if (solution) {
                    Toast.makeText(context, "Correct Answer", Toast.LENGTH_SHORT).show();
                    // raise score
                } else {
                    Toast.makeText(context, "Wrong Answer", Toast.LENGTH_SHORT).show();
                }
                NavHostFragment.findNavController(MiniGame1Fragment.this).navigate(R.id.action_miniGame1Fragment_to_mainGameFragment);
            }
        });
        btn_false.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // give user feedback
                if (solution) {
                    Toast.makeText(context, "Wrong Answer", Toast.LENGTH_SHORT).show();
                    // raise score
                } else {
                    Toast.makeText(context, "Correct Answer", Toast.LENGTH_SHORT).show();
                }
                NavHostFragment.findNavController(MiniGame1Fragment.this).navigate(R.id.action_miniGame1Fragment_to_mainGameFragment);
            }
        });

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}
