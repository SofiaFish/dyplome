package com.example.dyplome.activityes.ui.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.dyplome.R;
import com.example.dyplome.db.DataBaseHelper;
import com.example.dyplome.db.DbCreator;
import com.example.dyplome.model.Resources;

public class PlaceholderFragment extends Fragment {

    private static final String ARG_SECTION_NUMBER = "section_number";

    public static final int TYPE_EMOTION = 1;
    public static final int TYPE_INTELLECT = 2;
    public static final int TYPE_BODY = 3;

    private PageViewModel pageViewModel;

    Button btnAdd;
    EditText enterResource;
    TextView resourcesList;

    public static PlaceholderFragment newInstance(int index) {
        PlaceholderFragment fragment = new PlaceholderFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(ARG_SECTION_NUMBER, index);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pageViewModel = ViewModelProviders.of(this).get(PageViewModel.class);
        int index = 1;
        if (getArguments() != null) {
            index = getArguments().getInt(ARG_SECTION_NUMBER);
        }
        pageViewModel.setIndex(index);

    }

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_recourses, container, false);
        Button button = root.findViewById(R.id.button_add);
        final EditText enterResource = root.findViewById(R.id.resource);
        resourcesList = root.findViewById(R.id.resources_list);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DbCreator creator = new DbCreator(DataBaseHelper.getInstance(getActivity()).getWritableDatabase());
                creator.addResource(new Resources(enterResource.getText().toString()));

                if(!enterResource.getText().toString().isEmpty()){
                    resourcesList.append(enterResource.getText().toString() + " , ");
                    enterResource.setText("");
                }
            }
        });



        return root;
    }
}