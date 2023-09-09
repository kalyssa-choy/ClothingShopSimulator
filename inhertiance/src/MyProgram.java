import java.util.Scanner;
import java.util.ArrayList;

/**
 * Simulates a online shopping website
 * @author kchoy
 */
public class MyProgram
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to Kalyssa's Clothes! Enter \"exit\" to quit or \"shop\" to continue");
        Scanner in = new Scanner(System.in);
        String shop = in.next();
        ArrayList<Clothing> cart = new ArrayList<Clothing>();

        //checks if the user wants to continue shopping
        while (shop.toLowerCase().equals("shop"))
        {

            //prompts with categories that the user can choose from
            System.out.println("Enter a number for the category you would like to browse, 3 to change the size of an item, or 0 to quit:");
            System.out.println("1. Tops\n2. Bottoms");



            int choice = in.nextInt();
            String size = "";
            String color = "";
            String length = "";
            String graphic = "";
            String type = "";


            //checks if the user wants to stop shopping
            if (choice == 0)
            {
                shop = "quit";
            }

            //lists the tops that can be bought
            else if (choice == 1)
            {
                System.out.println("Here are the tops we have:\n1. T-Shirts ($12)\n2. Graphic Tees ($15)\n3. Basic Tops ($10)");
                System.out.println("Enter a number to buy a top, or enter 0 to go back.");
                int number = in.nextInt();

                //to go back
                if (number == 0)
                {
                    return;
                }

                //for adding a t-shirt to the cart
                else if (number == 1)
                {
                    System.out.println("Enter your size:");
                    size = in.next();
                    System.out.println("Enter the color you want:");
                    color = in.next();
                    System.out.println("Full-length or cropped?");
                    length = in.next();
                    cart.add(new TShirt(size, color, 12, length));
                    System.out.println("T-Shirt has been successfully added");
                }

                //for adding a graphic tee to the cart
                else if (number == 2)
                {
                    System.out.println("Enter your size:");
                    size = in.next();
                    System.out.println("Enter the color you want:");
                    color = in.next();
                    System.out.println("Full-length or cropped?");
                    length = in.next();
                    System.out.println("Choose a graphic: Butterfly, Dragon, Hippo");
                    graphic = in.next();
                    cart.add(new GraphicTee(size, color, 15, length, graphic));
                    System.out.println("Graphic Tee has been successfully added");
                }

                //for adding a basic top to the cart
                else if (number == 3)
                {
                    System.out.println("Enter your size:");
                    size = in.next();
                    System.out.println("Enter the color you want:");
                    color = in.next();
                    cart.add(new Top(size, color, 10));
                    System.out.println("Basic Top has been successfully added");
                }
            }

            //for if the user chose to browse pants
            else if (choice == 2)
            {
                System.out.println("Here are the bottoms we sell:\n1. Skirt ($25)\n2. Jeans ($65)\n3. Shorts ($30)");
                System.out.println("Enter a number to buy a bottom, or enter 0 to go back.");
                int num = in.nextInt();

                //for if the user wants to go back
                if (num == 0)
                {
                    return;
                }

                //for if the user wants to add a skirt to the cart
                else if(num == 1)
                {
                    System.out.println("Enter your size: ");
                    size = in.next();
                    System.out.println("Enter the color you want: ");
                    color = in.next();
                    System.out.println("Mini, Maxi, or Mid-length?");
                    length = in.next();
                    System.out.println("Pleated, Tennis, or Pencil?");
                    type = in.next();
                    cart.add(new Skirt(size, color, 25, length, type));
                    System.out.println("Skirt has been successfully added");
                }

                //for adding jeans to the cart
                else if(num == 2)
                {
                    System.out.println("Enter your size: ");
                    size = in.next();
                    System.out.println("Enter the color you want: ");
                    color = in.next();
                    System.out.println("Ripped, Cargo, Baggy, or Patchwork?");
                    type = in.next();
                    cart.add(new Jeans(size, color, 65, type));
                    System.out.println("Jeans have been successfully added");
                }

                //for adding shorts to the cart
                else if(num == 3)
                {
                    System.out.println("Enter your size: ");
                    size = in.next();
                    System.out.println("Enter the color you want: ");
                    color = in.next();
                    cart.add(new Bottoms(size, color, 30));
                    System.out.println("Shorts have been successfully added");
                }
            }

            //for if the user wants to change the size of an item
            else if (choice == 3)
            {
                System.out.println("Here are the items in your cart: \n");
                for (int i = 0; i < cart.size(); i++)
                {
                    System.out.print((i+1) + ". " + cart.get(i).toString());
                    System.out.println("");

                }
                System.out.println("");
                System.out.println("Enter the item number of the piece of clothing you want to change");
                int k = in.nextInt();
                System.out.println("What size do you want to change the item to? ");
                size = in.next();
                cart.get(k-1).setSize(size);
                System.out.println("Size has successfully been updated.");
            }
            //for if the user gives a number that is not applicable
            else
            {
                System.out.println("Sorry we don't have that category.");
            }
        }

        //array for keeping track of the prices of the items in the cart
        double[] costList = new double[cart.size()];
        double sum = 0;

        for (int k = 0; k < cart.size(); k++)
        {
            costList[k] = cart.get(k).getPrice();
            sum += cart.get(k).getPrice();
        }

        //prints out the items bought with their prices and the total
        System.out.println("\nThankyou for shopping at Kalyssa's Clothing! Here are the items you bought: \n");
        for (int i = 0; i < cart.size(); i++)
        {
            System.out.print(cart.get(i).toString() + "  $");
            System.out.printf("%.2f", costList[i]);
            System.out.println("");

        }
        System.out.println("\n");
        System.out.print("Total: $");
        System.out.printf("%.2f", sum);
    }
}