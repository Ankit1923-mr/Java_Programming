import java.util.Scanner; // Import the scanner

class lab_class23_7 {
    public static void main(String[] args) {

        boolean isJavaFun = true;
        boolean isFishtasty = false;
        int x = 10;
        int y = 9;
        int time = 20;
        int day = 4;
        int i = 0;
        String UserName1;
        String UserName;
        double salary;
        int age;
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        try (Scanner myobj = new Scanner(System.in)) {

            System.out.println(isJavaFun);
            System.out.println(isFishtasty);//boolearn expressions

            System.out.println(x > y);  //comparison of two number

            System.out.println(10 == 15);   //Equality comparison

            if (time < 18) {// if else statements
                System.out.println("Good day");
            } else {
                System.out.println("Good evening");
            }

            time = 22;
            if (time < 10) {        //use of else if in if statement when more than one condition is there
                System.out.println("Good day");
            } else if (time < 20) {
                System.out.println("Good day");
            } else {
                System.out.println("Good evening");
            }

            //Switch Case
            switch (day) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    break;
            }

            //While loop
            while (i < 5) {
                System.out.println(i);
                i++;
            }

            //do-while loop 
            i = 0;
            do {
                System.out.println(i);
                i++;
            } while (i < 5);

            //for-loop 
            for (i = 0; i < 5; i++) {
                System.out.println(i);
            }

            //Advanced for-loop
            for (String j : cars) {
                System.out.println(j);
            }

            //Use of break keyword is to break out of the current loop
            for (i = 0; i < 10; i++) {
                if (i == 6) {
                    break;
                }
                System.out.println(i);
            }

            //Use of continue is to ignore the snippet in which continue is mentioned
            for (i = 0; i < 10; i++) {
                if (i == 4) {
                    continue;
                }
                System.out.println(i);
            }

            //Taking use input with the help of Scanner class

            System.out.println("Enter Username: ");
            UserName1 = myobj.nextLine();
            System.out.println("Username is : " + UserName1);

            System.out.println("Enter Username: ");
            UserName = myobj.nextLine();
            System.out.println("Enter salary: ");
            salary = myobj.nextDouble();
            System.out.println("Enter age: ");
            age = myobj.nextInt();
            System.out.println("Username is : " + UserName);
            System.out.println("Salary : " + salary);
            System.out.println("Age : " + age);

            myobj.close();
        }
    }
}

