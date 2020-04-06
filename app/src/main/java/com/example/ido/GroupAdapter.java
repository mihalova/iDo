package com.example.ido;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.ArrayList;

public class GroupAdapter extends ArrayAdapter<Group> {

    GroupAdapter(Context context, ArrayList<Group> groups) {
        super(context, 0, groups);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        // View view = super.getView(position, convertView, parent);
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.group_listview, parent, false);
        }

        Group currentGroup = getItem(position);

        TextView groupname = listItemView.findViewById(R.id.groupname);
        assert currentGroup != null;
        groupname.setText(currentGroup.getGroupName());

        ImageView newMessage = listItemView.findViewById(R.id.newMessage);
        newMessage.setVisibility(currentGroup.getNewMessage());

        return listItemView;
    }
}
