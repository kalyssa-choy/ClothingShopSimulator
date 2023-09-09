public class Top extends Clothing
{

    /**
     * Constructor
     * @param size the size as a String
     * @param color the color as a String
     * @param price the price as a double
     */
    public Top(String size, String color, double price)
    {
        super(size, color, price);
    }

    /**
     * method returns the color and size of the top
     */
    public String toString()
    {
        return super.getColor() + " " + super.getSize() + " bassic top";
    }
}