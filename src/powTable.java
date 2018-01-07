import java.util.Scanner;

import static java.lang.Math.pow;

public class powTable {

    public static void main(String[] args) {
        System.out.println("  a  b  pow(a,b)");
        int a, b=1, c;

        for (a =1; a <=5; a++)
        {
            if(b<=6)
                b++;
            c =(int)pow(a, b);
            System.out.println("  "+a+"  "+b+"  "+c);
        }
    }
}
