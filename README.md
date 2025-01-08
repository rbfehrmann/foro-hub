# 🔗 Foro Hub API

Foro Hub API es una aplicación backend construida con Spring Boot que permite a los usuarios interactuar en un foro mediante la creación, lectura, actualización y eliminación de tópicos (CRUD). Esta API está diseñada para facilitar el aprendizaje y la colaboración entre estudiantes, profesores y moderadores. Cabe mencionar que corresponde a un desafío de Alura Latam de una estudiante en formación de backend. 🌐

---

## 🚀 Características Principales

- **CRUD Completo para Tópicos:**
  - Crear nuevos tópicos.
  - Obtener todos los tópicos.
  - Consultar un tópico específico.
  - Actualizar un tópico existente.
  - Eliminar tópicos.

- **Autenticación y Autorización:**
  - Registro e inicio de sesión de usuarios.
  - Acceso protegido mediante JWT.

- **Persistencia de Datos:**
  - Base de datos configurada con MySQL.

- **Buenas Prácticas REST:**
  - Rutas organizadas según estándares REST.

---

## 📝 Requisitos Previos

1. **Java**: Versión 17 o superior.
2. **Maven**: Para la gestión de dependencias.
3. **MySQL**: Para la base de datos.
4. **IntelliJ IDEA**: IDE recomendado para el desarrollo.
5. **Insomnia**: Para probar las rutas de la API REST.

---

## 🔧 Instalación y Configuración

### **1. Clonar el Repositorio**
```bash
$ git clone https://github.com/tu-usuario/foro-hub.git
$ cd foro-hub
```

### **2. Configurar la Base de Datos**
- Crea una base de datos en MySQL con el nombre `foro_hub`.
```sql
CREATE DATABASE foro_hub;
```

- Configura las credenciales de MySQL en el archivo `application.properties`:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/foro_hub
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contrasena
```

### **3. Ejecutar la Aplicación**
- Compila y ejecuta el proyecto:
```bash
$ mvn spring-boot:run
```
- La API estará disponible en `http://localhost:8080`.

---

## 🔄 Endpoints Disponibles

### **Autenticación**
- **Registro de Usuario**: `POST /auth/registro`
- **Login de Usuario**: `POST /auth/login`

### **Tópicos**
- **Crear un Tópico**: `POST /topicos`
- **Listar Todos los Tópicos**: `GET /topicos`
- **Obtener un Tópico por ID**: `GET /topicos/{id}`
- **Actualizar un Tópico**: `PUT /topicos/{id}`
- **Eliminar un Tópico**: `DELETE /topicos/{id}`

---

## 🕵️️ Ejemplo de Request y Response

### **Crear un Tópico**
- **Request (POST)**:
```json
{
  "titulo": "Duda sobre Spring Boot",
  "mensaje": "¿Cómo configurar una base de datos?",
  "nombreCurso": "Spring Framework",
  "idUsuario": 1
}
```

- **Response**:
```json
{
  "id": 1,
  "titulo": "Duda sobre Spring Boot",
  "mensaje": "¿Cómo configurar una base de datos?",
  "nombreCurso": "Spring Framework",
  "fechaCreacion": "2025-01-07T10:00:00"
}
```

---

## 📊 Tecnologías Utilizadas

- **Lenguaje**: Java 17
- **Framework**: Spring Boot
- **Base de Datos**: MySQL
- **Seguridad**: Spring Security con JWT
- **Cliente REST**: Insomnia

---

## 🛠️ To-Do

- Implementar páginas de resultados con paginación.
- Agregar métricas y monitoreo (por ejemplo, con Actuator).
- Documentar la API con Swagger.

---

## 🌟 Contribuciones

¡Las contribuciones son bienvenidas! Sigue estos pasos:
1. Haz un fork del repositorio.
2. Crea una rama para tu funcionalidad o bugfix (`git checkout -b feature/nueva-funcionalidad`).
3. Haz commit de tus cambios (`git commit -m 'Agrega nueva funcionalidad'`).
4. Haz un push a la rama (`git push origin feature/nueva-funcionalidad`).
5. Crea un Pull Request.

---
