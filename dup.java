public class dup {
    public static void main(String[] args) {
        String str = "banana";
        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
        boolean isDuplicate = false;
        for (int k = 0; k < i; k++) {
            if (str.charAt(i) == str.charAt(k)) {
                isDuplicate = true;
                break;
            }
        }
        if (!isDuplicate) {
            System.out.println(str.charAt(i) + " appears " + count + " times.");
        }
    }
}
}
