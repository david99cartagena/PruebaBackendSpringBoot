# 🧪 PruebaBackendSpringBoot

Este proyecto es una prueba técnica CRUD desarrollada con **Spring Boot**, utilizando **MySQL** como base de datos relacional y herramientas modernas para pruebas y desarrollo backend en Java.

---

## 🛠️ Construido con

Herramientas utilizadas durante el desarrollo:

- **[Visual Studio Code](https://code.visualstudio.com/)** `v1.76.0`: Editor de código ligero y potente.
- **[NetBeans](https://netbeans.apache.org/)**: IDE especializado para desarrollo en Java.
- **[Postman](https://www.postman.com/)**: Plataforma para pruebas de APIs REST.
- **[Spring Boot](https://spring.io/projects/spring-boot)**: Framework para crear microservicios y aplicaciones web de forma rápida.
- **[MySQL](https://www.mysql.com/)**: Sistema de gestión de bases de datos relacional.
- **[MySQL Workbench](https://www.mysql.com/products/workbench/)**: Herramienta visual para modelado y administración de bases de datos.
- **[Git](https://git-scm.com/)** `v2.34.1`: Sistema de control de versiones distribuido.

---

## ☕ Versiones de Java utilizadas

- `Java version "1.8.0_361"`
- `Java(TM) SE Runtime Environment (build 1.8.0_361-b09)`
- `Java HotSpot(TM) 64-Bit Server VM (build 25.361-b09, mixed mode)`

> ℹ️ El proyecto está configurado para ejecutarse con Java 8.

---

## 🗃️ Base de Datos

Consulta la carpeta `BasedeDatos` incluida en el repositorio para revisar los recursos necesarios:

- **ModeloEntidadRelacion**: Diagrama E-R elaborado en MySQL Workbench.
- **ScriptSQL**: Contiene los scripts `.sql` para la creación de tablas e inserción de datos de prueba.

---

## 🚀 Ejecutar el proyecto

### 1. Clonar el repositorio

```bash
git clone https://github.com/david99cartagena/PruebaBackendSpringBoot.git
```

### 2. Abrir en Spring Tool Suite o IDE compatible

Utiliza Spring Tool Suite 4, IntelliJ IDEA o Eclipse para importar el proyecto y ejecutarlo.

### 3. Configuración de base de datos

Revisa y ajusta el archivo de configuración ubicado en:

```bash
PruebaBackendSpringBoot/CrudPrueba/src/main/resources/application.properties
```

Asegúrate de establecer los valores correctos para:

```bash
spring.datasource.url=jdbc:mysql://localhost:3306/tu_base_de_datos
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña
```

💡 También puedes configurar otros parámetros como el dialecto de Hibernate, puerto del servidor, y comportamiento de creación de tablas (spring.jpa.hibernate.ddl-auto).
