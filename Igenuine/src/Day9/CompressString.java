package Igenuine.src.Day9;

public class CompressString {
    public static void main(String[] args) {
        String str = "aabbbcccc";
        StringBuilder sb = new StringBuilder();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            int count = 1;
            while (i + 1 < n && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            sb.append(count);
        }
        System.out.println(sb.toString());
    }
}
