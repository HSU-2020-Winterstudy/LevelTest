package core;


import questions.*;

public class Main {
    public static void main(String[] args) {
        DynamicArray<PartTimeJob> partTimerJobs = new DynamicArray<>(PartTimeJob.class);
        for(int i=0;i<100000;i++){
            partTimerJobs.put(PartTimer.autoGenerator());
        }
        for(int i=0;i<partTimerJobs.size();i++){
            System.out.print(i+" ");
            partTimerJobs.get(i).workPartTime();
        }
    }
}
