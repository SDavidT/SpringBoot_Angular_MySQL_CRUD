# Backend del CRUD

## Requerimientos 

El proyecto requiere:

1. IDE para manejo de proyectos Maven SpringBoot como (NetBeans, SST4, VSC) en este proyecto se desarrlló en VIsual Studio Code 
2. MySQL 
3. Navegador (Chrome)

El proyecto se desarrolló con las siguientes versiones:

1. JDK - 11.0.2
2. Maven - 2.7.3
3. Java - 11
4. MySQL - 8


## PUESTA EN MARCHA

1. Descargar el proyecto en zip 

2. Descomprimir el archivo y abrir el folder `backend` en uno de los IDE que soporte SpringBoot 

3. Cargar y ejecutar el archivo `DB.sql` en MySQL para la generación de la DB 

**4. Cambiar el usuario y contraseña para conexión con el DB**

+ Ubicarse en `src/main/resources/application.properties`

+ cambiar `spring.datasource.username`  
+ cambiar `spring.datasource.password` 

**5. Construir y correr el proyecto Maven**

Ejecutar el comando siguiente en consola

```bash
.\mvnw spring-boot:run
```

Acceder atraves de  <http://localhost:8080/producto/lista>.

## Pruebas del CRUD

Se recomienda el uso de PostMan como plataforma de testeo de la API

Para crear un registro del DB
   + POST /create

Para lectura de datos del DB
   + GET /producto/lista
   
Para actualizar un registro del DB
   + PUT /update/{id}

Para borrar un registro del DB
   + DELETE /delete/{id}


    

    
