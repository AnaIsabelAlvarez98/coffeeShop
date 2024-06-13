public class Drink {
    double price;
    String type;
    String size;
    double degrees;

    public Drink(){

    }
    public Drink(double price, String type, String size, double degrees) {
        this.price = price;
        this.type = type;
        this.size = size;
        this.degrees = degrees;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getDegrees() {
        return degrees;
    }

    public void setDegrees(double degrees) {
        this.degrees = degrees;
    }

    public void showInfo(){
        System.out.println("This drink has a price of: " + price + "$ \n It's type is: " + type + "\n It's size is: " + size + "\n It's temperature is: " + degrees + "°");
    }
}
