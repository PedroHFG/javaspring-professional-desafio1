# Desafio: Sistema de Cálculo de Pedidos

Este projeto faz parte do curso **Java Spring Professional** da [DevSuperior](https://devsuperior.com.br/). O desafio consiste na criação de um sistema para calcular o valor total de um pedido, levando em consideração uma porcentagem de desconto e o valor do frete. A aplicação foi desenvolvida utilizando **Java** e **Spring Boot**, seguindo boas práticas de desenvolvimento com componentes e serviços.

## 🚀 Tecnologias Utilizadas

- Java
- Spring Boot
- Maven

## 📋 Descrição do Projeto

O objetivo é calcular o valor total de um pedido a partir de um valor básico, aplicando uma porcentagem de desconto e adicionando o valor do frete conforme as regras abaixo:

### Regras de Frete
| Valor Básico do Pedido (sem desconto) | Valor do Frete |
|---------------------------------------|----------------|
| Abaixo de R$ 100,00                   | R$ 20,00       |
| De R$ 100,00 até R$ 200,00 (exclusive)| R$ 12,00       |
| R$ 200,00 ou mais                     | Grátis         |

O cálculo do valor total do pedido é feito da seguinte forma:

- Valor total = (Valor básico - Desconto) + Frete

## 🛠️ Estrutura do Projeto

A solução foi desenvolvida seguindo a arquitetura de serviços, conforme o diagrama abaixo:

### Diagrama de Classes

#### 1. Order (Pedido)
A classe `Order` representa o pedido e possui os seguintes atributos: