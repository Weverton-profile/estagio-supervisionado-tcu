package br.com.tcu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.tcu.model.TermosContratuais;
import br.com.tcu.service.TermosContratuaisService;

@Controller
@RequestMapping("termos-contratuais")
public class TermosContratuaisController {
	
	@Autowired
	private TermosContratuaisService termosContratuaisService;
	
	@GetMapping("listar/{ordenacao}/{pagina}")
	public ResponseEntity<Page<TermosContratuais>> listar(@PathVariable String ordenacao, @PathVariable int pagina) {
		Page<TermosContratuais> page = termosContratuaisService.listar(ordenacao, pagina);
		return ResponseEntity.ok(page);
	}
}
