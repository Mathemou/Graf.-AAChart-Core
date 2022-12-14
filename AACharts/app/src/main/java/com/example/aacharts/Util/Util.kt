package com.example.aacharts.Util

import com.example.aacharts.R
import com.github.aachartmodel.aainfographics.aachartcreator.*

class Util {
    companion object {
        public fun gerarModelGraficoArea(array: Array<Any>, titulo : String, background : String, label : Boolean, grafColor : String): AAChartModel {

            val aaChartModel: AAChartModel = AAChartModel()
                .chartType(AAChartType.Area)
                .backgroundColor(background)
                .dataLabelsEnabled(label)
                .series(
                    arrayOf(
                        AASeriesElement()
                            .name(titulo)
                            .data(array)
                            .color(grafColor)
                    )
                )
                .zoomType(AAChartZoomType.XY)
                .yAxisTitle("Horas")

            return aaChartModel
        }

        fun gerarModelGraficoAreaDuplo(
            array1: Array<Any>,
            array2: Array<Any>,
            titulo: String,
            subtitulo: String,
            background: String,
            label: Boolean,
            graf1Color : String,
            graf2Color : String
        ): AAChartModel {
            val aaChartModel: AAChartModel = AAChartModel()
                .chartType(AAChartType.Area)
                .backgroundColor(background)
                .dataLabelsEnabled(label)
                .series(
                    arrayOf(
                        AASeriesElement()
                            .name("Guiguer")
                            .data(array1)
                            .color(graf1Color),
                        AASeriesElement()
                            .name("Maradona")
                            .data(array2)
                            .color(graf2Color)
                    )

                )
                .zoomType(AAChartZoomType.XY)
                .yAxisTitle("Horas")
            return aaChartModel
        }


    }
}