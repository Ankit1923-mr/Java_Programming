import java.util.StringTokenizer;

public class StringTokenizer1 {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer(
                "Demonstrating methods from String Tokenizer Class which is going to be very helpful in understanding its basics",
                " ");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());

        }
    }
}
