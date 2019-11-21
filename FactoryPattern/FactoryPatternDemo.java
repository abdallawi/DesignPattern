import java.util.Scanner;

/**
 * https://www.tutorialspoint.com/design_pattern/factory_pattern.htm
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FactoryPatternDemo
{
    public static void main(String[] args)
    {
        ShapeFactory SF = new ShapeFactory();
        System.out.println("Enter Square or Circle");
        Scanner s = new Scanner(System.in);
        String shape = s.nextLine();
        Shape sh = SF.getShape(shape);
        sh.draw();
 
    }
}
