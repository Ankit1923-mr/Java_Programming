import java.util.StringTokenizer;

public class Simple {
    public static void main(String args[]) {
        StringTokenizer st = new StringTokenizer("My name is ;Lakhan", ";");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}