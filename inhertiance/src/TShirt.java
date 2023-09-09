public class TShirt extends Top
{
    private String length;

    /**
     * Constructor
     * @param size the size as a String
     * @param color the color as a String
     * @param price the price as a double
     * @param length the length as a String
     */
    public TShirt(String size, String color, double cost, String length)
    {
        super(size, color, cost);
        this.length = length;

    }

    /**
     * method that returns the length of the T-shirt
     * @return length returns the length of the T-shirt
     */
    public String getLength()
    {
        return length;
    }

    /**
     * method returns the color, size, and length of the T-shirt
     * @return length returns the length of the T-shirt
     */
    public String toString()
    {
        return super.getColor() + " " + super.getSize() + " " + length + " T-Shirt";
    }
}
