package br.com.tcu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.tcu.model.Acordao;
import br.com.tcu.repository.AcordaoRepository;

@Service
public class AcordaoService {
	
	@Autowired
	private AcordaoRepository acordaoRepository;
	
	public Page<Acordao> listar(String ordenacao, int pagina) {
		Page<Acordao> page = null;
		if (ordenacao.equals("por-ano-desc")) {
			Pageable sortedByAnoDesc = PageRequest.of(pagina, 100, Sort.by(Sort.Direction.DESC, "anoAcordao"));
			page = acordaoRepository.findAll(sortedByAnoDesc);
		} else if (ordenacao.equals("por-ano-asc")) {
			Pageable sortedByAnoAsc = PageRequest.of(pagina, 100, Sort.by(Sort.Direction.ASC, "anoAcordao"));
			page = acordaoRepository.findAll(sortedByAnoAsc);
		} else if (ordenacao.equals("sem-ordenacao")){
			Pageable noSorted = PageRequest.of(pagina, 100);
			page = acordaoRepository.findAll(noSorted);
		}
		return page;
	}
	
}
