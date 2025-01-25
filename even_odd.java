/* find whether the given number is even or odd but don't use arithmetic operator */


import java.util.*;
public class Even_odd {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = in.nextInt();
        if((num & 1) ==0)
        {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }
}
