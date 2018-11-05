# modulo-inventario

### Rotas públicas

1. Serviço ProdutoInventario
 - http://localhost:8093/inventario/buscarPorNome               -> Realiza a busca de um produto pelo nome
 - http://localhost:8093/inventario/listar			-> Lista todos os produtos disponíveis no inventário

2. Serviço Localizacao
  - http://localhost:8093/localizacao/buscarPorNome		-> Realiza a busca do local onde se encontra determinada peça
  - http://localhost:8093/localizacao/listar		        -> Lista todos os locais cadastrados

### Rotas privadas

1. Serviço ProdutoInventario
  - http://localhost:8093/inventario/adicionarProduto	        -> Adiciona um produto ao inventário
  - http://localhost:8093/inventario/remover/{id}		-> Remove produto dado seu Id

2. Serviço Localizacao
  - http://localhost:8093/localizacao/adicionarLocalizacao	-> Adiciona uma nova localizacao
  - http://localhost:8093/localizacao/remover/{id}		-> Remove uma localizacao dado seu Id
