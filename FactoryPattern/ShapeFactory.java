/**
 * https://www.tutorialspoint.com/design_pattern/factory_pattern.htm
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ShapeFactory
{
    public Shape getShape(String shapeType)
    {
        switch (shapeType){
            case "Square": return new Square();
            
            case"Circle":return new Circle();
            
            default:return null;
            
        }
        
        //return null;
        
    }
}
