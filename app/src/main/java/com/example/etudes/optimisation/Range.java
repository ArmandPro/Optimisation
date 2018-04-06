package com.example.etudes.optimisation;

/**
 * Created by Etudes on 05/04/2018.
 */

public class Range {

    int min = 0;
    int max = 180;
    int step = 5;


    public String[] getArrayWithSteps()
    {
        int iMinValue = min;
        int iMaxValue = max;
        int iStep = step;

        int iStepsArray = (iMaxValue-iMinValue)/iStep+1; //get the lenght array that will return

        String[] arrayValues= new String[iStepsArray]; //Create array with length of iStepsArray

        for(int i = 0; i < iStepsArray; i++)
        {
            arrayValues[i] = String.valueOf(iMinValue + (i*iStep));
        }

        return arrayValues;
    }


    public String[] getArrayWithSteps (int iMinValue, int iMaxValue , int iStep )
    {
        int iStepsArray = (iMaxValue-iMinValue)/iStep+1; //get the lenght array that will return

        String[] arrayValues= new String[iStepsArray]; //Create array with length of iStepsArray

        for(int i = 0; i < iStepsArray; i++)
        {
            arrayValues[i] = String.valueOf(iMinValue + (i*iStep));
        }

        return arrayValues;
    }


}
