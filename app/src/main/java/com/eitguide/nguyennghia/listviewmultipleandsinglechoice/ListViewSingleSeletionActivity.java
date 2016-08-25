package com.eitguide.nguyennghia.listviewmultipleandsinglechoice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ListViewSingleSeletionActivity extends AppCompatActivity {

    private static final String TAG = "SingleSeletion";
    private ListView lvSingleSelection;
    private Button btnGetItemSelected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_single_seletion);

        lvSingleSelection = (ListView) findViewById(R.id.lv_single_selection);
        btnGetItemSelected = (Button) findViewById(R.id.btn_get_item_selected);

        List<String> data = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            data.add("Item " + i);
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_single_choice, data);
        lvSingleSelection.setAdapter(adapter);
        lvSingleSelection.setChoiceMode(AbsListView.CHOICE_MODE_SINGLE);

        btnGetItemSelected.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ListViewSingleSeletionActivity.this, "Item Selected: " + lvSingleSelection.getCheckedItemPosition(), Toast.LENGTH_SHORT).show();
            }
        });


    }
}
