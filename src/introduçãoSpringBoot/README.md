# ***Introdução a Spring Framework com Spring Boot***

---

### ***Fundamentos:***

*Spring Framework*, como o nome diz, é um framework opreSource desenvolvido 
para a plataforma java baseado em padrões de projetos inversão de controle e injeção
de dependências.

Sua estrutura é composto por ***modulos***, visando reduzir a complexidade no desenvolvimento 
de aplicações simples ou corporativas.

### ***Inversão de Controle***:

Redirecionamento de fluxo de execução de um codigo, retirando parcialmente o
controle sobre ele e delegando-o para um container

### ***Injeção de Dependencia*** :

Padrão de desenvolvimento com a finalidade de manter baixo o nivel de acoplamento entre 
modulos de um sistema

---

#### ***Singleton***:

O container do Spring IOC define apenas uma instancia de objeto

#### ***Prototype***:

Será criado um novo objeto a cada solicitação ao container

#### ***HTTP - Request***:

Um bean será criado para cada requisição HTTP.

#### ***HTTP - Sesion***:

Um bean será criado para a sessão de usuario

#### ***HTTP - Global***:

Cria um bean para o ciclo de vida do contexto da aplicação

### ***Autowired***:

Uma anotação onde deverá ocorrer uma injeção automatica de dependencia.

---