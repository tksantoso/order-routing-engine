# Event-Driven Order Routing Engine (CRM & Supply Chain)

Engine reativo e extensível de roteamento e priorização de pedidos em Java/Spring Boot utilizando **Chain of Responsibility Pattern** e simulação de **Event-Driven Architecture (EDA)**.

## 🎯 Padrões e Tecnologias
- **Java 17 & Spring Boot 3**
- **Design Pattern Chain of Responsibility:** Desacoplamento de regras de negócios logísticas.
- **Arquitetura Orientada a Eventos:** Simulação de publicação para brokers de mensageria (RabbitMQ/Kafka).
- **Regras de Negócio:** Score de prioridade baseado em tipo de cliente CRM (VIP), valor do pedido e restrições de peso/modal.

## 🚀 Como Executar

```bash
mvn spring-boot:run