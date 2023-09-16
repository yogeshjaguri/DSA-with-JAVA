package Graphs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GetPath {

    public static void main(String[] args) throws NumberFormatException, IOException {

        /*
         * Write Your Code Here
         * Complete the Rest of the Program
         * You have to take input and print the output yourself
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] ve = br.readLine().split(" ");
        int V = Integer.parseInt(ve[0]);
        int E = Integer.parseInt(ve[1]);

        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int i = 0; i < E; i++) {
            String[] edge = br.readLine().split(" ");
            int a = Integer.parseInt(edge[0]);
            int b = Integer.parseInt(edge[1]);
            adjList.get(a).add(b);
            adjList.get(b).add(a);
        }

        String[] svd = br.readLine().split(" ");
        int v1 = Integer.parseInt(svd[0]);
        int v2 = Integer.parseInt(svd[1]);

        boolean[] visited = new boolean[V];
        ArrayList<Integer> path = new ArrayList<>();
        boolean hasPath = hasPathDFS(adjList, v1, v2, visited, path);

        if (hasPath) {
            for (int i = path.size() - 1; i >= 0; i--) {
                System.out.print(path.get(i) + " ");
            }
        }
    }

    private static boolean hasPathDFS(ArrayList<ArrayList<Integer>> adjList, int src, int dest, boolean[] visited,
            ArrayList<Integer> path) {
        visited[src] = true;
        path.add(src);

        if (src == dest) {
            return true;
        }

        for (int neighbor : adjList.get(src)) {
            if (!visited[neighbor]) {
                if (hasPathDFS(adjList, neighbor, dest, visited, path)) {
                    return true;
                }
            }
        }

        path.remove(path.size() - 1);
        return false;

    }

}
