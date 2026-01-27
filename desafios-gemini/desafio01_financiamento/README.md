### 🟢 Nível Básico (Lógica e Sintaxe)
# Desafio 1: Aprovador de Financiamento (Loja de Veículos)

Este projeto é um sistema de análise de crédito simples para auxiliar vendedores de veículos.

## 🛠️ Tecnologias e Habilidades Usadas
* **Java 21**
* **Scanner** (Entrada de dados)
* **Estruturas Condicionais** (If / Else)
* **Lógica Matemática** (Cálculo de porcentagem e parcelas)
* **Clean Code** (Nomes de variáveis descritivos)

## 📋 Como funciona
O sistema recebe o salário e o valor do empréstimo, verifica se a parcela compromete mais de 30% da renda e retorna o resultado imediato.

# 🚗 Desafio 1: Aprovador de Financiamento (Audax Motors)

Este projeto é um sistema de análise de crédito inicial desenvolvido para auxiliar vendedores de veículos a validarem propostas de financiamento em tempo real.

## 💼 Cenário de Negócio
O vendedor precisa de uma ferramenta rápida para verificar se o cliente possui capacidade de pagamento antes de prosseguir com a burocracia bancária. O sistema automatiza o cálculo de comprometimento de renda.

### 📋 Regra de Negócio (Compliance)
> **Regra de Ouro:** O valor da parcela do veículo **não pode comprometer mais do que 30%** da renda mensal do cliente.

---

## 🛠️ Requisitos Técnicos
O sistema foi desenvolvido em **Java** aplicando os seguintes conceitos:

* **Entrada de Dados:** Uso da classe `Scanner` para capturar Nome, Salário e Valor do Empréstimo.
* **Tipagem:** Manipulação de `String`, `double` e `int`.
* **Lógica Matemática:** Cálculo de parcelas e porcentagem (`valor / parcelas`).
* **Estruturas Condicionais:** Uso de `if/else` para aprovação ou recusa.
* **Operador Ternário:** Classificação de clientes (VIP vs Comum) em uma única linha de código.

## 🚀 Como o Sistema  Funciona

1.  **Coleta de Dados:** O sistema solicita as informações financeiras do cliente.
2.  **Processamento:**
    * Calcula o valor da parcela mensal.
    * Calcula o limite máximo de comprometimento (30% do salário).
3.  **Saída (Output):**
    * **Se Aprovado:** Exibe mensagem de sucesso com o valor da parcela.
    * **Se Reprovado:** Informa a recusa e mostra o valor que excedeu o limite.
    * **Status:** Informa se o cliente é "VIP" (Renda > R$ 10k) ou "Comum".

---

## 📝 Exemplo de Uso

```text
Digite seu nome: Victor
Salário: 12000
Valor do empréstimo: 50000
Número de parcelas: 24

Resultado:
Parabéns Victor, crédito aprovado! Parcela: R$ 2083.33
Status do Cliente: Cliente VIP 🌟