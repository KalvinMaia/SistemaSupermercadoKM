# SistemaSupermercadoKM

Este repositório trata da estrutura de um sistema de gerenciamento de compras para um supermercado, escrito na linguagem de programação Java, mediante o uso do Eclipse IDE for Java Developers. Este projeto esta associado à disciplina Linguagem de Programação II, do Bacharelado em Tecnologia da Informação (BTI), do Instituto Metrópole Digital (IMD), da UFRN; e se propõe a efetivar conceitos sólidos de **Programação Orientada a Objetos**, como herança, polimorfismo e encapsulamento.

## Funcionalidades

* **Gestão de Fornecedores:** Cadastro de empresas com NIF e país de origem.
* **Diversidade de Produtos:** Suporte para diferentes categorias (Alimentícios e Eletrônicos) com regras de precificação distintas.
* **Cálculo Automático de Preços:** Ajustes dinâmicos baseados em taxas, validade e tempo de garantia.
* **Processamento de Carrinho:** Geração de talão de compra com resumo detalhado e somatório total.

---

## Estrutura das Classes

O sistema foi desenhado para ser extensível. Abaixo, a hierarquia de classes principal:


### Descrição dos Arquivos

| Arquivo | Função |
| :--- | :--- |
| `Main.java` | Ponto de entrada do sistema. Orquestra a criação de objetos e a execução da compra. |
| `Produto.java` | **Classe Abstrata** que serve de base para todos os produtos. Define o contrato para cálculo de preço. |
| `ProdutoAlimenticio.java` | Especialização para alimentos. Inclui lógica de desconto por validade. |
| `ProdutoEletronico.java` | Especialização para eletrônicos. Inclui lógica de acréscimo por garantia estendida. |
| `Fornecedor.java` | Armazena dados do fabricante/distribuidor associado a cada produto. |
| `CarrinhoDeCompras.java` | Gerencia uma lista de produtos e processa o fechamento da conta. |

---

## Regras de Negócio (Precificação)

O sistema aplica diferentes fórmulas para chegar ao valor final de um item:

### Produto Alimentício
1.  **Taxa Padrão:** O preço base recebe um acréscimo de **20%**.
2.  **Promoção de Validade:** Se o produto vencer em **5 dias ou menos**, aplica-se um **desconto de 30%** sobre o valor taxado.

### Produto Eletrônico
1.  **Taxa Padrão:** O preço base recebe um acréscimo de **50%** (impostos/logística).
2.  **Garantia Premium:** Se a garantia for superior a **12 meses**, há um acréscimo de **15%** no valor final.

---

## Como Executar

1.  Certifique-se de ter o **JDK 8 ou superior** instalado.
2.  Clone o repositório ou baixe os arquivos.
3.  Compile os arquivos `.java`:
    ```bash
    javac supermercadoKM/*.java
    ```
4.  Execute a classe principal:
    ```bash
    java supermercadoKM.Main
    ```

### Exemplo de Saída no Console:
===== TALÃO DE COMPRA =====
Produto: Leite
Fornecedor: Fazenda Local
NIF: 123456
País: Brasil
Preço base: R$ 15.0
Preço final: R$ 12.6
--------------------------
Produto: Notebook
Fornecedor: TechGlobal
NIF: 987654
País: EUA
Preço base: R$ 3000.0
Preço final: R$ 5175.0
--------------------------
TOTAL A PAGAR: R$ 5187.6
> ```

---

## Conceitos de Programação Orientada a Objetos Aplicados

* **Abstração:** A classe `Produto` não pode ser instanciada diretamente, servindo apenas como modelo.
* **Polimorfismo:** O `CarrinhoDeCompras` trata todos os itens como `Produto`, mas cada um executa seu próprio método `calcularPrecoFinal()`.
* **Encapsulamento:** Uso de atributos privados e métodos `get/set` para proteção de dados em `Fornecedor`.
