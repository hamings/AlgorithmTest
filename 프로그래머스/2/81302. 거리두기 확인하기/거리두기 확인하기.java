class Solution {
    private static final int[] dx = {0,-1,1,0};
        private static final int[] dy = {-1,0,0,1};
        public boolean isNextDistanced(char[][] room, int x, int y, int exclude){
            for(int i = 0;i<4;i++){
                if(i==exclude) continue;
                int nx = x+dx[i];
                int ny = y+dy[i];
                if(nx<0||nx>=5||ny<0||ny>=5) continue;
                if(room[ny][nx]=='P'){
                    return false;
                }
            }
            return true;
        }
        public boolean isDistanced(char[][] room, int x, int y){
            for(int i = 0;i<4;i++){
                int nx = x+dx[i];
                int ny = y+dy[i];
                if(nx<0||nx>=5||ny<0||ny>=5) continue;
                if(room[ny][nx]=='P'){
                    return false;
                }if(room[ny][nx]=='O'){
                    if(!isNextDistanced(room,nx,ny,3-i)) return false;
                }
            }
            return true;
        }
        public boolean isDistanced(char[][] room){
            for(int y = 0;y< room.length;y++){
                for(int x = 0;x<room[y].length;x++){
                    if(room[y][x]!='P') continue;
                    if(!isDistanced(room,x,y)) return false;
                }
            }
            return true;
        }
        public int[] solution(String[][] places) {
            int[] answer = new int[5];
            for(int i =0;i< places.length;i++){
                char[][] room = new char[5][5];
                for(int j = 0;j<places[i].length;j++){
                    room[j]= places[i][j].toCharArray();
                }
                answer[i]=isDistanced(room)?1:0;
            }
            
            return answer;
    }
}