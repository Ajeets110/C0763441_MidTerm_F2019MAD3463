import java.util.Scanner;

public class LambtonStringTools {

    public void reverse(String s) {

        String reverse = "";


        for (int i = s.length() - 1; i >= 0; i--) {
            reverse = reverse + s.charAt(i);
        }

        System.out.println("Reversed string is:");
        System.out.println(reverse);
    }

/**
    public void binToDec(String s)
    {

    }
 **/
}
