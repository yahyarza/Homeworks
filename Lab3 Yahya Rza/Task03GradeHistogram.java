import java.util.Arrays;

public class Task03GradeHistogram {
    public static int[] statistics(int[] grades) {
        int[] result = new int[3]; // mean, median, mode (rounded mean and median)
        if (grades.length == 0) return result;
        int[] sorted = grades.clone(); Arrays.sort(sorted);
        int total=0; int[] counts=new int[11];
        for(int g:grades){ if(g<0||g>10) throw new IllegalArgumentException("Grades must be from 0 to 10."); total+=g; counts[g]++; }
        int mode=0; for(int i=1;i<=10;i++) if(counts[i]>counts[mode]) mode=i;
        result[0]=(int)Math.round((double)total/grades.length);
        result[1]=sorted.length%2==1?sorted[sorted.length/2]:(sorted[sorted.length/2-1]+sorted[sorted.length/2])/2;
        result[2]=mode; return result;
    }
    public static void main(String[] args) {
        int[] grades={7,8,10,6,8,5,9,8,7,10}; int[] histogram=new int[11];
        for(int g:grades) histogram[g]++;
        for(int i=0;i<histogram.length;i++) System.out.println(i+": "+"*".repeat(histogram[i])+" ("+histogram[i]+")");
        int[] s=statistics(grades); System.out.println("Mean: "+(double)Arrays.stream(grades).sum()/grades.length);
        System.out.println("Median: "+s[1]); System.out.println("Mode: "+s[2]);
    }
}
