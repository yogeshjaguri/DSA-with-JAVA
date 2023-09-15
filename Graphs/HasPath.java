package Graphs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class HasPath {

    public static void main(String[] args) throws NumberFormatException, IOException {
        /*
         * Write Your Code Here
         * Complete the Rest of the Program
         * You have to take input and print the output yourself
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] ve = br.readLine().trim().split(" ");
        int V = Integer.parseInt(ve[0]);
        int E = Integer.parseInt(ve[1]);

        int[][] graph = new int[V][V];

        for (int i = 0; i < E; i++) {
            String[] edge = br.readLine().trim().split(" ");
            int u = Integer.parseInt(edge[0]);
            int v = Integer.parseInt(edge[1]);
            graph[u][v] = 1;
            graph[v][u] = 1;
        }

        String[] svd = br.readLine().trim().split(" ");
        int src = Integer.parseInt(svd[0]);
        int dest = Integer.parseInt(svd[1]);

        boolean[] visited = new boolean[V];
        boolean hasPath = hasPathBFS(graph, src, dest, visited);

        System.out.println(hasPath);
    }

    private static boolean hasPathBFS(int[][] graph, int src, int dest, boolean[] visited) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(src);
        visited[src] = true;

        while (!queue.isEmpty()) {
            int current = queue.poll();

            if (current == dest) {
                return true;
            }

            for (int neighbor = 0; neighbor < graph.length; neighbor++) {
                if (graph[current][neighbor] == 1 && !visited[neighbor]) {
                    queue.offer(neighbor);
                    visited[neighbor] = true;
                }
            }
        }

        return false;

    }

}
