
public class BasicComparator {
    public static void main(String args[]) {
        Comparator<String> comparator = new Comparator<String>() {
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(),s2.length());
            }
        }

    }
}
