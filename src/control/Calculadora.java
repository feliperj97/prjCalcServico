package control;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Calculadora {
	@WebMethod
	public float Somar(float a, float b) {
		return a + b;
	}
	@WebMethod
	public float Multiplicar(float a, float b) {
		return a*b;
	}
	@WebMethod
	public float Dividir(float a, float b) {
		return a/b;
	}
	@WebMethod
	public float Substrair(float a, float b) {
		return a - b;
	}
}
