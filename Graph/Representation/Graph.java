package Graph.Representation;

import java.util.ArrayList;

public class Graph {

    class Pair{
        int node;
        int weight;

        Pair(int n, int w){
            node = n;
            weight = w;
        }

        @Override
        public String toString() {
            return "Node: " + node + ", Weight: " + weight;
        }
    }

    int adjMatrix[][];

    ArrayList<ArrayList<Integer>> adjList;

    ArrayList<ArrayList<Pair>> adjListWithWeight;

    Graph(int nodes){
        adjMatrix = new int[nodes][nodes]; // creating a 2D array of size nodes x nodes
        adjList = new ArrayList<>(); // creating an array list of array lists
        adjListWithWeight = new ArrayList<>(); // creating an array list of array lists

        for(int i = 0; i < nodes; i++){
            adjList.add(new ArrayList<>()); // adding an empty array list for each node
            adjListWithWeight.add(new ArrayList<>()); // adding an empty array list for each node
        }
    }

    public void addEdgesInMatrix(int[][] edges, boolean isDirected){
        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];

            if(isDirected){
                //directed
                adjMatrix[u][v] = 1; 
            } else {
                //undirected
                adjMatrix[u][v] = 1; 
                adjMatrix[v][u] = 1; 
            }
        }
    }

    public void addEdgesWithWeightMatrix(int[][] edges, boolean isDirected){
        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];
            int w = edge[2]; // weight

            if(isDirected){
                //directed
                adjMatrix[u][v] = w; 
            } else {
                //undirected
                adjMatrix[u][v] = w; 
                adjMatrix[v][u] = w; 
            }
        }
    }

    public void addEdgesInList(int[][] edges, boolean isDirected){
        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];

            if(isDirected){
                //directed
                adjList.get(u).add(v);
                
            } else {
                //undirected
                adjList.get(u).add(v);
                adjList.get(v).add(u);
            }
        }
    }

    public void addEdgesWithWeightList(int[][] edges, boolean isDirected){
        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];
            int w = edge[2]; // weight

            if(isDirected){
                //directed
                Pair p = new Pair(v, w);
                adjListWithWeight.get(u).add(p);
                
            } else {
                //undirected
                Pair p1 = new Pair(v, w);
                Pair p2 = new Pair(v, w);
                adjListWithWeight.get(u).add(p1);
                adjListWithWeight.get(v).add(p2);
            }
        }
    }

    public void printMatrix(){
        for(int i = 0; i < adjMatrix.length; i++){
            System.out.print("Row " + i + ": ");
            for(int j = 0; j < adjMatrix[i].length; j++){
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void printList(){
        for(int i = 0; i < adjList.size(); i++){
            System.out.print("Node " + i + ": ");
            for(int j = 0; j < adjList.get(i).size(); j++){
                System.out.print(adjList.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    public void printWeightedList(){
        for(int i = 0; i < adjListWithWeight.size(); i++){
            System.out.print("Node " + i + ": ");
            for(int j = 0; j < adjListWithWeight.get(i).size(); j++){
                System.out.print(adjListWithWeight.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // int[][] edges = {{0, 1}, {0, 2}, {1, 2}, {2, 3}};
        // int nodes = 4;
        // System.out.println("Undirected Graph:");
        // Graph graph = new Graph(nodes);
        // graph.addEdgesInMatrix(edges, false);
        // graph.printMatrix();
        // System.out.println("Directed Graph:");
        // Graph graph1 = new Graph(nodes);
        // graph1.addEdgesInMatrix(edges, true);
        // graph1.printMatrix();

        // int[][] edges = {{0, 1, 10}, {0, 2, 10}, {1, 2, 10}, {2, 3, 10}};
        // int nodes = 4;
        // System.out.println("Weighted Undirected Graph:");
        // Graph graph = new Graph(nodes);
        // graph.addEdgesWithWeightMatrix(edges, false);
        // graph.printMatrix();
        // System.out.println("Weighted Directed Graph:");
        // Graph graph1 = new Graph(nodes);
        // graph1.addEdgesWithWeightMatrix(edges, true);
        // graph1.printMatrix();

        // int[][] edges = {{0, 1}, {0, 2}, {1, 2}, {2, 3}};
        // int nodes = 4;
        // System.out.println("Undirected Graph:");
        // Graph graph = new Graph(nodes);
        // graph.addEdgesInList(edges, false);
        // graph.printList();
        // System.out.println("Directed Graph:");
        // Graph graph1 = new Graph(nodes);
        // graph1.addEdgesInList(edges, true);
        // graph1.printList();

        int[][] edges = {{0, 1, 10}, {0, 2, 10}, {1, 2, 10}, {2, 3, 10}};
        int nodes = 4;
        System.out.println("Weighted Undirected Graph:");
        Graph graph = new Graph(nodes);
        graph.addEdgesWithWeightList(edges, false);
        graph.printWeightedList();
        System.out.println("Weighted Directed Graph:");
        Graph graph1 = new Graph(nodes);
        graph1.addEdgesWithWeightList(edges, true);
        graph1.printWeightedList();
    }
}
