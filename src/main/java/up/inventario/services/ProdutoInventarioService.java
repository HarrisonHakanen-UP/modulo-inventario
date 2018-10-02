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
@RequestMapping("/inventario")
public class ProdutoInventarioService {
	
	@Autowired
	ProdutoInventarioRepository produtoInventarioRepository;
	
	@Autowired
	LocalizacaoRepository localizacaoRepository;
	
	@GetMapping
	@RequestMapping("/listar")
	public @ResponseBody Iterable<ProdutoInventario> listarProdutosInventario() {
		Iterable<ProdutoInventario> listaProdutosInventario = produtoInventarioRepository.findAll();
		return listaProdutosInventario;
	}
	
	@PostMapping
	@RequestMapping("/adicionarProduto")
	public void adicionarProduto(@RequestBody ProdutoInventario produto, @RequestBody Localizacao localizacao) {
		produtoInventarioRepository.save(produto);
		localizacaoRepository.save(localizacao);
	}
	
	@DeleteMapping
	@RequestMapping("/remover/{id}")
	public ProdutoInventario removerProduto(@RequestBody ProdutoInventario ProdutoID, @RequestBody Localizacao localizacaoID) {
		produtoInventarioRepository.delete(ProdutoID);
		localizacaoRepository.delete(localizacaoID);		
		return ProdutoID;
	}
}
