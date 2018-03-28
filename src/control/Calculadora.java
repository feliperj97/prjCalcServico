package control;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public class Calculadora {
	@WebMethod
	public float Somar(@WebParam(name = "a")float a, @WebParam(name = "b")float b) {
		return a + b;
	}
	@WebMethod
	public float Multiplicar(@WebParam(name = "a")float a, @WebParam(name = "b")float b) {
		return a*b;
	}
	@WebMethod
	public float Dividir(@WebParam(name = "a")float a, @WebParam(name = "b")float b) {
		return a/b;
	}
	@WebMethod
	public float Substrair(@WebParam(name = "a")float a, @WebParam(name = "b")float b) {
		return a - b;
	}
}
