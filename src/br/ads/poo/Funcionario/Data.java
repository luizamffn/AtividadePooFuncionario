package br.ads.poo.Funcionario;

public class Data {
	private int dia = 0;
	private int mes = 0;
	private int ano = 0;
	
	public String formatada(){
		return String.valueOf(dia) + "/" + String.valueOf(mes) + "/" +String.valueOf(ano);
	}
	
	public void receberData(int dia, int mes, int ano){
		if((mes == 02) && (dia >=1 && dia <=28)){
			this.dia = dia;
			this.mes = mes;
			this.ano = ano;
		}else if((mes == 4 || mes ==6 || mes == 9 || mes ==11) && 
				(dia >=1 && dia <=30)){
			this.dia = dia;
			this.mes = mes;
			this.ano = ano;
		}else if(mes ==1 || mes ==3 || mes ==05 || mes ==7 || mes ==8 ||
				mes ==10 || mes ==12 && (dia >= 1 && dia <= 31)){
			this.dia = dia;
			this.mes = mes;
			this.ano = ano;
		}else{
			System.out.println("Numero do mes ou dia errado tente novamente!");
		}	
	}

}
