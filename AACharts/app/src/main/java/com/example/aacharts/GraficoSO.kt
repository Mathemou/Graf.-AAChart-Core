package com.example.aacharts

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.github.aachartmodel.aainfographics.aachartcreator.*
import com.github.aachartmodel.aainfographics.aatools.AAColor

private const val ARG_PARAM1 = "param1"
class GraficoSO : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view =  inflater.inflate(R.layout.fragment_grafico_s_o, container, false)
        val aaChartView = view?.findViewById<AAChartView>(R.id.grafico_so)
        val soNames = arrayOf(
            "Linux",
            "Mac",
            "Windows"
        )

        val colorsArr = arrayOf<Any>(
            AAColor.Green,
            AAColor.Cyan,
            AAColor.Blue,
            AAColor.Purple,
            AAColor.Gray,
            AAColor.DarkGray,
            AAColor.LightGray,
            AAColor.Magenta,
            AAColor.Brown,
            AAColor.Black,
        )
        val aaChartModel: AAChartModel = AAChartModel()
            .chartType(AAChartType.Bar)
            .backgroundColor("#b6c0dd")
            .dataLabelsEnabled(false)
            .categories(soNames)
            .colorsTheme(colorsArr)
            .series(
                arrayOf(
                    AASeriesElement()
                        .data(arrayOf(
                            arrayOf("Linux", 4),
                            arrayOf("Mac", 1),
                            arrayOf("Windows", 2)
                        ))
                        .colorByPoint(true)
                        .name("Usuários"),
                    AASeriesElement()
                        .data(arrayOf(
                            arrayOf("Linux", 10),
                            arrayOf("Mac", 2),
                            arrayOf("Windows", 0)
                        ))
                        .colorByPoint(true)
                        .name("Haters")
                )
            )
            .zoomType(AAChartZoomType.XY)
            .yAxisTitle("Número de usuários")
        aaChartView?.aa_drawChartWithChartModel(aaChartModel)
        return view
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            GraficoSO().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}
private const val ARG_PARAM2 = "param2"

