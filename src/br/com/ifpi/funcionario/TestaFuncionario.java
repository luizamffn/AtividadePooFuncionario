package br.com.ifpi.funcionario;

public class TestaFuncionario {

	public static void main(String[] args) {
		
//		Funcionario f1 = new Funcionario():
//		f1.nome = "Hugo";
//		f1.salario = 100;
//		f1.recebeAumento(50);
//		System.out.println("salario atual:" + f1.getSalario());
//	    System.out.println("ganho anual:" + f1.calculaGanhoAnual());
		
		
		
		Funcionario f1 = new Funcionario();    
		f1.setNome("Danilo");
		f1.setSalario(100);
		f1.setDepartamento("Contabilidade");
		f1.getDataDeEntrada().receberData(34, 04, 2011);
		f1.setEstaNaEmpresa(true);
		f1.setRG("3.565.671");

		Funcionario f2 = new Funcionario();    
		f2.setNome("Danilo");
		f2.setSalario(100);
		
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
