public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sbl = new StringBuilder();
        sbl.append("Hello");
        sbl.append("Vitians");
        System.out.println("Appended String: " + sbl);

        sbl.insert(3, "Heyy");

        System.out.println("Inserted " + "Heyy in the String: " + sbl);

        sbl.replace(1, 4, "merci");

        System.out.println("Replaced 1 to 3rd index of the String " + sbl);

        sbl.delete(4, 8);

        System.out.println("Deleted 4 to 7th index of the String " + sbl);

        sbl.reverse();

        System.out.println("Reversed String: " + sbl);

        System.out.println(sbl.capacity());

        sbl.append(
                "He is good at programming in c language and he wants to thirve as a data scientist so wants to learn python also");

        System.out.println("Increased capacity of the StringBuilder: " + sbl.capacity());

        sbl.ensureCapacity(10);

        System.out.println("Original Capacity: " + sbl.capacity());

        sbl.ensureCapacity(130);

        System.out.println("changed the capacity to ensure the minimum capacity value: " + sbl.capacity());

    }
}
