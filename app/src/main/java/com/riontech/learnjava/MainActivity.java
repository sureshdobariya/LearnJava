package com.riontech.learnjava;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "123";
    ListView listView;
    ListViewAdapter listViewAdapter;
    String[] Topic;

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // toolbar= (Toolbar) findViewById(R.id.toolbar1);

        Resources res = getResources();
        final String[] planets = res.getStringArray(R.array.planets_array);



        listView = (ListView) findViewById(R.id.list_view);
        Topic = new String[]{
                "Introdaction",
                "Opps Concept",
                "Class",
                "Object",
                "Structure of Java",
                "Methode Overridding",
                "Method Overloding",
                "Abstract Class",
                "Interface",
                "Inheritance",
                "super keyword",
                "Encaptulation",
                "this Keyword",
                "String Function",
                "HashMap",
                "Array",
                "Iterator",
                "Loops",
                "Method",
                "variable"};
        listViewAdapter = new ListViewAdapter(this, Topic);
        listView.setAdapter(listViewAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.d(TAG, "onItemClick: ");
//                Toast.makeText(getApplicationContext(), "You Are Selected:" + Topic[position], Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, Introduction.class);
                intent.putExtra("srd",Topic[position]);
                intent.putExtra("des",planets[position]);
                startActivity(intent);
//                if (position == 0) {
//                    Intent intent = new Intent(MainActivity.this, Introduction.class);
//                    startActivity(intent);
//                } else if (position == 1) {
//                    Intent intent = new Intent(MainActivity.this, OppsConceptSort.class);
//                    startActivity(intent);
//                } else if (position == 2) {
//                    Intent intent = new Intent(MainActivity.this, StructureOfJava.class);
//                    startActivity(intent);
//                }


            }


        });
    }
}