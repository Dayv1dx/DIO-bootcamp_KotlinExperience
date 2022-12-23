enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

class Usuario (val nome: String,val sobrenome: String, val email: String)

data class ConteudoEducacional(val nome: String, val duracaoHoras: Int)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>, val nivel: Nivel) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
      	inscritos.add(usuario)
        //println("O usuário ${usuario.nome} foi matriculado")
    }
    
    fun listarUsuarios(){
        for(usuario in inscritos){
            println("Nome: ${usuario.nome+ " " + usuario.sobrenome} | e-mail: ${usuario.email}")
        }
    }
    
    fun listarConteudos(){
        for(conteudo in conteudos){
            println(" - ${conteudo.nome} (${conteudo.duracaoHoras}h)")
        }
    }
}

fun main() {
   
    val aluno_1 = Usuario("Dayvid","Cunha", "dayvid@gmail.com")
    val aluno_2 = Usuario("Mirelly","Cunha","mirelly@gmail.com")
    val aluno_3 = Usuario("José Pedro","Oliveira", "jpedro@gmail.com")
    
    val curso_Java = ConteudoEducacional("Curso de Java", 10)
    val curso_Kotlin = ConteudoEducacional("Curso de Kotlin", 10)
    val curso_Git_Github = ConteudoEducacional("Introdução ao Git e GitHub", 10)
    
    val lista_conteudosBasicos = mutableListOf<ConteudoEducacional>()
    	lista_conteudosBasicos.add(curso_Git_Github)
        lista_conteudosBasicos.add(curso_Java)
        lista_conteudosBasicos.add(curso_Kotlin)
    
    val treinamentoAndroid_basico = Formacao("Curso Desenvolvimento Android: Módulo 1",
                                             lista_conteudosBasicos,
                                             Nivel.BASICO)
    
    val curso_Java_POO = ConteudoEducacional("POO em Java", 25)
    val curso_Kotlin_POO = ConteudoEducacional("POO em Kotlin", 25)
    val curso2_Git_Github = ConteudoEducacional("Trabalhando com Git e Gitlab na prática", 20)
    
    val lista_conteudosInter = mutableListOf<ConteudoEducacional>()
    	lista_conteudosInter.add(curso2_Git_Github)
        lista_conteudosInter.add(curso_Java_POO)
        lista_conteudosInter.add(curso_Kotlin_POO)
        
    val treinamentoAndroid_intermediario = Formacao("Curso Desenvolvimento Android: Módulo 2",
                                             lista_conteudosInter,
                                             Nivel.INTERMEDIARIO)
       
    
    treinamentoAndroid_basico.matricular(aluno_2)
    treinamentoAndroid_basico.matricular(aluno_3)
    treinamentoAndroid_intermediario.matricular(aluno_1)
   
    println("${treinamentoAndroid_basico.nome} - ${treinamentoAndroid_basico.nivel}\n")
    println("Grade do curso:\n")
    println(treinamentoAndroid_basico.listarConteudos())
    
    println("Alunos matriculados:\n")
    
    println(treinamentoAndroid_basico.listarUsuarios())
    println("-----------------------------------------\n")
    
    println("${treinamentoAndroid_intermediario.nome} - ${treinamentoAndroid_intermediario.nivel}\n")
    println("Grade do curso:\n")
    println(treinamentoAndroid_intermediario.listarConteudos())
    println("Alunos matriculados:\n")
    
    println(treinamentoAndroid_intermediario.listarUsuarios())
    
    
    
    
    
}