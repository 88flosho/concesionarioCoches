Perfecto 😄 aquí tienes **otro escenario distinto**, pero con **exactamente la misma estructura técnica de examen**.

---

# 🚗 Sistema de Gestión – Concesionario de Vehículos

## 🎯 Objetivo

Aplicar de forma autónoma el patrón trabajado en clase utilizando:

* Clases y objetos
* Composición
* Arrays unidimensionales de tamaño fijo
* Métodos bien estructurados
* Javadoc correcto
* Código limpio y ordenado

Este ejercicio tiene exactamente la misma estructura técnica que el examen.

---

## 📖 Escenario

Un concesionario gestiona un máximo de **12 vehículos en stock**.

Cada vehículo está identificado mediante una **matricula única** y dispone de la siguiente información:

* matricula (String)
* marca (String)
* precio (double)

El sistema debe permitir registrar vehículos, buscarlos, mostrarlos y contar cuántos están actualmente almacenados.

📌 Recuerda realizar commits progresivos según avances.

---

## 🧩 Requisitos técnicos

### 1️⃣ Clase `Vehiculo`

Debe incluir:

* Atributos privados.
* Constructor completo.
* Métodos getters.
* Método `toString()`.
* Javadoc en:

    * Clase
    * Constructor
    * Métodos públicos

---

### 2️⃣ Clase `Concesionario`

Debe incluir:

#### Atributos

```java
private Vehiculo[] vehiculos;
private final int NUM_MAX_VEHICULOS;
```

#### Constructor

* Debe comprobar que el número máximo recibido sea positivo.

---

### Métodos obligatorios

```java
public Vehiculo buscarVehiculo(String matricula)
private int buscarPrimerHuecoLibre()
public boolean registrarVehiculo(Vehiculo vehiculo)
public String mostrarVehiculos()
public int contarVehiculos()
```

---

## 🔍 Comportamiento esperado

### `buscarVehiculo(String matricula)`

* Devuelve el vehículo con esa matrícula.
* Devuelve `null` si no existe.

---

### `buscarPrimerHuecoLibre()`

* Devuelve la primera posición `null`.
* Devuelve `-1` si el array está completo.

---

### `registrarVehiculo(Vehiculo vehiculo)`

* Solo añade si no existe otro con la misma matrícula.
* Solo añade si hay hueco disponible.
* Devuelve `true` si se añade.
* Devuelve `false` si no puede añadirse.

---

### `mostrarVehiculos()`

* Devuelve el listado de vehículos con su información.

---

### `contarVehiculos()`

* Devuelve el número real de vehículos almacenados.

---

## 🖥 Clase `Main`

Debe:

* Crear un `Concesionario` con capacidad para 12 vehículos.
* Registrar al menos 3 vehículos.
* Mostrar los vehículos.
* Mostrar el total almacenado.
* Probar una búsqueda existente y otra inexistente.

---

## 📊 Criterios de evaluación

| Criterio                            | Peso |
| ----------------------------------- | ---- |
| Diseño correcto de clases           | 20%  |
| Encapsulación adecuada              | 10%  |
| Uso correcto del array fijo         | 20%  |
| Método registrarVehiculo correcto   | 15%  |
| Recorrido y visualización correctos | 10%  |
| Conteo correcto                     | 10%  |
| Javadoc adecuado                    | 10%  |
| Orden y claridad del código         | 5%   |

---

## ⚠️ Errores frecuentes a evitar

* No inicializar el array en el constructor.
* Usar `ArrayList`.
* No comprobar `null` antes de acceder a un objeto.
* Sobrescribir posiciones ocupadas.
* No devolver `false` cuando el catálogo está lleno.
* No documentar correctamente.
* Hacer atributos públicos.

---

## 📌 Entrega

* Proyecto completo.
* Código funcional.
* Compila sin errores.
* Nombres claros y coherentes.

---

## 💬 Importante

Si resuelves este ejercicio correctamente, estás listo para el examen.

---

# 🔄 Ampliación del ejercicio

Implementa un método que elimine un vehículo que recibe:

```java
public Vehiculo deleteVehiculo(Vehiculo vehiculo)
```

Implementa un método que elimine un vehículo del que recibe una matrícula:

```java
public Vehiculo deleteVehiculo(String matricula)
```

Implementa un método que ordene los vehículos según su precio de mayor a menor, sin dejar huecos libres:

```java
public void ordenarVehiculos()
```

---

Si quieres, te preparo uno **más difícil todavía**, con algún pequeño giro lógico que suelen meter en examen 😏
