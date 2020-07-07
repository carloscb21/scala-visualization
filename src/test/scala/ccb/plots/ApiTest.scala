///*
// * The original author is CCB, 2020.
// */
//
//package ccb.plots
//
//import org.scalatest.FunSuite
//import ccb.utilities.Variables.{LabelsLegend, LabelsRowXY, LabelsXY, VegasLegendTypes, VegasRowTypes, VegasTypes}
//import vegas.data.External.Cars
//import vegas.spec.Spec.MarkEnums.Area
//import vegas.spec.Spec.TypeEnums.{Nominal, Quantitative}
//
//class ApiTest extends FunSuite {
//  val horsePower: String = "Horsepower"
//  val milesPerGallon: String = "Miles_per_Gallon"
//  val Origin: String = "Origin"
//
//
//  test("Test Api default"){
//    val labelsXY: LabelsXY = LabelsXY(horsePower, milesPerGallon)
//    val vegasTypes: VegasTypes = VegasTypes(Area, Quantitative, Quantitative)
//    assert(Api(Cars, vegasTypes, labelsXY).toString.nonEmpty)
//  }
//
//
//  test("Test Api Legend"){
//    val labelsLegendXY: LabelsLegend = LabelsLegend(horsePower, milesPerGallon, Origin, "left", Origin, "red")
//    val vegasTypesLegend: VegasLegendTypes = VegasLegendTypes(Area, Quantitative, Quantitative, Nominal)
//    Api.withLegend(Cars, vegasTypesLegend, labelsLegendXY)
//    assert(Api.withLegend(Cars, vegasTypesLegend, labelsLegendXY).toString.nonEmpty)
//  }
//
//
//  test("Test Api three variables"){
//    val labelsRowXY: LabelsRowXY = LabelsRowXY(horsePower, milesPerGallon, "Acceleration")
//    val vegasTypesRow: VegasRowTypes = VegasRowTypes(Area, Quantitative, Quantitative, Quantitative)
//    Api.withThreeVariables(Cars, vegasTypesRow, labelsRowXY)
//    assert(Api.withThreeVariables(Cars, vegasTypesRow, labelsRowXY).toString.nonEmpty)
//  }
//
//}
