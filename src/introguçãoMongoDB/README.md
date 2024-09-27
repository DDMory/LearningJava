# ***Introdução ao MongoDB e Bancos de Dados NoSQL***

---

## Introdução ao MongoDB

O **MongoDB** banco de dados de codigo aberto com alta *performance* e *schema-free*,
ele utizila json para armazenar dados, oferecendo suporte a indeces para consultar dados. 
Poussi Auto-Sharding (escalamento horizontal), sendo capaz de colocar mais maquinas
para operar em conjunto. Map-Reduce que auxilia na agregação e consulta em processamente
de grande volume de dados em que se deseja obter um resultado.

- Documment ==> Tupla/Registro.
- Collection ==> tabela.
- Embedding/linking ==> join.

***Recomendado usar para***
- Grande volume de dados.
- Dados não necessariamente estruturados.

***Quando não usar***
- Necessidade de relacionamento/joins
- Propriedades ACID e transações são importantes

---
## Introdução Docker
O docker é uma plataforma de codigo aberto que tem alto desempenho, ele garante que seja possivel criar e administrar o ambientes de maneira isolada.
Tem por objetivo permitir a criação de teste e implemente aplicações em ambientes separados, um processo chamado conteinerzação.