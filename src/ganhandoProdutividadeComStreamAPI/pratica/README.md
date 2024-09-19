### Contexto dos metodos:

- <p> Abaixo segue a descrição da aplicação dos metodos: </p>

  - `Consumer<T>`: Representa uma operação que aceita um argumento do tipo T e não retorna nenhum resultado. É utilizada
    principalmente para realizar ações ou efeitos colaterais nos elementos do Stream sem modificar ou retornar um valor.

  - `Supplier<T>`: Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T. É comumente
    usada para criar ou fornecer novos objetos de um determinado tipo.

  - `Function<T, R>`: Representa uma função que aceita um argumento do tipo T e retorna um resultado do tipo R. É
    utilizada para transformar ou mapear os elementos do Stream em outros valores ou tipos.

  - `Predicate<T>`: Representa uma função que aceita um argumento do tipo T e retorna um valor booleano (verdadeiro ou
    falso). É comumente usada para filtrar os elementos do Stream com base em alguma condição.

  - `BinaryOperator<T>`: Representa uma operação que combina dois argumentos do tipo T e retorna um resultado do mesmo
    tipo T. É usada para realizar operações de redução em pares de elementos, como somar números ou combinar objetos.

## Creditos:

- Creditos destinados a tutora *Camila Calvacante* pela criação do github original de onde esse conteudo foi tirado. disponivel em: [Functional Interface](https://github.com/digitalinnovationone/ganhando_produtividade_com_Stream_API_Java/blob/master/src/functional_interface/README.md)
