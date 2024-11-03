package intensiv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Util {

    private static final BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

    static void waitSecond() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    static String readLine() {
        try {
            return stdin.readLine();
        } catch (IOException e) {
            throw new RuntimeException("Failed to read line from stdin", e);
        }
    }

}
