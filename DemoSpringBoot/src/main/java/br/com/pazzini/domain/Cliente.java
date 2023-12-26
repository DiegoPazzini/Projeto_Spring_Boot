/**
 * Classe que representa a entidade Cliente no domínio da aplicação.
 */

// Declaração do pacote para a classe Cliente
package br.com.pazzini.domain;

// Importação das anotações e classes necessárias do Lombok e JPA (Java Persistence API)
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Classe que mapeia a entidade Cliente para persistência no banco de dados.
 */
@Entity

/**
 * Anotação para especificar o nome da tabela correspondente no banco de dados.
 */
@Table(name = "TB_CLIENTE")

/**
 * Anotações do Lombok para geração automática de métodos como construtores, getters, setters, etc.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

/**
 * Definição dos atributos da entidade Cliente.
 */
public class Cliente {
	
	/**
	 * Identificador único do cliente, gerado automaticamente.
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cliente_seq")
	@SequenceGenerator(name="cliente_seq", sequenceName="sq_cliente", initialValue = 1, allocationSize = 1)
	private Long id;
	
	/**
	 * Nome do cliente, com restrição de não nulo e comprimento máximo de 50 caracteres.
	 */
	@Column(name = "NOME", nullable = false, length = 50)
	private String nome;
	
	/**
	 * CPF do cliente, com restrição de não nulo e unicidade.
	 */
	@Column(name = "CPF", nullable = false, unique = true)
    private Long cpf;
    
	/**
	 * Número de telefone do cliente, com restrição de não nulo.
	 */
	@Column(name = "TEL", nullable = false)
    private Long tel;
	
	/**
	 * Endereço de e-mail do cliente, com restrição de não nulo e comprimento máximo de 50 caracteres.
	 */
	@Column(name = "EMAIL", nullable = false, length = 50)
    private String email;
    
	/**
	 * Endereço do cliente, com restrição de não nulo e comprimento máximo de 100 caracteres.
	 */
	@Column(name = "ENDERECO", nullable = false, length = 100)
    private String end;
    
	/**
	 * Número do endereço do cliente, com restrição de não nulo.
	 */
	@Column(name = "NUMERO", nullable = false)
    private Integer numero;
    
	/**
	 * Cidade do cliente, com restrição de não nulo e comprimento máximo de 100 caracteres.
	 */
	@Column(name = "CIDADE", nullable = false, length = 100)
    private String cidade;
    
	/**
	 * Estado do cliente, com restrição de não nulo e comprimento máximo de 50 caracteres.
	 */
	@Column(name = "ESTADO", nullable = false, length = 50)
    private String estado;
}
