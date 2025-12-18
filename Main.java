import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static PrintStream out = System.out;
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        // Test 1
        {
            out.println("Test 1");
            DirectedGraph g = new DirectedGraph();
            g.addEdge(1, 2);
            g.addEdge(1, 3);
            g.addEdge(2, 4);
            g.addEdge(3, 4);
            out.println(g);
        }

        // Test 2
        {
            out.println("Test 2");
            DirectedGraph g = new DirectedGraph();
            out.println(g.addEdge(1, 1));
            out.println(g.addEdge(1, 3));
            out.println(g.addEdge(3, 2));
            out.println(g.addEdge(2, 4));
            out.println(g.addEdge(2,4));
            out.println(g.addEdge(4, 2));
            out.println(g);
        }

        // Test 3
        {
            out.println("Test 3");
            DirectedGraph g = new DirectedGraph();
            g.addEdge(1, 1);
            g.printVertices();
            g.addEdge(1,3);
            g.printVertices();
            g.addEdge(2,4);
            g.printVertices();
        }

        // Test 4
        {
            out.println("Test 4");
            DirectedGraph g = new DirectedGraph();
            g.addEdge(1, 4);
            g.addEdge(2, 4);
            g.addEdge(3, 4);
            g.addEdge(4, 5);
            g.addEdge(4, 6);
            g.addEdge(5, 7);
            g.addEdge(5, 1);
            g.addEdge(7, 6);
            g.addEdge(6, 3);
            int[] n = g.verticesWithMinDegree(3);
            for (int x : n)
                out.print(x + " ");
            out.println();
        }

        // Test 5
        {
            out.println("Test 5");
            DirectedGraph g = new DirectedGraph();
            g.addEdge(1, 4);
            g.addEdge(2, 4);
            g.addEdge(3, 4);
            g.addEdge(4, 5);
            g.addEdge(4, 6);
            g.addEdge(5, 7);
            g.addEdge(5, 1);
            g.addEdge(7, 6);
            g.addEdge(6, 3);
            int[] n = g.verticesWithInDominantDegree();
            for (int x : n)
                out.print(x + " ");
            out.println();
        }

        // Test 6
        {
            out.println("Test 6");
            DirectedGraph g = new DirectedGraph();
            g.addEdge(1,2);
            g.addEdge(1,3);
            g.addEdge(2,4);
            g.addEdge(3,4);
            out.println(g);
            out.println(g.edgeRedirect(1,2));
            out.println(g.edgeRedirect(1,4));
            out.println(g);
        }

        // Test 7
        {
            out.println("Test 7");
            DirectedGraph g = new DirectedGraph();
            g.addEdge(1, 4);
            g.addEdge(2, 4);
            g.addEdge(3, 4);
            g.addEdge(4, 5);
            g.addEdge(4, 6);
            g.addEdge(5, 7);
            g.addEdge(5, 1);
            g.addEdge(7, 6);
            g.addEdge(6, 3);
            out.println(g);
            out.println(g.deleteEdge(1, 4));
            out.println(g.deleteEdge(1, 2));
            out.println(g);
        }

        // Test 8
        {
            out.println("Test 8");
            DirectedGraph g = new DirectedGraph();
            g.addEdge(1, 4);
            g.addEdge(2, 4);
            g.addEdge(3, 4);
            g.addEdge(4, 5);
            g.addEdge(4, 6);
            g.addEdge(5, 7);
            g.addEdge(5, 1);
            g.addEdge(7, 6);
            g.addEdge(6, 3);
            out.println(g);
            out.println(g.deleteVertex(4));
            out.println(g.deleteVertex(0));
            out.println(g);
        }

        // Test 9
        {
            out.println("Test 9");
            DirectedGraph g = new DirectedGraph();
            g.addEdge(1, 4);
            g.addEdge(2, 4);
            g.addEdge(3, 4);
            g.addEdge(4, 5);
            g.addEdge(4, 6);
            g.addEdge(5, 7);
            g.addEdge(5, 1);
            g.addEdge(7, 6);
            g.addEdge(6, 3);
            out.println(g);
            g.printVertices();
            g.deleteVerticesWithMinDegreeDifference();
            out.println(g);
            g.printVertices();
        }

        // Test 10
        {
            out.println("Test 10");
            DirectedGraph g = new DirectedGraph();
            g.addEdge(1, 4);
            g.addEdge(2, 4);
            g.addEdge(3, 4);
            g.addEdge(4, 5);
            g.addEdge(4, 6);
            g.addEdge(5, 7);
            g.addEdge(5, 1);
            g.addEdge(7, 6);
            g.addEdge(6, 3);
            out.println(g);
            g.printVertices();
            g.deleteVerticesWithMinDegreeDifference();
            out.println(g);
            g.printVertices();
        }
    }
}