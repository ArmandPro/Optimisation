package com.example.etudes.optimisation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.text.DecimalFormat;

public class ShowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        DecimalFormat formatter = new DecimalFormat("#0.00");

        TextView textViewT1 = (TextView) findViewById(R.id.textView3);
        textViewT1.setText(SettingValue.OPTIMUM[0]*SettingValue.DISCRETISATION+"m3/s soit "+formatter.format(SettingValue.PUISSANCE_OPTIMUM[0])+"MW");

        TextView textViewT2 = (TextView) findViewById(R.id.textView5);
        textViewT2.setText(SettingValue.OPTIMUM[1]*SettingValue.DISCRETISATION+"m3/s soit "+formatter.format(SettingValue.PUISSANCE_OPTIMUM[1])+"MW");

        TextView textViewT3 = (TextView) findViewById(R.id.textView7);
        textViewT3.setText(SettingValue.OPTIMUM[2]*SettingValue.DISCRETISATION+"m3/s soit "+formatter.format(SettingValue.PUISSANCE_OPTIMUM[2])+"MW");


        TextView textViewT4 = (TextView) findViewById(R.id.textView9);
        textViewT4.setText(SettingValue.OPTIMUM[3]*SettingValue.DISCRETISATION+"m3/s soit "+formatter.format(SettingValue.PUISSANCE_OPTIMUM[3])+"MW");

        TextView textViewT5 = (TextView) findViewById(R.id.textView11);
        textViewT5.setText(SettingValue.OPTIMUM[4]*SettingValue.DISCRETISATION+"m3/s soit "+formatter.format(SettingValue.PUISSANCE_OPTIMUM[4])+"MW");
    }
}
