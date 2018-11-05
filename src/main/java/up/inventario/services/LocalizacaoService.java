package up.inventario.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import up.inventario.repositiry.LocalizacaoRepository;
import up.inventario.repositiry.ProdutoInventarioRepository;

@Service
@RestController
@RequestMapping("/localizacao")
public class LocalizacaoService {

	@Autowired
	ProdutoInventarioRepository produtoInventarioRepository;

	@Autowired
	LocalizacaoRepository localizacaoRepository;

}
