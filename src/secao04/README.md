# Seção 04 - Outros tópicos básicos sobre Java
## O que aprendi
- Restrições e convenções para nomes
- Operadores bitwise
- Funções interessantes para String
- Comentários em Java (básico)
- Funções (sintaxe)

## Conceitos-chave
```java
public static tipoRetorno nomeDaFuncao(tipo param1, tipo param2) { ... }

/* Modificadores (public static): public permite que outras partes do código acessem a função.
O static é necessário enquanto você estiver chamando suas funções diretamente de dentro do
main (que também é static ).

Tipo de Retorno: Indica o tipo de dado que a função vai devolver no final ( int , double ,
String , boolean ) ou void se ela não devolver nada.

Nome da Função: Por convenção em Java, começa com letra minúscula e usa camelCase (ex:
calcularMedia , exibirMenu ).

Parâmetros (Entrada): Variáveis que ficam entre parênteses para receber dados de fora. Se não
precisar de nada, deixe os parênteses vazios () .
 */

```
## Exercícios
- [Exercicio01.java](Exercicio01.java): Retorna o maior valor digitado.
- [Exerccicio02.java](Exercicio02.java): Leia as três notas de um aluno e mostre a média e a situação dele (aprovado ou reprovado). A média mínima para aprovação é 6.0.
- [Exercicio02a.java](Exercicio02a.java): Função simples com retorno.
- [Exercicio03.java](Exercicio03.java): Leia três números inteiros e mostre o maior. Desta vez, uma função reaproveita a outra, e é isso que treina a passagem de parâmetros.
- [Exercicio04.java](Exercicio04.java): Leia três números inteiros e mostre quantos deles são pares.
- [Exercicio05.java](Exercicio05.java): Leia o preço unitário de um produto e a quantidade comprada. Se o total for 100 ou mais, o cliente ganha 10% de desconto. Mostre o total, o desconto e o valor final.