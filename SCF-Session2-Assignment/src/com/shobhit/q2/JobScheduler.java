package com.shobhit.q2;
/**
* It is a class which implements FCFS algorithm
*/
public class JobScheduler {

    private int[] wt;
    private int[] ct;
    private int[] tat;
    private int[][] array;
    private int size;
/**
* sets array of arrival and burst time
*@param array paramter as 2d array reference
*/
    public void setArray(int[][] array) {
        this.array = array;
        this.size= array.length;
    }

/**
* initialises waiting, completion && turn-around time arrays
*/
    public void initArray(){
        wt= new int[size];
        ct= new int[size];
        tat= new int[size];


    }
    /**
* calculates completion time of the processes
*/
    public void completionTime(){
            initArray();
            
            if(array[0][0]==0)
            	ct[0]= array[0][1];
            else
            	ct[0]= array[0][1]+ array[0][0];
            
            
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
/**
* calculates turn around time of the processes
*/
    public void  turnAroundTime(){

        for(int i=0; i<size; i++){
            tat[i]= ct[i]- array[i][0];
        }
    }
/**
* calculates waiting time of the processes
*/
    public void waitingTime(){
            for (int i=0; i<size; i++){
                wt[i]= tat[i]- array[i][1];
            }

    }

/**
* displays the tabular format of the computet waiting time completion time and turn around time
*/
    public void print(){
        // Display processes along with all details
        System.out.print("Processes " + "\t Arrival Time " + " \t\tBurst Time " + " \t\tCompletion Time" + "\t\tWaiting Time " + " \tTurn-Around Time \n"
                );
        int total_wt = 0, max_wt = Integer.MIN_VALUE;
        for (int i = 0 ; i < size ; i++)
        {
            total_wt = total_wt + wt[i];
//            max_wt = max_wt + tat[i];
//            int compl_time = tat[i] + at[i];
            System.out.println(i+1 + "\t\t\t" + array[i][0] + "\t\t\t"
                    + array[i][1] + "\t\t\t" + ct[i] +"\t\t\t" + wt[i] + "\t\t"
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
