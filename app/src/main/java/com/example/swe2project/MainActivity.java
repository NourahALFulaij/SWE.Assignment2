package com.example.swe2project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editTextTextPersonName;
    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
        editTextTextPersonName= findViewById (R.id.editTextTextPersonName);
        button= findViewById (R.id.button);
        textView= findViewById ( R.id.textView);


        button.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                String name=editTextTextPersonName.getText ().toString ();
                textView.setText ( "Hi "+name );
            }
        } );

    }
}