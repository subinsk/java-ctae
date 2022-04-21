public class intern {
    public static void main(String[] args) {
        String str1 = new String("quasistar");
        String str2 = "quasistar";
        // returns string from pool, now it will be same as s2
        String str3 = str1.intern();

        System.out.println("reference variables are pointing to different instance so str1==str2 -> " + (str1 == str2));

        System.out.println("reference variables are pointing to same instance so str2==str3 -> " + (str2 == str3));
    }
}
