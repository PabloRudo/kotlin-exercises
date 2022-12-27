# Propiedades delegadas
En esta sección se va a realizar un ejercicio para practicar el patrón *Delegate* en kotlin, concretamente la delegación de la inicialización de una propiedad. En kotlin se puede utilizar la palabra clave **by** para dicha tarea.

1. Crea una clase llamada *Product* que tenga una variable llamada *price* de tipo *Double* y una variable booleana llamada *hasDiscount*.

2. Crea otra clase llamada *PriceDelegate* que tenga una función *getPrice* y otra función *setPrice*. Estas funciones deben tener los siguientes parámetros:

    * **thisRef**: Any?: se refiere al objeto en el que se está utilizando el delegado.
    * **property**: KProperty<\*>: se refiere a la propiedad en la que se está utilizando el delegado.
    * **value**: Double (sólo en setPrice): el valor que se está asignando a la propiedad.

3. Inicializa la variable *price* con el delegado *PriceDelegate*.

4. En la clase *PriceDelegate*, implementa la función *getPrice* de tal manera que devuelva el precio del producto. Si *thisRef* es una instancia de *Product* y la variable *hasDiscount* es true, aplica un descuento del 10% al precio antes de devolverlo.

5. En la clase *PriceDelegate*, implementa la función *setPrice* de tal manera que escribe el precio del producto en la variable. Si *thisRef* es una instancia de *Product* y la variable *hasDiscount* es true, aplica un recargo del 5% al precio antes de escribirlo.

6. Crea una función *main* y crea dos instancias de *Product*, una sin descuento y otra con descuento.

7. Asigna un nuevo valor a la variable *price* de cada instancia.

8. Accede a la variable *price* de cada instancia y muestra el resultado en pantalla.

A continuación tienes un ejemplo de la función main:

```
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
```


![Rudo](../README/rudo.png)

**Develop by rudo apps**

hola@rudo.es | https://www.rudo.es