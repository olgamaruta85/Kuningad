package com.example.opilane.kings;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.List;

public class SpinnerKings extends AppCompatActivity {

    private List<King> kings = (new Kings().getKings());
    private Spinner view;
    private EditText from, to;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_kings);

        view = findViewById(R.id.lstKings);
        from = findViewById(R.id.txtFrom);
        to = findViewById(R.id.txtTo);

        disable(from);
        disable(to);

        view.setAdapter(new ArrayAdapter<King>(this, android.R.layout.simple_list_item_1, kings));
        view.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                update(position);

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                from.setText(" ");
                to.setText(" ");

            }
        });

    }
    //
    private void disable (EditText view){
        view.setKeyListener(null);
        view.setEnabled(false);
    }
    private void update(int position){
        int a = kings.get(position).getFrom();
        int b = kings.get(position).getTo();
        from.setText(a==0 ? "": "" + a);
        to.setText(b == 9999 ? "" : "" + b);
    }
}
