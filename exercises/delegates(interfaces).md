# Interfaces y abstracciones
En esta sección se va a realizar un ejercicio para practicar el patrón *Delegate* en kotlin, concretamente la delegación de la implementación de una interfaz. En kotlin se puede utilizar la palabra clave **by** para dicha tarea.

1. Crea una interfaz llamada *IBankAccount* con tres métodos: *deposit* que recibe un parámetro de tipo *Double* y no devuelve nada, *withdraw* que recibe un parámetro de tipo *Double* y no devuelve nada, y *checkBalance* que no recibe parámetros y devuelve un valor de tipo *Double*.

2. Crea una clase llamada *BasicBankAccount* que implemente la interfaz *IBankAccount*. Esta clase debe tener un atributo privado de tipo *Double* llamado *balance* inicializado a *0.0*. Los métodos *deposit* y *withdraw* deben modificar el valor del atributo *balance* según corresponda y el método *checkBalance* debe devolver el valor del atributo *balance*.

3. Crea una clase llamada *PremiumBankAccount* que implemente la interfaz *IBankAccount*. Esta clase debe tener un atributo privado de tipo *Double* llamado *balance* inicializado a *0.0*. Los métodos *deposit* y *withdraw* deben modificar el valor del atributo saldo de manera diferente a la clase *BasicBankAccount*.

4. Crea una clase llamada *BankAccount* que implemente la interfaz *IBankAccount* y delegue la implementación de sus métodos a una instancia de *IBankAccount* mediante la palabra clave *by*. Esta clase debe tener un constructor que recibe una instancia de *IBankAccount*.

5. En el método *main*, crea una instancia de *BankAccount* utilizando *BasicBankAccount* como la implementación delegada y otra instancia utilizando *PremiumBankAccount*. Luego, realiza algunas operaciones en ambas cuentas y imprime el resultado de comparar sus saldos. La siguiente función *main* te puede servir como ejemplo.


```
fun main() {
    val basicAccount = BankAccount(BasicBankAccount())
    basicAccount.deposit(100.0)
    println(basicAccount.checkBalance())  // Prints 100.0
    basicAccount.withdraw(50.0)
    println(basicAccount.checkBalance())  // Prints 50.0

    val premiumAccount = BankAccount(PremiumBankAccount())
    premiumAccount.deposit(100.0)
    println(premiumAccount.checkBalance())  // Prints 110.0
    premiumAccount.withdraw(50.0)
    println(premiumAccount.checkBalance())  // Prints 45.0
}
```


![Rudo](../README/rudo.png)

**Develop by rudo apps**

hola@rudo.es | https://www.rudo.es