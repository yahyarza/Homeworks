import java.util.Scanner;
class PointForDirections { final int x,y; PointForDirections(int x,int y){this.x=x;this.y=y;} public String toString(){return "("+x+", "+y+")";} }
public class Task16ArrayOfPoints {
    public static void main(String[] args){Scanner in=new Scanner(System.in);System.out.print("Number of points: ");int n=in.nextInt();if(n<1){System.out.println("Enter at least one point.");return;}PointForDirections[] p=new PointForDirections[n];for(int i=0;i<n;i++){System.out.print("Point "+(i+1)+" x y: ");p[i]=new PointForDirections(in.nextInt(),in.nextInt());}
        PointForDirections north=p[0],south=p[0],east=p[0],west=p[0];for(PointForDirections v:p){if(v.y>north.y)north=v;if(v.y<south.y)south=v;if(v.x>east.x)east=v;if(v.x<west.x)west=v;}
        System.out.println("North: "+north);System.out.println("South: "+south);System.out.println("East: "+east);System.out.println("West: "+west);}
}
