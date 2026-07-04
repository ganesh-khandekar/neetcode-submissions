class Solution {
        private List<List<String>> m =new ArrayList<>();
        private int[][] matrix =new int[50][50];
        int at=0;
     public List<List<String>> solveNQueens(int n) {
         return placeNQueen(0,n);
    }    
      public boolean isposible(int row,int col,int number){
        for (int i=row-1; i >=0  ; i--) {
            if(matrix[i][col]==1){

                return true;
            }
        }
        // diagnolly left
        for (int i=row-1,j=col-1; i >=0 && j >=0 ; i--,j--) {
            if(matrix[i][j]==1){
                return true;
            }
        }

        // dignolly right
        for (int i=row-1,j=col+1; i >=0 && j <number ; i--,j++) {
            if(matrix[i][j]==1){
                return true;
            }
        }
        return false;

    }




    List<List<String>> placeNQueen(int row,int number ){
        //base case
        if (number ==row){
            m.add(new ArrayList<>());
            for (int i = 0; i <number ; i++) {
                String s =new String();
                for (int j = 0; j <number ; j++) {                    
                    if(matrix[i][j]==1){
                        s= s+"Q";
                    }else{
                        s= s+".";
                    }
                        
                }
                m.get(at).add(s);
                System.out.println("");
            }
            System.out.println();
            at++;

        }  
        
        //possible place of queen
        for (int col = 0; col <number ; col++) {
            if(!isposible(row,col,number)){
                matrix[row][col]=1;
                placeNQueen(++row,number);
                row--;
                matrix[row][col]=0;
            }else{
                matrix[row][col]=0;
            }
        }

        return m;
    }
   
}
