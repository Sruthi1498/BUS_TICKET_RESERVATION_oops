public class Book extends Customer  {

    int filledSeats = 0;
    int totalSeats = 100;
    int value = 0;
    double amount = 150;
    double cancelAmount = 100;
    double am =0;

    public Book(String name, int age) {
        super(name, age);
    }

    public void Booking(int seat)
    {
        String id;
        int availableSeats = totalSeats - seat;
        amount = seat * amount;
        id = super.getName()+super.getAge()+seat+value;

        System.out.println("Booked Successfully");
        System.out.println("Name: "+ super.getName() );
        System.out.println("Age: "+ super.getAge());
        System.out.println("No of seats booked: "+seat);
        System.out.println("Your ID: "+id);
        System.out.println("Bill amount: "+amount);
    }

    public void Cancel(int se,int id)
    {
        am = cancelAmount * se;
        System.out.println("Cancelled "+se + "seats");
        System.out.println("Name: "+ super.getName() );
        System.out.println("Age: "+ super.getAge());
        System.out.println("Cancellation fees "+am);
    }
}
