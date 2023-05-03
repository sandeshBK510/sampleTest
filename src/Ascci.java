import java.math.BigInteger;

import java.util.*;

public class Ascci {

    public static void main(String[] args) {


         Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name");
        String name = sc.next();

        for(int i = 0; i < name.length() ; i++) {
            char character = name.charAt(i);
            int ascii = (int) character;
            System.out.println(character + " = " + ascii);
        }

    }
}
