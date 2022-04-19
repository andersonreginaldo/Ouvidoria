package br.senac.ma.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.senac.ma.domain.Manifestante;

@RestController
@RequestMapping(value="/manifestante") 
public class ManifestanteResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Manifestante> listar() {
		
		Manifestante man1 = new Manifestante (1, "Anderson", "anderson@gmail.com", "98981435843");
		Manifestante man2 = new Manifestante (2, "Reginaldo", "reginaldo@gmail.com", "98981584358");
	
	List<Manifestante> lista = new ArrayList<>();
	lista.add(man1);
	lista.add(man2);

	return lista;
	
	}
}
