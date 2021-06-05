public abstract class Pizza {
    private int itemId;
    private int billId;
    private String category;
    private String type;
    private String size;

    public Pizza() {
    }

    public Pizza(int itemId, String category, String type, String size) {
        this.itemId = itemId;
        this.category = category;
        this.type = type;
        this.size = size;
    }

    public int getItemId() {
        return itemId;
    }

    public int getBillId() {
        return billId;
    }

    public String getCategory() {
        return category;
    }

    public String getType() {
        return type;
    }

    public String getSize() {
        return size;
    }

    public abstract double calTax();

    public boolean validateCategory(String category) {
        return false;
    }

    public boolean validateSize(String size) {
        return false;
    }

    public abstract int validateType();

    public abstract double identifyCost();

    public abstract double calculateBillAmount();
}
