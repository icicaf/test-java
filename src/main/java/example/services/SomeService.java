package example.services;

import org.springframework.stereotype.Service;

import example.interfaces.ISomeService;
import example.domain.SomeObject;

/**
 * declaracion de servicio SomeService e implementacion de metodo creado en la Interface
 * @author C.A
 *
 */
@Service
public class SomeService implements ISomeService {

	public SomeObject doPartOfLogic(SomeObject someObject){
        return someObject;
    }

}
