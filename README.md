# CHALLENGE FORO HUB
ForoHub es un APi hecha solamente en el aspecto de BackEnd siendo un challenge de java y Springboot de Alura para las
buenas practicas de estos temas. ForoHub se trata de un codigo que recibe clientes y les permite registrarse y unirse a
un foro donde podra publicar topicos y responder topicos desde el rol de USER que se les asigna por defecto. Limitando
asi el uso del programa que tiene el usuario y el acceso en comparacion con su opuesto rol el ADMIN.
el usuario se registra con una contraseña codificada y se autentifica con un TOKEN.

## TECNOLOGIAS UTILIZADAS:

Un archivo Spring initializr generado con las siguientes caracteristicas
- **Maven**
- **Java 17**
- **Spring Boot 3.3.1**
- **Principios SOLID**
- **MySQL (utilizando en mi caso workbench para los testeos)**
- **JPA (Java Persistence API)**
- **JWT (Json Web Tokens)**
- **fliwaydb**

## Como usar el programa

### En cuanto al usuario.....
Registrar usuario:
se utiliza el metodo POST, la direccion es:
`/con/users`

Cambiar contraseña:
Se utiliza el metodo PUT, la direccion es:
`/con/users/changePassword`

Listar usuario:
Se utiliza el metodo GET, la direccion es:
`/con/users/(se agrega el id del usuario de este modo: {id})`

Eliminar usuario:
Se utiliza el metodo DELETE, la direccion es:
`/con/users/(se agrega el id del usuario de este modo: {id})`



### En cuanto a los topicos.....

Crear Topico:
Se utiliza el metodo POST, la direccion es:
`/con/topicos/`

Listar Topicos:
Se utiliza el metodo GET , la direccion es:
`/con/topicos/`

Eliminar Topicos:
Se utiliza el metodo DELETE, la direccion es:
`/con/topicos/(se agrega el id del usuario de este modo: {id})`

Actualizar topicos:
Se utiliza el metodo PUT, la direccion es:
`/con/topicos/(se agrega el id del usuario de este modo: {id})`

Buscar un topico:
Se utiliza el metodo GET, la direccion es:
`/con/topicos/(se agrega el id del usuario de este modo: {id})`

### Repuestas:

Agregar respuesta:
Se utiliza el metodo POST, la direccion es:
`/con/topicos/{id}/replies`

Listar respuestas:
Se utiliza el metodo GET, la direccion es:
`/con/topicos/{id}/replies`

Editar respuestas:
Se utiliza el metodo PUT, la direccion es:
`/con/topicos/{id}/replies/id_reply`

Eliminar respuesta:
Se utiliza el metodo DELETE, la direccion es:
`/con/topicos/{id}/replies/id_reply`

### En cuanto a los cursos......

Registrar Curso:
Se utiliza el metodo POST, la direccion es:
`/con/cursos/`

Listar cursos:
Se utiliza el metodo GET, la direccion es:
`/con/cursos/`

Buscar curso:
Se utiliza el metodo GET, la direccion es:
`/con/cursos/{id}`

Editar datos de un curso:
Se utiliza el metodo PUT, la direccion es:
`/con/cursos/{id}`

Eliminar curso:
Se utiliza el metodo DELETE, la direccion es:
`/con/cursos/{id}`


### Autenticacion....

Iniciar Sesion:

Se  utiliza el metodo POST, la direccion esL
`/login`

## Estado actual del proyecto:

<img src>"![img.png](img.png)
Pendiente a futuras actualizaciones...



### AGRADECIMIENTOS:
Con todas las funciones del programa ya explicadas me gustaria mostrar mi gratitud
a Alura por esta campaña de Oracle para ayudar a mucha gente en latinoamerica
a aprender a programar sin ser estafados o malgastar dinero, disfrute bastante de los 
cursos y los instructores son bastante buenos. Este programa lo logre gracias a todo eso.

#### Autor:
Juan Sebastian Arduz Espada:

github nickname: Sebillasxd2

LINK: https://github.com/Sebillasxd2
