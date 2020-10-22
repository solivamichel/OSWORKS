package com.soliva.osworks.domain.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import com.soliva.osworks.domain.model.OrdemServico;
import com.soliva.osworks.domain.model.StatusOrdemServico;
import com.soliva.osworks.domain.repository.OrdemServicoRepository;

@Service
public class GestaoOrdemServicoService {
	
	private OrdemServicoRepository ordemServicoRepository;
	
	public OrdemServico criar(OrdemServico ordemServico) {
		ordemServico.setStatus(StatusOrdemServico.ABERTA);
		ordemServico.setDataAbertura(LocalDateTime.now());
		
		
		return ordemServicoRepository.save(ordemServico);
	}
}
