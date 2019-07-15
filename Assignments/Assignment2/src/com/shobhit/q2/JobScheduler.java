package com.shobhit.q2;

import java.sql.SQLOutput;

public class JobScheduler {

    private int[] wt;
    private int[] ct;
    private int[] tat;
    private int[][] array;
    private int size;

    public void setArray(int[][] array) {
        this.array = array;
        this.size= array.length;
    }


    public void initArray(){
        wt= new int[size];
        ct= new int[size];
        tat= new int[size];


    }

    public void completionTime(){
            initArray();
            ct[0]= array[0][1];
            for (int i=1; i<size; i++){
                if(array[i][0] < ct[i-1])
                    ct[i]= array[i][1] + ct[i-1];
                else
                    ct[i]= array[i][0] + array[i][1];
            }

        turnAroundTime();
        waitingTime();

        print();

    }

    public void  turnAroundTime(){

        for(int i=0; i<size; i++){
            tat[i]= ct[i]- array[i][0];
        }
    }

    public void waitingTime(){
            for (int i=0; i<size; i++){
                wt[i]= tat[i]- array[i][1];
            }

    }


    public void print(){
        // Display processes along with all details
        System.out.print("Processes " + "\t Arrival Time " + " \tBurst Time " + " \t\tCompletion Time" + "\tWaiting Time " + " \tTurn-Around Time \n"
                );
        int total_wt = 0, max_wt = Integer.MIN_VALUE;
        for (int i = 0 ; i < size ; i++)
        {
            total_wt = total_wt + wt[i];
//            max_wt = max_wt + tat[i];
//            int compl_time = tat[i] + at[i];
            System.out.println(i+1 + "\t\t\t" + array[i][0] + "\t\t\t"
                    + array[i][1] + "\t\t\t\t" + ct[i] +"\t\t\t" + wt[i] + "\t\t\t"
                    + tat[i] );
            // Calculating Max wait time
                if(max_wt < wt[i])
                    max_wt= wt[i];

        }

        System.out.print("Average waiting time = "
                + (float)total_wt / (float)size);
        System.out.print("\nMax waiting time = "
                + max_wt);
    }
}
