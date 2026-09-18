# Turmas UMC — Materiais por Semestre

Este repositório reúne materiais didáticos, exemplos de código, exercícios e projetos utilizados nas turmas dos cursos de graduação da Universidade de Mogi das Cruzes — UMC.

Os conteúdos são organizados por semestre e disciplina para facilitar o acesso dos estudantes e manter um histórico das aulas desenvolvidas.

## Acesso rápido

| Semestre | Disciplina / Turma |
| --- | --- |
| 01/2025 | [Lógica de Programação](./01-2025%20-%20L%C3%B3gica%20Programa%C3%A7%C3%A3o/) |
| 01/2025 | [Projeto de Software](./01-2025%20-%20Projeto%20Software/) |
| 02/2025 | [Lógica de Programação](./02-2025%20-%20L%C3%B3gica%20Programa%C3%A7%C3%A3o/) |
| 02/2025 | [Projeto de Software](./02-2025%20-%20Projeto%20Software/) |
| 01/2026 | [Projeto de Software](./01-2026%20-%20ProjetoSoftware/) |
| 01/2026 | [Projeto de Software — 3F](./01-2026%20-%20ProjetoSoftware-3F/) |

## Padrão de organização

A estrutura principal segue o padrão:

```text
SEMESTRE-ANO - DISCIPLINA
```

Exemplo:

```text
Turmas-UMC/
├── 01-2025 - Lógica Programação/
├── 01-2025 - Projeto Software/
├── 02-2025 - Lógica Programação/
├── 02-2025 - Projeto Software/
├── 01-2026 - ProjetoSoftware/
├── 01-2026 - ProjetoSoftware-3F/
├── .gitignore
├── LICENSE
└── README.md
```

Dentro de cada disciplina, os conteúdos são separados por aulas, módulos, exercícios ou projetos.

## Conteúdos

### Lógica de Programação

Os materiais podem abordar:

- HTML5 e CSS3;
- JavaScript;
- estruturas condicionais e de repetição;
- DOM e eventos;
- formulários;
- consumo de APIs;
- PHP;
- integração com banco de dados;
- desenvolvimento de CRUD.

### Projeto de Software

Os materiais podem abordar:

- Java;
- Programação Orientada a Objetos;
- classes, objetos, atributos e métodos;
- encapsulamento;
- herança e polimorfismo;
- interfaces;
- arrays, vetores e `ArrayList`;
- tratamento de exceções;
- JDBC;
- Maven;
- APIs REST;
- Spring Boot;
- Spring Data JPA;
- persistência de dados.

## Como utilizar

Para clonar o repositório:

```bash
git clone https://github.com/PedroMiho/Turmas-UMC.git
cd Turmas-UMC
```

Depois, acesse a pasta correspondente ao semestre e à disciplina desejada.

### Projetos Java

Verifique a instalação do Java:

```bash
java --version
```

Quando o projeto utilizar Maven:

```bash
mvn --version
```

Projetos Spring Boot normalmente podem ser executados com:

```bash
mvn spring-boot:run
```

### Projetos web

Projetos com HTML, CSS e JavaScript podem ser executados diretamente no navegador ou utilizando uma extensão como o Live Server.

Projetos PHP precisam de um ambiente compatível, como XAMPP, Apache ou o servidor de desenvolvimento do PHP.

## Boas práticas do repositório

O `.gitignore` da raiz evita o versionamento de arquivos gerados pela IDE, builds e dependências locais, como:

- `.idea/` e `*.iml`;
- `target/`, `build/` e `.gradle/`;
- `node_modules/`;
- arquivos `.env`;
- logs e arquivos temporários.

Arquivos desse tipo que já tenham sido versionados anteriormente podem continuar no histórico do Git, mas não devem voltar a ser adicionados em novos commits.

## Observações

- O repositório possui finalidade acadêmica e didática.
- Alguns projetos representam etapas intermediárias construídas durante as aulas.
- Alguns exemplos podem exigir banco de dados ou configurações locais.
- Credenciais, tokens e informações de acesso não devem ser publicados.
- Semestres anteriores são mantidos como histórico acadêmico.

## Autor

**Pedro Henrique Miho de Souza**  
Professor de Tecnologia da Informação

- [LinkedIn](https://www.linkedin.com/in/pedro-miho)
- [GitHub](https://github.com/PedroMiho)

## Licença

Consulte o arquivo [LICENSE](LICENSE).
