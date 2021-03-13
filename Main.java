import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int loop = 1, ch;
        String name = null;
        int age = 0;
        int seat;

        while (loop == 1) {
            System.out.println("WELCOME TO ABC BUS RESERVATION SERVICE");
            System.out.println("1. RedBus Service");
            System.out.println("2. BlueBus Service");
            System.out.println("3. Price enquiry");
            System.out.println("4. Exit");

            ch = scan.nextInt();

            switch (ch) {


                case 1:
                    int flag = 1;
                    while (flag == 1) {
                        System.out.println("1. Book");
                        System.out.println("2. Cancel");
                        System.out.println("3. Exit");
                        int choice = scan.nextInt();

                        switch (choice) {
                            case 1:
                                System.out.println("Enter your name");
                                name = scan.next();
                                System.out.println("Enter your age");
                                age = scan.nextInt();
                                System.out.println("Enter the number of seats to be booked");
                                seat = scan.nextInt();
                                Book b = new Book(name, age);
                                b.Booking(seat);
                                break;

                            case 2:
                                System.out.println("Enter ur ID:");
                                String i = scan.next();
                                System.out.println("Enter the number of seats to be cancelled");
                                int se = scan.nextInt();
                                System.out.println("No of seats booked");
                                int s = scan.nextInt();
                                Cancel c = new Cancel(name, age);
                                c.Cancel(se, i, s);
                                break;

                            case 3:
                                System.exit(0);
                            default:
                                throw new IllegalStateException("Unexpected value: " + choice);
                        }
                    }
                    break;


                case 2:
                    int flag1 = 1;
                    while (flag1 == 1) {
                        System.out.println("1. Membership user");
                        System.out.println("2. Get membership");
                        System.out.println("3. Normal Booking");
                        System.out.println("4. Exit");
                        int cho = scan.nextInt();
                        System.out.println("Enter your name");
                        name = scan.next();
                        System.out.println("Enter your age");
                        age = scan.nextInt();
                        BlueBusImpl m = new BlueBusImpl();

                        switch (cho) {
                            case 1:
                                System.out.println("Enter the number of seats to be booked");
                                seat = scan.nextInt();
                                m.member(seat, name, age);
                                break;

                            case 2:
                                m.membership(name, age);
                                System.out.println("Enter 1 to book and 2 to exit");
                                int c = scan.nextInt();

                                switch (c) {
                                    case 1:
                                        System.out.println("Enter the number of seats to be booked");
                                        seat = scan.nextInt();
                                        m.member(seat, name, age);
                                        break;
                                    case 2:
                                        System.exit(0);
                                }
                                break;

                            case 3:
                                System.out.println("Enter the number of seats to be booked");
                                seat = scan.nextInt();
                                m.normalBooking(seat, name, age);
                                break;

                            case 4:
                                System.exit(0);

                        }
                    }
                case 3:
                    int f = 1;
                    while (f == 1) {
                        System.out.println("1. Bus ticket price enquiry - Seater");
                        System.out.println("2. Bus ticket price enquiry - Semi-sleeper");
                        System.out.println("3. Bus ticket price enquiry - Sleeper");
                        System.out.println("4. Exit");
                        int c = scan.nextInt();
                        switch (c) {
                            case 1:
                                PriceEnquiry p = new Seater();
                                p.price();
                                break;
                            case 2:
                                PriceEnquiry p1 = new SemiSleeper();
                                p1.price();
                                break;
                            case 3:
                                PriceEnquiry p2 = new Sleeper();
                                p2.price();
                                break;
                            case 4:
                                System.exit(0);
                        }
                    }
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }
}