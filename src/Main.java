import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double width = 0.0;
        double height = 0.0;
        double area = 0.0;
        double perimeter = 0.0;
        double diagonal = 0.0;
        boolean done = false;

        do
        {
            System.out.println("Please Enter the width of the rectangle: ");
            if (in.hasNextDouble())
            {
                width = in.nextDouble();
                done = true;
            }
            else
            {
                System.out.println("Please Enter a valid width!");
                in.next();
            }
        }while (!done);

        do
        {
            System.out.println("Please Enter the height of the rectangle: ");
            if (in.hasNextDouble())
            {
                height = in.nextDouble();
                done = true;
            }
            else
            {
                System.out.println("Please Enter a valid height!");
                in.next();
            }
        }while (!done);

        area = width * height;
        perimeter = width + width + height + height;
        diagonal = Math.sqrt(width * width + height * height);


        System.out.println("The area of the rectangle is: " + area);
        System.out.println("The perimeter of the rectangle is: " + perimeter);
        System.out.println("The diagonal of the rectangle is " + diagonal);

    }
}