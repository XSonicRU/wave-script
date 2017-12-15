//интерпретатор кода с консоли

import java.util.Scanner;

public class launcher {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String inp;
        while (true) {
            inp = s.nextLine();
            if (inp.equalsIgnoreCase("finish") || inp.equalsIgnoreCase("финиш")) {
                break;
            }
            wsvm.make(inp);
        }
    }
}
