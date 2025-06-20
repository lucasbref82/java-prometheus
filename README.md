# Decisões tomadas

### Não uso do lombok

* Código mais claro
* Fácil de debugar
* Sem dependências

### Padrão Builder

* Nome correto dos campos
* Evita construtores
* Monta somente oque precisa
* Facilidade de leitura

### Injeção por contrutor

* Dependências não podem ser alteradas depois da criação (final).
* Facilita testes unitários sem precisar subir contexto Spring.
* Fica explícito quais dependências a classe precisa.
* Facilidade de leitura
* Evita NullPointerException por injeção tardia.

