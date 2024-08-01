import java.util.StringTokenizer;

public class StringTokenizer2 {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer(
                "Demonstrating methods from String Tokenizer Class which is going to be very helpful in understanding its basics",
                " ");
        while (st.hasMoreElements()) {
            System.out.println(st.nextToken());

        }
    }
}
