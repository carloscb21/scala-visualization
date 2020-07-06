/*
 * The original author is CCB, 2020.
 */

package ccb.plots

import ccb.utilities.Labels.DICT
import ccb.utilities.Variables.{LabelsXY, VegasTypes}
import vegas.DSL.Vegas

object Dictionary {

  /**
   * Plot the graph from an sequences of dictionary data
   * @param data Sequences of Dictionary of String and Any
   * @param vegasTypes Case class that contains type of graph, type of encodeX and type of encodeY
   * @param labelsXY Case class that contains variables that the x-axis and y-axis names
   * @return Plot graph
   */
  def apply(data: Seq[Map[String, Any]], vegasTypes: VegasTypes, labelsXY: LabelsXY): Unit = {
    Vegas(DICT).withData(data).
      encodeX(labelsXY.labelX, vegasTypes.typeX).
      encodeY(labelsXY.labelY, vegasTypes.typeY).
      mark(vegasTypes.graph).show
  }

}
