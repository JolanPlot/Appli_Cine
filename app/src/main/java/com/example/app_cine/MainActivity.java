package com.example.app_cine;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    private FirebaseAuth mAuth; // Déclaration instance Firebase
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mAuth = FirebaseAuth.getInstance(); // Initialisation FireBase

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button boutonSend = findViewById(R.id.ButtonSend);
        boutonSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Spinner mySpinnerScenario = (Spinner) findViewById(R.id.SpinnerScenario);
                String grade_scenario = mySpinnerScenario.getSelectedItem().toString();

                Spinner mySpinnerRealisation = (Spinner) findViewById(R.id.SpinnerRealisation);
                String grade_realisation = mySpinnerScenario.getSelectedItem().toString();

                Spinner mySpinnerMusique = (Spinner) findViewById(R.id.SpinnerMusique);
                String grade_musique = mySpinnerScenario.getSelectedItem().toString();

                Spinner mySpinnerDate = (Spinner) findViewById(R.id.Spinner_Date);
                String date = mySpinnerScenario.getSelectedItem().toString();

                Spinner mySpinnerTimes = (Spinner) findViewById(R.id.Spinner_Times);
                String times = mySpinnerScenario.getSelectedItem().toString();

            }

        });




    }





}
