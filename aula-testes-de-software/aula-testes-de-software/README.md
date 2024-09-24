# Teste de software

## Defeito, erro, falha

Todo erro que é visível ao usuários. Por trás de toda falha há um erro. E um erro evidencia um Defeito, um erro técnico.

## Niveis de teste

### Unidade
Testes direcionados a pequenas unidades de código.

### Integração
Validar uma estrutura maior do software. Por exemplo, chamadas a sistemas externos, banco de dados etc.

### Sistema
Testar uma versão estável do sistema, normalmente em um ambiente controlado.

- alfa: inicial.
- beta: mais maduro, não 100% estável, mas mais próximo do software.
- canary: estratégia de deploy.

### Regressão
Reavaliar o que está sendo desenvolvido. Validar se as novas funcionalidades não estão quebrando as demais.

### Aceitação
Teste com os usuários, aguardando o OK deles.

## Técnicas de testes

### Caixa branca
- teste estrutural
- validas dados, controles, fluxos, chamadas
- garantir a qualidade da implementação
- níveis: unidade, integração, sistema, regressão

### Caixa preta
- Teste funcional
- Verificar saídas usando vários tipos de entrada
- Teste sem conhecer a estrutura interna do software
- Níveis: Integração, sistema e aceitação.

### Caixa cinza
- Mescla das duas
- Análise parte lógica e também funcionalidade
- ex: ter acesso a documentação do funcionamento do código
- ex; engenharia reversa

## Testes não funcionais

Estão ligados a requisitos não funcionais

- comportamento do sistema
- performance
- escalabilidade
- segurança
- infraestrutura

tem como objetivo testar aspectos do software que não são associados as regras de negócio mas sim a requisitos não funcionais.

### Teste de carga

realizado para verificar qual o volume de transações, acessos simultâneos ou usuários que um servidor/software/sistema suporta:

- Objetivos para clareza de resultados
- Ambiente 
- Cenários
- Execução de testes
- Análise de resultado
- Ex: Gattling loading testing; Apache Jmeter

### Teste de stress

submeter o software a situações extremas. testar os limites do software e avaliar seu comportamento.

### Teste de segurança

Detectar vulnerabilidades
- Ex: OWASP ZAP;

## Pirâmide de testes

| x | y | z |
|-----|-----|-----|
| more integration | UI Tests | Slower |
| | Service Tests | |
| more isolation | unit tests | faster |