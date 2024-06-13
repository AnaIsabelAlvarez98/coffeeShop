import java.util.Scanner;

public class Coffee extends Drink {
    Boolean withMilk;
    String bitterness;
    Scanner scanner = new Scanner(System.in);

    public Coffee() {

    }

    public Coffee(double price, String type, String size, double degrees, Boolean withMilk, String bitterness) {
        super(price, type, size, degrees);
        this.withMilk = withMilk;
        this.bitterness = bitterness;
    }

    public Boolean getWithMilk() {
        return withMilk;
    }

    public void setWithMilk(Boolean withMilk) {
        this.withMilk = withMilk;
    }

    public String getBitterness() {
        return bitterness;
    }

    public void setBitterness(String bitterness) {
        this.bitterness = bitterness;
    }

    public String wantsMilk() {
        System.out.println("Do you want your coffee with milk? Choose 1 for yes, or 2 for not");
        int usersSelection = scanner.nextInt();
        String message = (withMilk) ? "yes" : "not";;
        withMilk = usersSelection == 1;
        return message;
    }

    @Override
    public void showInfo() {
        wantsMilk();
        System.out.println("This coffee has milk: " + withMilk + "This coffee has a bitterness of: " + bitterness);
    }
}
