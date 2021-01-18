package example.helper;

import example.interfaces.IHelper;
import example.domain.SomeObject;
/**
 * implementacion de metodo formatObject declarado en la interface
 * @author C.A
 *
 */
public class Helper implements IHelper {

	@Override
	public SomeObject formatObject(SomeObject someObject) {
		return someObject;
	}

	
}
