/*
 * The original author is CCB, 2020.
 */

package ccb.plots

import ccb.utilities.Variables._
import org.scalatest.FunSuite
import vegas.spec.Spec.MarkEnums.{Area, Bar}
import vegas.spec.Spec.TypeEnums.{Nominal, Quantitative}
import org.scalatest.{FlatSpec, Matchers}

class DictionaryTest extends FlatSpec with Matchers {
  val country: String = "Country"
  val population: String = "Population"
  val labelsXY: LabelsXY = LabelsXY(country, population)
  val dict1: Map[String, Any] = Map(country -> "CA", population -> 314)
  val dict2: Map[String, Any] = Map(country -> "PE", population -> 64)
  val dict3: Map[String, Any] = Map(country -> "GE", population -> 80)
  val seq: Seq[Map[String, Any]] = Seq(dict1, dict2, dict3)


  "Test Dictionary default" should "non empty string" in {
    val vegasTypes: VegasTypes = VegasTypes(Area, Quantitative, Quantitative)
    assert(Dictionary(seq, vegasTypes, labelsXY).toString.nonEmpty)
  }

//  test("Test Dictionary default"){
//    val vegasTypes: VegasTypes = VegasTypes(Area, Quantitative, Quantitative)
//    assert(Dictionary(seq, vegasTypes, labelsXY).toString.nonEmpty)
//  }

}
