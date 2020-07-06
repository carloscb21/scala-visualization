/*
 * The original author is CCB, 2020.
 */

package ccb.plots

import vegas.DSL.Vegas
import vegas.spec.Spec.{DataFormatTypeEnums, Legend}
import ccb.utilities.Variables.{LabelsLegend, LabelsRowXY, LabelsXY, VegasLegendTypes, VegasRowTypes, VegasTypes}
import ccb.utilities.Labels.API


/**
 * Additional methods to plots graphs
 */
object Api {


  /**
   * Plot the graph from an external api
   * @param api String that contains url from api
   * @param vegasTypes Case class that contains type of graph, type of encodeX and type of encodeY
   * @param labelsXY Case class that contains variables that the x-axis and y-axis names
   * @return Plot graph
   */
  def apply(api: String, vegasTypes: VegasTypes, labelsXY: LabelsXY): Unit = {
    Vegas(API).withURL(api, DataFormatTypeEnums.Json).
      encodeX(labelsXY.labelX, vegasTypes.typeX).encodeY(labelsXY.labelY, vegasTypes.typeY).
      mark(vegasTypes.graph).
      show
  }


  /**
   * Plot the graph to label row plots from an external api
   * @param api String that contains url from api
   * @param vegasTypes Case class that contains type of graph, type of encodeRow, type of encodeX and type of encodeY
   * @param labelsXY Case class that contains variables that the labelRow, x-axis and y-axis names
   * @return Plot graph
   */
  def withThreeVariables(api: String, vegasTypes: VegasRowTypes, labelsXY: LabelsRowXY): Unit = {
    Vegas(API).withURL(api, DataFormatTypeEnums.Json).
      encodeX(labelsXY.labelX, vegasTypes.typeX).encodeY(labelsXY.labelY, vegasTypes.typeY).
      encodeRow(labelsXY.labelRow, vegasTypes.typeRow, enableBin = true).
      mark(vegasTypes.graph).
      show
  }


  /**
   * Plot the graph with legend from an external api
   * @param api String that contains url from api
   * @param vegasTypes Case class that contains type of graph, type of encodeX, type of encodeY and dataType
   * @param labelsXY Case class that contains variables that necessary features and the x-axis and y-axis names
   * @return Plot graph
   */
  def withLegend(api: String, vegasTypes: VegasLegendTypes, labelsXY: LabelsLegend): Unit = {
    Vegas(API).withURL(api, DataFormatTypeEnums.Json).
      encodeX(labelsXY.labelX, vegasTypes.typeX).encodeY(labelsXY.labelY, vegasTypes.typeY).
      mark(vegasTypes.graph).
      encodeColor(field = labelsXY.field, dataType = vegasTypes.dataType, legend=Legend(orient = Option(labelsXY.orient),
        title=Option(labelsXY.title))).
      encodeShape(field = labelsXY.field, dataType = vegasTypes.dataType, legend=Legend(orient = Option(labelsXY.orient),
        title=Option(labelsXY.title),
        titleColor= Option(labelsXY.titleColor))).
      show
  }

}
