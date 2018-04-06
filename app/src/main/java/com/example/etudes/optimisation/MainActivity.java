package com.example.etudes.optimisation;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //Toast
        Toasty.Config.getInstance().setErrorColor(Color.RED) // optional
            .setInfoColor(Color.BLUE) // optional
            .setSuccessColor(Color.GREEN) // optional
            .setWarningColor(Color.RED) // optional
            .setTextColor(Color.BLACK) // optional
            .tintIcon(true) // optional (apply textColor also to the icon)
            .apply(); // required


        //Range turbine
        final Range range = new Range();
        String[] myValues = range.getArrayWithSteps();
        String[] myBigValues = range.getArrayWithSteps(range.min,5*range.max, range.step);


        //TEST ONLY
        final TextView tv = (TextView) findViewById(R.id.textView);


        //Eamont
        final EditText eAmont = (EditText) findViewById(R.id.eAmont);
        eAmont.setText("172.2");


        //Qtot
        final NumberPicker npQT = (NumberPicker) findViewById(R.id.numberPickerQtot);
        npQT.setMinValue(0);
        npQT.setMaxValue((5*range.max-range.min)/range.step);
        npQT.setDisplayedValues(myBigValues);
        npQT.setValue(170);
        npQT.setWrapSelectorWheel(true);

        //Turbine 1
        final Switch s1 = (Switch) findViewById(R.id.switch1);
        s1.setChecked(true);
        final NumberPicker npmin1 = (NumberPicker) findViewById(R.id.numberPickerMinT1);
        npmin1.setMinValue(0);
        npmin1.setMaxValue((range.max-range.min)/range.step);
        npmin1.setDisplayedValues(myValues);
        npmin1.setWrapSelectorWheel(true);

        final NumberPicker npmax1 = (NumberPicker) findViewById(R.id.numberPickerMaxT1);
        npmax1.setMinValue(0);
        npmax1.setMaxValue((range.max-range.min)/range.step);
        npmax1.setDisplayedValues(myValues);
        npmax1.setValue(30);
        npmax1.setWrapSelectorWheel(true);



        //Turbine 2
        final Switch s2 = (Switch) findViewById(R.id.switch2);
        s2.setChecked(true);

        final NumberPicker npmin2 = (NumberPicker) findViewById(R.id.numberPickerMinT2);
        npmin2.setMinValue(0);
        npmin2.setMaxValue((range.max-range.min)/range.step);
        npmin2.setDisplayedValues(myValues);
        npmin2.setWrapSelectorWheel(true);

        final NumberPicker npmax2 = (NumberPicker) findViewById(R.id.numberPickerMaxT2);
        npmax2.setMinValue(0);
        npmax2.setMaxValue((range.max-range.min)/range.step);
        npmax2.setDisplayedValues(myValues);
        npmax2.setValue(30);
        npmax2.setWrapSelectorWheel(true);


        //Turbine 3
        final Switch s3 = (Switch) findViewById(R.id.switch3);
        s3.setChecked(true);
        final NumberPicker npmin3 = (NumberPicker) findViewById(R.id.numberPickerMinT3);
        npmin3.setMinValue(0);
        npmin3.setMaxValue((range.max-range.min)/range.step);
        npmin3.setDisplayedValues(myValues);
        npmin3.setWrapSelectorWheel(true);

        final NumberPicker npmax3 = (NumberPicker) findViewById(R.id.numberPickerMaxT3);
        npmax3.setMinValue(0);
        npmax3.setMaxValue((range.max-range.min)/range.step);
        npmax3.setDisplayedValues(myValues);
        npmax3.setValue(30);
        npmax3.setWrapSelectorWheel(true);



        //Turbine 4
        final Switch s4 = (Switch) findViewById(R.id.switch4);
        s4.setChecked(true);
        final NumberPicker npmin4 = (NumberPicker) findViewById(R.id.numberPickerMinT4);
        npmin4.setMinValue(0);
        npmin4.setMaxValue((range.max-range.min)/range.step);
        npmin4.setDisplayedValues(myValues);
        npmin4.setWrapSelectorWheel(true);

        final NumberPicker npmax4 = (NumberPicker) findViewById(R.id.numberPickerMaxT4);
        npmax4.setMinValue(0);
        npmax4.setMaxValue((range.max-range.min)/range.step);
        npmax4.setDisplayedValues(myValues);
        npmax4.setValue(30);
        npmax4.setWrapSelectorWheel(true);



        //Turbine 5
        final Switch s5 = (Switch) findViewById(R.id.switch5);
        s5.setChecked(true);
        final NumberPicker npmin5 = (NumberPicker) findViewById(R.id.numberPickerMinT5);
        npmin5.setMinValue(0);
        npmin5.setMaxValue((range.max-range.min)/range.step);
        npmin5.setDisplayedValues(myValues);
        npmin5.setWrapSelectorWheel(true);

        final NumberPicker npmax5 = (NumberPicker) findViewById(R.id.numberPickerMaxT5);
        npmax5.setMinValue(0);
        npmax5.setMaxValue((range.max-range.min)/range.step);
        npmax5.setDisplayedValues(myValues);
        npmax5.setValue(30);
        npmax5.setWrapSelectorWheel(true);







        //TEST ONLY
        npmin1.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal){
                //Display the newly selected number from picker
                //tv.setText("Selected Number : " + newVal);
            }
        });



        //OPTIMISE BUTTON
        Button button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                boolean allCorrect = true;

                int qmin1 = npmin1.getValue()*(range.step);
                int qmax1 = npmax1.getValue()*(range.step);
                if(!s1.isChecked()){
                    qmin1 = 0;
                    qmax1 = 0;
                }


                int qmin2 = npmin2.getValue()*(range.step);
                int qmax2 = npmax2.getValue()*(range.step);
                if(!s2.isChecked()){
                    qmin2 = 0;
                    qmax2 = 0;
                }

                int qmin3 = npmin3.getValue()*(range.step);
                int qmax3 = npmax3.getValue()*(range.step);
                if(!s3.isChecked()){
                    qmin3 = 0;
                    qmax3 = 0;
                }

                int qmin4 = npmin4.getValue()*(range.step);
                int qmax4 = npmax4.getValue()*(range.step);
                if(!s4.isChecked()){
                    qmin4 = 0;
                    qmax4 = 0;
                }

                int qmin5 = npmin5.getValue()*(range.step);
                int qmax5 = npmax5.getValue()*(range.step);
                if(!s5.isChecked()){
                    qmin5 = 0;
                    qmax5 = 0;
                }

                int qtot = npQT.getValue()*(range.step);

                if(npmin1.getValue() > npmax1.getValue()){
                    Toasty.error(getApplicationContext(), "Turbine 1: Qmin est superieur à Qmax", Toast.LENGTH_SHORT, true).show();
                    allCorrect = false;
                }
                if(npmin2.getValue() > npmax2.getValue()){
                    Toasty.error(getApplicationContext(), "Turbine 2: Qmin est superieur à Qmax", Toast.LENGTH_SHORT,true).show();
                    allCorrect = false;
                }
                if(npmin3.getValue() > npmax3.getValue()){
                    Toasty.error(getApplicationContext(), "Turbine 3: Qmin est superieur à Qmax", Toast.LENGTH_SHORT,true).show();
                    allCorrect = false;
                }
                if(npmin4.getValue() > npmax4.getValue()){
                    Toasty.error(getApplicationContext(), "Turbine 4: Qmin est superieur à Qmax", Toast.LENGTH_SHORT,true).show();
                    allCorrect = false;
                }
                if(npmin5.getValue() > npmax5.getValue()){
                    Toasty.error(getApplicationContext(), "Turbine 5: Qmin est superieur à Qmax", Toast.LENGTH_SHORT,true).show();
                    allCorrect = false;
                }

                if((qmin1+qmin2+qmin3+qmin4+qmin5)>qtot){

                    Toasty.error(getApplicationContext(), "Qtot est trop faible, devrait etre superieur à: " + (qmin1+qmin2+qmin3+qmin4+qmin5) +"m3/s", Toast.LENGTH_SHORT,true).show();
                    allCorrect = false;
                }

                if(allCorrect){

                    double dAmont = Double.parseDouble(eAmont.getText().toString());

                    SettingValue.setMAX_FLOW(qtot);

                    Toasty.info(getApplicationContext(),"qtot: "+qtot);

                    SettingValue.setMIN_FLOW_T1(qmin1);
                    SettingValue.setMAX_FLOW_T1(qmax1);

                    SettingValue.setMIN_FLOW_T2(qmin2);
                    SettingValue.setMAX_FLOW_T2(qmax2);

                    SettingValue.setMIN_FLOW_T3(qmin3);
                    SettingValue.setMAX_FLOW_T3(qmax3);

                    SettingValue.setMIN_FLOW_T4(qmin4);
                    SettingValue.setMAX_FLOW_T4(qmax4);

                    SettingValue.setMIN_FLOW_T5(qmin5);
                    SettingValue.setMAX_FLOW_T5(qmax5);

                    int optimum[];
                    Optimisation optimisation = new Optimisation();
                    optimum = optimisation.optimise(dAmont,SettingValue.MAX_FLOW);
                    SettingValue.OPTIMUM = optimum;

                    Toasty.success(getApplicationContext(),"Q1"+SettingValue.OPTIMUM[0]+"Q2"+optimum[1]+"Q3"+optimum[2]+"Q4"+optimum[3]+"Q5"+optimum[4], Toast.LENGTH_SHORT, true).show();

                    Intent resultIntent = new Intent(getApplicationContext(),ShowActivity.class);
                    startActivity(resultIntent);



                }


            }
        });









    }
}
