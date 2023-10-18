import java.util.Arrays;

public class PrimAlgorithm {

    public static void primMST(int[][] graph) {
        int vertices = graph.length;

        // Array to store constructed MST
        int[] parent = new int[vertices];

        // Key values used to pick minimum weight edge in cut
        int[] key = new int[vertices];

        // To represent set of vertices not yet included in MST
        boolean[] mstSet = new boolean[vertices];
