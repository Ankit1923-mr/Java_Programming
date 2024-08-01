public class StringBufferExampleb {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());// default 16
        sb.append("hello");
        System.out.println(sb.capacity());// now also 16 because the number of characters are less than 16
        sb.append("java is my favourite language");
        System.out.println(sb.capacity());// now (16*2)+2=34 i.e (oldcapacity*2)+2
        // sb.append("we are going to go to vit to learn about our current course on
        // computer science");
        // System.out.println(sb.capacity());
        sb.ensureCapacity(10);
        System.out.println(sb.capacity());
        sb.ensureCapacity(50);
        System.out.println(sb.capacity());

    }

}
