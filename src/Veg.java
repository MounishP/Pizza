public class Veg extends Pizza {
    private String vegToppings;
    public static int counter = 0;

    public Veg(String vegToppings) {
        this.vegToppings = vegToppings;
        counter++;
    }

    public Veg(int itemId, String category, String type, String size, String vegToppings) {
        super(itemId, category, type, size);
        this.vegToppings = vegToppings;
    }

    public String getVegToppings() {
        return vegToppings;
    }

    @Override
    public double calTax() {
        return (validateType() + calVegToppings()) * 0.05;
    }

    private int calVegToppings() {
        if (!getVegToppings().equals("no")){
            return 10;
        }
        return 0;
    }

    @Override
    public int validateType() {
        if (getType().equals("s")) {
            switch (getSize()) {
                case "s":
                    return 30;
                case "m":
                    return 60;
                case "l":
                    return 90;
            }
        } else if (getType().equals("n")) {
            switch (getSize()) {
                case "s":
                    return 20;
                case "m":
                    return 40;
                case "l":
                    return 80;
            }
        }else {
            System.out.println("Invalid Type Selection");
        }
        return 0;

    }

    @Override
    public double identifyCost() {
        return validateType() + calVegToppings();
    }

    @Override
    public double calculateBillAmount() {
        return (identifyCost() + calTax());
    }
}
