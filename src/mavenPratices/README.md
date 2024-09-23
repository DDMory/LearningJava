# *Gerenciamento de Dependências e Build em java Com Maven*

## Conceitos:

- <p><B>Maven</B>: Maven é uma ferramenta de gereciamento de <i><B>build</B></i> e <i><b>dependências</b></i>.</p> 

  - Fornece informações de qualidade  
  - Facilita a compreensão do desenvolvedor sobre a construção do software e de suas dependências.

### Criação de arquivo maven (linha de comando)

<p> 
Como todos os arquivos estão presentes em um aglomerado de pastas, recomenda-se que,em vez clonar ou baixar o seguinte pacote que contenha o build gerado por maven, o leitordeverá realizar os passos para criar um arquivo semelhante por linha de comando.
</p>

### Passos para criação de arquivo maven.<p> Após realizar o dowload do maven apache em seu site, configurar os PATH em <b><i>Variaveis de Ambiente</i></b>, crie uma pasta que seja o local onde o build será gerado.</p>1. Abra o prompt de comando (cmd) e navegue até a pasta criada.   - `cd <path Até a pasta criada>`.  2. digite o seguinte comando, pode ser alterado conforme necessario.   - `mvn archetype:generate -DgroupId=one.digitalinnovation -DartifactId=quick-start-maven -Darchetype=maven-archetype-quickstart -DinteractiveMode=false`.<p>E assim será finalizado a criação do Build maven. Para testarmos se está tudo de acordo, existe uma serie de comandos que podemos usar no proprio cmd, vale lembrar que precisamos estar no mesmo diretorio em que o arquivo <code>pom.xml</code> encontra-se:</p>- `mvn compile`- `mvn test`- `mvn package`- `mvn clean`<p>Comandos como <code>compile</code>, <code>test</code> e <code>clean</code> irão influenciar em uma pasta <code>target</code>que será criado, enquanto package irá gerar um <code>jar</code> da aplicação.</p>