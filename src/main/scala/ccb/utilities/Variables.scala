/*
 * The original author is CCB, 2020.
 */

package ccb.utilities

import vegas.spec.Spec


/**
 * Variables that will be used to respect the sonar style and consistent with code clean
 */
object Variables {


  /**
   * Trait of minimum labels of graph
   */
  trait Labels {
    def labelX: String
    def labelY: String
  }


  /**
   * Trait of minimum of spec types to generate the graph
   */
  trait SpecTypes {
    def graph: Spec.Mark
    def typeX: Spec.Type
    def typeY: Spec.Type
  }


  /**
   * Stores variables needed by the graphics of the vegas library
   * @return Case class
   */
  case class VegasTypes(graph: Spec.Mark, typeX: Spec.Type, typeY: Spec.Type) extends SpecTypes


  /**
   * Stores variables that the x-axis and y-axis names
   * @return Case class
   */
  case class LabelsXY(labelX: String, labelY: String) extends Labels


  /**
   * Stores variables needed by the graphics of the vegas library
   * @return Case class
   */
  case class VegasRowTypes(graph: Spec.Mark, typeX: Spec.Type, typeY: Spec.Type, typeRow:Spec.Type) extends SpecTypes


  /**
   * Stores variables that the label row, x-axis and y-axis names
   * @return Case class
   */
  case class LabelsRowXY(labelX: String, labelY: String, labelRow: String) extends Labels

  /**
   * Stores variables that the field legend, features to legend, x-axis and y-axis names
   * @return Case class
   */
  case class LabelsLegend(labelX: String, labelY: String, field: String, orient: String, title: String, titleColor: String)
    extends Labels


  /**
   * Stores variables needed by the graphics with legend of the vegas library
   * @return Case class
   */
  case class VegasLegendTypes(graph: Spec.Mark, typeX: Spec.Type, typeY: Spec.Type, dataType: Spec.Type) extends SpecTypes
}

