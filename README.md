#Ejemplo de un servidor RMI utilizando Spring

#�Qu� es un RMI?

RMI (Java Remote Method Invocation) es un mecanismo ofrecido por Java para invocar un m�todo de manera remota. Forma parte del entorno est�ndar de ejecuci�n de Java y proporciona un mecanismo simple para la comunicaci�n de servidores en aplicaciones distribuidas basadas exclusivamente en Java. Si se requiere comunicaci�n entre otras tecnolog�as debe utilizarse CORBA o SOAP en lugar de RMI.
RMI se caracteriza por la facilidad de su uso en la programaci�n por estar espec�ficamente dise�ado para Java; proporciona paso de objetos por referencia (no permitido por SOAP), recolecci�n de basura distribuida (Garbage Collector distribuido) y paso de tipos arbitrarios (funcionalidad no provista por CORBA).
A trav�s de RMI, un programa Java puede exportar un objeto, con lo que dicho objeto estar� accesible a trav�s de la red y el programa permanece a la espera de peticiones en un puerto TCP. A partir de ese momento, un cliente puede conectarse e invocar los m�todos proporcionados por el objeto.
La invocaci�n se compone de los siguientes pasos:

- Encapsulado (marshalling) de los par�metros (utilizando la funcionalidad de serializaci�n de Java).
- Invocaci�n del m�todo (del cliente sobre el servidor). El invocador se queda esperando una respuesta.
- Al terminar la ejecuci�n, el servidor serializa el valor de retorno (si lo hay) y lo env�a al cliente.
- El c�digo cliente recibe la respuesta y contin�a como si la invocaci�n hubiera sido local.

Fuente: http://es.wikipedia.org/wiki/Java_Remote_Method_Invocation
