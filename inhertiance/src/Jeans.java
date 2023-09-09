public class Jeans extends Bottoms
{
    private String type;

    /**
     * Constructor
     * @param size the size as a String
     * @param color the color as a String
     * @param price the price as a double
     * @param type the type as a String
     */
    public Jeans(String size, String color, double price, String type)
    {
        super(size, color, price);
        this.type = type;
    }

    /**
     * method returns the color, size, and type of Jeans
     * @return type returns the type of Jeans
     */
    public String toString()
    {
        return super.getColor() + " " + super.getSize() + " " + type + " jeans";
    }
}