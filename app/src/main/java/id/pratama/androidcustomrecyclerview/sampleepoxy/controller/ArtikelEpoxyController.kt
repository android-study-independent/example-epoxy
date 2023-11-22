package id.pratama.androidcustomrecyclerview.sampleepoxy.controller

import android.content.Context
import android.util.Log
import com.airbnb.epoxy.TypedEpoxyController
import id.pratama.androidcustomrecyclerview.sampleepoxy.model.EpoxyArtikelModel
import id.pratama.androidcustomrecyclerview.sampleepoxy.model.EpoxyMenuHeaderModel
import id.pratama.androidcustomrecyclerview.sampleepoxy.model.HomeBaseModel
import id.pratama.androidcustomrecyclerview.sampleepoxy.view.itemArtikelEpoxyView
import id.pratama.androidcustomrecyclerview.sampleepoxy.view.itemMenuHeaderEpoxyView

class ArtikelEpoxyController(private val ctx: Context, private val callback: AdapterCallbacks) :
    TypedEpoxyController<List<HomeBaseModel>>() {

    interface AdapterCallbacks {
        fun onArtikelClick(artikel: EpoxyArtikelModel)
    }

    override fun buildModels(data: List<HomeBaseModel>?) {

        Log.d("debug", "build models -> ${data?.size}")
        data?.forEach {
            when (it) {
                is EpoxyArtikelModel -> {
                    Log.d("debug", "build model artikel")
                    itemArtikelEpoxyView(ctx) {
                        id(1)
                        model(it)
                        clickListener { data, _, _, _ ->
                            this@ArtikelEpoxyController.callback.onArtikelClick(
                                data.model
                            )
                        }
                    }
                }

                is EpoxyMenuHeaderModel -> {
                    Log.d("debug", "build model header")
                    itemMenuHeaderEpoxyView {
                        id(2)
                    }
                }
            }
        }
    }
}