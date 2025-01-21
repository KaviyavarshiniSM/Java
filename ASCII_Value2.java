public class ASCII_Value2 {
    public static void main(String[] args) {
        char ch = '5';
        if(ch >= 48 && ch <= 57)             //ASCII value of 5 is 55
        {
            System.out.println("It's a digit");
        }
        else {
            System.out.println("Not a digit");
        }
    }
}
