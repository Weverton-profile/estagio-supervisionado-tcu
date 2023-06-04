package br.com.tcu.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Getter
public class Acordao {
	
	private Long id;
	private String chave;
	private String tipo;
	private String anoAcordao;
	private String titulo;
	private String numeroAcordao;
    private String numeroAta;
    private String colegiado;
    private String dataSessao;
    private String relator;
    private String situacao;
    private String sumario;
    private String urlArquivo;
    private String urlArquivoPdf;
    private String urlAcordao;
    
}