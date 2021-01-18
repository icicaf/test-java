package example.domain;

/**
 * 
 * @author C.A
 *
 */
public class SomeObject {
	    
	/**
	 * declaracion de variables de someObject
	 * uso de enum someTypes
	 */
	private String id;
	private SomeTypes type;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public SomeTypes getType() {
		return type;
	}

	public void setType(SomeTypes type) {
		this.type = type;
	}
}
