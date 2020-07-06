/*
 * The original author is CCB, 2020.
 */

package ccb.plots

import ccb.utilities.Variables._
import org.scalatest.FunSuite
import vegas.spec.Spec.MarkEnums.Area
import vegas.spec.Spec.TypeEnums.Quantitative

class TupleTest extends FunSuite {
  val tuple1: (String, Int) = ("USA", 314)
  val tuple2: (String, Int) = ("UK", 60)
  val tuple3: (String, Int) = ("DK", 14)
  val seq: Seq[(String, Int)] = Seq(tuple1, tuple2, tuple3)

  test("Test Tuple default"){
    val vegasTypes: VegasTypes = VegasTypes(Area, Quantitative, Quantitative)
    assert(Tuple(seq, vegasTypes).toString.nonEmpty)
  }

}
