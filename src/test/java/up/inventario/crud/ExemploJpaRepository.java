package up.inventario.crud;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import up.inventario.dominio.Localizacao;
import up.inventario.dominio.ProdutoInventario;
import up.inventario.repositiry.ProdutoInventarioRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ExemploJpaRepository {

	@Autowired
	private ProdutoInventarioRepository produtoInventarioRepository;
	
	/* Métodos JPA Repository */
	
	@Test
	public void rodarMetodosJpa() {
		ProdutoInventario produtoInventario = new ProdutoInventario();
		Localizacao localizacao = new Localizacao();
		localizacao.setLocalizacaoID(1);
		
		produtoInventario.getLocalizacaoID();
		produtoInventario.setBin(1);
		produtoInventario.setChave("Roda");
		produtoInventario.setEstante("A");
		produtoInventario.setQuantidade(3);
		produtoInventario.setDatamodificacao(new Date());
		produtoInventarioRepository.save(produtoInventario);
		
		for(ProdutoInventario prodInv: produtoInventarioRepository.findAll()) {
			System.out.println("\n" + "Prateleira " + produtoInventario.getEstante() + " " + "Quantidade " + produtoInventario.getQuantidade());
		}
	}
	
	@Before
	@After
	public void banner() {
		System.out.println("\n\n-------------------------------------------\n");
	}
}
