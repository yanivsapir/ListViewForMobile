package com.example.ysapir.listview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] foods = {"Find a Jon", "Prepare Shenkar mobile workshop #2", "Call Amnon", "Get milk",
        "Mock task 19", "Mock task 18", "Mock task 17", "Mock task 16", "Mock task 15", "Mock task 14",
                "Mock task 13", "Mock task 12", "Mock task 11", "Mock task 10", "Mock task 9", "Mock task 8",
                "Mock task 7","Mock task 6", "Mock task 5", "Mock task 4", "Mock task 3", "Mock task 2", "Mock task 1"};
        ListAdapter yanivAdapter = new CustomAdapter(this, foods);
        ListView yanivsListView = (ListView) findViewById(R.id.yanivListView);
        yanivsListView.setAdapter(yanivAdapter);

        yanivsListView.setOnItemClickListener(
                new AdapterView.OnItemClickListener(){

                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String food = String.valueOf(parent.getItemAtPosition(position));
                        Toast.makeText(MainActivity.this, food, Toast.LENGTH_LONG).show();
                    }
                }
        );
    }

    public void CreateTask(View view) {
        Intent intent = new Intent(this, CreateTaskActivity.class);
        startActivity(intent);
    }
}