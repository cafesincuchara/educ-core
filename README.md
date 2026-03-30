Proyecto EduCore - Microservicio de Gestión Académica

Este proyecto consiste en el desarrollo de un microservicio backend utilizando Java 21 y Spring Boot, diseñado para la administración de registros académicos dentro de la plataforma EduCore.
Arquitectura del Sistema

El microservicio aplica el patrón de diseño CSR (Controller-Service-Repository), asegurando una separación clara de responsabilidades:

    Controller: Expone los endpoints REST y gestiona las peticiones HTTP.

    Service: Contiene la lógica de negocio, procesamiento de datos y validaciones.

    Repository: Gestiona la persistencia de datos mediante Spring Data JPA.

    Model: Define la entidad de dominio y las reglas de validación de datos.

Tecnologías Utilizadas

    Java 21

    Spring Boot 4.0.5

    Spring Data JPA

    H2 Database (Base de datos en memoria para prototipado)

    Lombok (Reducción de código boilerplate)

    Jakarta Validation (Integridad de datos)

Modelo de Datos

La entidad principal Escuela incluye los siguientes atributos:

    id: Identificador único (UUID).

    estudiantes: Registro de participantes asociados.

    profesores: Nombre del docente a cargo.

    curso: Nombre de la actividad académica.

    activo: Estado de vigencia del registro.

    fechaCreacion: Fecha de registro en el sistema.

    modalidad: Tipo de instrucción (Presencial/Online).

    nivel: Categoría o nivel del curso.
