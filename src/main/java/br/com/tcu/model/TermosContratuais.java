package br.com.tcu.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table
@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class TermosContratuais {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private String tipoContratacao;
	@Column
	private Long numero;
	@Column
	private Long ano;
	@Column
	private String unidadeGestora;
	@Column
	private String nomeFornecedor;
	@Column
	private String cnpjFornecedor;
	@Column(columnDefinition = "TEXT")
	private String objeto;
	@Column
	private BigDecimal valorInicial;
	@Column
	private String numeroProcesso;
	@Column
	private String modalidadeLicitacao;
	@Column
	private BigDecimal valorAtualizado;
}
