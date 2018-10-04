package up.inventario.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import up.inventario.dominio.Localizacao;
import up.inventario.dominio.ProdutoInventario;
import up.inventario.repositiry.LocalizacaoRepository;
import up.inventario.repositiry.ProdutoInventarioRepository;

@Service
@RestController
@Component
@RequestMapping("/localizacao")
public class LocalizacaoService {
	
	@Autowired
	ProdutoInventarioRepository produtoInventarioRepository;
	
	@Autowired
	LocalizacaoRepository localizacaoRepository;
	
	@GetMapping
	@RequestMapping("/buscarPorNome")
	public @ResponseBody Localizacao buscarLocalizacaoPorNome(String nome) {
		Localizacao localizacao = localizacaoRepository.findByNome(nome);
		return localizacao;
	}
	
	@GetMapping
	@RequestMapping("/listar")
	public @ResponseBody Iterable<Localizacao> listarLocalizacao() {
		Iterable<Localizacao> listaLocalizacao = localizacaoRepository.findAll();
		return listaLocalizacao;
	}
	
	@PostMapping
	@RequestMapping("/adicionarLocalizacao")
	public void adicionarLocalizacao(@RequestBody Localizacao localizacao) {
		localizacaoRepository.save(localizacao);
	}
	
	@DeleteMapping
	@RequestMapping("/remover/{id}")
	public Localizacao removerLocalizacao(@RequestBody Localizacao localizacaoID, @RequestBody ProdutoInventario ProdutoID) {
		localizacaoRepository.delete(localizacaoID);		
		produtoInventarioRepository.delete(ProdutoID);
		return localizacaoID;
	}
}
