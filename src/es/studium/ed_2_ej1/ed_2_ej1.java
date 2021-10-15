package es.studium.ed_2_ej1;

public class ed_2_ej1
{

	public static void main(String[] args)
	{
		int numero = 3;
		String texto = "El factorial de ";
		System.out.println(texto + numero + " es " + calcularFactorial(numero));
		numero = 5;
		System.out.println(texto + numero + " es " + calcularFactorial(numero));
	}
	public static double calcularFactorial(double n) {


		if (n == 0) {
			return 1;
		} else {
			double resultado = n * calcularFactorial(n - 1);
			return resultado;
		}
	}
}




