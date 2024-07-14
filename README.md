<h1 align="center"> # Challenge-Conversor-De-Monedas </h1>
<em> # Reto Java Orientado a Objetos </em>

![Imagen Ilustrativa](https://github.com/user-attachments/assets/e376c483-8583-4f71-9fca-9d3c7728c526)

Bienvenidos al README de mi proyecto, en este apartado se presentarán capturas de ejecución, así como comentarios generales del código generado.

La propuesta de solución a este challenge se elaboró utilizando Java y API proveniente de ExchangeRate, la cual facilita la conversión de distintas divisas, pues su manejo principal es mediante un archivo JSON, el cual recibe una actualización constantemente según fluctúa la tasa de cambio de las distintas divisas reconocidas por la ONU.

A continuación se presentan algunas de las ejecuciones de los posibles escenarios que se podrían presentar al momento de interactuar con usuarios. Se presenta al mismo tiempo un ejemplo de ejecución.

En primera instancia se presenta el menú principal, el cual es fiel en diseño al propuesto en la presentación del Challenge.

![Menú del programa](https://github.com/user-attachments/assets/baeffe66-40c0-4a68-b074-469749b6ca9d)

Por otro lado, se expone un ejemplo de recopilación de datos no deseados en la entrada, por lo cual se finaliza el programa y se expone el motivo por el cual se finalizó el programa.

![Entrada de datos no esperados](https://github.com/user-attachments/assets/30a6d330-5ea9-4ec0-af43-72a4de33c08d)

Finalmente, como último ejemplo de pantalla de ejecución se presenta el caso de que la elección de transformación de divisas no se encuentre dentro del rango permisible.

![Selección de casos fuera de rango](https://github.com/user-attachments/assets/57bc71d8-d3d5-495c-b160-3b0e831b0154)

Para la presentación de este challenge se decidió implementar un historial que almacene fecha, hora, divisas y el factor de conversión al momento.

![Generación de historial](https://github.com/user-attachments/assets/febf0618-fec0-44ca-9bab-a7d1e9de4fc4)

En cuanto a estructura, se buscó generar un código sencillo en la clase principal, por lo cual se generaron 4 categorías principales, las cuales son API, Generación de archivos, Main y Moneda. Se trató de hacer las funciones lo más implícito posible, por lo tanto API es la clase encargada de la generación de adquisición de datos mediante el JSON; Generación de archivos es la función encargada de crear el documento txt del historial; el Main contiene el código principal; y el apartado Moneda, cuenta con 3 funciones. 

En primera instancia, se encuentra Moneda, en la cual se encuentra el Record para la adquisición y clasificación de los datos provenientes del archivo JSON. Por otro lado, la función Movimientos sirvió como una clase encargada de contar con la información requerida para generar el Historial. Finalmente, la clase Calculadora es la responsable de mostrar la tasa de cambios, así como efectuar las operaciones según la elección del usuario.

IMPORTANTE : La API key que se encuentra en la sección de API>ConsultaMoneda se encuentra desactivada, por lo que para utilizar el programa es necesario sustituir la sección correspondiente a la key por una activa.
