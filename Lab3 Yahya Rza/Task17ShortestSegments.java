import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class SegmentForLength { final double x1,y1,x2,y2; SegmentForLength(double x1,double y1,double x2,double y2){this.x1=x1;this.y1=y1;this.x2=x2;this.y2=y2;} double length(){return Math.hypot(x2-x1,y2-y1);} public String toString(){return "[("+x1+", "+y1+"), ("+x2+", "+y2+")]";} }
public class Task17ShortestSegments {
    public static SegmentForLength[] shortest(SegmentForLength[] segments){double min=Double.POSITIVE_INFINITY;for(SegmentForLength s:segments)min=Math.min(min,s.length());List<SegmentForLength> result=new ArrayList<>();for(SegmentForLength s:segments)if(Math.abs(s.length()-min)<1e-9)result.add(s);return result.toArray(new SegmentForLength[0]);}
    public static void main(String[] args){Scanner in=new Scanner(System.in);System.out.print("Number of segments: ");int n=in.nextInt();SegmentForLength[] a=new SegmentForLength[n];for(int i=0;i<n;i++){System.out.print("Enter x1 y1 x2 y2: ");a[i]=new SegmentForLength(in.nextDouble(),in.nextDouble(),in.nextDouble(),in.nextDouble());}for(SegmentForLength s:shortest(a))System.out.println(s+" length="+s.length());}
}
