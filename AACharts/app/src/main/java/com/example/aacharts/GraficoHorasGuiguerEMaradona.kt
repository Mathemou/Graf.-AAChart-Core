package com.example.aacharts

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.aacharts.Util.Util
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartView


private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class GraficoHorasGuiguerEMaradona : Fragment() {
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_grafico_horas_guiguer_e_maradona, container, false)
        val aaChartViewGuiguer = view?.findViewById<AAChartView>(R.id.grafico_horas_outubro_guiguer_e_maradona)
        val horasGuiguer : Array<Any> = arrayOf(4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4)
        val horasMaradona : Array<Any> = arrayOf(0, 0, 0, 4, 8.5, 2.5, 9, 0, 1, 2, 2, 4, 2.5, 7.5, 0, 3.5, 0, 4, 5, 6.5, 4, 0, 7, 8, 0, 0, 2, 0, 0, 0, 0)

        val aaChartModel = Util.gerarModelGraficoAreaDuplo(horasGuiguer, horasMaradona, "Horas Guiguer e Maradona", "Comparativo de horas trabalhadas por Guiguer e Maradona", "#b6c0dd", false, "#F6CB1C", "#ED8545")

        aaChartViewGuiguer?.aa_drawChartWithChartModel(aaChartModel)
        return view
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            GraficoHorasGuiguerEMaradona().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}