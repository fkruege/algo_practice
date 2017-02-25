package BreadthFirstSearch;

import edu.princeton.cs.algs4.BreadthFirstPaths;
import edu.princeton.cs.algs4.Graph;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by fkruege on 2/25/17.
 */
public class MyBreadthFirstTests {

    @Before
    public void before(){

    }

    @Test
    public void test1(){

        String inputGraphFileName = "src/test/resources/tinyCG.txt";
        String sourceVertex = "0";

        In in = new In(inputGraphFileName);
        Graph G = new Graph(in);
        // StdOut.println(G);

        int s = Integer.parseInt(sourceVertex);
        BreadthFirstPaths bfs = new BreadthFirstPaths(G, s);

        for (int v = 0; v < G.V(); v++) {
            if (bfs.hasPathTo(v)) {
                StdOut.printf("%d to %d (%d):  ", s, v, bfs.distTo(v));
                for (int x : bfs.pathTo(v)) {
                    if (x == s) StdOut.print(x);
                    else        StdOut.print("-" + x);
                }
                StdOut.println();
            }

            else {
                StdOut.printf("%d to %d (-):  not connected\n", s, v);
            }
        }

    }

}
