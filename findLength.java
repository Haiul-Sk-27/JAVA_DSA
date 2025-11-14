public class Main{
    public static int findLength(int[] A,int[] B){
        int m = A.length,n = B.length,res=0;
        int[][] dp = new int[m+1][n+1];
        
        for(int i = 1;i<=m;i++){
            for(int j = 1;j<=n;j++){
                if(A[i-1]==B[j-1]){
                    dp[i][j] = dp[i-1][j-1]+1;
                    res = Math.max(res,dp[i][j]);
                }
            }
        }
        return res;
    }
    
    public static void main(String[] args){
        int[] A = {1, 2, 3, 2, 1};
        int[] B = {3, 2, 1, 4, 7};

        System.out.println("Maximum Length of Repeated Subarray: " + findLength(A, B));
    }
}