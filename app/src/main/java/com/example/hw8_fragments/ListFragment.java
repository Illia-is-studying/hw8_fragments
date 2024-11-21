package com.example.hw8_fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.hw8_fragments.Services.PersonService;

public class ListFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        String[] names = PersonService.getNames();

        View view = inflater
                .inflate(R.layout.list_fragment, container, false);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                requireContext(),
                android.R.layout.simple_list_item_1,
                names);

        GridView gridView = view.findViewById(R.id.list_grid_view);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(((parent, view1, position, id) -> {
            String name = names[position];

            PersonFragment personFragment = PersonFragment.getInstance(name);
            requireActivity().getSupportFragmentManager().beginTransaction()
                    .replace(R.id.main_fragment, personFragment)
                    .addToBackStack(null)
                    .commit();
        }));

        return view;
    }
}
