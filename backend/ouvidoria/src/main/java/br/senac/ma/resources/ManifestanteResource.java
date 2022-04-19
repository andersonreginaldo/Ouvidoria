package br.senac.ma.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/manifestante") 
public class ManifestanteResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public String listar() {
		return "Rest funcionando";
	}
}