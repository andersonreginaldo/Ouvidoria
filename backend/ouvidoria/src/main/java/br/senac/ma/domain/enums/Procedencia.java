package br.senac.ma.domain.enums;

public enum Procedencia {

	PROCEDENTE (1, "Procedente"),
	IMPROCEDENTE (2, "Improcedente");

	private int cod;
	private String descricao;
	
	private Procedencia(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public int getCod() {
		return cod;
	}
	
	public String getDescricao() {
		return descricao;
	}
}
