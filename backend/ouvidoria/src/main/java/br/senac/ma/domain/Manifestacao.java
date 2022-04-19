package br.senac.ma.domain;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Objects;

import br.senac.ma.domain.enums.Categoria;
import br.senac.ma.domain.enums.MeioDeComunicacao;
import br.senac.ma.domain.enums.Procedencia;
import br.senac.ma.domain.enums.Publico;
import br.senac.ma.domain.enums.Situacao;
import br.senac.ma.domain.enums.TipoManifestacao;


public class Manifestacao implements Serializable{
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String nome;
	private String email;
	private String telefone;
	private String protocolo;
	private String data;
	private String assunto;
	private String descricao;
	private TipoManifestacao tipo;
	private MeioDeComunicacao meio;
	private Situacao situacao;
	private Publico publico;
	private Procedencia procedencia;
	private Categoria categoria;
	
	public Manifestacao() {
		
	}


	public Manifestacao(Integer id, String nome, String email, String telefone, String protocolo, String data,
			String assunto, String descricao, TipoManifestacao tipo, MeioDeComunicacao meio, Situacao situacao, Publico publico,
			Procedencia procedencia, Categoria categoria) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.protocolo = protocolo;
		this.data = data;
		this.assunto = assunto;
		this.descricao = descricao;
		this.tipo = tipo;
		this.meio = meio;
		this.situacao = situacao;
		this.publico = publico;
		this.procedencia = procedencia;
		this.categoria = categoria;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
		
	public String getProtocolo() {
		return protocolo;
	}

	public void setProtocolo(String protocolo) {
		this.protocolo = protocolo;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public TipoManifestacao getTipo() {
		return tipo;
	}

	public void setTipo(TipoManifestacao tipo) {
		this.tipo = tipo;
	}

	public MeioDeComunicacao getMeio() {
		return meio;
	}

	public void setMeio(MeioDeComunicacao meio) {
		this.meio = meio;
	}


	public Situacao getSituacao() {
		return situacao;
	}

	public void setSituacao(Situacao situacao) {
		this.situacao = situacao;
	}

	public Publico getPublico() {
		return publico;
	}

	public void setPublico(Publico publico) {
		this.publico = publico;
	}

	public Procedencia getProcedencia() {
		return procedencia;
	}

	public void setProcedencia(Procedencia procedencia) {
		this.procedencia = procedencia;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}


	@Override
	public int hashCode() {
		return Objects.hash(assunto, data, descricao, email, id, nome, protocolo, telefone);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Manifestacao other = (Manifestacao) obj;
		return Objects.equals(assunto, other.assunto) && Objects.equals(data, other.data)
				&& Objects.equals(descricao, other.descricao) && Objects.equals(email, other.email)
				&& Objects.equals(id, other.id) && Objects.equals(nome, other.nome)
				&& Objects.equals(protocolo, other.protocolo) && Objects.equals(telefone, other.telefone);
	}


	
	
	
	
}
