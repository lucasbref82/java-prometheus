# Decisões tomadas

### Não uso do lombok

* Código mais claro
* Fácil de debugar
* Sem dependências

### Padrão Builder

* Nome correto dos campos
* Evita construtores
* Monta somente o que precisa
* Facilidade de leitura

### Injeção por construtor

* Dependências não podem ser alteradas depois da criação (final).
* Facilita testes unitários sem precisar subir contexto Spring.
* Fica explícito quais dependências a classe precisa.
* Facilidade de leitura
* Evita NullPointerException por injeção tardia.

### Uso de DTO

* Padroniza o formato da resposta da API
* Evita expor entidades diretamente
* Facilita testes e manutenção
* Permite criar respostas genéricas e reutilizáveis
* Possibilita esconder dados sensíveis

### Uso de Record

* Menos código (getters, construtor e toString automáticos)
* Imutável por padrão (mais seguro)
* Facilita criação de DTOs simples
* Melhor organização e legibilidade
* Ideal para respostas de API no padrão JSON
