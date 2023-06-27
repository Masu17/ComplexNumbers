# Index

- English version
- Version en Español


# Complex numbers calculator.

The objective of this project is to create an automated calculator of complex numbers, in addition to this, it will be intended to show the most basic use of the interfaces belonging to the java library, in this particular case two different types of them are used. 

`Comparable and Cloneable`

For this program to work we must create a class that takes care of constructing the different complex numbers, besides creating basic methods or overwrite the methods of the interfaces on these. The actions can be such as:

### toString method:

This method belonging to the Java base libraries will be overwritten to correctly display each of the complex numbers.

![ToString](https://github.com/Masu17/prueba/assets/114241909/04a16565-c585-4050-85d6-be6267311825)

### compareTo method:

This method has to be implemented directly inside our class since as we mentioned previously the Comparable interface has been used, this method is the one in charge of the comparison of two complex numbers, for this we must first calculate the absolute value of these numbers with the **calculateAbsoluteValue()** method.

![compareTo](https://github.com/Masu17/prueba/assets/114241909/bf0afa91-55e8-44d8-8277-9d045073cf5d)

**CalculateAbsoluteValue() method:**

This method uses the following formula to calculate the absolute value of our complex numbers:

being our complex number *a + bi*.

`| a+bi | = sqrt(a² + b²)`.

### Clone method

The clone method is the last of the methods overwritten in our program, it belongs to the previously mentioned Cloneable interface and is in charge of cloning the complex numbers.

![clone](https://github.com/Masu17/prueba/assets/114241909/8d2af8ac-4c89-4f09-9d12-2ddb077db8d3)

## Installation requirements
To run the program, you must have the Java JVM installed or have the latest version available.

To check if you have it installed or updated, open the terminal on your PC and type the following command:

```
java --version
```

If you have it installed correctly, you should see the following execution result:

```
openjdk 19.0.2 2023-01-17
OpenJDK Runtime Environment (build 19.0.2+7)
OpenJDK 64-Bit Server VM (build 19.0.2+7, mixed mode, sharing)
```

In case you don't have the java JVM installed you can install it [here](https://www.oracle.com/es/java/technologies/downloads/)

## How the program works

When executing the program, you will be asked to enter the different parts of both complex numbers.

![complexInsert](https://github.com/Masu17/prueba/assets/114241909/ce595730-ffde-4eed-85bb-3ef070a8187b)

After the insertion, our program will run automatically and will return the result of the operations between the complex numbers.

![complexOperations](https://github.com/Masu17/prueba/assets/114241909/a0f2a16a-e0c7-4baf-bbe4-ab1325ff7425)

To finally create a new complex number, based on the absolute value of the two previous ones and after that clone it to later order them and show them in our console.

![cloneCompare](https://github.com/Masu17/prueba/assets/114241909/0ca335e3-6fa5-415e-bb3a-d85200453ab8)
# Calculadora de numeros complejos.

El objetivo de este proyecto es crear una calculadora automatizada de numeros complejos, ademas de esto, se pretende mostrar el uso mas basico de las interfaces pertenecientes a la libreria de java en este caso particular se utilizan dos tipos diferentes de las mismas. 

`Comparable y Cloneable`

Para que este ejercicio funcione debemos crear una clase que se ocupe de construir los diferentes numeros complejos, ademas de crear metodos basicos o sobreescribir los metodos de las interfaces sobre estos. Las acciones pueden ser tales como:

### Metodo toString:

Este metodo perteneciente a las librerias base de Java se sobreescribira para mostrar de forma correcta cada uno de los numeros complejos.

![ToString](https://github.com/Masu17/prueba/assets/114241909/04a16565-c585-4050-85d6-be6267311825)

### Metodo compareTo:

Este metodo ha de ser implementado directamente dentro de nuestra clase ya que como mencionamos previamente se ha utilizado la interfaz Comparable, este metodo es el encargado de la comparacion de dos numeros complejos, para esto debemos calcular primero el valor absoluto de estos numeros con el metodo **calculateAbsoluteValue()**.

![compareTo](https://github.com/Masu17/prueba/assets/114241909/bf0afa91-55e8-44d8-8277-9d045073cf5d)

**Metodo calculateAbsoluteValue:**

Este metodo utiliza la siguiente formula para calcular el valor absoluto de nuestros numeros complejos:

siendo nuestro numero complejo *a + bi*

`| a+bi | = sqrt(a² + b²)`

### Metodo clone

El metodo clone es el ultimo de los metodos sobreescritos en nuestro programa, este pertenece a la interfaz Cloneable previamente mencionada y se ocupa de clonar los numeros complejos.

![clone](https://github.com/Masu17/prueba/assets/114241909/8d2af8ac-4c89-4f09-9d12-2ddb077db8d3)

## Requisitos de instalación
Para ejecutar el programa, debes tener instalada la JVM de Java o disponer de la última versión disponible.

Para comprobar si lo tienes instalado o actualizado, abre la terminal de tu PC y escribe el siguiente comando:

```
java --version
```

Si lo tienes instalado correctamente, deberías ver el siguiente resultado de ejecución:

```
openjdk 19.0.2 2023-01-17
OpenJDK Runtime Environment (build 19.0.2+7)
OpenJDK 64-Bit Server VM (build 19.0.2+7, mixed mode, sharing)
```

En caso de no tener instalado la JVM de java puedes instalarla [aquí](https://www.oracle.com/es/java/technologies/downloads/)

## Funcionamiento del programa

Al ejecutar el programa, se solicitará ingresar la diferentes partes de ambos numeros complejos.

![complexInsert](https://github.com/Masu17/prueba/assets/114241909/ce595730-ffde-4eed-85bb-3ef070a8187b)

Posterior a la insersión, nuestro programa se ejecutara automaticamente y nos devolvera el resultado de las operaciones entre los numeros complejos.

![complexOperations](https://github.com/Masu17/prueba/assets/114241909/a0f2a16a-e0c7-4baf-bbe4-ab1325ff7425)

Para por útlimo crear un nuevo numero complejo, en base al valor absoluto de los dos anteriores y tras eso clonarlo para posteriormente ordenarlos y mostrarlos en nuestra consola.

![cloneCompare](https://github.com/Masu17/prueba/assets/114241909/0ca335e3-6fa5-415e-bb3a-d85200453ab8)
