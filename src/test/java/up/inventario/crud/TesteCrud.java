package up.inventario.crud;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import up.inventario.InventarioApplication;
import up.inventario.dominio.Localizacao;
import up.inventario.repositiry.LocalizacaoRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = InventarioApplication.class)
public class TesteCrud {
	
	@Autowired
	LocalizacaoRepository localizacaoRepository;
	
	@Test
	public void Crud() {
		/* Salva nova localização */
		
		Localizacao localizacao = new Localizacao();
		
		localizacao.setNome("Tool Crib");
		localizacao.setTaxadecusto(0.1);
		localizacao.setDisponibilidade(20);
		localizacao.setDatamodificacao(new Date());
		localizacaoRepository.save(localizacao);
		
		for (Localizacao local: localizacaoRepository.findAll()) {
			System.out.println("\n" + "Nome: " + local.getNome() + " " + "Taxa de Custo: " + local.getTaxadecusto() + "Disponibilidade: " + local.getDisponibilidade() + "Data de modificação: " + local.getDatamodificacao());
		}
	}

}
