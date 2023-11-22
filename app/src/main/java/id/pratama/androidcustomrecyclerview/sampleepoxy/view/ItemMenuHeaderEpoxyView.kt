package id.pratama.androidcustomrecyclerview.sampleepoxy.view

import android.view.View
import android.widget.LinearLayout
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder
import id.pratama.androidcustomrecyclerview.R
import id.pratama.androidcustomrecyclerview.sampleepoxy.model.EpoxyMenuHeaderModel

@EpoxyModelClass(layout = R.layout.layout_item_menuheader)
abstract class ItemMenuHeaderEpoxyView :
    EpoxyModelWithHolder<ItemMenuHeaderEpoxyView.ItemMenuHeaderHolder>() {

    @EpoxyAttribute
    lateinit var model: EpoxyMenuHeaderModel
    override fun bind(holder: ItemMenuHeaderHolder) {
        super.bind(holder)

        holder.btnMenuCuaca.setOnClickListener {
            // todo: handle click
        }
    }

    inner class ItemMenuHeaderHolder : EpoxyHolder() {
        lateinit var btnMenuCuaca: LinearLayout
        override fun bindView(itemView: View) {
            btnMenuCuaca = itemView.findViewById(R.id.btnCuaca)
        }

    }
}