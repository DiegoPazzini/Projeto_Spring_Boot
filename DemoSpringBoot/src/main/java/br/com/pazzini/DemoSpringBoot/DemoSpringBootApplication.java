// Declaração do pacote para a classe DemoSpringBootApplication
package br.com.pazzini.DemoSpringBoot;

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

// Anotação indicando que a classe é uma aplicação Spring Boot
@SpringBootApplication
// Anotação indicando que a classe é uma configuração do Spring
@Configuration
// Anotação para habilitar repositórios JPA
@EnableJpaRepositories(basePackages = "br.com.pazzini.repository")
// Anotação para escanear e reconhecer entidades JPA
@EntityScan("br.com.pazzini.*")  
// Anotação para escanear e reconhecer componentes Spring
@ComponentScan(basePackages = "br.com.pazzini")
// Implementação da interface CommandLineRunner para executar a lógica ao iniciar a aplicação
public class DemoSpringBootApplication implements CommandLineRunner {
	
	// Logger para registro de mensagens de log
	private static final Logger log = LoggerFactory.getLogger(DemoSpringBootApplication.class);
	
	// Injeção de dependência do repositório de clientes
	@Autowired
	private IClienteRepository repository;

	// Método principal que inicia a aplicação Spring Boot
	public static void main(String[] args) {
		SpringApplication.run(DemoSpringBootApplication.class, args);
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
