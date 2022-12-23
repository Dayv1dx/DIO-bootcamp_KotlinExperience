# Desafio dos números romanos
Os algarismos romanos são representados por sete símbolos diferentes: I, V, X, L, C, D e M. Cada um com seu respectivo valor:

I : 1    <br>
V : 5    <br>
X : 10   <br>
L : 50   <br>
C : 100  <br>
D : 500  <br>
M : 1000 <br>

Eles são geralmente escritos do maior para o menor. Porém, para escrevermos “4” não usamos “IIII”, mas sim “IV” porque 5 - 1 = 4.

Você receberá uma entrada em numeral romano e deverá imprimi-lo convertido em um número inteiro. 

## Solução: 
~~~ kotlin
fun main() {
    val numeroRomano: String? = readLine()
    
    val numerosRomanos = mapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
    )
  	var resultado = 0
    //TODO("Criar uma variável mutável para armazenar o $resultado")
    for (i in numeroRomano!!.indices) {
        // Recupera o valor em romano do indice atual. 
        val atual = numerosRomanos.getValue(numeroRomano[i])
        // Recupera o valor em romano do próximo indice (caso exista).
        val proximo = when (i + 1) {
            // Caso o próximo indice não exista, atribui 0 à variável $proximo.
            numeroRomano.length -> 0 
            // Caso contrário, atribui o valor em romano equivalente ao próximo indice.
            else -> numerosRomanos.getValue(numeroRomano[i + 1])
        }
        if (resultado==0 && atual>=proximo){
            resultado = atual+proximo
      }
        else if (resultado!=0 && atual<proximo){
            resultado = (resultado - atual + (proximo-atual))
            }
        else if (resultado==0 && atual<proximo){
            resultado = proximo-atual
           }
        else if (resultado!=0 && atual>=proximo){
            resultado = resultado + proximo
        }
 
    }
            println("$resultado")
}
~~~
