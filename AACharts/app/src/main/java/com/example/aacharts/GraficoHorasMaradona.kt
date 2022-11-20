package com.example.aacharts

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.aacharts.Util.Util
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartType
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartView
import com.github.aachartmodel.aainfographics.aachartcreator.AASeriesElement

// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class GraficoHorasMaradona : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_grafico_horas_maradona, container, false)
        val outubroNovembroMaradona : Array<Any> = arrayOf(0, 0, 0, 4, 8.5, 2.5, 9, 0, 1, 2, 2, 4, 2.5, 7.5, 0, 3.5, 0, 4, 5, 6.5, 4, 0, 7, 8, 0, 0, 2, 0, 0, 0, 0)
        val aaChartViewMaradona = view?.findViewById<AAChartView>(R.id.grafico_horas_outubro_maradona)

        val aaChartModelMaradona = Util.gerarModelGraficoArea(outubroNovembroMaradona, "Horas Maradona", "Horas por dia no mês de outubro", "#b6c0dd", false)

        aaChartViewMaradona?.aa_drawChartWithChartModel(aaChartModelMaradona)


        // Inflate the layout for this fragment
        return view
    }


}