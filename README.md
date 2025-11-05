# dslist

![Arquitetura do projeto](https://github.com/user-attachments/assets/af42a17d-32f4-4b02-a95c-7cb9d2a68a1c)

dslist é um projeto que implementa um catálogo/listas de jogos (DSList). O repositório contém backend e frontend (mobile/expo). Além disso, como ilustra a imagem acima, é um projeto estruturado em camadas.

---

## Sumário
- [Visão geral](#visão-geral)
- [Arquitetura / Modelo de domínio](#arquitetura--modelo-de-domínio)
- [Tecnologias](#tecnologias)
- [Pré-requisitos](#pré-requisitos)
- [Como executar](#como-executar)
  - [Backend](#backend)
  - [Frontend (Expo)](#frontend-expo)
- [Endpoints da API](#endpoints-principais-exemplo)
- [Estrutura do projeto](#estrutura-do-projeto)
- [Contribuições](#contribuições)
- [Licença](#licença)
- [Contato](#contato)

---

## Visão geral
O projeto tem como finalidade o gerenciamento de jogos e suas categorias. Além disso, foi desenvolvido comforme os vídeos da imersão criada pelo [prof. Nélio Alves](https://github.com/acenelio).

---

## Modelo de domínio

![Modelo de domínio](https://github.com/user-attachments/assets/75859ae3-bcbd-4f52-a299-abfbc2120353)

A imagem acima ilustra o modelo de domínio, expondo os detelhas das entidades e seus relacionamentos.

---

## Tecnologias
- Backend: ![Static Badge](https://img.shields.io/badge/v21---?logoSize=auto&label=Java&labelColor=blue&color=orange) + ![Static Badge](https://img.shields.io/badge/v3.5.4---?logo=springboot&logoSize=auto&label=Spring%20Boot&labelColor=black&color=gray)


- Frontend mobile: ![Static Badge](https://img.shields.io/badge/v54---?logo=expo&logoSize=auto&label=Expo&labelColor=black&color=gray) / ![Static Badge](https://img.shields.io/badge/v0.81.4---?logo=react&logoSize=auto&label=React%20Native&labelColor=black&color=gray)
- Banco de dados: ![Static Badge](https://img.shields.io/badge/---?logo=h2database&logoColor=auto&logoSize=auto&label=H2%20Database&labelColor=blue&color=lightblue) / ![Static Badge](https://img.shields.io/badge/---?logo=postgresql&logoColor=auto&logoSize=auto&label=PostgreSQL&labelColor=darkgray&color=lightblue) 
- Build: ![Static Badge](https://img.shields.io/badge/---?logo=apachemaven&logoColor=red&logoSize=auto&label=Maven&labelColor=purple&color=orange) 

---

## Pré-requisitos
- Git
- Java 21
- Maven
- Node.js (16+) e npm/yarn
- Expo CLI (opcional global): `npm install -g expo-cli` ou use `npx expo`

---

## Como executar

As instruções abaixo cobrem os passos gerais para rodar localmente.

### Backend
1. Entre no diretório do backend (ex.: `cd backend` se houver pasta):
   ```bash
   cd backend
   ```
2. Instale dependências e rode:
   - Com Maven:
     ```bash
     mvn clean install
     mvn spring-boot:run
     ```
   - Ou com Gradle:
     ```bash
     ./gradlew bootRun
     ```
3. Configurações:
   - Configure `application.properties` / `application.yml` para o datasource (URL, usuário, senha) e porta (ex.: `server.port=8080`).
   - Se usar banco em memória (H2) não precisa de configuração adicional para testes rápidos.

Verifique os logs para confirmar que a API iniciou (ex.: "Started Application").

### Frontend (Expo)
1. Entre no diretório do frontend:
   ```bash
   cd frontend
   ```
2. Instale dependências:
   ```bash
   npm install
   # ou
   yarn
   ```
3. Inicie o Expo:
   ```bash
   npx expo start
   # ou, se instalado globalmente:
   expo start
   ```
4. Abra no emulador (Android/iOS) ou no Expo Go via QR code.

Observação: ajuste a URL/base da API no cliente mobile para apontar para o backend rodando (ex.: `http://localhost:8080/api` ou IP da sua máquina quando usar dispositivo físico).

---

## Endpoints da API  
Abaixo seguem os endpoints disponíveis:

- GET /games — lista todos os jogos
- GET /games/{id} — detalhes de um jogo
- GET /lists — lista as categorais de jogos
- POST /lists/{listId}/games — lista os jogos de uma categoria

Sugestão: crie/atualize uma seção com o contrato real da API (ex.: usando OpenAPI/Swagger).

---

## Estrutura do projeto (exemplo)
- /backend — código do servidor 
  📦backend
 ┣ 📂.mvn
 ┣ 📂src
 ┃ ┣ 📂main
 ┃ ┃ ┣ 📂java
 ┃ ┃ ┃ ┗ 📂com
 ┃ ┃ ┃ ┃ ┗ 📂project
 ┃ ┃ ┃ ┃ ┃ ┗ 📂backend
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂controllers
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂dto
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂entities
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂projections
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂repositories
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂services
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜BackendApplication.java
 ┃ ┃ ┗ 📂resources
 ┃ ┃ ┃ ┣ 📜application-test.properties
 ┃ ┃ ┃ ┣ 📜application.properties
 ┃ ┃ ┃ ┗ 📜import.sql
 ┃ ┗ 📂test
 ┣ 📂target
 ┣ 📜.gitattributes
 ┣ 📜.gitignore
 ┣ 📜mvnw
 ┣ 📜mvnw.cmd
 ┣ 📜nb-configuration.xml
 ┣ 📜nbactions.xml
 ┗ 📜pom.xml

- /frontend — app Expo / React Native
📦frontend
 ┣ 📂.cursor
 ┣ 📂.vscode
 ┣ 📂app
 ┣ 📂assets
 ┃ ┗ 📂images
 ┣ 📜.gitignore
 ┣ 📜README.md
 ┣ 📜app.json
 ┣ 📜eslint.config.js
 ┣ 📜package-lock.json
 ┣ 📜package.json
 ┗ 📜tsconfig.json

- README.md — documentação principal

---

## Testes
- Backend: rodar testes unitários/integrados via `mvn test`.
- Frontend: use ferramentas de testes de sua escolha (Jest, Detox etc.)

---

## Licença
Coloque aqui a licença do projeto (ex.: MIT). Se ainda não houver, escolha uma licença apropriada e adicione o arquivo LICENSE no repositório.

---

## Contato
Gabrielx47 — gabrieldossantosmendonca0@gmail.com

---
