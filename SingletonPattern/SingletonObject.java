/**
 * https://www.tutorialspoint.com/design_pattern/singleton_pattern.htm
 *
 * @author 
 * @version 
 */
public class SingletonObject
{   
    private static SingletonObject So = new SingletonObject();
    private SingletonObject()
    {
       
    }
    
    public static SingletonObject getInstance()
    {
        return So;
    }
    
    public static void showMessage()
    {
        System.out.println("SingletonObject return"); 
    }
}
