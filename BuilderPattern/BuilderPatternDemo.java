/**
 * TutorialsPoint.com
 *
 * @author 
 * @version 
 */
public class BuilderPatternDemo
{
   public static void main(String[] args)
   {
   MealBuilder Mb = new MealBuilder();
   Mb.prepareVegMeal().showItems();
}
}
