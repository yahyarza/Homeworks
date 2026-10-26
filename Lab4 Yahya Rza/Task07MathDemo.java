public class Task07MathDemo {
    public static int min(int a,int b){return a<b?a:b;} public static int max(int a,int b){return a>b?a:b;}
    public static int sum(int[] values){int total=0;for(int v:values)total+=v;return total;}
    public static float mean(int[] values){return values.length==0?0:(float)sum(values)/values.length;}
    public static int factorial(int n){if(n<0)throw new IllegalArgumentException("n must not be negative");int result=1;for(int i=2;i<=n;i++)result*=i;return result;}
    public static void main(String[] args){int[] values={2,4,6};System.out.println(min(2,4));System.out.println(max(2,4));System.out.println(sum(values));System.out.println(mean(values));System.out.println(factorial(5));System.out.println("Static methods can be called without creating a MathDemo object.");}
}
