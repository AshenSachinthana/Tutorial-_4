object Q3{
    def main(args: Array[String]): Unit={

        println(formatNames("Benny", toUpper))
        println(formatNames("Ni", toUpper) + "roshan")
        println(formatNames("Saman", toLower))
        println("Kumar" +formatNames("a",toUpper))
    }

    def toUpper(name: String): String = {
    name.toUpperCase()
    }

    def toLower(name: String): String = {
    name.toLowerCase()
    }

    def formatNames(name: String, formatFunc: String => String): String = {
    formatFunc(name)
    }
}



