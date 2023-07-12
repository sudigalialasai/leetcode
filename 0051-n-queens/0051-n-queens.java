class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][] chess=new char[n][n];
        for(int i=0;i<n;++i){
            for(int j=0;j<n;++j){
                chess[i][j]='.';
            }
        }
        List<List<String>> l=new ArrayList<>();
        dfs(l,chess,0);
        return l;       
    }

    public List<String> construct(char[][] chess){
        List < String > res = new LinkedList < String > ();
        for(int i=0;i<chess.length;++i){
            String s=new String(chess[i]);
            res.add(s);

        }
        return res;
    }

    public void dfs(List<List<String>> l,char[][] chess,int column){
        if(column==chess[0].length){
            l.add(construct(chess));
            return;
        }
        for(int i=0;i<chess.length;++i){
            if(valid(chess,i,column)){
                chess[i][column]='Q';
                dfs(l,chess,column+1);
                chess[i][column]='.';
            }
        }
    }
    public boolean valid(char[][] board,int row,int col){
         int duprow = row;
        int dupcol = col;
        while (row >= 0 && col >= 0) {
            if (board[row][col] == 'Q') return false;
            row--;
            col--;
        }

        row = duprow;
        col = dupcol;
        while (col >= 0) {
            if (board[row][col] == 'Q') return false;
            col--;
        }

        row = duprow;
        col = dupcol;
        while (col >= 0 && row < board.length) {
            if (board[row][col] == 'Q') return false;
            col--;
            row++;
        }
        return true;
    }
    }
