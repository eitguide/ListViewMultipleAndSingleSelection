package com.eitguide.nguyennghia.listviewmultipleandsinglechoice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnListViewMultipleSelection;
    private Button btnListViewSingleSelection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnListViewMultipleSelection = (Button) findViewById(R.id.btn_listview_multiple_selection);
        btnListViewSingleSelection = (Button) findViewById(R.id.btn_listview_single_selection);

        btnListViewMultipleSelection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ListViewMultipleSelectionActivity.class));
            }
        });


        btnListViewSingleSelection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ListViewSingleSeletionActivity.class));
            }
        });
    }
}
