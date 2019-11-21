/**
 * TutorialsPoint.com
 *
 * @author 
 * @version 
 */
public class MealBuilder
{
   public meal prepareVegMeal()
   {
      meal meal = new meal();
      meal.addItem(new VegBurger());
      meal.addItem(new Pepsi());
      return meal;
   }
}
