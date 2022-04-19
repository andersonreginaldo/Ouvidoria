package br.senac.ma.domain.enums;

public enum TipoManifestacao {

	DENUNCIA (1, "Denúncia"),
	ELOGIO (2, "Elogio"),
	EQUIVOCO (3, "Equívoco"),
	INFORMACAO (4, "Informação"),
	RECLAMACAO (5, "Reclamação"),
	SOLICITACAO (6, "Solicitação"),
	SUGESTAO (7, "Sugestão");

	private int cod;
	private String descricao;
	
	private TipoManifestacao(int cod, String descricao) {
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
