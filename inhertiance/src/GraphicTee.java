public class GraphicTee extends TShirt
{
    private String graphic;

    /**
     * Constructor
     * @param size the size as a String
     * @param color the color as a String
     * @param price the price as a double
     * @param length the length as a String
     * @param graphic the graphic as a String
     */
    public GraphicTee(String size, String color, double cost, String length, String graphic)
    {
        super (size, color, cost, length);
        this.graphic = graphic;
    }

    /**
     * method returns the color, size, length, and graphic of the Graphic Tee
     * @return length returns the graphic of the Graphic Tee
     */
    public String toString()
    {
        return super.getColor() + " " + super.getSize() + " " + super.getLength() + " " + graphic + " Graphic Tee";
    }
}