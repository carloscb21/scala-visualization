/*
 * The original author is CCB, 2020.
 */

package ccb

import vegas.DSL.Vegas
import vegas.DSL.ExtendedUnitSpecBuilder
import vegas.spec.Spec.DataFormatTypeEnums
import vegas.spec.Spec.MarkEnums.Bar
import vegas.spec.Spec.TypeEnums.{Nominal, Quantitative}

/**
 * Examples by web: https://github.com/vegas-viz
 */
object Example {

  private final val x: String = "x"
  private final val y: String = "y"

  /**
   * Example of dictionary data
   * @return Plot graph
   */
  def exampleWithData(): Unit = {
    val country: String = "Country"
    val population: String = "Population"
    val dict1: Map[String, Any] = Map(country -> "CA", population -> 314)
    val dict2: Map[String, Any] = Map(country -> "PE", population -> 64)
    val dict3: Map[String, Any] = Map(country -> "GE", population -> 80)

    val plot: ExtendedUnitSpecBuilder = Vegas("With Data").
      withData(
        Seq(
          dict1,
          dict2,
          dict3
        )
      ).
      encodeX(country, Nominal).
      encodeY(population, Quantitative).
      mark(Bar)

    plot.show
  }

  /**
   * Example of Integer values
   * @return Plot graph
   */
  def exampleWithValues(): Unit = {
    val value1: Int = 100
    val value2: Int = 500
    val value3: Int = 1000
    val plot: ExtendedUnitSpecBuilder = Vegas("With Values").
      withValues(
        Seq(
          value1,
          value2,
          value3
        )
      ).
      // By definition must be "x" and "y"
      encodeX(x, Nominal).
      encodeY(y, Quantitative).
      mark(Bar)

    plot.show
  }


  /**
   * Example of tuple values
   * @return Plot graph
   */
  def exampleWithXY(): Unit = {
    val tuple1: (String, Int) = ("USA", 314)
    val tuple2: (String, Int) = ("UK", 60)
    val tuple3: (String, Int) = ("DK", 14)
    val plot: ExtendedUnitSpecBuilder = Vegas("With XYs").
      withXY(
        Seq(
          tuple1,
          tuple2,
          tuple3
        )
      ).
      // By definition must be "x" and "y"
      encodeX(x, Nominal).
      encodeY(y, Quantitative).
      mark(Bar)

    plot.show
  }


  /**
   * Example of tuple of integer
   * @return Plot graph
   */
  def exampleWithXYIntInt(): Unit = {
    val tuple1: (Int, Int) = (1, 314)
    val tuple2: (Int, Int) = (2, 60)
    val tuple3: (Int, Int) = (3, 14)
    val plot: ExtendedUnitSpecBuilder = Vegas("With XY").
      withXY(
        Seq(
          tuple1,
          tuple2,
          tuple3
        )
      ).
      // By definition must be "x" and "y"
      encodeX(x, Quantitative).
      encodeY(y, Quantitative).
      mark(Bar)

    plot.show
  }

  /**
   * Example of json from api
   * @return Plot graph
   */
  def exampleWithUrl(): Unit = {
    val url = "https://api.github.com/repositories/19438/issues"
    val plot: ExtendedUnitSpecBuilder = Vegas("With URL").
      withURL(url, DataFormatTypeEnums.Json
      ).
      encodeX("url", Nominal).
      encodeY("number", Quantitative).
      mark(Bar)

    plot.show
  }

}
