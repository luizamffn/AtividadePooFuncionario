package br.ads.poo.Funcionario;

public class Funcionario {
	
	String nome;
	String departamento;
//	String dataDeEntada;
	String RG;

	double salario;
	
	boolean estaNaEmpresa;
	
	Data dataDeEntrada;
	
	public Funcionario(){
		dataDeEntrada = new Data();
	}
	
	public void recebeAumento (double aumento){
		this.salario = salario + aumento;
	}
	
	//Não faz sentido
	public double calculaGanhoAnual(){
		double ganho;
		ganho = salario * 12;
		
		return ganho;
	}
	
	public void demite(){
		if (estaNaEmpresa == true){
			estaNaEmpresa = false;
		}else{
			System.out.println("Funcionario ja esta demitido");
		}
	}
	
	public void mostra(){
		System.out.println("Nome: " + this.nome);
		System.out.println("Departamento: " + this.departamento);
		System.out.println("Data Entrada: " + this.dataDeEntrada.formatada());
		System.out.println("RG: " + this.RG);
		System.out.println("Salario: " + this.salario);
		
		if (estaNaEmpresa == true){
			System.out.println("Esta na empresa: Sim" );
		}else{
			System.out.println("Esta na empresa: Não" );
		}
		
	}

	

}
