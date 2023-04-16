package edu.stevens.cs545.caninecaboodle;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

public class MainGameFragment extends Fragment {

    private Button journal;
    private Button settings;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main_game, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //journal = view.findViewById(R.id.button_journal);
        //settings = view.findViewById(R.id.button_settings);

        journal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //navigate from main game to journal fragment
                //NavHostFragment.findNavController(MainGameFragment.this).navigate(R.id.action_welcomeFragment_to_loginFragment);
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
