package string;

public class StringFunctionCompare {
    public static void main(String[] args) {
        String str1 = "Tony";
        String str2 = "Tony";
        String str3 = new String("Tony");

        // First Comparison
        if (str1 == str2) {
            System.out.println("Equal String");
        } else {
            System.out.println("Not Equal");
        }

        // Second Comparison
        if (str1 == str3) {
            System.out.println("Equal String");
        } else {
            System.out.println("Not Equal");
        }

        // Third Comparison
        if (str1.equals(str3)) {
            System.out.println("Equal String");
        } else {
            System.out.println("Not Equal");
        }
    }
}
