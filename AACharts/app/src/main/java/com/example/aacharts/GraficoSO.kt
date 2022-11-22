package com.example.aacharts

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.github.aachartmodel.aainfographics.aachartcreator.*

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
        val array : Array<Any> = arrayOf(arrayOf("Linux", 4), arrayOf("Windows", 2), arrayOf("Mac", 1))
        val aaChartModel: AAChartModel = AAChartModel()
            .chartType(AAChartType.Bar)
            .title("Grafico de SO")
            .subtitle("Comparação de SO's usados na Update")
            .backgroundColor("#b6c0dd")
            .dataLabelsEnabled(false)
            .series(
                arrayOf(
                    AASeriesElement()
                        .data(arrayOf(
                            5
                        ))
                        .name("Tesla"),
                    AASeriesElement()
                        .data(arrayOf(
                            1
                        ))
                        .name("Mac"),
                    AASeriesElement()
                        .data(arrayOf(
                            2
                        ))
                        .name("Windows"),
                    AASeriesElement()
                        .data(arrayOf(
                            4
                        ))
                        .name("Linux")
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

