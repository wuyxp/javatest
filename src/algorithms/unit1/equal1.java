package algorithms.unit1;
import edu.princeton.cs.algs4.StdOut;

public class equal1 {
    public static void main(String[] args) {
        StdOut.println( args[0] );
        StdOut.println( args[1] );
        StdOut.println( args[2] );
        StdOut.println( args[0].equals(args[1]) ? args[1].equals(args[2]) ? "equal" : "not equal1" : "not equal2" );
    }
}