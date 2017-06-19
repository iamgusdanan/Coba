package com.example.gusdanan.coba;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


/**
 * Created by gusdanan on 14/06/17.
 */

public class MenuActivity extends AppCompatActivity {

    private ListView listview;
    private String[] strings;
    private ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        listview = (ListView) findViewById(R.id.listview);
        strings = new String[]{"Jeruk", "Apel", "Mangga", "Manggis", "Pisang",
                "Jeruk", "Apel", "Mangga", "Manggis",
                "Pisang", "Jeruk", "Apel", "Mangga", "Manggis", "Pisang"};
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, strings);
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MenuActivity.this, strings[i], Toast.LENGTH_SHORT).show();
            }
        });
    }
}
