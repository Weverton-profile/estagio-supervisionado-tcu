package br.com.tcu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tcu.model.Acordao;
import br.com.tcu.service.AcordaoService;

@RestController
@RequestMapping("acordao")
public class AcordaoController {
	
	@Autowired
	private AcordaoService acordaoService;
	
	@GetMapping("listar/{ordenacao}/{pagina}")
	public ResponseEntity<Page<Acordao>> listar(@PathVariable String ordenacao, @PathVariable int pagina) {
		Page<Acordao> page = acordaoService.listar(ordenacao, pagina);
		return ResponseEntity.ok(page);
	}
}
