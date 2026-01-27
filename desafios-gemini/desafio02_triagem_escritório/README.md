# Desafio 2: Triagem Jurídica Automatizada (Audax Solutions)

Este projeto simula um "Robô de Triagem" para o escritório **Marques dos Santos Advogados**. O objetivo é filtrar clientes automaticamente antes do atendimento humano, direcionando para a área correta (Trabalhista ou Previdenciária).

## 🛠️ Tecnologias e Habilidades Usadas
* **Java 21**
* **Scanner** (Entrada de dados interativa)
* **Switch Case** (Criação de menus de opções)
* **Lógica Aninhada** (If dentro de If para filtros profundos)
* **Regras de Negócio** (Critérios reais de aceitação de causas)

## 📋 Como funciona
1. O sistema apresenta um menu de áreas de atuação (1. Trabalhista, 2. Previdenciário, 3. Outros).
2. Com base na escolha, ele faz perguntas específicas (ex: "Tem carteira assinada?", "Qual a idade?").
3. Se o cliente não se encaixar no perfil do escritório, o sistema encerra o atendimento educadamente.
4. Se o cliente for qualificado, o sistema aprova e sugere o agendamento.

---
*Este é um MVP (Produto Mínimo Viável) para o futuro SaaS Audax Solutions.*

# ⚖️ Desafio 2: Triagem Jurídica Automatizada (Audax Solutions)

Este projeto simula um "Robô de Triagem" para o escritório **Marques dos Santos Advogados**. O objetivo é filtrar clientes automaticamente antes do atendimento humano, direcionando para a área correta ou encerrando o atendimento caso não haja aderência.

## 💼 Cenário de Negócio
Para otimizar o tempo dos advogados, o sistema atua como uma barreira inicial. Ele identifica a necessidade do cliente e verifica requisitos mínimos (ex: tempo de contribuição ou vínculo empregatício) antes de agendar uma consulta.

### 📋 Regra de Negócio
1.  **Menu Inicial:** O cliente escolhe entre Áreas de Atuação (Trabalhista, Previdenciário, Cível).
2.  **Filtro Trabalhista:** O sistema pergunta se há demissão sem justa causa ou verbas pendentes.
3.  **Filtro Previdenciário:** Verifica idade mínima (65 anos) ou tempo de contribuição.
4.  **Encerramento:** Se o cliente escolher uma área que o escritório não atende (ex: Cível), o sistema encerra educadamente.

---

## 🛠️ Requisitos Técnicos
Evoluindo do Desafio 1, aqui aplicamos estruturas de controle de fluxo mais complexas:

* **Switch Case:** Para criar o menu de opções (Menu Interativo).
* **If/Else Aninhados:** Condicionais dentro de condicionais para filtros profundos ("Se escolheu Previdenciário > Então verifique idade").
* **Scanner:** Leitura de múltiplas entradas (números e texto).
* **User Experience (UX):** Mensagens claras de orientação ao usuário.

## 🚀 Como o Sistema Funciona

1.  O sistema exibe o logotipo do escritório e o menu.
2.  O usuário digita o número da opção desejada.
3.  O sistema avalia a entrada (`switch`) e direciona para o bloco de perguntas específico.
4.  Ao final, exibe o veredito: **"Agendamento Permitido"** ou **"Encaminhado para Parceiro"**.

---

## 📝 Exemplo de Uso (Simulação)

```text
=== MARQUES DOS SANTOS ADVOGADOS ===
Selecione a área desejada:
1. Direito Trabalhista
2. Direito Previdenciário
3. Outras áreas

> Opção: 1

[Sistema]: Você possui carteira assinada ou contrato formal? (S/N)
> S
[Sistema]: A empresa deve verbas rescisórias? (S/N)
> S

 Resultado: Pré-análise APROVADA. Redirecionando para Dr. Victor...