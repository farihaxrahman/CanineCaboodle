package edu.stevens.cs545.caninecaboodle;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import java.util.HashMap;

//import edu.stevens.cs545.caninecaboodle.databinding.FragmentSecondBinding;

public class SelectFragment extends Fragment {

    private Button buttonSecond;
    private HashMap<String, Object> dog1_data;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_select, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        MainActivity activity = (MainActivity) getActivity();
        dog1_data = activity.dog1;

        buttonSecond = view.findViewById(R.id.button_second);

        // navigates to main game after "next" is clicked
        // ideally should have onClickListener on images instead
        // so that we can actually use the user-selected option
        buttonSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activity.setDog1(true);
                NavHostFragment.findNavController(SelectFragment.this)
                        .navigate(R.id.action_selectFragment_to_mainGameFragment);
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

}