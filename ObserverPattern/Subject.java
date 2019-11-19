/* 
 * http://www.newthinktank.com/2012/08/observer-design-pattern-tutorial/
 * 
 * @author: Derek Banas
 * 
 * */
 /* 
 * http://www.newthinktank.com/2012/08/observer-design-pattern-tutorial/
 * 
 * @author: Derek Banas
 * 
 * */
public interface Subject {
	
	public void register(Observer o);
	public void unregister(Observer o);
	public void notifyObserver();	
}
