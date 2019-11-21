
/**
 * https://www.tutorialspoint.com/design_pattern/singleton_pattern.htm
 *
 * @author 
 * @version 
 */
public class SingletonPatternDemo
{
 public static void main(String[] args)
 {
     System.out.println(SingletonObject.getInstance());
     SingletonObject.showMessage();
 }
}
