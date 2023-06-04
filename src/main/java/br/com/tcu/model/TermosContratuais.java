package br.com.tcu.model;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class TermosContratuais {
	
	private Long id;
	private String tipoContratacao;
	private Long numero;
	private Long ano;
	private String unidadeGestora;
	private String nomeFornecedor;
	private String cnpjFornecedor;
	private String objeto;
	private BigDecimal valorInicial;
	private String numeroProcesso;
	private String modalidadeLicitacao;
	private BigDecimal valorAtualizado;
}
