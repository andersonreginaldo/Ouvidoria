package br.senac.ma.domain.enums;

public enum MeioDeComunicacao {

	EMAIL (1, "Email"),
	PRESENCIAL (2, "Presencial"),
	SITE (3, "Site"),
	TELEFONE (4, "Telefone");

	private int cod;
	private String descricao;
	
	private MeioDeComunicacao(int cod, String descricao) {
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
