package daily

/**
 * Created by IntelliJ IDEA.
 * User: hellochar
 * Date: 6/12/11
 * Time: 8:50 PM
 * To change this template use File | Settings | File Templates.
 */
import processing.core._
import org.zhang.geom._
import org.zhang.lib.P5Util

class Jun12c extends PApplet {


  var loc:Vec2 = _
  override def setup() {
    size(800, 600)
    loc = Vec2(width/2, height/2)

  }

  override def draw() {
//    background(255)
    val last = loc.clone()
    loc += Vec2(random(-5, 5), random(-5, 5))
    P5Util.line(this, last, loc)
  }

}