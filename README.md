# modulo-inventario

Rotas Publicas (disponíveis para outros módulos que necessitem delas)

-Servico ProdutoInventario

http://localhost:8080/inventario/buscarPorNome 		-> Realiza a busca de um produto pelo nome

http://localhost:8080/inventario/listar			-> Lista todos os produtos disponíveis no inventário

-Servico Localizacao

http://localhost:8080/localizacao/buscarPorNome		-> Realiza a busca do local onde se encontra determinada peça

http://localhost:8080/localizacao/listar		-> Lista todos os locais cadastrados

Rotas Privadas

-Servico ProdutoInventario

http://localhost:8080/inventario/adicionarProduto	-> Adiciona um produto ao inventário

http://localhost:8080/inventario/remover/{id}		-> Remove produto dado seu Id

-Servico Localizacao

http://localhost:8080/localizacao/adicionarLocalizacao	-> Adiciona uma nova localizacao

http://localhost:8080/localizacao/remover/{id}		-> Remove uma localizacao dado seu Id
