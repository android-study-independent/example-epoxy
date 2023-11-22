package id.pratama.androidcustomrecyclerview.sampleepoxy.view

import android.content.Context
import android.util.Log
import android.view.View
import android.view.View.OnClickListener
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder
import com.bumptech.glide.Glide
import id.pratama.androidcustomrecyclerview.R
import id.pratama.androidcustomrecyclerview.sampleepoxy.model.EpoxyArtikelModel

@EpoxyModelClass(layout = R.layout.layout_item_artikel)
abstract class ItemArtikelEpoxyView(val context: Context) :
    EpoxyModelWithHolder<ItemArtikelEpoxyView.ItemArtikelHolder>() {

    @EpoxyAttribute
    lateinit var model: EpoxyArtikelModel

    @EpoxyAttribute
    lateinit var clickListener: OnClickListener

    override fun bind(holder: ItemArtikelHolder) {
        super.bind(holder)
        Log.d("debug", "build bind data -> ${model.toString()}")
        holder.containerArtikel.setOnClickListener(clickListener)
        holder.labelTitle.text = model.title
        holder.labelDesc.text = model.desc
        holder.labelTag.text = model.tag
        Glide.with(context).load(model.imgUrl).into(holder.imgArtikel)
    }

    inner class ItemArtikelHolder : EpoxyHolder() {
        lateinit var labelTag: TextView
        lateinit var labelTitle: TextView
        lateinit var labelDesc: TextView
        lateinit var imgArtikel: ImageView
        lateinit var containerArtikel: CardView
        override fun bindView(itemView: View) {
            labelTag = itemView.findViewById(R.id.labelTag)
            labelTitle = itemView.findViewById(R.id.labelTitle)
            labelDesc = itemView.findViewById(R.id.labelDesc)
            imgArtikel = itemView.findViewById(R.id.imgArtikel)
            containerArtikel = itemView.findViewById(R.id.containerArtikel)
        }

    }


}