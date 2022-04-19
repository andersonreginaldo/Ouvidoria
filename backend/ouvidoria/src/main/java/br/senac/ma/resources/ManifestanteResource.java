package br.senac.ma.resources;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.senac.ma.domain.Manifestacao;
import br.senac.ma.domain.enums.Categoria;
import br.senac.ma.domain.enums.MeioDeComunicacao;
import br.senac.ma.domain.enums.Procedencia;
import br.senac.ma.domain.enums.Publico;
import br.senac.ma.domain.enums.Situacao;
import br.senac.ma.domain.enums.TipoManifestacao;

@RestController
@RequestMapping(value="/manifestante") 
public class ManifestanteResource {
	//SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Manifestacao> listar() {
		
		//SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm");
		
		Manifestacao man1 = new Manifestacao(null, "Anderson", "anderson@gmail.com", "98981435843", "2022", "19/04/2022 15:00", "assunto", "descrição", TipoManifestacao.ELOGIO, MeioDeComunicacao.SITE, Situacao.ABERTA, Publico.EMPREGADO, Procedencia.PROCEDENTE, Categoria.OUTROS);

	
	List<Manifestacao> lista = new ArrayList<>();
	lista.add(man1);


	return lista;
	
	}
}
