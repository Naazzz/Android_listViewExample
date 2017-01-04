package com.example.nazrin.listviewexample;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private int images[]={
            R.drawable.p1,R.drawable.p2,R.drawable.p3,
            R.drawable.p4,R.drawable.p5,R.drawable.p6,
            R.drawable.p7,R.drawable.p8,R.drawable.p9,
            R.drawable.p10,R.drawable.p11,R.drawable.p12,
            R.drawable.p1,R.drawable.p2,R.drawable.p3,
            R.drawable.p4,R.drawable.p5,R.drawable.p6,
            R.drawable.p7,R.drawable.p8,R.drawable.p9,};
   private String [] films = {
           "Bana adini sor","Teddy","3 meters above sky",
            "Godfather","Skyfall","Ikimizin yerine",
            "Ikinci shans","Matrix","Oglan evi",
            "Source code","The other women","21 and over",
            "This is the end","Role models","Interseller",
            "Bad kids go to hell","Mr. Nobody","Lucy",
            "About time","Hadi inshallah","A beautiful mind"};

    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Film filmsAdapter = new Film(images,films,MainActivity.this);
//        ListAdapter filmsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,films);
        ListView filmsListView = (ListView) findViewById(R.id.filmsListView);
        filmsListView.setAdapter(filmsAdapter);

    }
}
