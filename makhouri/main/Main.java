package main;

import com.ashok.lang.inputs.InputReader;
import com.ashok.lang.inputs.Output;
import dataStructures.implementation.SinglyLinkedListImpl;

import java.io.IOException;

/**
 * This class is to test classes implemented.
 *
 * @author Ashok Rajpurohit (ashok1113@gmail.com).
 */
public class Main {
    private static InputReader in = new InputReader();
    private static Output out = new Output();

    public static void Main(String[] args) throws IOException {
        // test your code here.
        SinglyLinkedListImpl list = new SinglyLinkedListImpl(); // object creation.
        int t = in.readInt();

        while (t > 0) {
            t--;
            // perform operations on the object.
        }
    }
}
