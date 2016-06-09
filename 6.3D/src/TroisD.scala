/**
  * Created by User on 2016-06-09.
  */
object TroisD {
  def main(args: Array[String]) {
    println("3D")



      val  cube = new geometrie.Cube (9)

      println(s"Cube Volume: ${cube.volume()}")

      cube.translation(0,5)

    // Appel Constructeur
    val  sphere = new geometrie.Sphere (9, -1)

    println(s"Sphere Volume: ${sphere.volume()}")

    // access avec Accesseur
    println(s"Sphere Rayon: ${sphere.rayon}")

    // access prive erreur
    //  println(s"Sphere complex: ${sphere.complex}")

  }
}
