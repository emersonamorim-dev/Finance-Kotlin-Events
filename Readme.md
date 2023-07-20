# **Projeto de Sistema Financeiro Bancário com Spring Boot e Kotlin Coroutines**
Este projeto é uma aplicação Spring Boot que utiliza Kotlin Coroutines para realizar operações bancárias de forma assíncrona e não bloqueante. A aplicação expõe endpoints HTTP para realizar depósitos, saques e transferências.

#### **Estrutura do Projeto**
O projeto está organizado em vários pacotes:

- com.bank.finance: Contém a classe principal da aplicação, FinanceApplication.kt, que inicia a aplicação Spring Boot.
- com.bank.finance.service: Contém o serviço BankingService.kt, que realiza as operações bancárias.
- com.bank.finance.controller: Contém o controlador BankingController.kt, que expõe as operações bancárias como endpoints HTTP.
- Operações Bancárias
- O serviço BankingService fornece os seguintes métodos:

deposit(amount: Double): Realiza um depósito de uma determinada quantia.
withdraw(amount: Double): Realiza um saque de uma determinada quantia.
transfer(fromAccount: String, toAccount: String, amount: Double): Realiza uma transferência de uma determinada quantia de uma conta para outra.
Cada método é uma suspending function, o que significa que pode ser pausada e retomada sem bloquear um thread. Isso permite que a aplicação lide com muitas operações simultâneas com um pequeno número de threads.

#### Endpoints HTTP
O controlador BankingController expõe os seguintes endpoints HTTP:

- POST /deposit: Realiza um depósito. A quantia a ser depositada é fornecida como um parâmetro de requisição.
- POST /withdraw: Realiza um saque. A quantia a ser sacada é fornecida como um parâmetro de requisição.
- POST /transfer: Realiza uma transferência. A conta de origem, a conta de destino e a quantia a ser transferida são fornecidas como parâmetros de requisição.
- Executando a Aplicação
- Para executar a aplicação, você pode usar o comando ./gradlew bootRun para Gradle ou mvn spring-boot:run para Maven.

#### Autor
Emerson Amorim