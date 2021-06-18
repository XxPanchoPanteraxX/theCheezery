package preciado.francisco.thecheezery

import android.os.Bundle
import kotlinx.android.synthetic.main.activity_productos.*

class SweetActivity : ProductLineActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        imageView_products.setImageResource(R.drawable.sweets1)
    }

    override fun agregarProductos() {
        lstProducts.add(Product("Blueberry cake", R.drawable.blueberrycake, "Vanilla cake flavor, topped with cheese topping and blueberries.", 6))
        lstProducts.add(Product("Chocolate cupcake", R.drawable.chocolatecupcake, "Chocolate cupcakes topped with butter cream and cherries", 3))
        lstProducts.add(Product("Lemon tartalette", R.drawable.lemontartalette, "Pastry shell with a lemon flavored filling", 4))
        lstProducts.add(Product("Red Velvet cake", R.drawable.redvelvetcake, "Soft, moist, buttery cake topped with an easy cream cheese frosting.", 6))
        lstProducts.add(Product("Cherry cheesecake", R.drawable. strawberrycheesecake, "This cherry topped cheesecake is positively creamy and delicious and will be your new favorite dessert.", 7))
        lstProducts.add(Product("Tiramisu", R.drawable.tiramisu, "Coffee-flavored Italian dessert", 6))
    }
}