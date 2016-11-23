package com.garthtoland.notes;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AddNote_Activity extends AppCompatActivity {

    private EditText editTextHeader, editTextBody;
    private DBHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_note_);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        dbHelper = new DBHelper(AddNote_Activity.this, null, null, 3);
        editTextHeader = (EditText) findViewById(R.id.editTextHeading);
        editTextBody = (EditText) findViewById(R.id.editTextBody);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String header = editTextHeader.getText().toString();
                final String body = editTextBody.getText().toString();
                if (!header.isEmpty() || !body.isEmpty()) {
                    dbHelper.addNote(new Note(header, body));
                    // Move to ViewNotes
                    startActivity(new Intent(AddNote_Activity.this, ViewNotes_Activity.class));
                } else {
                    Toast.makeText(AddNote_Activity.this, "Please fill out all fields.",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
