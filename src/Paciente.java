package exercicioita;

public class Paciente {

	private double peso;
	private double altura;
	
	Paciente(double p, double a){
		peso = p;
		altura = a;
	}
	
	public double calcularIMC(){
		return peso/(altura*altura);
	}
	
	public String diagnostico(){
		double imc = calcularIMC();
		if (imc<16){ 
			return "Estado do Paciente: muito grave";
		}
		else if(imc>16 && imc<16.99){
			return "Estado do Paciente: Grave";
		}
		else if(imc>17 && imc<18.49){
			return "Estado do Paciente: Baixo Peso";
		}
		else if(imc>18.50 && imc<24.99){
			return "Estado do Paciente: Normal";
		}
		else if(imc>25 && imc<29.99){
			return "Estado do Paciente: Sobrepeso";
		}
		else if(imc>30 && imc<34.99){
			return "Estado do Paciente: Obesidade Grau 1";
		}
		else if(imc>35 && imc<39.99){
			return "Estado do Paciente: Obesidade Grau 2";
		}
		else if(imc>=40){
			return "Estado do Paciente: Obesidade Mórbida";
		}
		else return null;
		}
	}
