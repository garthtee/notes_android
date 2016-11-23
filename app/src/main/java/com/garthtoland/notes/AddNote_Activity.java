package com.garthtoland.notes;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class AddNote_Activity extends AppCompatActivity {

    private EditText editTextHeader, editTextBody;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_note_);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        editTextHeader = (EditText) findViewById(R.id.editTextHeading);
        editTextBody = (EditText) findViewById(R.id.editTextBody);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO: Save note here

                // Move to ViewNotes
                startActivity(new Intent(AddNote_Activity.this, ViewNotes_Activity.class));
            }
        });
    }
}
