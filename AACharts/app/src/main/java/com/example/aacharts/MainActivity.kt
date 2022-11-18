package com.example.aacharts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartType
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartView
import com.github.aachartmodel.aainfographics.aachartcreator.AASeriesElement

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//
//
//
//        val outubroNovembroGuiguer : Array<Any> = arrayOf(0, 0, 0, 4, 8.5, 2.5, 9, 0, 1, 2, 2, 4, 2.5, 7.5, 0, 3.5, 0, 4, 5, 6.5, 4, 0, 7, 8, 0, 0, 2, 0, 0, 0, 0)
//
//        val aaChartViewGuiguer = findViewById<AAChartView>(R.id.grafico_horas_outubro_guiguer)
//
//        val aaChartModelGuiguer : AAChartModel = AAChartModel()
//            .chartType(AAChartType.Area)
//            .title("Horas trabalhadas por dia")
//            .subtitle("Média de 4 horas por dia")
//            .backgroundColor("#b6c0dd")
//            .dataLabelsEnabled(false)
//            .series(arrayOf(
//                AASeriesElement()
//                    .name("Horas")
//                    .data(outubroNovembroGuiguer)
//            )
//            )
//
//        aaChartViewGuiguer.aa_drawChartWithChartModel(aaChartModelGuiguer)
//
//        val Vendas : Array<Any> = arrayOf(0, 0, 0, 4, 8.5, 2.5, 9, 0, 1, 2, 2, 4, 2.5, 7.5, 0, 3.5, 0, 4, 5, 6.5, 4, 0, 7, 8, 0, 0, 2, 0, 0, 0, 0)
//
//        val aaChartViewVendas = findViewById<AAChartView>(R.id.vendas)
//
//        val aaChartModelVendas : AAChartModel = AAChartModel()
//            .chartType(AAChartType.Area)
//            .title("Horas trabalhadas por dia")
//            .subtitle("Média de 4 horas por dia")
//            .backgroundColor("#b6c0dd")
//            .dataLabelsEnabled(false)
//            .series(arrayOf(
//                AASeriesElement()
//                    .name("Horas")
//                    .data(Vendas)
//            )
//            )
//
//        aaChartViewVendas.aa_drawChartWithChartModel(aaChartModelVendas)
    }
}