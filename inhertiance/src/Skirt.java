public class Skirt extends Bottoms
{
    private String length;
    private String type;

    /**
     * Constructor
     * @param size the size as a String
     * @param color the color as a String
     * @param price the price as a double
     * @param type the type as a String
     * @param length the length as a String
     */
    public Skirt(String size, String color, double price, String length, String type)
    {
        super(size, color, price);
        this.length = length;
        this.type = type;
    }

    /**
     * method returns the color, size, type, and length of the Skirt
     * @return type returns the type of Skirt
     * @return length returns the length of the Skirt
     */
    public String toString()
    {
        return super.getColor() + " " + super.getSize() + " " + type + " " + length + " skirt";
    }
}