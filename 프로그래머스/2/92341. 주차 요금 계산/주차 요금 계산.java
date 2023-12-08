import java.util.*;
class Solution {
    private static class Fee{
            private final int baseTime;
            private final int baseFee;
            private final int unitTime;
            private final int unitFee;

            public Fee(int baseTime, int baseFee, int unitTime, int unitFee) {
                this.baseTime = baseTime;
                this.baseFee = baseFee;
                this.unitTime = unitTime;
                this.unitFee = unitFee;
            }
            public int cost(int time){
                int fee = baseFee;
                time-=baseTime;
                while(time>0){
                    fee+=unitFee;
                    time-=unitTime;
                }
                return fee;
            }

        }
        private static class Car{
            public final String number;
            private final Fee fee;
            private int inTime = -1;
            private int totalTime;

            public Car(String number,Fee fee) {
                this.number = number;
                this.fee = fee;
            }
            public void in(int time){
                this.inTime = time;
            }
            public void out(int time){
                if(this.inTime==-1) return;
                totalTime+=time-inTime;
                inTime=-1;
            }
            public int cost(){
                return fee.cost(totalTime);
            }
        }
        private int parseTime(String time){
            int hour = Integer.parseInt(time.substring(0,2));
            int minute = Integer.parseInt(time.substring(3));
            return hour*60+minute;
        }
        public int[] solution(int[] fees, String[] records){
            Fee fee = new Fee(fees[0],fees[1],fees[2],fees[3]);
            Map<String,Car> carMap = new HashMap<>();
            for(String record: records){
                String[] tokens = record.split(" ");
                int inTime = parseTime(tokens[0]);
                String number = tokens[1];
                boolean isIn = tokens[2].equals("IN");
                if(!carMap.containsKey(number)){
                    carMap.put(number,new Car(number,fee));
                }
                Car car = carMap.get(number);
                if(isIn){
                    car.in(inTime);
                }else{
                    car.out(inTime);
                }
            }
            int endTIme = parseTime("23:59");
            for(Car car : carMap.values()){
                car.out(endTIme);
            }
            return carMap.values()
                    .stream().sorted(Comparator.comparing(car->car.number))
                    .mapToInt(Car::cost).toArray();
        }
}