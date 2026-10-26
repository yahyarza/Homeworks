import java.util.*;

public class Task04GraphRepresentations {
    public static List<int[]> matrixToEdges(int[][] matrix) {
        List<int[]> edges=new ArrayList<>();
        for(int i=0;i<matrix.length;i++) for(int j=i+1;j<matrix[i].length;j++) if(matrix[i][j]!=0) edges.add(new int[]{i,j});
        return edges;
    }
    public static List<List<Integer>> matrixToList(int[][] matrix) {
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<matrix.length;i++){ list.add(new ArrayList<>()); for(int j=0;j<matrix[i].length;j++) if(matrix[i][j]!=0) list.get(i).add(j); }
        return list;
    }
    public static int[][] edgesToMatrix(int vertices, List<int[]> edges) {
        int[][] matrix=new int[vertices][vertices];
        for(int[] edge:edges){ int a=edge[0],b=edge[1]; matrix[a][b]=1; matrix[b][a]=1; }
        return matrix;
    }
    public static void main(String[] args) {
        int[][] matrix={{0,1,1},{1,0,0},{1,0,0}};
        System.out.println("Edges:"); for(int[] e:matrixToEdges(matrix)) System.out.println(Arrays.toString(e));
        System.out.println("Adjacency list: "+matrixToList(matrix));
        System.out.println("Matrix from edges: "+Arrays.deepToString(edgesToMatrix(3,matrixToEdges(matrix))));
    }
}
