class Solution {
    public int solution(String[] board) {
       boolean bingoO = false;
            boolean bingoX = false;

            int countO = 0;
            int countX = 0;
            int answer = 0;

            for(int i = 0;i<3;i++){
                if(board[i].equals("OOO")){
                    bingoO =true;
                }else if(board[i].equals("XXX")){
                    bingoX=true;
                }
                if(board[0].charAt(i)==board[1].charAt(i)&&board[1].charAt(i)==board[2].charAt(i)){
                    if(board[0].charAt(i)=='O'){
                        bingoO=true;
                    }else if(board[0].charAt(i)=='X'){
                        bingoX=true;
                    }
                }
                for(int j = 0;j<3;j++){
                    if(board[i].charAt(j)=='O'){
                        countO++;
                    }else if(board[i].charAt(j)=='X'){
                        countX++;
                    }
                }
            }
            if(board[0].charAt(0)==board[1].charAt(1)&&board[1].charAt(1)==board[2].charAt(2)
                    ||board[0].charAt(2)==board[1].charAt(1)&&board[1].charAt(1)==board[2].charAt(0)) {
                if (board[1].charAt(1) == 'O') {
                    bingoO = true;
                } else if (board[1].charAt(1) == 'X') {
                    bingoX = true;
                }
            }
            if(countO==countX) {
                if ((!bingoO && !bingoX) || (!bingoO && bingoX)) {
                    answer = 1;
                }
            }else if(countO==countX+1){
                if((bingoO&&!bingoX)||(!bingoO&&!bingoX)){
                    answer=1;
                }
            }
            
            return answer;
        }
    }
