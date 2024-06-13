public class Tea extends Drink {
    Boolean withSugar;
    String extraIngredients;

    public Tea() {

    }

    public Tea(double price, String type, String size, double degrees, Boolean withSugar, String extraIngredients) {
        super(price, type, size, degrees);
        this.withSugar = withSugar;
        this.extraIngredients = extraIngredients;
    }

    public Boolean getWithSugar() {
        return withSugar;
    }

    public void setWithSugar(Boolean withSugar) {
        this.withSugar = withSugar;
    }

    public String getExtraIngredients() {
        return extraIngredients;
    }

    public void setExtraIngredients(String extraIngredients) {
        this.extraIngredients = extraIngredients;
    }
}
