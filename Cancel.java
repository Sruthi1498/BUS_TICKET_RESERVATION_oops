public class Cancel extends Book{
    double am = 0;
    double cancelAmount = 100;

    public Cancel(String name, int age) {
        super(name, age);
    }

    public void Cancel(int se,String id,int seat)
    {
        am = cancelAmount * se;
        if(se<seat) {
            System.out.println("Cancelled " + se + "seats");
            System.out.println("Name: " + super.getName());
            System.out.println("Age: " + super.getAge());
            System.out.println("Cancellation fees " + am);
        }
        else
        {
            System.out.println("Seats booked is less than seat cancelling");
        }
    }
}
