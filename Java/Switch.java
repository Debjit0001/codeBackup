import java.util.Scanner;

public class Switch {
    /**
     * @param args
     */
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            /*
             * Nested Switch:
             */
            int empID = in.nextInt();
            String department = in.nextLine();

            switch (empID) {

                case 1:
                    System.out.println("Kunal Kushwaha");
                    break;

                case 2:
                    System.out.println("Rahul Rana");
                    break;

                case 3:
                    switch (department) {
                        
                        case "IT":
                            System.out.println("IT Department");
                            break;

                        case "Management":
                            System.out.println("Management Department");
                            break;

                        default:
                            System.out.println("No department entered");
                    }

                default:

                    System.out.println("Enter correct EmpID");

            }
        }

        // int day = in.nextInt();

        // switch(day) {
        // case 1:
        // case 2:
        // case 3:
        // case 4:
        // case 5:
        // System.out.println("Week days");
        // break;
        // case 6:
        // case 7:
        // System.out.println("Weekend");
        // break;
        // }

        // Better format:

        // switch(day) {
        // case 1, 2, 3, 4, 5 -> System.out.println("Week days");
        // case 6, 7 -> System.out.println("Weekend");
        // }
    }
}
