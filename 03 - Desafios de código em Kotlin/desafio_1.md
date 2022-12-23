# Desafio da média
Faça um programa que receba:

- Caso a média seja < 5 imprima "REP";<br>
- Caso a média seja >= 5 e < 7 imprima "REC";<br>
- Caso a média seja >7 imprima "APR".

A entrada consiste em vários arquivos de teste, cada um com uma linha, que conterá o valor da média do aluno. Conforme mostrado no exemplo de entrada a seguir.

Para cada arquivo da entrada, terá um arquivo de saída. E como mencionado no Desafio, será gerado uma linha com a palavra "Reprovado" caso sua média seja < 5, "Recuperação" caso sua média seja >= 5 e < 7 e "Aprovado" caso a média seja > 7. Use o exemplo abaixo para clarear o que está sendo pedido.
## Solução:
~~~ kotlin
fun main() {
    val media = readLine()!!.toDouble();
    
    when {
          media < 5 -> println("REP")
          media >= 5 && media < 7 -> println("REC")
          else -> println("APR")
    }
 }
 ~~~ 