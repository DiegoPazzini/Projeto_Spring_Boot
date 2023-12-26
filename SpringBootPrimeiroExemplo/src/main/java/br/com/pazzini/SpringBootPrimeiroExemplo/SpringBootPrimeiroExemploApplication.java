/**
 * Pacote que contém a classe principal da aplicação Spring Boot, SpringBootPrimeiroExemploApplication.
 */

// Declaração do pacote para a classe SpringBootPrimeiroExemploApplication
package br.com.pazzini.SpringBootPrimeiroExemplo;

// Importação das classes necessárias do Spring e do SLF4J (Simple Logging Facade for Java)
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

// Importação das classes relacionadas ao domínio e ao repositório
import br.com.pazzini.domain.Cliente;
import br.com.pazzini.repository.IClienteRepository;

/**
 * Classe principal que inicia a aplicação Spring Boot, configurando e executando a aplicação.
 */
@SpringBootApplication
@Configuration
@EnableJpaRepositories(basePackages = "br.com.pazzini.repository")
@EntityScan("br.com.pazzini.*")  
@ComponentScan(basePackages = "br.com.pazzini")
public class SpringBootPrimeiroExemploApplication implements CommandLineRunner {

	// Logger para registro de mensagens de log
	private static final Logger log = LoggerFactory.getLogger(SpringBootPrimeiroExemploApplication.class);
	
	// Injeção de dependência do repositório de clientes
	@Autowired
	private IClienteRepository repository;
	
	// Método principal que inicia a aplicação Spring Boot
	public static void main(String[] args) {
		SpringApplication.run(SpringBootPrimeiroExemploApplication.class, args);
	}

	// Método da interface CommandLineRunner, que será executado ao iniciar a aplicação
	@Override
	public void run(String... args) throws Exception {
		log.info("StartApplication...");
		// Cria um objeto Cliente e o salva usando o repositório
		Cliente cliente = createCliente();
		repository.save(cliente);
	}
	
	// Método privado para criar um objeto Cliente com dados pré-definidos
	private Cliente createCliente() {
		return Cliente.builder()
				.cidade("SP")
				.cpf(12312312310L)
				.email("Teste@teste.com")
				.end("End")
				.estado("SP")
				.nome("Teste Spring Boot")
				.numero(102030)
				.tel(10203040L)
				.build();
	}
}
