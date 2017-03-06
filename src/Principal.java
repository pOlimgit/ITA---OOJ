package exercicioita;

public class Principal {

	public static void main(String[] args) {

		Paciente paulo = new Paciente(73, 1.70);
		System.out.println("IMC: "+paulo.calcularIMC());
		System.out.println(paulo.diagnostico());
		System.out.println("\n");	
		Paciente raysa = new Paciente(60, 1.58);
		System.out.println("IMC: "+raysa.calcularIMC());
		System.out.println(raysa.diagnostico());
		System.out.println("\n");
		Paciente ingles = new Paciente(140, 1.82);
		System.out.println("IMC: "+ingles.calcularIMC());
		System.out.println(ingles.diagnostico());
		
	}
	
}
