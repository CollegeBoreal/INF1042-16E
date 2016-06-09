package geometrie

/**
  * Created by User on 2016-06-09.
  */
trait Figure3D {
  def volume(): Int
}

class Cube  (cote :Int) extends Figure3D with Point {
  def volume(): Int = cote * cote *cote
  def translation (dx:Int,dy: Int): Unit = dx + cote
}

class Prisme (base :Int,hauteur1 :Int,hauteur2:Int) extends Figure3D {
  def volume(): Int = base * hauteur1 / 2 * hauteur2
}

class Sphere (val rayon:Int, private val complex: Int) extends Figure3D {
  def volume () :Int  = math.Pi.toInt*rayon*rayon*rayon*4/3+complex

}

trait Point {

  def translation (dx:Int,dy: Int): Unit

}