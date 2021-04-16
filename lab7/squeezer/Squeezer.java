package squeezer;
 
public class Squeezer{
    private int numberOfSpeeds;

    private String color;

    private String producer;

    private int price;

    protected String powerConsumption;

    private static int objectCountField;

    public Squeezer(int numberOfSpeeds, String color, String producer, int price, String powerConsumption) {
        super();
        setValues(numberOfSpeeds, color, producer, price, powerConsumption);
        objectCountField++;
    }

    public Squeezer(int numberOfSpeeds, String color, String producer) {
        this(numberOfSpeeds, color, producer, 2, "black"); 
        
    }

    public Squeezer() {
        this(2, "black", "PHILIPS", 3200, "two hundred  twenty wat");
    }

    public void resetValues(int numberOfSpeeds, String color, String producer, int price, String powerConsumption) {
        setValues(numberOfSpeeds, color, producer, price, powerConsumption);
    }
    public static void printobjectCountField() {
        System.out.println(objectCountField);
    }
    private void setValues(int numberOfSpeeds, String color, String producer, int price, String powerConsumption) {
        this.numberOfSpeeds = numberOfSpeeds;
        this.color = color;
        this.producer = producer;
        this.price = price;
        this.powerConsumption = powerConsumption;
    }



    public int getNumberOfSpeeds() {
        return numberOfSpeeds;
    }

    public void setNumberOfSpeeds(int numberOfSpeeds) {
        this.numberOfSpeeds = numberOfSpeeds;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "Squeezer [color=" + color + ", numberOfSpeeds=" + numberOfSpeeds + ", powerConsumption="
                + powerConsumption + ", price=" + price + ", producer=" + producer + "]";
    }
}