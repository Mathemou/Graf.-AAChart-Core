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

        val aaChartView = findViewById<AAChartView>(R.id.aa_chart_view)

        val aaChartModel : AAChartModel = AAChartModel()
            .chartType(AAChartType.Pie)
            .title("Problemas")
            .subtitle("Veículos com problemas nos últimos 30 dias")
            .backgroundColor("#b6c0dd")
            .dataLabelsEnabled(true)
            .series(arrayOf(
                AASeriesElement()
                    .name("Torta")
                    .data(arrayOf(7.0, 6.9, 9.5, 14.5, 18.2, 21.5, 25.2, 26.5, 23.3, 18.3, 13.9, 9.6))

            )
            )

        aaChartView.aa_drawChartWithChartModel(aaChartModel)
    }
}