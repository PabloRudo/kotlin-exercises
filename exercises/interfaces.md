# Interfaces y abstracciones
En esta sección se van a realizar ejercicios para practicar y aplicar las abstracciones usando interfaces de Kotlin.

### Ejercicio 1

Este ejercicio consiste en crear una interfaz que defina un método cuya función será devolver una lista de elementos llamados ListItem. Posteriormente, crearemos una clase que implemente dicha interfaz y la inyectaremos/pasaremos al ViewModel correspondiente. Esta interfaz también contará con otro método que, dado un id entero, devuelva un tipo ListItem con dicho id.

1- Crea la interfaz ApiInterface con las dos funciones o métodos ya nombrados.

2- Crea la clase ListItem que contiene un id y un nombre. De esta clase han de heredar los objetos que pintarás en siguientes apartados.

3- Crea la clase que implemente dicha interfaz y escribe en ella la implementación de los métodos. Ten en cuenta que el objeto que devuelva la API ha de heredar de ListItem, ya que tiene que tener al menos un id y un nombre. Para las llamadas puedes usar Retrofit.

```
https://rickandmortyapi.com/api/character
```

4- Crea una instancia de la interfaz ApiInterface en tu ViewModel. Puedes inicializar dicha dependencia desde el onCreate() con la implementación que hayas creado.

```
lateinit var apiInterface: ApiInterface
```

5- Crea la siguiente función en el ViewModel.

```
fun getItemList(): List<ListItem>
	return apiInterface.getFirstName()
}
```

6- Pinta la lista de nombres de los 10 primeros personajes.


### Ejercicio 2

Crea una segunda clase que implemente la misma interfaz y pinta la lista de nombres de las 10 primeras monedas
```
https://api.coincap.io/v2/assets
```


![Rudo](../README/rudo.png)

**Develop by rudo apps**

hola@rudo.es | https://www.rudo.es