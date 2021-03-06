
public class ObjectCloneDemo implements Cloneable {
	/*The object cloning is a way to create exact copy of an object. 
	 * The clone() method of Object class is used to clone an object.
	 * The java.lang.Cloneable interface must be implemented by the class whose object clone we want to create. 
	 * If we don't implement Cloneable interface, clone() method generates CloneNotSupportedException.
*/
int id;
String name;

	ObjectCloneDemo(int id,String name){
		this.id=id;
		this.name=name;
	}
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
		}
	
	
	public static void main(String[] args) throws CloneNotSupportedException {
		ObjectCloneDemo d=new ObjectCloneDemo(101, "siva");
ObjectCloneDemo d1=		(ObjectCloneDemo) d.clone();
System.out.println("id:"+d.id+" "+"name:"+d.name);
System.out.println("From duplicate obj =>id:"+d1.id+" "+"name:"+d1.name);

	}

}
