public class climbStairs{
    public static int climbStairs(int n ){
        if(n<=2) return n;
        
        int a = 1;
        int b = 2;
        
        for(int i = 3;i<=n;i++){
            int c = a+b;
            a=b;
            b=c;
        }
        
        return b;
    }
    
    public static void main(String[] args){
        int n =5;
        System.out.println(climbStairs(n));
    }
}