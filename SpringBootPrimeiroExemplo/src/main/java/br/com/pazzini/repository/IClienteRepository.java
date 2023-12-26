/**
 * Pacote que contém a definição da interface IClienteRepository.
 */

// Declaração do pacote para a interface IClienteRepository
package br.com.pazzini.repository;

// Importação das classes necessárias do Spring e do domínio da aplicação
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import br.com.pazzini.domain.Cliente;

/**
 * Interface que estende a CrudRepository do Spring, fornecendo operações básicas de CRUD para a entidade Cliente.
 */
@Repository
public interface IClienteRepository extends CrudRepository<Cliente, Long>{

}
