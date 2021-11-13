
// This is 2-D matrix representation of the Graph 
import java.util.Scanner;

public class AdjMatrixGraph {
    int vertices;
    int matrix[][];

    AdjMatrixGraph(int vertices) {
        this.vertices = vertices;
        matrix = new int[vertices][vertices];

    }

    void addEdge(int source, int destination) {
        matrix[source][destination] = 1;
        matrix[destination][source] = 1;
    }

    void printGraph() {
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of vertices");
        int V = s.nextInt();
        AdjMatrixGraph amg = new AdjMatrixGraph(V);
        System.out.println("Enter the number of edges");
        int E = s.nextInt();

        for (int i = 0; i < E; i++) {
            System.out.println("Enter the source vertex");
            int a = s.nextInt();
            System.out.println("Enter the destination vertex");
            int b = s.nextInt();

            amg.addEdge(a, b);
        }
        amg.printGraph();

    }
}
