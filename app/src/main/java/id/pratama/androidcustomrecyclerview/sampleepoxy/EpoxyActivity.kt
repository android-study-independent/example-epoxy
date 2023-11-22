package id.pratama.androidcustomrecyclerview.sampleepoxy

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.airbnb.epoxy.EpoxyRecyclerView
import id.pratama.androidcustomrecyclerview.databinding.ActivityEpoxyBinding
import id.pratama.androidcustomrecyclerview.sampleepoxy.controller.ArtikelEpoxyController
import id.pratama.androidcustomrecyclerview.sampleepoxy.model.EpoxyArtikelModel
import id.pratama.androidcustomrecyclerview.sampleepoxy.model.EpoxyMenuHeaderModel

class EpoxyActivity : AppCompatActivity(), ArtikelEpoxyController.AdapterCallbacks {


    lateinit var homeController: ArtikelEpoxyController

    lateinit var epoxyRv: EpoxyRecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityEpoxyBinding.inflate(layoutInflater)
        setContentView(binding.root)

        homeController = ArtikelEpoxyController(this, this)

        epoxyRv = binding.rvEpoxy
        epoxyRv.layoutManager = LinearLayoutManager(this)

        epoxyRv.setController(homeController)

        val listItemHome = mutableListOf(
            EpoxyMenuHeaderModel(),
            EpoxyArtikelModel(
                tag = "bayam",
                title = "Mudah menanam bayam",
                desc = "lorem",
                imgUrl = ""
            ),
            EpoxyArtikelModel(
                tag = "cabai",
                title = "Mudah menanam cabai",
                desc = "lorem",
                imgUrl = "https://news.unair.ac.id/wp-content/uploads/2021/10/Foto-oleh-The-Sport-Review.jpg"
            ),
            EpoxyArtikelModel(
                tag = "cabai",
                title = "Mudah menanam cabai",
                desc = "lorem",
                imgUrl = "https://news.unair.ac.id/wp-content/uploads/2021/10/Foto-oleh-The-Sport-Review.jpg"
            ),
            EpoxyArtikelModel(
                tag = "cabai",
                title = "Mudah menanam cabai",
                desc = "lorem",
                imgUrl = "https://news.unair.ac.id/wp-content/uploads/2021/10/Foto-oleh-The-Sport-Review.jpg"
            ),
            EpoxyArtikelModel(
                tag = "cabai",
                title = "Mudah menanam cabai",
                desc = "lorem",
                imgUrl = "https://news.unair.ac.id/wp-content/uploads/2021/10/Foto-oleh-The-Sport-Review.jpg"
            ),
            EpoxyArtikelModel(
                tag = "cabai",
                title = "Mudah menanam cabai",
                desc = "lorem",
                imgUrl = "https://news.unair.ac.id/wp-content/uploads/2021/10/Foto-oleh-The-Sport-Review.jpg"
            ),
            EpoxyArtikelModel(
                tag = "cabai",
                title = "Mudah menanam cabai",
                desc = "lorem",
                imgUrl = "https://news.unair.ac.id/wp-content/uploads/2021/10/Foto-oleh-The-Sport-Review.jpg"
            ),
            EpoxyArtikelModel(
                tag = "cabai",
                title = "Mudah menanam cabai",
                desc = "lorem",
                imgUrl = "https://news.unair.ac.id/wp-content/uploads/2021/10/Foto-oleh-The-Sport-Review.jpg"
            ),
            EpoxyArtikelModel(
                tag = "cabai",
                title = "Mudah menanam cabai",
                desc = "lorem",
                imgUrl = "https://news.unair.ac.id/wp-content/uploads/2021/10/Foto-oleh-The-Sport-Review.jpg"
            )
        )

        Log.d("debug", "list item ->${listItemHome.size}")

        homeController.setData(listItemHome)

    }

    override fun onArtikelClick(artikel: EpoxyArtikelModel) {
        Toast.makeText(this, "artikel yang diklik $artikel", Toast.LENGTH_SHORT).show()
    }
}