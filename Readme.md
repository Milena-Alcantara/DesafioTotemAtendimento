### Desafio Kotlin - Totem de Autoatendimento  :computer:

<hr>

### _**Bem Vindo Ao FlashFood!**_   :hamburger:

- **Objetivo do Desafio:** _Criar um sistema que representasse um Totem de uma lanchonete, onde o usário fosse capaz de
realizar seus pedidos._


- **Regras de Negócio**:
- _O sistema deve ser totalmente dinâmico (receber inputs do usuário);_
- _Os menus devem apresentar as opções de maneira ordenada e só podem receber a escolha do usuário com o número 
correspondente;_
- _A cada item escolhido, deve apresentar o carrinho do cliente e o valor total do pedido até o momento_;
- _Permitir que o usuário adicione mais itens;_
- _Permitir que o usuário possa editar a quantidade ou remover um item através do seu código;_
- _Permitir que o usuário possa efetuar o pagamento via crédito, débito, VA ou VR e dinheiro. Para o último, se necessário,
deve calcular o troco do cliente._

<hr>

###  **Implentação:**


- Iniciei o Projeto criando a Super Classe Produto com os atributos nome, código, quantidade e preço. Implementei o seu 
construtor associando as variáveis.


- Criei as Subclasses X-Burguer, X-Salada, Refrigerante, Suco, MilkShake e Casquinha que serve para representar os 
produtos disponíveis ao cliente.


- Na Classe Produto, implementei os métodos: 


- **adicionarAoCarrinho()**: Adiciona o objeto do tipo de produto que o Usário escolheu numa lista que representa o carrinho.


- **visualizarCarrinho()**: Caso a lista não esteja vazia, esse método percorre a lista de produtos exibindo os dados 
e o valor total até o momento. Se a lista não possuir nenhum produto, é exibido o menu principal.


- **editarItem()**:  Recebe um código do usuário e verifica se o código é compátivel com algum Item da lista, se sim, permite
o usuário alterar a quantidade de produtos.


- **removerItem()**: Recebe um código do usuário e verifica se o código é compátivel com algum Item da lista, se sim, permite
  o usuário remover o item do carrinho.


- **finalizarPedidoCartao()**: Caso o usuário escolha como método de pagamento crédito, débito, VA ou VR, essa função finaliza o pedido
com uma mensagem amigável informando ao cliente o número do seu pedido.


- **finalizarPedidoDinheiro()**: Recebe o valor em dinheiro do usuário e verifica se é possível realizar o pagamento. Se
o valor do cliente for menor que o total do pedido, solicita um novo método de pagamento. Caso seja maior, realiza o 
cáculo e devolve o troco para o usuário, finalizando com uma mensagem amigável informando ao cliente o número do seu pedido.


- **verificarCarrinho()**: Verifica se há produtos no carrinho do usuário.


- **limparCarrinho()**: Após finalizado o pedido, limpa o carrinho para que um novo autoatendimento possa ser realizado
corretamente.


- **esperar()**: Pausa a exeção por 3 segundos antes que o programa reinicie.



- A Classe Menus apresenta todas as escolhas que o programa permite ao usuário e recebe seus dados via console. Além disso,
executa a função correspondente a escolha do mesmo.


- A Classe Object ConsoleMensages possui todas as mensagens padrão a serem exibidas no console ao usuário armazenadas 
variáveis que são chamadas nos métodos que precisarem utilizá-las. 


- No arquivo FlashFoodSystem.kt implementei o método main que inicializa o programa executando o menuPrincipal().


- **Adicionais:**


- Criei a subclasse de Produto denominada Combos adicionando a descrição como atributo.
De Combos, criei mais quatro subclasses que também representam tipos de produtos a serem 
vendidos pela lanchonete denomidas: ComboSolteiro1, ComboSolteiro2, ComboCasal e ComboFamília.


<hr>

- **Conceitos Utilizados**


- Funções;
- Orientação a Objetos;
- Herança Multípla;
- Polimorfismo;
- Encapsulamento;
- Laços de repetição;
- Collections;
- Exceptions.




