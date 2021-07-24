# Laboratorio Analizador Lexico + Sintactico
Laboratorio Inicial

Para comprender bien todo el tema de la instalacion es necesario seguir los siguientes pasos:
* Instalar JAVA (Se puede tener la version de Oracle o un jdk)
* Obtener la version de ANTLR (En este caso se uso la 4.9)

[ANTLR] (https://www.antlr.org)
[DOWNLOAD ANTLR] (https://www.antlr.org/download/)

Si no siguen los pasos al pie de la letra:

![Alt Text](https://media.giphy.com/media/d2W7eZX5z62ziqdi/giphy.gif)

Posterior a tener todo esto instalado se escogera usar el disco de preferencia C: o D: para crear una carpeta a la que llamaremos "Javalib".
De esta forma tendremos un directorio que se ve asi: C:\Javalib (como es en mi caso)

Ahora en este directorio tenemos que insertar la version de ANTLR que hallamos descargado para tener lo siguiente: C:\Javalib\antlr-4.9-complete.jar

Luego es necesario definir variables de ambiente y que se vean de la siguiente manera (lado izquierdo variable de ambiente, lado derecho valor):

|Variable       | Valor                           |
|:-------------:|:-------------------------------:|
|CLASSPATH      |C:\Javalib\antlr-4.9-complete.jar|
|Path           |%CLASSPATH%                      |
|Path           |C:\Javalib                       |

Todas estas en las variables de usuario y asegurarse que en las variables de sistema se tenga lo siguiente:

|Variable       | Valor                              |
|:-------------:|:----------------------------------:|
|Path           |C:\Program Files\Java\jdk-16.0.1\bin|

Luego de esto es necesario crear 3 archivos .bat llamados:
* class.bat
* antlr4.bat
* grun.bat

Los contenidos de todos estos deberan ser los siguientes (en el mismo orden):
* SET CLASSPATH=.;C:\Javalib\antlr4-complete.jar;%CLASSPATH%
* java org.antlr.v4.Tool %*
* java org.antlr.v4.gui.TestRig %*

Si todo funciono a la perfeccion podremos correr el comando antlr4 (segun la version puede ser solo antlr) y nos desplegara las opciones disponibles.

Y lo siguiente es hacer que funcione con nuestra gramatica de la siguiente manera y corriendo los siguientes comandos:
* antlr4 <gramatica>.g4
* javac <gramatica>*.java
* grun <nombre_gramatica> <start_rule_name> <archivo_entrada> -gui 