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
/ Initialize all keys as INFINITE
        Arrays.fill(key, Integer.MAX_VALUE);

        // Always include the first vertex in MST.
        // Make key 0 so that this vertex is picked as the first vertex.
        key[0] = 0;
        parent[0] = -1; // First node is always root of MST

        // The MST will have V vertices
        for (int count = 0; count < vertices - 1; count++) {
            // Pick the minimum key vertex from the set of vertices not yet included in MST
            int u = minKey(key, mstSet);

            // Include the picked vertex in MST set
            mstSet[u] = true;

            // Update key value and parent index of the adjacent vertices of the picked vertex.
            // Consider only those vertices which are not yet included in the MST
            for (int v = 0; v < vertices; v++) {
                if (graph[u][v] != 0 && !mstSet[v] && graph[u][v] < key[v]) {
                    parent[v] = u;
                    key[v] = graph[u][v];
                }
            }
