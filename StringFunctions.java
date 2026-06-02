public class StringFunctions{
    public static void main(String[] args)
    {
        String str = "java";
        System.out.println("Length:"+str.length());
        System.out.println("Character at 2:"+ str.charAt(2));
        System.out.println("Substring:" + str.substring(1,5));
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("lowercase: " + str.toLowerCase());
        System.out.println("trim:"+str.trim());
        System.out.println("Contains java: " + str.contains("java"));
        System.out.println("starts with ja: " + str.trim().startsWith("ja"));

    }
}