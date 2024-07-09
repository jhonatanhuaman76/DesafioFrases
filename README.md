## Variables de Entorno

Este proyecto utiliza varias variables de entorno para su configuración. A continuación se detallan las variables necesarias y sus descripciones:

### Variables Requeridas

- `DB_HOST`
    - **Descripción**: Host donde se encuentra la base de datos.
    - **Ejemplo**: `localhost:4000`

- `DB_NAME`
    - **Descripción**: Nombre de la base de datos a la que se conecta la aplicación.
    - **Ejemplo**: `mi_base_de_datos`

- `DB_USER`
    - **Descripción**: Nombre de usuario para autenticar la conexión a la base de datos.
    - **Ejemplo**: `mi_usuario`

- `DB_PASSWORD`
    - **Descripción**: Contraseña para autenticar la conexión a la base de datos.
    - **Ejemplo**: `mi_contraseña`

- `CORS_ORIGIN`
    - **Descripción**: Define el origen permitido para las solicitudes CORS. Donde está alojado el Front-End.
    - **Ejemplo**: `http://localhost:3000`