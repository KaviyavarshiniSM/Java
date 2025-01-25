/* No condition usage
   No recursion usage
   no loops usage
   No ternary operation usage
   No Math.max function
   No Math.min function

   find the Greatest Number

 */

// Math.abs -> it converts negative value into positive value

public class Greatest_No_using_abs {
    public static void main(String[] args) {
        int a =75;
        int b =123;
        int c = ((a+b) + Math.abs(a-b)) / 2;
        int d =((a+b) - Math.abs(a-b)) / 2;
        System.out.println("Max is: " +c);
        System.out.println("Min is: "+d);
    }
}
