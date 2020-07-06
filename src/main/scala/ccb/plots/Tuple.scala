/*
 * The original author is CCB, 2020.
 */

package ccb.plots

import ccb.utilities.Labels.{SEQ, X, Y}
import ccb.utilities.Variables.VegasTypes
import vegas.DSL.Vegas

object Tuple {

  /**
   * Plot the graph from an sequences of dictionary data
   * @param data Sequences of tuple of String and Int
   * @param vegasTypes Case class that contains type of graph, type of encodeX and type of encodeY
   * @return Plot graph
   */
  def apply(data: Seq[(String, Int)], vegasTypes: VegasTypes): Unit = {
    Vegas(SEQ).withXY(data).
      encodeX(X, vegasTypes.typeX).
      encodeY(Y, vegasTypes.typeY).
      mark(vegasTypes.graph).show
  }

}
