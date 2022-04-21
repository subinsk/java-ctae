
public class stringclass {
    public static void main(String[] args) {
        String str1 = "StringOne";
        System.out.println("String length = " + str1.length());
        System.out.println("Changing to upper Case " + str1.toUpperCase());

        String str2 = "StringTwo";
        System.out.println("Changing to lower Case " + str2.toLowerCase());
        System.out.println("Concatenated string  = " + str1.concat(str2));

        String str3 = "      this string trims whitespaces from the start and end      ";
        System.out.println("String before trimming = " + str3);
        System.out.println("String after trimming = " + str3.trim());

        Boolean out = "RandomString".equals("RandomString");
        System.out.println("Checking Equality  " + out);
        out = "RandomString".equals("RandomString");
        System.out.println("Checking Equality  " + out);

        out = "RandomString".equalsIgnoreCase("RandomString");
        System.out.println("Checking Equality " + out);
    }
}