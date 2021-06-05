public class NonVeg extends Pizza{
    private String nonVegToppings;

    public String getNonVegToppings() {
        return nonVegToppings;
    }

    public NonVeg(int itemId, String category, String type, String size,String nonVegToppings) {
        super(itemId, category, type, size);
        this.nonVegToppings = nonVegToppings;
    }


    @Override
    public double calTax() {
        return (validateType() + calNonVegToppings()) * 0.1;
    }

    private int calNonVegToppings() {
        if (!getNonVegToppings().equals("non")){
            return 20;
        }
        return 0;
    }

    @Override
    public int validateType() {
        if (getType().equals("s")) {
            switch (getSize()) {
                case "s":
                    return 50;
                case "m":
                    return 100;
                case "l":
                    return 150;
            }
        } else if (getType().equals("n")) {
            switch (getSize()) {
                case "s":
                    return 40;
                case "m":
                    return 80;
                case "l":
                    return 120;
            }
        }
        return 0;
    }

    @Override
    public double identifyCost() {
        return validateType() + calNonVegToppings();
    }

    @Override
    public double calculateBillAmount() {
        return (identifyCost() + calTax());
    }
}
