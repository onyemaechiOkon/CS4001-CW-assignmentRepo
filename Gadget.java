package gadgetShop;

public class Gadget {
    private String model;
    private float price;
    private int weight;
    private String size;

    public Gadget(String model, float price, int weight, String size) {
        this.model = model;
        this.price = price;
        this.weight = weight;
        this.size = size;
    }
    
    public String getGadgetModel() {
        return model;
    }

    public float getGadgetPrice() {
        return price;
    }

    public int getGadgetWeight() {
        return weight;
    }

    public String getGadgetSize() {
        return size;
    }
    
    public void display() {
        System.out.println("Model: " + model);
        System.out.println("Price: £" + price);
        System.out.println("Weight: " + weight + " grams");
        System.out.println("Size: " + size);
    }
    
}
