/**
 * A class that has accessor methods.
 * @author kchoy
 */

public class Clothing
{
    private String size;
    private String color;
    private double price;

    /**
     * Constructor
     * @param size the size as a String
     * @param color the color as a String
     * @param price the price as a double
     */
    public Clothing(String size, String color, double price)
    {
        this.price = price;
        this.size = size;
        this.color = color;
    }

    /**
     * method that returns the size of the Clothing
     * @return size returns the clothing size
     */
    public String getSize()
    {
        return size;
    }

    /**
     * method that returns the color of the Clothing
     * @return color returns the clothing color
     */
    public String getColor()
    {
        return color;
    }

    /**
     * method that returns the price of the Clothing
     * @return price returns the clothing price
     */
    public double getPrice()
    {
        return price;
    }

    public void setSize(String size)
    {
        this.size = size;
    }
}