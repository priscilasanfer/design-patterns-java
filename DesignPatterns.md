# Curso 1 - Padrões comportamentais 

## 0.1 Strategy

Todos os padrões de projeto definidos pela Gang of Four (GoF) possuem uma motivação:   
resolver um problema recorrente.  
Que tipo de problema o padrão Strategy visa resolver?    
A existência de diversos algoritmos para uma ação, resultando na possibilidade de vários ifs.  
Este padrão pode ser utilizado quando há diversos possíveis algoritmos para uma ação (como calcular imposto, por exemplo).   
Nele, nós separamos cada um dos possíveis algoritmos em classes separadas.  

Todo padrão de projeto possui sua explicação teórica com motivação, aplicação, seus participantes, consequências, etc.
O livro Padrões de Projeto - Soluções reutilizáveis de software orientado a objetos é um catálogo para todos estes padrões, com todas as explicações necessárias.
Caso não possa (ou não queira) ler o livro, existem sites que resumem cada um dos padrões. Aqui está um que é bastante utilizado, já na página específica sobre o [Strategy](https://refactoring.guru/design-patterns/strategy)

Resumo:  

- Padrões de projeto são soluções genéricas para problemas recorrentes do desenvolvimento de software orientado a objetos;
- Existem três principais categorias de padrões de projeto:
  - Comportamentais (que serão vistos neste treinamento)
  - Estruturais
  - Criacionais
- Como diminuir a complexidade do nosso código, trocando múltiplas condicionais por classes:
  - Esta técnica é chamada de Strategy, que é um dos padrões de projeto
   

## 02. Chain of Responsibility
Em diversas ocasiões, ter diversos if pode ser um problema, e que ter uma classe que "pode crescer para sempre" também é um problema.
Qual o problema real deste cenário, onde uma classe tem muitos if ou pode crescer para sempre?  
Se eu precisar editar um pedaço de código, para implementar uma nova funcionalidade, as chances de quebrar funcionalidades existentes são grandes
Sempre que uma nova funcionalidade for implementada, o ideal é que possamos criar código novo e editar o mínimo possível de código já existente. 
Este é um dos principais pontos do princípio Aberto-Fechado (Open-Closed Principle) do SOLID. 
Ao editar código existente, podemos acabar quebrando funcionalidades já implementadas e funcionais.

Assim como qualquer outro conceito em computação, existe mais de uma forma de implementar o padrão de projeto Chain of Responsibility.
Para saber mais sobre a parte teórica deste padrão, e analisar diferentes implementações, você pode conferir este [link](https://refactoring.guru/design-patterns/chain-of-responsibility)

Resumo:
- A diferenciar casos onde padrões semelhantes podem ser aplicados;
- Como criar uma cadeia de possíveis algoritmos como Chain of Responsibility;
- A utilizar o padrão para aplicar um desconto dentro de uma cadeia de possíveis descontos.
  

## 03. Template Method
Aplicamos o pattern Template Method com a criação de um método concreto na classe “mãe”, que chama métodos abstratos implementados nas classes “filhas”
Qual a principal vantagem da utilização desse padrão?  
Reaproveitar trechos de códigos comuns, evitando duplicações
O padrão Template Method favorece o reaproveitamento de códigos comuns entre classes, evitando assim duplicações de códigos.

As aplicações do padrão Template Method são muitas, mas além de entender a parte prática, é muito importante ler sobre a teoria por trás do padrão.
Para entendê-lo melhor, você pode conferir este [link](https://refactoring.guru/design-patterns/template-method)

Resumo:
- Reforçamos a ideia de que repetição de código é problemática;
- Criamos um template de algoritmo que estava sendo replicado em mais de uma classe e utilizamos herança para reaproveitar esse código:
  - Aprendemos que a esta técnica foi dado o nome de Template Method;
- Vimos que é possível aplicar mais de um padrão no mesmo código.
  

## 04. State

Vimos que o padrão State resolve um problema muito parecido com um problema resolvido por outro padrão.
Que outro padrão seria esse?  
Strategy
O padrão State, assim como o padrão Strategy, resolve o problema de muitos ifs no código.

Para que você entenda melhor como aplicar o padrão State em outras situações, é interessante conhecer toda sua parte teórica, como motivação, aplicações, etc.
Para isso, você pode conferir este [link](https://refactoring.guru/design-patterns/state)

Resumo:
- Que é possível que um objeto se comporte de formas diferentes, dependendo do seu estado;
- Que, se o resultado de uma chamada de método depende do estado, podemos delegar esta ação para uma classe específica do estado atual:
  - Aprendemos que a esta técnica foi dado o nome de State.

  
## 05. Command

O código criado até aqui é muito comumente encontrado em sistemas reais.   
A diferença é que, ao invés de estar em um arquivo rodado na CLI, está em algum Controller ou algo do tipo.  
Qual o problema de ter um código arquitetado assim, recebendo os dados e executando todas as tarefas no mesmo local?  

Se fosse necessário executar o mesmo fluxo de outro lugar (web, API, filas), o código precisaria ser duplicado. 
Da forma como o código foi organizado, se precisássemos, além de executar a geração de pedido através da CLI, também executar através de um formulário web, uma API e/ou mensagens de uma fila, precisaríamos duplicar todo este código em vários lugares.  

O padrão de projetos Command é, provavelmente, um dos que mais gera confusão, principalmente no mundo de desenvolvimento web em geral, já que alguns conceitos mais específicos pro mundo da web surgiram.   
Para você entender melhor sobre o padrão Command "original" (definido no livro da GoF), você pode dar uma olhada nesse [link](https://refactoring.guru/design-patterns/command). 
Também é muito interessante o estudo de alguns padrões de arquitetura de software, como Domain Driven Design e Clean Architecture, pois você vai esbarrar no padrão de Command Handlers (que foi aplicado de forma bem simples nesta aula).  

Resumo:
- Que um caso de uso em nossa aplicação pode ter várias ações (salvar no banco, enviar e-mail, etc);
- Que um caso de uso deve ser extraído para uma classe específica, ao invés de estar no arquivo da CLI, controller ou algo do tipo;
- Que a técnica de extração do caso de uso para uma classe específica pode ser chamada de padrão Command;
- A diferença do padrão Command da GoF para o padrão que utiliza Command Handler (muito utilizado no padrão de arquitetura Domain Driven Design).
  

## 06. Observer

Um *Command Handler* tem como responsabilidade, normalmente, apenas orquestrar as tarefas a serem executadas, ou seja, chamar as classes necessárias que realizam as tarefas desejadas.   
No nosso caso, o Command Handler tinha todo o código do fluxo em seu corpo.  
Por quais motivos separar cada uma das tarefas em classes distintas é benéfico?    

Porque, com classes menores e mais concisas, é mais fácil encontrar possíveis problemas.   
Se em algum momento uma das tarefas parar de funcionar, nós sabemos que há uma classe específica para este propósito e podemos começar a depuração por ela.    

Porque a implementação de cada tarefa pode mudar com o tempo e o Command Handler não deve precisar saber disso.   
Imagine que a ferramenta utilizada para enviar e-mails mude depois de alguns anos.     
O nosso Command Handler não precisa saber deste detalhe específico, então é interessante que cada classe seja responsável apenas por uma pequena tarefa.   

O padrão *Observer* é comumente utilizado por diversas bibliotecas que trabalham com eventos. Muitas tecnologias em Java, como o Spring e o CDI, possuem componentes que nos auxiliam a trabalhar com eventos.  
A forma como o padrão foi implementado aqui na aula é a mais simples e pura, mas existem diversas modificações que podem ser feitas.
Para entender mais sobre a teoria deste padrão, você pode conferir este [link](https://refactoring.guru/design-patterns/observer)

Resumo:
- Que deixar a implementação de todas as tarefas de um caso de uso da aplicação na mesma classe pode trazer problemas:
  - Dificuldade de manutenção;
  - Classes muito grandes e difíceis de ler;
  - Problemas quando precisar alterar a implementação de uma das tarefas.
- Que é mais interessante separar cada ação em uma classe separada;
- Como ligar um evento ocorrido com suas ações, através do padrão Observer.
  

# Curso 2 - Padrões Estruturais 

## 01. Adapters para reutilizar dependências
Já sabemos que classes podem possuir dependências para realizar suas tarefas. 
No último vídeo, a nossa classe passou a possuir uma dependência de alguma outra implementação que consiga realizar chamadas HTTP.
Qual das alternativas a seguir é uma simples recomendação para trabalhar com dependências?

Depender sempre de abstrações, e não de implementações específicas.
Inclusive, esse é um dos princípio de SOLID (Dependency Inversion Principle, a letra D). 
Devemos sempre preferir depender de abstrações, ou seja, interfaces ou classes abstratas, sempre que possível, ao invés de implementações específicas.

Quando precisamos utilizar código legado ou código de componentes externos em nosso sistema, é muito comum não ter a interface (métodos públicos) batendo com o que a gente precisa, então nesses casos nós criamos adapters.
Esse padrão é muito simples e muito utilizado no dia a dia do desenvolvimento, então vale a pena a sua leitura com mais calma: Adapter.
Aplicando o pattern [Adapter](https://refactoring.guru/design-patterns/adapter)

Resumo:
- Que padrões estruturais nos ajudam a relacionar diversas classes de forma organizada
- Que detalhes de infraestrutura devem ser abstraídos através de interfaces
- Como o padrão Adapter pode nos ajudar a trocar detalhes de infraestrutura, sem muitas dores de cabeça


## 02. Decorator

Utilizamos o padrão Decorator para resolver um problema em específico da aplicação.
Qual foi o problema que o padrão Decorator nos ajudou a resolver?

Flexibilizar, de maneira dinâmica, o cálculo de diferentes impostos de um orçamento.
O padrão Decorator permite adicionar novos comportamentos a um objeto, tornando o código bastante flexível e dinâmico.

O padrão Decorator é muito poderoso e bastante comum de ser implementado, mas possui alguns detalhes importantes a serem observados, como o fato do Decorator precisar possuir a mesma interface do objeto que ele está decorando.
Para entender melhor a teoria do padrão e estes detalhes, você pode conferir este link: [Decorator](https://refactoring.guru/design-patterns/decorator)

Resumo:
- Que é possível adicionar comportamento a classes em tempo de execução;
- A aplicar esse conhecimento para combinar impostos;
- Que comportamentos adicionados em tempo de execução são possíveis, através do padrão Decorator.


## 03. Composite

Precisamos implementar uma forma de adicionar um orçamento a outro orçamento, e escolhemos a abordagem de podermos representar tanto orçamentos quanto itens de forma semelhante, através da interface Orcavel.
Por que não simplesmente criamos um novo List<ItemOrcamento> na classe Orcamento?

Porque dessa forma, podemos percorrer toda a nossa árvore de itens "orçáveis", de forma muito simples para calcular o valor.
Ao implementar uma interface que permita representar ItemOrcamentos e Orcamentos de forma semelhante, podemos percorrer essa lista de Orcavels facilmente, para calcular o valor do orçamento, que é a raiz da árvore.

É bastante comum nós precisarmos trabalhar com coleções de itens que podem ter mais de uma implementação. 
Se essa estrutura pode ser descrita como uma árvore (no modelo computacional), então o padrão Composite pode ser muito útil.
Para entender melhor os conceitos por trás do padrão, dá uma olhada nesse link: [Composite](https://refactoring.guru/design-patterns/composite).

Resumo:
- Por alto o que é uma representação de árvore;
- Como representar itens e orçamentos de forma semelhante;
- A percorrer a estrutura de árvores utilizando o padrão Composite.


## 04. Facade
Enunciado: Vimos que é possível fornecer acesso a uma pequena parte de um sistema, através de uma única classe, e que essa classe pode acabar utilizando várias outras classes desse "sub-sistema".
Quais as vantagens de utilizar uma classe dessas, ao invés de acessar o sistema completo diretamente?

Simplicidade. Tendo acesso a parte de um sistema (módulo) através de uma única classe, temos uma interface mais simples.
Uma classe desse tipo nos fornece poucos métodos públicos (um só, no nosso caso), com toda a infraestrutura necessária para realizar a tarefa.

Em determinados casos, nós podemos precisar de um acesso simplificado a uma parte complexa ou grande do nosso sistema, como autenticação, acesso a sistema de arquivos, cache, etc. 
Uma classe de fachada, contendo apenas a funcionalidade desejada, pode ser bastante útil.
Este padrão é bem simples, mas possui particularidades, então vale a pena uma leitura mais completa:[Facade](https://refactoring.guru/design-patterns/facade).

Resumo:
- Que podemos pegar um sub-sistema e expor parte de suas funcionalidades através de uma classe;
- Que a classe responsável por ser essa fachada implementa o padrão Facade.


## 05. Proxy
Quais seriam bons motivos para utilização do padrão Proxy?

Performance
Esse foi exatamente o motivo demonstrado nessa aula.

Segurança
Podemos utilizar o padrão Proxy para interceptar classes e executar regras de segurança.

Há uma falha na implementação do último vídeo do padrão Proxy: apenas o método getValor() está realizando a chamada para o objeto orçamento original.
Para corrigir esse problema, nós temos duas opções:

1. Implementar todos os métodos da classe Orcamento, delegando a chamada para o objeto original
2. Apenas implementar a interface Orcavel, ao invés de estender Orcamento (Feito)

Para saber mais detalhes sobre esse padrão simples, porém muito poderoso, você pode conferir este link: [Proxy](https://refactoring.guru/design-patterns/proxy).

Resumo:
- A interceptar o acesso a um método, através de uma classe derivada;
- Quando isso pode ser útil, em nosso caso, para fazer cache;
- Que, a esse conceito, se dá o nome de Proxy.
