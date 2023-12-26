/**
 * Pacote que contém a classe de teste para a aplicação Spring Boot, SpringBootPrimeiroExemploApplicationTests.
 */

// Declaração do pacote para a classe SpringBootPrimeiroExemploApplicationTests
package br.com.pazzini.SpringBootPrimeiroExemplo;

// Importação das classes necessárias do JUnit e do Spring
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Classe de teste que verifica se o contexto da aplicação Spring Boot é carregado corretamente.
 */
@SpringBootTest
class SpringBootPrimeiroExemploApplicationTests {

    /**
     * Método de teste que verifica se o contexto da aplicação é carregado com sucesso.
     */
	@Test
	void contextLoads() {
	}

}
