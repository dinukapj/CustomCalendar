package com.din.customcalendar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.din.customcalendar.adapters.MonthAdapter;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvMonths;
    MonthAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvMonths = findViewById(R.id.rvMonths);

        loadCalendar();
    }

    private void loadCalendar() {

        ArrayList<Calendar> monthsList = loadMonths();

        adapter = new MonthAdapter(this, monthsList);

        rvMonths.setLayoutManager(new LinearLayoutManager(this));
        rvMonths.setAdapter(adapter);
    }

    private ArrayList<Calendar> loadMonths() {
        ArrayList<Calendar> monthsList = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            Calendar calendar = Calendar.getInstance();
            calendar.set(Calendar.MONTH, i);
            monthsList.add(calendar);
        }
        return monthsList;
    }
}
