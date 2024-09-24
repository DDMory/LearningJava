# *Introdução a Testes de Software*

### *Defeito, Erro e Falha*:

- <p><b>Defeito</b>: Chamado de <i><b>bug</b></i></b>, é causado na fase de desenvolvimento do software.</p>

- <p><b>Erro</b>: Resultado do <b><i>defeito</i></b> quando há uma <i><b>diferença entre o valor obtido e o valor esperado</b></i>.</p>

- <p><b>Falha</b>: Quando o software apresenta um comportamento e respostas diferentes do que se era esperado pelo cliente final.</p>
    
    - <p><b><i>Diversos erros podem ocasionar em falha, mas nem todos os erros irão resultar em falha.</i></b></p>

### *Validação x Verificação*:

-   <p><b><i>Verificação</i></b>: Estamos construindo sistema corretamente ?</p>
-   <p><b><i>Validação</i></b>: Estamos contruindo o software certo ?</p>

### *Niveis de Teste*:

<p>Teste de Unidade/Unitario >> Teste de Integração >> Teste de Sistema >> Teste de Regrassão >> Teste de Aceitação</p>

- ***Teste de Unidade***: Validação da peça do *quebra-cabeça*;

- ***Teste de Integração***: Validação da agregação dsa peças do *quebra-cabeça*;

- ***Teste de Sistema***: Validação de um prototipo do sistema em um conjunto de pessoas seletas;

- ***Teste de Regrassão***: Validação das features(atualizações) feitas, *o novo está quebrando o que já existe ?*;

- ***Teste de Aceitação***: Validação final do produto antes de ser entregue oficialmente ao cliente/publico;

    - ***Alfa***: Teste de Aceitação conduzida em um ambiente controlado em uma equipe separada que faz parte da organização desenvolvedora.
    - ***Beta***: Teste de Aceitação conduzida em um ambiente não controlado, ou seja, o produto é liberado para o publico de maneira limitada.

#### Teste Caixa Preta, Caixa Branca e Caixa Cinza:

- ***Caixa Branca/Teste Estrutural***: Teste em que o individuo tem acesso ao codigo fonte, sabendo o que acontece por debaixo dos panos

  - Validação de dados, controles, fluxos e chamadas;
  - Garantir a qualidade da implementação;
  - Niveis: Unidade, Integração e Regrassão.

- ***Caixa Preta/Teste Funcional***: Teste em que não há conhecimento do codigo fonte.

  - verificar saidas usando tipos de entradas variados;
  - Nivels: Integração, Sistema, Aceitação.

- ***Caixa cinza***: Mescla da Caixa Branca e Caixa Preta.
  
  - Analisa parte logica e também funcionalidade;
  - Engenharia reversa.

### ***Testes Não Funcionais***

<p>
Ligado a <i>Requisitos <b>não funcionais</b></i>:
</p>

- Comportamento do Sistema; 
- Performance;
- Escalabilidade;
- Segurança;
- Infraestrutura.

#### *Tipos de testes*:
- ***Teste de Carga***: Realizado para verficar o volume de transações, acessos simultaneos ou usuarios em que um recurso suporta.

- ***Teste de Stress***: Busca extressar o sistema o sistema e ver como se comporta

- ***Teste de Stress***: Processo critico que busca testar vulnerabilidades.
