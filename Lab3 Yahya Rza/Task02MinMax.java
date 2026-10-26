import java.util.Scanner;

public class Task02MinMax {
    public static int min(int[] a) { int m=a[0]; for(int n:a) if(n<m)m=n; return m; }
    public static int max(int[] a) { int m=a[0]; for(int n:a) if(n>m)m=n; return m; }
    public static int[] minMax(int[] a) { return new int[]{min(a), max(a)}; }

    public static void main(String[] args) {
        if (args.length > 0) {
            int[] a = new int[args.length];
            try { for(int i=0;i<args.length;i++) a[i]=Integer.parseInt(args[i]); }
            catch(NumberFormatException e) { System.out.println("Use integers only."); return; }
            show(a);
        } else {
            Scanner in = new Scanner(System.in);
            System.out.print("How many numbers? "); int count=in.nextInt();
            if(count<1){System.out.println("Enter at least one number.");return;}
            int[] a=new int[count]; for(int i=0;i<count;i++) a[i]=in.nextInt(); show(a);
        }
    }
    private static void show(int[] a) { int[] result=minMax(a); System.out.println("Minimum: "+result[0]); System.out.println("Maximum: "+result[1]); }
}
