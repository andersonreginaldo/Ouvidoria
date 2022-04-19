package br.senac.ma.domain.enums;

public enum Categoria {

	ATENDIMENTO (1, "Atendimento"),
	CURSOS (2, "Cursos"),
	EAD (3, "EAD"), 
	FINANCEIRO (4, "Financeiro"),
	OUTROS (5, "Outros"),
	PROCEDIMENTO (6, "Procedimento Professor / Coordenador"),
	SELETIVO (7, "Processo Seletivo"),
	PSG (8, "PSG"),
	SITE (9, "Site");


	private int cod;
	private String descricao;
	
	private Categoria(int cod, String descricao) {
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
