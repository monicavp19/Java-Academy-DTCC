package assignment_3.item_package;

public class driver {
    private int price;
    private String description;
    private String name;
    private String type;


    public static void main (String args []) {
        /*
            This can be where you attempt to test constructing your objects!

            Additionally, you can create a main method in your item class if you so choose.
         */

        // Example construction of root class Object
        driver car= new driver();
        car.setPrice(20000);
        car.setDescription("White car");
        car.setName("Honda");
        car.setType("Sedan");
        System.out.println(car);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "driver{" +
                "price=" + price +
                ", description='" + description + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
