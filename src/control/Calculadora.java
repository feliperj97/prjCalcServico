package control;

import javax.jws.WebService;

@WebService
public class Calculadora {
	public float Somar(float a, float b) {
		return a + b;
	}
	public float Multiplicar(float a, float b) {
		return a*b;
	}
	public float Dividir(float a, float b) {
		return a/b;
	}
	public float Substrair(float a, float b) {
		return a - b;
	}
}
