fun main(args: Array<String>) {
    println("gu@gmail.com.br".removeEspecialChars(specil = "@"))


    val concessionaria: Concessionaria = Concessionaria(
             "",  null, ""
    )
    concessionaria.nome = "G-CAR"
    println(concessionaria.nome)

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    // println("Program arguments: ${args.joinToString()}")
}