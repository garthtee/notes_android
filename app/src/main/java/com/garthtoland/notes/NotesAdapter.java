package com.garthtoland.notes;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by garth on 23/11/2016.
 */

public class NotesAdapter extends ArrayAdapter<Note> {

    private Context context;
    private List<Note> notes;

    public NotesAdapter(Context context, int resource, List<Note> objects) {
        super(context, resource, objects);
        this.context = context;
        this.notes = objects;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.note_layout, parent, false);
        }

        Note note = notes.get(position);

        TextView textViewHeader = (TextView) convertView.findViewById(R.id.textViewHeader);
        textViewHeader.setText(note.getHeader());

        TextView textViewBody = (TextView) convertView.findViewById(R.id.textViewBody);
        textViewBody.setText(note.getBody());

        return convertView;
    }
}
