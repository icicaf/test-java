package example.dao;


import org.springframework.beans.factory.annotation.Autowired;

import example.interfaces.IHelper;
import example.interfaces.ISomeService;
import example.domain.SomeObject;
import example.domain.SomeTypes;

/**
 * 
 * @author C.A
 *
 */
public class SomeTesteableClass {

	/**
	 * instancia de Interfaces
	 */
	@Autowired
	private ISomeService someService;

	@Autowired
	private SomeObject defaultObject;

	@Autowired
	private IHelper helper;
	
	
	/**
	 * uso de constante para evitar su declaracion en cada metodo.
	 */
	private static final String ID_EJEMPLO = "ef6799765433";

	/**
	 * Descripcion de la variable, esta no se usa en nada mas que su constructor.
	 */
	private final String stringField;

	/**
	 *
	 * @param stringField
	 */
	public SomeTesteableClass(String stringField) {
		this.stringField = stringField;
	}

	/**
	 * Metodo init.
	 */
	public void init() {
		defaultObject.setId(ID_EJEMPLO);
		defaultObject.setType(SomeTypes.DEFAULT_TYPE);
	}

	/**
	 * Metodo resolveSomeComplexLogic en la cual se eliminaron las instancias 
	 * 
	 * @return SomeObject
	 */
	public SomeObject resolveSomeComplexLogic() {
		defaultObject.setId(ID_EJEMPLO);
		defaultObject.setType(SomeTypes.DEFAULT_TYPE);

		defaultObject = someService.doPartOfLogic(defaultObject);

		return helper.formatObject(defaultObject);
	}
}