public class BlueBusImpl implements BlueBus{
    double amount = 100;
    public void member(int seat, String name, int age) {
        double amt = seat*amount;
        System.out.println("Booked successfully");
        System.out.println("Your name: "+name);
        System.out.println("Your age: "+age);
        System.out.println("No of seats booked: "+seat);
        System.out.println("Amount: " + amt);
        double dis = ((10/100)*(amt));
        double discount = amt - dis;
        System.out.println("After 10% discount "+discount);
    }

    @Override
    public void membership(String name, int age) {
        int am = 1000;
        System.out.println("The membership amount to be payed is "+am);
        int dis = ((10/100)*(am));
        System.out.println("After the discount "+dis);
    }

    @Override
    public void normalBooking(int seat,String name, int age) {
        double amt = seat*amount;
        System.out.println("Booked successfully");
        System.out.println("Your name: "+name);
        System.out.println("Your age: "+age);
        System.out.println("No of seats booked: "+seat);
        System.out.println("Amount: " + amt);

    }
}
