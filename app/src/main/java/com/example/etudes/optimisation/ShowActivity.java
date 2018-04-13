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
        if(SettingValue.OPTIMUM[0]==0){
            textViewT1.setText("Inactive");
        }else {
            textViewT1.setText(SettingValue.OPTIMUM[0] * SettingValue.DISCRETISATION + "m3/s soit " + formatter.format(SettingValue.PUISSANCE_OPTIMUM[0]) +  " MW et Hchute: " + formatter.format(SettingValue.ELEVATION[0]) + " m");
        }
        TextView textViewT2 = (TextView) findViewById(R.id.textView5);
        if(SettingValue.OPTIMUM[1]==0){
            textViewT2.setText("Inactive");
        }else {
            textViewT2.setText(SettingValue.OPTIMUM[1] * SettingValue.DISCRETISATION + "m3/s soit " + formatter.format(SettingValue.PUISSANCE_OPTIMUM[1]) + " MW et Hchute: " + formatter.format(SettingValue.ELEVATION[1]) + " m");
        }
        TextView textViewT3 = (TextView) findViewById(R.id.textView7);
        if(SettingValue.OPTIMUM[2]==0){
            textViewT3.setText("Inactive");
        }else {
            textViewT3.setText(SettingValue.OPTIMUM[2] * SettingValue.DISCRETISATION + "m3/s soit " + formatter.format(SettingValue.PUISSANCE_OPTIMUM[2]) + " MW et Hchute: " + formatter.format(SettingValue.ELEVATION[2]) + " m");
        }

        TextView textViewT4 = (TextView) findViewById(R.id.textView9);
        if(SettingValue.OPTIMUM[3]==0){
            textViewT4.setText("Inactive");
        }else {
            textViewT4.setText(SettingValue.OPTIMUM[3] * SettingValue.DISCRETISATION + "m3/s soit " + formatter.format(SettingValue.PUISSANCE_OPTIMUM[3]) + " MW et Hchute: " + formatter.format(SettingValue.ELEVATION[3]) + " m");
        }
        TextView textViewT5 = (TextView) findViewById(R.id.textView11);
        if(SettingValue.OPTIMUM[4]==0){
            textViewT5.setText("Inactive");
        }else {
            textViewT5.setText(SettingValue.OPTIMUM[4]*SettingValue.DISCRETISATION+"m3/s soit "+formatter.format(SettingValue.PUISSANCE_OPTIMUM[4])+" MW et Hchute: " +formatter.format(SettingValue.ELEVATION[4])+" m");
    }       }
}
