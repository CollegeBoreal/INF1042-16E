import geometrie.{Carre, Point}

object Hi {
  def main(args: Array[String]) = {
    val a = new Point(0,1)
    println(s"a: $a")

    val b = new Point (4,1)
    println (s"b: $b")

    b.translation(0,2)
    println(s"b: $b")
    println(a)

    a.translation(2,1)
    println(s"a:$a")

    val  carre = new geometrie.Carre (9)

    println(s"carre: ${carre.aire()}")

    val carreBX = new Carre(b.x)
    println(s"aire bx: ${carreBX.aire()}")


    val  rectangle = new geometrie.Rectangle(10,5)
    println(s"Rectangle : ${rectangle.aire()}" )

    val cercle = new geometrie.Cercle(20)
    println(s"Cercle : ${cercle.aire()}")


}
}

