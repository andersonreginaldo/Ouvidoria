package br.senac.ma.domain.enums;

public enum Situacao {

	ABERTA (1, "Aberta"),
	CONCLUIDA (2, "Concluída"),
	PROCESSO (3, "Em Processo"),
	IMPROCEDENTE (4, "Improcedente"),
	INFORMACAO (5, "Esperando Informação");

	private int cod;
	private String descricao;
	
	private Situacao(int cod, String descricao) {
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
