# ECI-SportLife

> MVP de tienda virtual deportiva desarrollado con Spring Boot, PostgreSQL, MongoDB, Spring Security y JWT.

---

## Tabla de Contenidos

- [Parte Teórica](#parte-teórica)
    - [2. Matriz de Trazabilidad](#2-matriz-de-trazabilidad)
    - [3. Diagrama de Componentes General](#3-diagrama-de-componentes-general)
    - [4. Diagrama de Componentes Específico](#4-diagrama-de-componentes-específico)
    - [5. Diagrama de Clases](#5-diagrama-de-clases)
    - [6. Modelos de Base de Datos](#6-modelos-de-base-de-datos)
    - [7. Seguridad](#7-seguridad)
    - [8. Roles y Permisos](#8-roles-y-permisos)
    - [9. TLS/SSL](#9-tlsssl)
    - [10. CORS](#10-cors)
    - [11. Diseño Figma](#11-diseño-figma)
- [Parte Práctica](#parte-práctica)

---

## Parte Teórica

### 2. Matriz de Trazabilidad

[Ver Matriz de Trazabilidad](./docs/Matriz de Trazabilidad preparcial.xlsx)

### 3. Diagrama de Componentes General

![Diagrama de componentes general](./docs/Diagramadecomponentesgeneral.png)

---

### 4. Diagrama de Componentes Específico
![Diagrama de componentes específico](./docs/Diagramadecomponentesespecifico.png)

---

### 5. Diagrama de Clases

> Diagrama de clases del sistema con patrones de diseño implementados.

![Diagrama de clases](./docs/diagrama-clases.png)

**Patrones de diseño implementados:**

| Patrón | Clase | Justificación |
|---|---|---|
| Builder | `Cart`, `Order` | Objetos complejos con muchos campos opcionales. Permite construir el objeto paso a paso sin constructores gigantes. |
| Singleton | `JwtService`, `SecurityConfig` | Solo debe existir una instancia de configuración de seguridad y generación de tokens en toda la aplicación. |
| Strategy | `PaymentStrategy` | Permite intercambiar la lógica de pago (aprobado/rechazado) sin modificar el código de `OrderService`. Abierto a extensión, cerrado a modificación. |
| Factory Method | `UserFactory` | Centraliza la creación de usuarios con diferentes roles (USER/ADMIN) sin exponer la lógica de construcción al exterior. |

---

### 6. Modelos de Base de Datos

#### 6a. Modelo Relacional — PostgreSQL

![Modelo relacional](./docs/modelo-relacional.png)

#### 6b. Modelo No Relacional — MongoDB

![Modelo no relacional](./docs/modelo-nosql.png)

---

### 7. Seguridad

SportLife implementa **JWT (JSON Web Tokens) + Spring Security**.

**Ventajas:**
- **Stateless** — el servidor no guarda sesiones. El token viaja en cada request en el header `Authorization: Bearer <token>`.
- **Escalable** — cualquier instancia del servidor puede validar el token sin consultar BD.
- El token contiene el rol del usuario → fácil control de permisos por endpoint.
- Expiración configurable → tokens viejos se invalidan automáticamente.

**Flujo de autenticación:**

Login → servidor genera JWT → cliente guarda token
→ cada request envía token en header Authorization: Bearer <token>
→ Spring Security valida el token antes de llegar al controller
→ si válido → accede al recurso / si inválido → 401 Unauthorized


---

### 8. Roles y Permisos

| Rol | Funcionalidades permitidas |
|---|---|
| **GUEST** (no autenticado) | Ver listado de productos (F03), ver detalle de producto (F04) |
| **USER** (autenticado) | Todo lo anterior + agregar al carrito (F05), ver carrito (F06), generar orden (F07), procesar pago (F08) |
| **ADMIN** | Todo lo anterior + crear producto (F09), editar producto (F09), desactivar producto (F09) |

---

### 9. TLS/SSL

TLS/SSL cifra todo el tráfico entre el cliente y el servidor, impidiendo que terceros intercepten credenciales o tokens JWT.

**Implementación en Spring Boot application.yml:**

server:

  ssl:

    key-store: classpath:keystore.p12
    key-store-password: password
    key-store-type: PKCS12
  port: 8443


**Ventajas:**
- Todo el tráfico viaja **cifrado** entre cliente y servidor.
- Protege credenciales y tokens JWT de ser interceptados (ataques man-in-the-middle).
- Garantiza que el cliente está hablando con el servidor real (autenticación del servidor).
- Obligatorio en producción para cualquier API que maneja datos sensibles.

---

### 10. CORS

CORS (Cross-Origin Resource Sharing) controla qué dominios externos pueden hacer requests a la API.

**¿Por qué es importante?** Sin CORS configurado, el browser bloquea cualquier request desde un dominio diferente al del servidor.

**Ventaja de seguridad:** Evita que sitios maliciosos hagan requests a la API usando los tokens de los usuarios autenticados como ataques CSRF

---


### Tecnologías utilizadas

- Java 21
- Spring Boot 3.x
- Maven
- PostgreSQL + Spring Data JPA
- MongoDB + Spring Data MongoDB
- Spring Security + JWT
- Lombok
- Swagger / OpenAPI
- JUnit + Mockito
- JaCoCo
- SonarCloud
- GitHub Actions (CI/CD)
- Azure (Deploy)

### Pipeline CI/CD

> Se activa en cada merge a `develop` y en cada merge a `master`.

<!-- Pega aquí el screenshot del pipeline de GitHub Actions -->
![Pipeline CI/CD](./docs/pipeline.png)


https://github.com/brrbrrbalatropin/ECI-SportLife

### Video demostración




*Confia en el trabajo que hiciste durante el corte*