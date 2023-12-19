import java.util.*;
class Solution {
    public int solution(String[][] book_time){
            Book[] books = new Book[book_time.length];
            for(int i = 0;i< books.length;i++){
                int start = calTime(book_time[i][0]);
                int end = calTime(book_time[i][1]);
                books[i]= new Book(start, end);
            }
            Arrays.sort(books, new Comparator<Book>() {
                @Override
                public int compare(Book o1, Book o2) {
                    if(o1.start==o2.start){
                        return o1.end- o2.end;
                    }else{
                        return o1.start-o2.start;
                    }
                }
            });

            ArrayList<Integer> endTimes = new ArrayList<>();
            for(int i = 0;i< books.length;i++){
                Collections.sort(endTimes);
                boolean check = false;
                for(int j = 0;j<endTimes.size();j++){
                    if(books[i].start>=endTimes.get(j)){
                        endTimes.set(j,books[i].end);
                        check=true;
                        break;
                    }
                }
                if(!check){
                    endTimes.add(books[i].end);
                }
            }
            return endTimes.size();
        }
        private static class Book{
            private final int start;
            private final int end;

            public Book(int start, int end) {
                this.start = start;
                this.end = end+10;
            }
        }
        private int calTime(String time){
            String[] strings = time.split(":");
            int hour = Integer.parseInt(strings[0]);
            int min = Integer.parseInt(strings[1]);
            return hour*60+min;
        }
}