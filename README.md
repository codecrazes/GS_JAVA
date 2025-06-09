# 🌧️ Projeto Social

---

## 👨‍💻 Integrantes

- Caroline Assis Silva - RM 557596  
- Enzo de Moura Silva - RM 556532  
- Luis Henrique Gomes Cardoso - RM 558883  

---

Este projeto tem como objetivo **ajudar famílias afetadas por desastres naturais**, principalmente **danos causados pela chuva no Brasil** e **necessidades enfrentadas no período de frio**.

A iniciativa busca mapear e prestar assistência a:
- Pessoas com deficiência
- Famílias com animais
- Famílias em situação de vulnerabilidade

Além disso, oferece um **formulário para cadastro de voluntários**, permitindo que mais pessoas contribuam com a nossa causa.
---

## 📋 Funcionalidades

- 📄 Formulário para mapear pessoas necessitadas
- 🐶 Identificação de famílias com animais
- ♿ Inclusão de pessoas com deficiência
- 🧤 Ajuda emergencial em tempos de frio
- 🙋 Cadastro de voluntários
  
---

  🧪 Acesso ao Swagger
Acesse a documentação da API no Swagger:

🔗 http://localhost:8080/swagger-ui/index.html

---

## 🚀 Como rodar o projeto localmente

1. **Clone o repositório**:

```bash
git clone https://github.com/codecrazes/GS_JAVA.git

```

2. **Execute o projeto**:

```bash
mvnw spring-boot:run
cd GS_JAVA
```
📁 Exemplos de Requisições JSON

Formulário familia 

```json
{
  "nomeResponsavel": "João Carlos Fernandes",
  "cpf": "987.654.321-00",
  "telefone": "(11) 99876-5432",
  "endereco": {
    "rua": "Avenida Brasil",
    "numero": "789",
    "bairro": "Jardim Paulista",
    "cidade": "São Paulo",
    "cep": "04567-890",
    "estado": "SP",
    "complemento": "Apto 42, Bloco B"
  },
  "possuiDeficiencia": true,
  "tipoDeficiencia": "Motora",
  "quantidadePessoas": 6,
  "quantidadeCriancas": 3,
  "possuiAnimais": true,
  "animais": [
    {
      "especie": "Gato",
      "nome": "Mimi",
      "idade": 2,
      "precisaAjudaVeterinaria": false
    },
    {
      "especie": "Cachorro",
      "nome": "Thor",
      "idade": 8,
      "precisaAjudaVeterinaria": true
    }
  ],
  "necessidade": "Roupas de frio, alimentos não perecíveis e ração para animais"
}

```
🔄 Exemplo de Atualização de Formulário
  ```json
{
  "id": 1,
  "nomeResponsavel": "Maria Aparecida Lopes",
  "cpf": "123.456.789-00",
  "telefone": "(11) 98765-4321",
  "endereco": {
    "rua": "Rua das Flores",
    "numero": "123",
    "bairro": "Vila Nova",
    "cidade": "Guarulhos",
    "cep": "07010-000",
    "estado": "SP",
    "complemento": "Casa térrea"
  },
  "possuiDeficiencia": false,
  "tipoDeficiencia": null,
  "quantidadePessoas": 4,
  "quantidadeCriancas": 2,
  "possuiAnimais": true,
  "animais": [
    {
      "id": 1,
      "especie": "Cachorro",
      "nome": "Luna",
      "idade": 5,
      "precisaAjudaVeterinaria": false
    },
    {
      "id": 2,
      "especie": "Pássaro",
      "nome": "Pipoca",
      "idade": 1,
      "precisaAjudaVeterinaria": false
    }
  ],
  "necessidade": "Cobertores, leite em pó e ajuda com transporte"
}

  ```

🙋 Cadastro de Voluntário

  ```json
{
  "nomeCompleto": "João da Silva",
  "telefone": "(11) 91234-5678",
  "tipoAjuda": "Distribuição de alimentos",
  "disponibilidade": "Seg a Sex - Tarde",
  "cidade": "São Paulo",
  "relatorios": [
    {
      "tipoAjuda": "Entrega de cestas",
      "descricao": "Entreguei 10 cestas básicas na zona leste",
      "data": "2025-06-08"
    }
  ]
}
```

🔄 Exemplo de Atualização de Voluntário

  ```json
{
  "id": 1,
  "nomeCompleto": "Joana Ferreira Lima",
  "telefone": "(11) 99888-7766",
  "tipoAjuda": "Apoio psicológico",
  "disponibilidade": "Fins de semana - Manhã",
  "cidade": "Guarulhos",
  "relatorios": [
    {
      "id": 1,
      "tipoAjuda": "Atendimento emocional",
      "descricao": "Conversei com 8 pessoas afetadas pelas enchentes",
      "data": "2025-06-07"
    },
    {
      "tipoAjuda": "Encaminhamento a psicólogos",
      "descricao": "Encaminhei 5 pessoas para acompanhamento gratuito",
      "data": "2025-06-08"
    }
  ]
}

```

