# 🕐 Tokisaki — Immersion Tracker

Aplicação de linha de comando desenvolvida em Java para registrar e contabilizar o tempo de imersão em mídias japonesas como animes e visual novels.

---

## 📌 Sobre o projeto

O Tokisaki foi criado como projeto de estudo para aplicar conceitos de **Orientação a Objetos em Java**, separando responsabilidades entre classes e simulando um sistema simples de registro de dados em memória.

O projeto faz parte do meu portfólio de aprendizado em Java, com foco em back-end.

---

## ⚙️ Funcionalidades

- Adicionar registros de imersão (nome da mídia, tempo em minutos e tipo)
- Calcular o tempo total de imersão acumulado (exibido em horas)
- Menu interativo via terminal com loop de navegação

---

## 🧱 Estrutura do projeto

```
Tokisaki/
└── src/
    ├── Main.java               # Ponto de entrada, menu interativo e fluxo da aplicação
    ├── RegistrarImersao.java   # Entidade que representa um registro de imersão (nome, tempo, tipo)
    └── GerenciadorImersao.java # Gerencia a lista de registros e calcula o tempo total
```

### Responsabilidades por classe

| Classe | Responsabilidade |
|---|---|
| `Main` | Controla o fluxo da aplicação e interação com o usuário via Scanner |
| `RegistrarImersao` | Modelo de dados com encapsulamento (getters/setters) |
| `GerenciadorImersao` | Regra de negócio: armazenamento e cálculo do tempo total |

---

## 🚀 Como executar

### Pré-requisitos

- Java 17+ instalado
- IntelliJ IDEA ou qualquer IDE com suporte a Java (ou JDK via terminal)

### Rodando pelo terminal

```bash
# Clone o repositório
git clone https://github.com/nyxzak/tokisaki.git
cd tokisaki

# Compile os arquivos
javac src/*.java -d out/

# Execute
java -cp out Main
```

### Exemplo de uso

```
Bem Vindo ao Tokisaki!
Escolha uma opção!
1- Adicionar Registro
2- Checar tempo total
3- Fechar
> 1
Qual o nome da mídia?
> Nekopara Vol. 1
Qual o tempo em minutos?
> 180
Qual o tipo? Ex: Anime/Visual Novel
> Visual Novel
Registro adicionado com sucesso!

Escolha uma opção!
1- Adicionar Registro
2- Checar tempo total
3- Fechar
> 2
Tempo total de imersão: 3.00 horas.
```

---

## 🛠️ Tecnologias utilizadas

- **Java 17**
- **IntelliJ IDEA**
- Orientação a Objetos (encapsulamento, separação de responsabilidades)
- Coleções Java (`ArrayList`, `List`)

---

## 📚 Conceitos aplicados

- **Encapsulamento** — atributos privados com acesso via getters e setters
- **Separação de responsabilidades** — cada classe com uma função específica
- **Coleções** — uso de `ArrayList` para gerenciar registros em memória
- **Entrada de dados** — leitura via `Scanner` com loop de navegação

---

## 🔮 Próximos passos

- [ ] Migrar para **Spring Boot** com API REST
- [ ] Persistência com **JPA/Hibernate** e **PostgreSQL**
- [ ] Adicionar validação de entrada de dados
- [ ] Implementar testes com **JUnit**

---

## 👤 Autor

**Gustavo Araújo Dutra**  
[LinkedIn](https://www.linkedin.com/in/gustavo-araújo-dutra) · [GitHub](https://github.com/nyxzak)
