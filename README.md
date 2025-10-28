# dslist

![Arquitetura do projeto](https://github.com/user-attachments/assets/af42a17d-32f4-4b02-a95c-7cb9d2a68a1c)

dslist é um projeto que implementa um catálogo/listas de jogos (DSList). O repositório contém backend e frontend (mobile/expo).

---

## Sumário
- [Visão geral](#visão-geral)
- [Arquitetura / Modelo de domínio](#arquitetura--modelo-de-domínio)
- [Tecnologias](#tecnologias)
- [Pré-requisitos](#pré-requisitos)
- [Como executar](#como-executar)
  - [Backend](#backend)
  - [Frontend (Expo)](#frontend-expo)
- [Endpoints principais (exemplo)](#endpoints-principais-exemplo)
- [Estrutura do projeto](#estrutura-do-projeto)
- [Contribuições](#contribuições)
- [Licença](#licença)
- [Contato](#contato)

---

## Visão geral
Projeto de demonstração para gerenciar jogos e listas (ex.: ranking pessoal, coleções). Ideal para estudo de arquitetura em camadas (controller, service, repository), consumo via API REST e cliente mobile com Expo.

---

## Arquitetura / Modelo de domínio

![Modelo de domínio](https://github.com/user-attachments/assets/75859ae3-bcbd-4f52-a299-abfbc2120353)

O projeto segue uma arquitetura em camadas (ex.: controller → service → repository). As imagens acima ilustram a arquitetura e o modelo de domínio.

---

## Tecnologias
- Backend: ![Static Badge](https://img.shields.io/badge/v21---?logoSize=auto&label=Java&labelColor=blue&color=orange)
 + ![Static Badge](https://img.shields.io/badge/v3.5.4---?logo=springboot&logoSize=auto&label=Spring%20Boot&labelColor=black&color=gray)


- Frontend mobile: Expo / React Native
- Banco de dados: (configurável — H2 / PostgreSQL / MySQL)
- Build: Maven ou Gradle (dependendo do projeto backend)

> Observação: substitua as tecnologias acima pela stack exata do seu projeto, se diferente.

---

## Pré-requisitos
- Git
- Java 11+ (se o backend for Java/Spring Boot)
- Maven
- Node.js (16+) e npm/yarn
- Expo CLI (opcional global): `npm install -g expo-cli` ou use `npx expo`

---

## Como executar

As instruções abaixo cobrem os passos gerais para rodar localmente. Adapte conforme a configuração real do seu repositório.

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

## Endpoints principais (exemplo)
Abaixo seguem exemplos genéricos — atualize conforme a implementação real:

- GET /games — lista todos os jogos
- GET /games/{id} — detalhes de um jogo
- GET /lists — lista de listas/rankings
- POST /lists/{listId}/items — adiciona jogo a uma lista
- PUT /lists/{listId}/items/{itemId}/position — altera posição em uma lista

Sugestão: crie/atualize uma seção com o contrato real da API (ex.: usando OpenAPI/Swagger).

---

## Estrutura do projeto (exemplo)
- /backend — código do servidor (controllers, services, repositories, model)
- /frontend — app Expo / React Native
- README.md — documentação principal

Ajuste a estrutura acima caso suas pastas tenham outros nomes.

---

## Testes
- Backend: rodar testes unitários/integrados via `mvn test`.
- Frontend: use ferramentas de testes de sua escolha (Jest, Detox etc.)

---

## Como contribuir
1. Faça um fork do projeto.
2. Crie uma branch com a feature ou correção:
   ```bash
   git checkout -b feature/minha-feature
   ```
3. Faça commits claros e atômicos.
4. Abra um Pull Request descrevendo as mudanças.

Adicione issues para bugs ou melhorias antes de trabalhar em mudanças maiores, para alinhamento.

---

## Licença
Coloque aqui a licença do projeto (ex.: MIT). Se ainda não houver, escolha uma licença apropriada e adicione o arquivo LICENSE no repositório.

---

## Contato
Gabrielx47 — gabrieldossantosmendonca0@gmail.com

---
