# Aula - Maven

## 1 - Introdução, definição e instalação

### O que é:
Uma ferramenta para gerenciar e criar projeto feitos com Java

### Objetivos
- Tornar o processo de build fácil
- Prover um sistema de build uniforme
- Prover informação de qualidade sobre o projeto
- Encorajar melhores práticas de desenvolvimento

## 2 - Primeiro Projeto e conceitos

- Criação de um projeto rápido:
```
mvn archetype:generate -DgroupId=one.digitalinnovation -DartifactId=quick-start-maven -Darchetype=maven-archetype-quickstart -DinteractiveMode=false
```

- Comandos úteis
  - compilar: ``mvn compile``
  - Testar: ``mvn test``
  - criar o JAR: ``mvn package``
  - limpar o diretório de trabalho: ``mvn clean``

- Criando diferentes tipos de projetos através do mavenarchetype [link](https://maven.apache.org/archetypes/index.html)

  | Archetype ArtifactIds | Description |
  | - | - |
  | maven-archetype-archetype	| An archetype to generate a sample archetype. |
  | maven-archetype-j2ee-simple	| An archetype to generate a simplified sample J2EE application. | 
  | maven-archetype-plugin	| An archetype to generate a sample Maven plugin. |
  | maven-archetype-plugin-site	| An archetype to generate a sample Maven plugin site. |
  | maven-archetype-portlet	| An archetype to generate a sample JSR-268 Portlet. |
  | maven-archetype-quickstart	| An archetype to generate a sample Maven project. |
  | maven-archetype-simple	| An archetype to generate a simple Maven project. |
  | maven-archetype-site	| An archetype to generate a sample Maven site which demonstrates some of the supported document types like APT, Markdown, XDoc, and FML and demonstrates how to i18n your site. |
  | maven-archetype-site-simple	| An archetype to generate a sample Maven site. |
  | maven-archetype-site-skin	| An archetype to generate a sample Maven Site Skin. |
  | maven-archetype-webapp	| An archetype to generate a sample Maven Webapp project. |

## 3 - POM, dependências e repositórios

## 4 - Gerenciando dependências

## 5 - Maven Build Lifecycle

## 6 - Projetos multi-módulos

## 7 - Plugins

## 8 - Conclusão

## Referências
[Apache Maven Project](https://maven.apache.org/what-is-maven.html)