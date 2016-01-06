package br.ads.poo.Funcionario;

public class Data {
	int dia = 0;
	int mes = 0;
	int ano = 0;
	
	public String formatada(){
		return String.valueOf(dia) + "/" + String.valueOf(mes) + "/" +String.valueOf(ano);
	}
}
