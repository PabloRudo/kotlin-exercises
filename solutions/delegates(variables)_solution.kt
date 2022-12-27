import kotlin.reflect.*

class Product() {
    var price: Double by PriceDelegate()
    var hasDiscount: Boolean = false
}

class PriceDelegate {
    private var price: Double = 0.0

    operator fun getValue(thisRef: Any?, property: KProperty<*>): Double {
        return if (thisRef is Product && thisRef.hasDiscount) price * 0.9 else price
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: Double) {
        price = if (thisRef is Product && thisRef.hasDiscount) value * 1.05 else value
    }
}

fun main() {
    val product1 = Product().apply {
        hasDiscount = false
        price = 100.0
    }
    println(product1.price) // 100.0

    val product2 = Product().apply{
        hasDiscount = true
        price = 100.0
    }
    println(product2.price) // 94.5
}