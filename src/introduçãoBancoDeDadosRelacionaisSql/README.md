# ***Introdução a Banco de Dados Relacionais (SQL)***

<p>
Um <b><i>Banco de Dados</i></b> é uma coleção organizada de informações/dados estruturados que são armazenadas de maneira eletronic.
</p>

### Tipos de Banco de Dados:

- Relacionais/SQL;
- Não Relacionais/NoSQL;
- Orientada e Objetos;
- Hierarquico

---
### SGBD

<p>
Um <b><i>Sistema de Gerenciamento de Banco de Dados</i></b> oferece um conjunto de 
ferramentos/recursos para manipulação de dados. Também é responsavel pela administração 
de segurança, uma vez que nem todos podem ter acesso aos dados.
<br>
Um conjunto de operações mais comum em um SGBD, é o <b><i>CRUD</i></b>.
</p>

- **C**reate;
- **R**ead;
- **U**pdate;
- **D**elete.

---
### ***Banco de Dados Relacionais***:

<p>
Pode ser entendida como um conjunto de tabelas que possuem ligações entre elas que representam serviços e/ou estados.
<br>
Cada tabela possui seus atributos e nornalmente possuem uma <i>chave</i> no qual é usada para acessar um determinado objeto dessa tabela que possue essa chave em questão.
</p>

#### ***Caracteristicas***:

- Relacionamento entre tabelas;
- Linguagem de Consulta Estruturada;
- Integridade Referencial;
- Normalização de Dados;
- Segurança;
- Flexibilidade e extensibilidada;
- Suporte a transações ACID.
  - **A**tomicidade;
  - **C**onsistência;
  - **I**solamento;
  - **D**urabilidade

---
## Introdução e Conceitos Basicos SQL:

<p>
É uma linguagem de consulta pradronizada afim de interagir com o banco de dados, 
permitindo ao programador escrever consultas e comando para realizar diversas operações,
como o <b><i>CRUD</i></b>
</p>

### ***Organização SQL***

- **DQL - Linguagem de Consulta de Dados**:
  - SELECT.

- **DML - Linguagem de Manipulação de Dados**:
  - INSERT,UPDATE, DELETE.

- **DDL - Linguagem de Definição de Dados**:
  - CREATE, ALTER, DROP.

- **DCL - Linguagem de Controle de Dados**:
  - GRANT, INVOKE.

- **DTL - Linguagem de Transação de Dados**:
  - BEGIN, COMMIT, ROLLBACK.

### ***Comandos***:

- Criar tabela: `CREATE TABLE <NomeDaTabela> { ... }`:
  - Restrições de valores:
    - NOT NULL;
    - UNIQUE;
    - DEFALT;
  - Chaves Estrangeiras;
  - Auto Incremento.
<p><br></p>

- inserir na tabela:
<p>
    <code>
        INSERT INTO {NomeDaTabela} ({coluna1}, ...) VALUES ({ValoresColuna1}, ...)
    </code>
</p>

- Ler da tabela: 
<p>
    <code>
         SELECT {tabelas}
        <br>
         FROM {tabela}
        <br> 
         WHERE {condições};
    </code>
</p>

- Atualizar na tabela:

<p>
    <code>
        UPDATE {tabela} 
        <br>
        SET 
        <br>
        {coluna1} = {novo_Valor1} 
        <br> 
        {coluna2} = {novo_Valor2}}
        <br>
        WHERE {condições};
    </code>
</p>

- Deletar na tabela:

<p>
    <code>
        Delete {tabela}
        <br>
        WHERE {condição};
    </code>
</p>

- Alterar a tabela:
<p>
    <code>
        ALTER TABLE {tabela}
    </code>
</p>

- Deletar a tabela:
<p>
    <code>
        DROP TABLE {tabela}
    </code>
</p>

---
## ***Modelagem de Banco de Dados***:

### ***Modelo Entidade-Relacionamento***:

<p>
Representado atraves de diagramas chamados Diagramas..
</p>

- **Entidades**: Nomeadas com substantivos concretas ou abstratas que representam de maneira clara sua função dentro do dominio.
- **Atributos**: ***Caracteristicas*** e ***propriedades*** das entidades. Descrevem informações especificas sobre uma entidade.
- **Relacionamentos**: Representam as ***associações*** entre entidades.
- **Cardinalidade**: Indica numero de instancias ou ocorrencias que pode ocorrer entre entidades. Exemplo:
  - 1..1 (um para um)
  - 1..n ou 1..* (um para muitos)
  - n..n ou \*..\* (muitos para muitos)

- **Tabelas**: Usadas para amazenar dados de maneira organizada. Cada tabela tem nome unico e é divida entre *colunas*x*linhas*
- **Colunas**: Estrutura dentro da tabela que representa um atributo especifico dos dados armazenados. Cada coluna tem nome uncio e um tipo de dado associado.
- **Registro**: É uma instancia individual de dados em uma tabela.

## **Creditos**:

- Creditos à professora  ***Pâmela Apolinario*** por montar e disponibilizar o github com os conteudos que foram utilizados para confeccionar esse ***readme***. Disponivel em [Dio-BancoDeDados-Relacional](https://github.com/pamelaborges/dio-bd-relacional)
