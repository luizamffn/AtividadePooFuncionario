package br.ads.poo.Funcionario;

public class TestaFuncionario {

	public static void main(String[] args) {
		
//		Funcionario f1 = new Funcionario():
//		f1.nome = "Hugo";
//		f1.salario = 100;
//		f1.recebeAumento(50);
//		System.out.println("salario atual:" + f1.getSalario());
//	    System.out.println("ganho anual:" + f1.calculaGanhoAnual());
		
		
		
		Funcionario f1 = new Funcionario();    
		f1.nome = "Danilo";
		f1.salario = 100;
		f1.departamento = "Contabilidade";
		f1.dataDeEntrada.ano = 2012;
		f1.dataDeEntrada.dia = 15;
		f1.dataDeEntrada.mes = 02;
		f1.estaNaEmpresa = true;
		f1.RG = "3.565.671";

		Funcionario f2 = new Funcionario();    
		f2.nome = "Danilo";
		f2.salario = 100;
		
//		f1 = f2;

		if (f1 == f2) {
		  System.out.println("iguais");
		} else {
		  System.out.println("diferentes");    
		}
	   
		f1.mostra();
		f2.mostra();
	  
	}

}
