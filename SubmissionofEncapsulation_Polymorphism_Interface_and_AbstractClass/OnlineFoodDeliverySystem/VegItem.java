package SubmissionofEncapsulation_Polymorphism_Interface_and_AbstractClass.OnlineFoodDeliverySystem;

class VegItem extends FoodItem {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }
}
