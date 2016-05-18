package geometrie

/**
  * Created by User on 2016-05-18.
  */
class Point(var x:Int , var y :Int ) {

  def deplacer (dx:Int,dy: Int): Unit = {
    x = x + dx
    y = y + dy
  }

 override def toString():String = s"($x,$y)"
}
