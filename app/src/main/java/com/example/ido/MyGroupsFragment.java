package com.example.ido;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MyGroupsFragment extends Fragment {

    ListView groupListView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_my_groups, container,false);

        final ArrayList<Group> groups = new ArrayList<>();

        groups.add(new Group("Group 1", View.INVISIBLE));
        groups.add(new Group("Group 2", View.INVISIBLE));
        groups.add(new Group("Group 3", View.VISIBLE));
        groups.add(new Group("Group 4", View.INVISIBLE));
        groups.add(new Group("Group 5", View.VISIBLE));
        groups.add(new Group("Group 6", View.VISIBLE));

        GroupAdapter adapter = new GroupAdapter(getActivity(), groups);
        groupListView = view.findViewById(R.id.groups);
        groupListView.setAdapter(adapter);
        groupListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                //Group group = groups.get(position);
                //čo sa stane po kliknutí na group message
            }
        });

        return view;
    }

}
