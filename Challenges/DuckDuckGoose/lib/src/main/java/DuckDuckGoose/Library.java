/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package DuckDuckGoose;

import java.util.ArrayList;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }

    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(6);
        int k = 3;
DuckDuckGoose test = new DuckDuckGoose();
//        ArrayList test1 = {A,B,C,D,E};
        q.enQueue('A');
        q.enQueue('B');
        q.enQueue('C');
        q.enQueue('D');
        q.enQueue('E');
        System.out.println(test.duckDuckGoose(q,k));
    }
}
