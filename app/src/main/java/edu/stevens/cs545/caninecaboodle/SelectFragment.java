package edu.stevens.cs545.caninecaboodle;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

//import edu.stevens.cs545.caninecaboodle.databinding.FragmentSecondBinding;

public class SelectFragment extends Fragment {

    private Button buttonSecond;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_select, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        buttonSecond = view.findViewById(R.id.button_second);

        buttonSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //NavHostFragment.findNavController(SelectFragment.this).navigate();
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

}