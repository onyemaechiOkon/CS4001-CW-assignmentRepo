package gadgetShop;
import gadgetShop.Gadget;


public class Mobile extends Gadget {
    private int callingCredit;

    public Mobile(String model, float price, int weight, String size, int callingCredit) {
        super(model, price, weight, size);
        this.callingCredit = callingCredit;
    }

    public int getCallingCredit() {
        return callingCredit;
    }

    public void addCallingCredit(int creditToBeAdded) {
        if (creditToBeAdded > 0) {
            callingCredit += creditToBeAdded;
        } else {
            System.out.println("Please enter a positive amount of calling credit to be added .");
        }
    }

    public void makeCall(String phoneNumber, int duration) {
        if (callingCredit >= duration) {
            System.out.println("Making a call to " + phoneNumber + " for " + duration + " minutes.");
            callingCredit -= duration;
        } else {
            System.out.println("Insufficient calling credit to make the call.");
        }
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Calling Credit Remaining: " + callingCredit + " minutes\n");
    }
}
