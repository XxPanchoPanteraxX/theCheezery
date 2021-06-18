package preciado.francisco.thecheezery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_productos.*

abstract class ProductLineActivity : AppCompatActivity() {
    protected var lstProducts = ArrayList<Product>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_productos)

        var adapter: ProductsAdapter = ProductsAdapter(this, lstProducts)
        listView.adapter = adapter

        agregarProductos()
    }

    protected abstract fun agregarProductos()
}