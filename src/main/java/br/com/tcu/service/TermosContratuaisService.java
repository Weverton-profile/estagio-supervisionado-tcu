package br.com.tcu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.tcu.model.TermosContratuais;
import br.com.tcu.repository.TermosContratuaisRepository;

@Service
public class TermosContratuaisService {
	
	@Autowired
	private TermosContratuaisRepository termosContratuaisRepository;
	
	public Page<TermosContratuais> listar(String ordenacao, int pagina) {
		Page<TermosContratuais> page = null;
		if (ordenacao.equals("por-ano-desc")) {
			Pageable sortedByAnoDesc = PageRequest.of(pagina, 100, Sort.by(Sort.Direction.DESC, "ano"));
			page = termosContratuaisRepository.findAll(sortedByAnoDesc);
		} else if (ordenacao.equals("por-ano-asc")) {
			Pageable sortedByAnoAsc = PageRequest.of(pagina, 100, Sort.by(Sort.Direction.ASC, "ano"));
			page = termosContratuaisRepository.findAll(sortedByAnoAsc);
		} else if (ordenacao.equals("por-valor-desc")) {
				Pageable sortedByAnoDesc = PageRequest.of(pagina, 100, Sort.by(Sort.Direction.DESC, "valorAtualizado"));
				page = termosContratuaisRepository.findAll(sortedByAnoDesc);
		} else if (ordenacao.equals("por-valor-asc")) {
				Pageable sortedByAnoAsc = PageRequest.of(pagina, 100, Sort.by(Sort.Direction.ASC, "valorAtualizado"));
				page = termosContratuaisRepository.findAll(sortedByAnoAsc);
		} else if (ordenacao.equals("sem-ordenacao")){
			Pageable noSorted = PageRequest.of(pagina, 100);
			page = termosContratuaisRepository.findAll(noSorted);
		}
		return page;
	}
}
