import static org.junit.Assert.*;

import java.time.Instant;
import org.junit.Test;

import br.ufpr.dao.ContatoDao;
import br.ufpr.modelo.Contato;

public class ContatoDaoTest {

	@Test
	public void testAdiciona() {
		
		// pronto para gravar
	      Contato contato = new Contato();
	      contato.setNome("Caelum");
	      contato.setEmail("contato@caelum.com.br");
	      contato.setEndereco("R. Vergueiro 3185 cj87");
	      contato.setDataNascimento(Instant.now());

	      // grave nessa conexão!!!
	      ContatoDao bd = new ContatoDao();

	      // método elegante
	      bd.adiciona(contato);

	      System.out.println("Gravado!");
		
	}
	
	@Test
	public void testeGetLista() {
		
		ContatoDao bd = new ContatoDao();
		assertNotNull(bd.getLista());
		System.out.println(bd.getLista());
		
	}

}
