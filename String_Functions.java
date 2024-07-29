public class String_Functions {
    public static void main(String args[]) {
        String text = "nbdjhsukhfdjkfnd";
        String text1 = "Ankit Kumar";
        String firstname = "Ankit";
        String secondname = "Kumar";
        String x = "Ankit";
        int y = 10;
        String z = x + y;
        String X = "Don't you worry son \"because\" daddy's home";
        
        System.out.println("Length of text is: " + text.length());
        
        System.out.println(text1.toUpperCase());
        System.out.println(text1.toLowerCase());
        System.out.println(text1.indexOf("a"));

        System.out.println(firstname + " " + secondname);
        System.out.println(firstname.concat(secondname));

        System.out.println(z);

        System.out.println(X);
    }
}
