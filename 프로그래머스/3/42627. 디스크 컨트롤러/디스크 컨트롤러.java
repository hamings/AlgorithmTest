import java.util.*;
class Solution {
   private static class Job{
            public final int start;
            public final int duration;

            public Job(int start, int duration){
                this.start = start;
                this.duration = duration;
            }
        }
        public int solution(int[][] jobs){
            Job[] jobList = new Job[jobs.length];
            for(int i = 0;i< jobs.length;i++){
                jobList[i]=new Job(jobs[i][0],jobs[i][1]);
            }
            Arrays.sort(jobList,Comparator.comparingInt(job ->job.start));
            Queue<Job> queue = new LinkedList<>(Arrays.asList(jobList));
            PriorityQueue<Job> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(job-> job.duration));
            
            int exec = 0;
            int time = 0;
            while(!queue.isEmpty()||!priorityQueue.isEmpty()){
                while(!queue.isEmpty()&&queue.peek().start<=time){
                    priorityQueue.add(queue.poll());
                }
                if(priorityQueue.isEmpty()){
                    time= queue.peek().start;
                    continue;
                }
                Job job = priorityQueue.poll();
                exec+=time+job.duration-job.start;
                time+=job.duration;
            }
            return exec/jobs.length;
        }
}