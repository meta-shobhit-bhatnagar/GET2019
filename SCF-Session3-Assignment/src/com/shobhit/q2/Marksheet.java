package com.shobhit.q2;


public class Marksheet {

    private int[] marksArray;

    public void setMarksArray(int[] marksArray) {
        this.marksArray = marksArray;
    }

    public void averageMarks(){
        int sum=0;
        for (int i=0; i<marksArray.length; i++){
            sum+=marksArray[i];
        }
        float avg= (float)sum/(float)marksArray.length;
        System.out.println("Average marks :" + String.format("%.2f", avg));
    }

    public void maxMarks(){
        int max= Integer.MIN_VALUE;
        int min= Integer.MAX_VALUE;

        for (int i=0 ; i<marksArray.length; i++){
            if(max <= marksArray[i])
                max= marksArray[i];
            if(min >= marksArray[i])
                min= marksArray[i];

        }
        System.out.println("Max grades : "+ max);
        System.out.println("Min grades : "+ min);
    }

    public void percentagePassing(int passMarks){
        int count=0;
        for(int i=0 ;i<marksArray.length; i++){
            if(marksArray[i] >= passMarks)
                count++;
        }
        float passed= (float)(count*100)/ (float)marksArray.length;
        System.out.println("Percentage of passed students : " + String.format("%.2f", passed) );

    }
}
