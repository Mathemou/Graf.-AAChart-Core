package com.example.aacharts

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartType
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartView
import com.github.aachartmodel.aainfographics.aachartcreator.AASeriesElement

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [GraficoVendas.newInstance] factory method to
 * create an instance of this fragment.
 */
class GraficoVendas : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_grafico_vendas, container, false)
        val aaChartView = view?.findViewById<AAChartView>(R.id.grafico_vendas)
        val aaChartModel : AAChartModel = AAChartModel()
            .chartType(AAChartType.Columnrange)
            .backgroundColor("#b6c0dd")
            .series(arrayOf(
                AASeriesElement()
                    .data(arrayOf(
                        arrayOf("20/03", 0, 19.24),
                        arrayOf("21/03", 19.24, 33.85),
                        arrayOf("22/03", 33.95, 0),
                        arrayOf("23/03", 0, 53.28),
                        arrayOf("24/03", 53.28, 0),
                        arrayOf("25/03", 0, 53.28),
                        arrayOf("26/03", 53.28, 159.84)
                    ))
                    .allowPointSelect(false)
                    .name("Vendas"),
                AASeriesElement()
                    .data(arrayOf(
                        arrayOf("20/03", 0, 1),
                        arrayOf("21/03", 1, 3),
                        arrayOf("22/03", 3, 2),
                        arrayOf("23/03", 2, 0.28),
                        arrayOf("24/03", 0.28, 0),
                        arrayOf("25/03", 0, 5.60),
                        arrayOf("26/03", 5.60, 0)
                    ))
                    .allowPointSelect(false)
                    .name("Gasto com cliques")

            ))
            .yAxisTitle("Variação")
        aaChartView?.aa_drawChartWithChartModel(aaChartModel)
        return view
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            GraficoVendas().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}