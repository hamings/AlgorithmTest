import java.util.*;
class Solution {
    public String[] solution(String[][] plans){
            ArrayList<Plan> planArrayList = new ArrayList<>();
            for (String[] plan : plans) {
                Plan p = changeToPlan(plan);
                planArrayList.add(p);
            }
            Collections.sort(planArrayList, Comparator.comparingInt(o -> o.start));
            Stack<Plan> stack = new Stack<>();

            ArrayList<String> answer = new ArrayList<>();
            int now = -1;
            for(int i = 0;i<planArrayList.size();i++) {
                if (stack.isEmpty()) {
                    stack.push(planArrayList.get(i));
                    continue;
                }
                Plan current = stack.peek();
                Plan newPlan = planArrayList.get(i);

                now = current.start;
                if (now + current.playTime <= newPlan.start) {
                    recur(stack, newPlan,now,answer);
                } else {
                    current.playTime -= newPlan.start - now;
                }
                stack.push(newPlan);
            }
            while(!stack.isEmpty()){
                answer.add(stack.pop().name);
            }

            return answer.toArray(new String[0]);

        }
        public void recur(Stack<Plan> stack, Plan plan, int now, ArrayList<String> answer){
            if(stack.isEmpty()) return;
            Plan before = stack.peek();
            if(now + before.playTime<=plan.start){
                answer.add(stack.pop().name);
                now += before.playTime;
                recur(stack,plan, now, answer);
            }else{
                before.playTime -= plan.start-now;
            }
        }
        private class Plan{
            private final String name;
            private int start;
            private int playTime;

            private Plan(String name, int start, int playTime) {
                this.name = name;
                this.start = start;
                this.playTime = playTime;
            }
        }private Plan changeToPlan(String[] plan){
            String name = plan[0];
            int start = changeToMinute(plan[1]);
            int playTime = Integer.parseInt(plan[2]);
            return new Plan(name,start,playTime);
        }
        private int changeToMinute(String time){
            String[] strings = time.split(":");
            int hour = Integer.parseInt(strings[0]);
            int min = Integer.parseInt(strings[1]);
            return hour*60+min;
        }
}