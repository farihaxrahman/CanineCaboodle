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

public class JournalFragment extends Fragment {
    private Button back;
    private ImageView dog_image1;
    private HashMap<String, Object> dog_data1;
    private Dog dog1;
    private ImageView dog_image2;
    private HashMap<String, Object> dog_data2;
    private Dog dog2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_journal, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        MainActivity activity = (MainActivity) getActivity();
        back = view.findViewById(R.id.button_back);
        dog_image1 = view.findViewById(R.id.image_dog1);
        dog_image2 = view.findViewById(R.id.image_dog2);

        dog1 = new Dog(dog_image1);
        dog1.sit();
        dog2 = new Dog(dog_image2);
        dog2.sit();

        // update textviews with data from dog_data
        dog_data1 = activity.dog1;


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(JournalFragment.this).navigate(R.id.action_journalFragment_to_mainGameFragment);
            }
        });

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}
