package com.example.hw8_fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.hw8_fragments.Models.Person;
import com.example.hw8_fragments.Services.PersonService;

import java.util.Arrays;

public class PersonFragment extends Fragment {
    private static final String ARG_NAME = "arg_name";

    public static PersonFragment getInstance(String name) {
        Bundle bundle = new Bundle();
        bundle.putString(ARG_NAME, name);

        PersonFragment personFragment = new PersonFragment();
        personFragment.setArguments(bundle);
        return personFragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater
                .inflate(R.layout.name_description_fragment, container, false);

        TextView nameTextView = view.findViewById(R.id.person_name);
        TextView datesTextView = view.findViewById(R.id.person_dates);
        TextView descriptionTextView = view.findViewById(R.id.person_description);

        if (getArguments() != null) {
            String name = getArguments().getString(ARG_NAME);
            Person person = PersonService.getPersonByName(name);
            String dates = Arrays.toString(person.getShortDates());
            dates = "Dates: " + dates.substring(1, dates.length() - 1);

            nameTextView.setText(person.getName());
            datesTextView.setText(dates);
            descriptionTextView.setText(person.getNameDescription());
        }

        return view;
    }
}
