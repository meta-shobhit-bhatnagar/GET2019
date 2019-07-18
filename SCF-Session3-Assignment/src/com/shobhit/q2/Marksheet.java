package com.shobhit.q2;


/**
 * This class contains methods for calculating average marks, maximum marks and percentage of students passed
 * @author Shobhit
 *
 */
public class Marksheet {

    private int[] marksArray;

    public void setMarksArray(int[] marksArray) {
        this.marksArray = marksArray;
    }
/**
 * Calculates average marks of the students grades
 */
    public void averageMarks(){
        int sum=0;
        for (int i=0; i<marksArray.length; i++){
            sum+=marksArray[i];
        }
        
        float avg=0f;
        try{
        	 avg= (float)sum/(float)marksArray.length;
        }
        catch(ArithmeticException e){
        	System.out.println("Invalid average detected");
        }
        
        System.out.println("Average marks :" + String.format("%.2f", avg));
    }

    /**
     * Calculates maximum marks amongst the students
     */
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
    /**
     * Calculates percentage of passed students
     * @param passMarks the parameter passMarks sets the threshold value for passing
     */
    public void percentagePassing(int passMarks){
        int count=0;
        for(int i=0 ;i<marksArray.length; i++){
            if(marksArray[i] >= passMarks)
                count++;
        }
        float passed=0;
        try{
        	passed= (float)(count*100)/ (float)marksArray.length;;
       }
       catch(ArithmeticException e){
       	System.out.println("Invalid number detected");
       }
        
        
        System.out.println("Percentage of passed students : " + String.format("%.2f", passed) +"%" );

    }
}
