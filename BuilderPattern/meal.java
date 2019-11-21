
import java.util.ArrayList;
/**
 * TutorialsPoint.com
 *
 * @author 
 * @version 
 */
public class meal
{
    // instance variables - replace the example below with your own
    private ArrayList<Item> items = new ArrayList<Item>();

    public void addItem(Item item)
    {
        items.add(item);   
    }
    
    public float getCost()
    {
        float total =0;
        for(Item item : items)
        {
             total += item.price();
        }       
        return total;
    }
    
    public void showItems()
    {
        items.forEach(item -> System.out.println(item.name()+" "+item.price()));
    }
}
