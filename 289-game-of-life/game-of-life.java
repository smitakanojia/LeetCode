class Solution {
    public void gameOfLife(int[][] board) {
        int n=board.length;
        int m=board[0].length;
        int[][] dup=new int[n][m];
        for(int i=0; i<n; i++ ){
            for(int j=0; j<m;j++ ){
                dup[i][j]=board[i][j];
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                int sum=0;
                for(int x=-1; x<=1 ;x++ ){
                    for(int y=-1; y<=1;y++){
                        int r=i+x;
                        int c=j+y;
                        if(r>=0 && c>=0 && r<n && c<m){
                            if(x==0 && y==0) continue;
                            else sum+=dup[r][c];
                        }
                    }
                }
                if(dup[i][j]==1){
                    if(sum<2) board[i][j]=0;
                    else if(sum>3) board[i][j]=0;
                }
                else{
                    if(sum == 3) board[i][j]=1;
                }
            }
        }
    }
}