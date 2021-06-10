package com.example.project2021;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ophtamologists extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ophtamologists);

        listView = findViewById(R.id.ophtamologistsListView);

        ArrayList<Doctor> arrayList = new ArrayList<>();

        arrayList.add(new Doctor(R.drawable.doctor2, "John Fisher", "Strucan u oblasti blablabla"));
        arrayList.add(new Doctor(R.drawable.doctor3, "Emma Cosby", "Strucan u oblasti blablabla"));
        arrayList.add(new Doctor(R.drawable.doctor11, "Bill Summer", "Strucan u oblasti blablabla"));

        // custom adapter
        DoctorAdapter doctorAdapter = new DoctorAdapter(this, R.layout.list_row, arrayList);

        listView.setAdapter(doctorAdapter);
    }

    public void makeAppoinment (View view) {
        startActivity(new Intent(this, MakeAppointment.class));
    }
}