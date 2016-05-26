package geometrie

/**
  * Created by User on 2016-05-18.
  */
class Point(var x:Int , var y :Int ) {

  def translation (dx:Int,dy: Int): Unit = {
    x = x + dx
    y = y + dy
  }

 override def toString():String = s"($x,$y)"
}

 abstract class Figure {

  def aire ( ):Int

 }

class Carre (cote :Int) extends {
  def aire(): Int = cote * cote

}
class Rectangle(long:Int,largeur :Int) extends {
  def aire(): Int = long * largeur

}