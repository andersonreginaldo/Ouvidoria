package br.senac.ma.domain.enums;

public enum Publico {

	ALUNO (1, "Aluno"),
	EMPREGADO (2, "Empregado"),
	FORNCEDOR (3, "Fornecedor"),
	INDEFINIDO (4, "Indefinido"),
	INSTRUTOR (5, "instrutor");

	private int cod;
	private String descricao;
	
	private Publico(int cod, String descricao) {
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
