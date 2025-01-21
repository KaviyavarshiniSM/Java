public class ASCII_Value1{
    public static void main(String[] args) {
        char ch ='a';
        System.out.println(ch);
        String str = "Welcome to java programming";
        System.out.println(str);
        ch = (char)(ch-32);                  //ASCII value of a: 97  &  A: 65
        System.out.println(ch);
        int num = ch;
        System.out.println(num);
    }
}
