package br.ads.poo.Funcionario;

public class Funcionario {
	
	private String nome;
	private String departamento;
	private String RG;
	
	private static int identificador;
	private int identificadorFunc;

	private double salario;
	
	private boolean estaNaEmpresa;
	
	private Data dataDeEntrada;
	
	public Funcionario(){
		dataDeEntrada = new Data();
		Funcionario.setIdentificador(identificador);
		this.identificadorFunc = identificador;
	}

	public Funcionario(String nome) {
		Funcionario.setIdentificador(identificador);
		this.identificadorFunc = identificador;
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
		System.out.println("identificador: " + this.identificadorFunc);

		
		if (estaNaEmpresa == true){
			System.out.println("Esta na empresa: Sim" );
		}else{
			System.out.println("Esta na empresa: Não" );
		}
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getRG() {
		return RG;
	}

	public void setRG(String rG) {
		RG = rG;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public boolean isEstaNaEmpresa() {
		return estaNaEmpresa;
	}

	public void setEstaNaEmpresa(boolean estaNaEmpresa) {
		this.estaNaEmpresa = estaNaEmpresa;
	}

	public Data getDataDeEntrada() {
		return dataDeEntrada;
	}

	public void setDataDeEntrada(Data dataDeEntrada) {
		this.dataDeEntrada = dataDeEntrada;
	}

	public static int getIdentificador() {
		return identificador;
	}

	public static void setIdentificador(int identificador) {
		Funcionario.identificador ++;
	}

	public int getIdentificadorFunc() {
		return identificadorFunc;
	}

	public void setIdentificadorFunc(int identificadorFunc) {
		this.identificadorFunc = identificadorFunc;
	}

}
