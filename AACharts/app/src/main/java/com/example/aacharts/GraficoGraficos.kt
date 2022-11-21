package com.example.aacharts

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.github.aachartmodel.aainfographics.aachartcreator.*
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AADataLabels
import com.google.gson.annotations.SerializedName

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [GraficoGraficos.newInstance] factory method to
 * create an instance of this fragment.
 */
class GraficoGraficos : Fragment() {
    // TODO: Rename and change types of parameters
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
        val view = inflater.inflate(R.layout.fragment_grafico_graficos, container, false)

        val AAChartView = view?.findViewById<AAChartView>(R.id.grafico_graficos)

        val numDeLinhas = 3
        val numDeTortas = 1
        var array : Array<Any> = arrayOf()
        array = addElemento(array, arrayOf("Torta", 1))
        array = addElemento(array,arrayOf("Linha", 3))
        val aaChartModel: AAChartModel = AAChartModel()
            .chartType(AAChartType.Pie)
            .title("Grafico de gráficos")
            .zoomType(AAChartZoomType.XY)
            .subtitle("Relação de gráficos presentes no projeto")
            .backgroundColor("#b6c0dd")
            .dataLabelsEnabled(true)
            .series(
                arrayOf(
                    AASeriesElement()
                        .data(array)
                        .name("Número de gráficos")
                )

            )

        AAChartView?.aa_drawChartWithChartModel(aaChartModel)
        return view
    }

    fun addElemento(array : Array<Any>, num : Any) : Array<Any>{
        val mutableList = array.toMutableList()
        mutableList.add(num)
        return mutableList.toTypedArray()
    }
    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment GraficoGraficos.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            GraficoGraficos().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}