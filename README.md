# CRUD de GET em Java com Jackson e API ViaCEP

Este projeto é um exemplo de um **CRUD focado na operação GET**, desenvolvido em **Java**, utilizando a biblioteca **Jackson** para manipulação de dados JSON e a API pública **ViaCEP** para consultar endereços a partir de um CEP. O objetivo é demonstrar como integrar APIs RESTful, manipulando e convertendo dados JSON em objetos Java.

---

## Funcionalidades Principais

### **Consulta de Dados (GET):**
- Realiza requisições à API ViaCEP e consome os dados no formato JSON.
- Desserializa as respostas JSON em objetos Java utilizando Jackson.

### **Serialização e Desserialização de JSON:**
- Converte objetos Java em JSON e vice-versa, garantindo uma integração eficiente entre sistemas.

### **Gestão de Recursos:**
- Implementa operações básicas de CRUD, com foco na operação GET para consultas.

---

## Tecnologias Utilizadas
- **Java:** Linguagem principal para a lógica do projeto.
- **Jackson:** Biblioteca para processamento e manipulação de JSON.
- **ObjectMapper:**  Biblioteca para processamento e manipulação de JSON
- **REST API:** Integração com a API pública ViaCEP para dados de endereços.
- **Maven/Gradle:** Gerenciadores de dependências e automação do build.

---

## Objetivos do Projeto
1. Demonstrar **boas práticas de programação em Java** ao consumir APIs RESTful.
2. Ensinar a utilização da biblioteca **Jackson** para manipulação de JSON.
3. Proporcionar uma base para projetos que envolvam integração com APIs RESTful.

---

## Como Utilizar

1. Clone este repositório:  
   ```bash
   git clone <URL_DO_REPOSITORIO>
   
2. Configure as dependências no arquivo `pom.xml` (Maven) ou `build.gradle` (Gradle).

3. Compile e execute o projeto.

4. Insira um CEP válido para consultar os dados de endereço via API ViaCEP.  
   Os dados retornados serão exibidos como objetos Java convertidos do JSON.

---

Este projeto é ideal para quem deseja aprender sobre **integração de APIs RESTful**, manipulação de **JSON com Jackson** e boas práticas em **Java**. 🚀

