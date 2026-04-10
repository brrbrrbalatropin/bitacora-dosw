# Requerimientos — Plataforma de Batallas Bakugan

| Código | Nombre | Tipo |
|--------|--------|------|
| RF_01 | Registro de usuario | Funcional |
| RF_02 | Autenticación | Funcional |
| RF_03 | Gestionar perfil | Funcional |
| RF_04 | Coleccionar criaturas | Funcional |
| RF_05 | Mejorar criaturas | Funcional |
| RF_06 | Gestionar inventario | Funcional |
| RF_07 | Crear combate | Funcional |
| RF_08 | Ejecutar combate | Funcional |
| RF_09 | Emparejamiento de jugadores | Funcional |
| RF_10 | Historial de combates | Funcional |
| RF_11 | Rankings | Funcional |
| RF_12 | Persistencia de partidas | Funcional |
| RNF_01 | Seguridad | No Funcional |
| RNF_02 | Disponibilidad | No Funcional |
| RNF_03 | Consistencia de datos | No Funcional |
| RNF_04 | Compatibilidad | No Funcional |
 
---

## RF_01 — Registro de usuario

| | |
|---|---|
| **FUNCIONALIDAD:** | |
| **Código:** | RF_01 |
| **Nombre:** | Registro de usuario |

| | |
|---|---|
| **Descripción:** | Un nuevo usuario se registra en la plataforma con sus datos básicos para acceder a las funcionalidades del sistema. |
| **Cómo se ejecutará:** | Mediante un formulario de registro en la plataforma web. |
| **Actor principal:** | Usuario |
| **Precondiciones:** | El usuario no debe tener una cuenta existente. |

**DATOS DE ENTRADA**

| Nombre | Descripción | Tipo de campo | Reglas / Aplicación | Obligatorio |
|--------|------------|---------------|---------------------|-------------|
| Nombre de usuario | Nombre único que identifica al jugador | String | Debe ser único en el sistema, máximo 30 caracteres | Sí |
| Correo electrónico | Correo del usuario | String | Formato de correo válido (example@domain.com) | Sí |
| Contraseña | Contraseña de acceso | String (cifrado) | Mínimo 8 caracteres, debe incluir letras y números | Sí |

**DATOS DE SALIDA**

| Nombre | Descripción | Tipo de campo | Reglas / Aplicación | Obligatorio |
|--------|------------|---------------|---------------------|-------------|
| Confirmación de registro | El sistema muestra mensaje de éxito y redirige al inicio de sesión | String | | Sí |

**FLUJO BÁSICO:**

| Paso | Actor | Descripción | Excepciones |
|------|-------|-------------|-------------|
| 1 | Usuario | Accede al formulario de registro | |
| 2 | Usuario | Diligencia nombre de usuario, correo y contraseña | |
| 3 | Sistema | Valida los datos ingresados | Datos inválidos o correo ya registrado |
| 4 | Sistema | Crea la cuenta y muestra confirmación | |

**FLUJO ALTERNO:**

| Paso | Actor | Descripción | Excepciones |
|------|-------|-------------|-------------|
| 3 | Sistema | Si el correo o nombre de usuario ya existen, muestra mensaje de error y permite corregir | |

| | |
|---|---|
| **Notas y comentarios:** | El usuario inicia con un inventario vacío y sin criaturas asignadas. |

**REGLAS DE NEGOCIO**

| No. | Descripción |
|-----|------------|
| 1 | El correo electrónico debe ser único en el sistema. |
| 2 | El nombre de usuario debe ser único en el sistema. |
| 3 | La contraseña debe cumplir los requisitos mínimos de seguridad. |

**HISTORIAL DE REVISIÓN**

| Elaborado por | Aprobado por | Fecha | Descripción y Justificación de Cambios |
|--------------|-------------|-------|----------------------------------------|
| Equipo Naranja | | | Versión inicial |
 
---

## RF_02 — Autenticación

| | |
|---|---|
| **FUNCIONALIDAD:** | |
| **Código:** | RF_02 |
| **Nombre:** | Autenticación |

| | |
|---|---|
| **Descripción:** | Un usuario registrado inicia sesión en la plataforma con sus credenciales para acceder a sus funcionalidades. |
| **Cómo se ejecutará:** | Mediante un formulario de inicio de sesión en la plataforma web. |
| **Actor principal:** | Usuario |
| **Precondiciones:** | El usuario debe tener una cuenta registrada. |

**DATOS DE ENTRADA**

| Nombre | Descripción | Tipo de campo | Reglas / Aplicación | Obligatorio |
|--------|------------|---------------|---------------------|-------------|
| Correo electrónico | Correo con el que se registró | String | Formato de correo válido | Sí |
| Contraseña | Contraseña de acceso | String (cifrado) | | Sí |

**DATOS DE SALIDA**

| Nombre | Descripción | Tipo de campo | Reglas / Aplicación | Obligatorio |
|--------|------------|---------------|---------------------|-------------|
| Token de sesión | Token de autenticación generado para el usuario | String (JWT) | Expira después de 24 horas | Sí |

**FLUJO BÁSICO:**

| Paso | Actor | Descripción | Excepciones |
|------|-------|-------------|-------------|
| 1 | Usuario | Accede al formulario de inicio de sesión | |
| 2 | Usuario | Ingresa correo y contraseña | |
| 3 | Sistema | Valida las credenciales | Credenciales incorrectas |
| 4 | Sistema | Genera token de sesión y redirige al panel principal | |

**FLUJO ALTERNO:**

| Paso | Actor | Descripción | Excepciones |
|------|-------|-------------|-------------|
| 3 | Sistema | Si las credenciales son incorrectas, muestra mensaje de error | |

| | |
|---|---|
| **Notas y comentarios:** | Después de 5 intentos fallidos, la cuenta debe bloquearse temporalmente. |

**REGLAS DE NEGOCIO**

| No. | Descripción |
|-----|------------|
| 1 | Las credenciales deben coincidir con las registradas en el sistema. |
| 2 | Después de 5 intentos fallidos consecutivos, la cuenta se bloquea temporalmente por 15 minutos. |

**HISTORIAL DE REVISIÓN**

| Elaborado por | Aprobado por | Fecha | Descripción y Justificación de Cambios |
|--------------|-------------|-------|----------------------------------------|
| Equipo Naranja | | | Versión inicial |
 
---

## RF_03 — Gestionar perfil

| | |
|---|---|
| **FUNCIONALIDAD:** | |
| **Código:** | RF_03 |
| **Nombre:** | Gestionar perfil |

| | |
|---|---|
| **Descripción:** | El usuario puede ver y editar su perfil dentro de la plataforma, incluyendo su información personal y estadísticas de juego. |
| **Cómo se ejecutará:** | Mediante una sección de perfil en la plataforma web. |
| **Actor principal:** | Usuario |
| **Precondiciones:** | El usuario debe estar autenticado. |

**DATOS DE ENTRADA**

| Nombre | Descripción | Tipo de campo | Reglas / Aplicación | Obligatorio |
|--------|------------|---------------|---------------------|-------------|
| Nombre de usuario | Nombre visible en la plataforma | String | Debe ser único, máximo 30 caracteres | No |
| Avatar | Imagen de perfil del jugador | File (JPG, PNG) | Máximo 2 MB | No |

**DATOS DE SALIDA**

| Nombre | Descripción | Tipo de campo | Reglas / Aplicación | Obligatorio |
|--------|------------|---------------|---------------------|-------------|
| Perfil actualizado | El sistema muestra el perfil con los datos actualizados | Object (Usuario) | | Sí |

**FLUJO BÁSICO:**

| Paso | Actor | Descripción | Excepciones |
|------|-------|-------------|-------------|
| 1 | Usuario | Accede a su perfil | |
| 2 | Usuario | Edita los campos deseados | |
| 3 | Sistema | Valida los datos ingresados | Datos inválidos o nombre duplicado |
| 4 | Sistema | Guarda los cambios y muestra confirmación | |

**FLUJO ALTERNO:**

| Paso | Actor | Descripción | Excepciones |
|------|-------|-------------|-------------|
| 3 | Sistema | Si el nombre de usuario ya existe, muestra error y permite corregir | |

| | |
|---|---|
| **Notas y comentarios:** | El perfil también muestra estadísticas de combate como victorias, derrotas y ranking actual. |

**REGLAS DE NEGOCIO**

| No. | Descripción |
|-----|------------|
| 1 | El nombre de usuario debe ser único en el sistema. |
| 2 | El correo electrónico no puede ser modificado por el usuario. |

**HISTORIAL DE REVISIÓN**

| Elaborado por | Aprobado por | Fecha | Descripción y Justificación de Cambios |
|--------------|-------------|-------|----------------------------------------|
| Equipo Naranja | | | Versión inicial |
 
---

## RF_04 — Coleccionar criaturas

| | |
|---|---|
| **FUNCIONALIDAD:** | |
| **Código:** | RF_04 |
| **Nombre:** | Coleccionar criaturas |

| | |
|---|---|
| **Descripción:** | El usuario puede adquirir criaturas Bakugan para su colección mediante el sistema de la plataforma. |
| **Cómo se ejecutará:** | Mediante una sección de colección en la plataforma web. |
| **Actor principal:** | Usuario |
| **Precondiciones:** | El usuario debe estar autenticado. |

**DATOS DE ENTRADA**

| Nombre | Descripción | Tipo de campo | Reglas / Aplicación | Obligatorio |
|--------|------------|---------------|---------------------|-------------|
| ID de criatura | Identificador de la criatura a adquirir | Long | Debe existir en el catálogo del sistema | Sí |

**DATOS DE SALIDA**

| Nombre | Descripción | Tipo de campo | Reglas / Aplicación | Obligatorio |
|--------|------------|---------------|---------------------|-------------|
| Criatura adquirida | Objeto con los datos de la criatura agregada al inventario | Object (Criatura) | | Sí |

**FLUJO BÁSICO:**

| Paso | Actor | Descripción | Excepciones |
|------|-------|-------------|-------------|
| 1 | Usuario | Accede a la sección de colección | |
| 2 | Usuario | Selecciona una criatura para adquirir | |
| 3 | Sistema | Valida que el usuario puede adquirir la criatura | Criatura no disponible |
| 4 | Sistema | Agrega la criatura al inventario y muestra confirmación | |

**FLUJO ALTERNO:**

| Paso | Actor | Descripción | Excepciones |
|------|-------|-------------|-------------|
| 3 | Sistema | Si la criatura no está disponible, muestra mensaje informativo | |

| | |
|---|---|
| **Notas y comentarios:** | El mecanismo exacto de adquisición (compra, recompensa, etc.) debe ser validado con el cliente. |

**REGLAS DE NEGOCIO**

| No. | Descripción |
|-----|------------|
| 1 | Cada usuario puede tener múltiples criaturas en su colección. |
| 2 | Una criatura puede pertenecer a varios usuarios simultáneamente. |

**HISTORIAL DE REVISIÓN**

| Elaborado por | Aprobado por | Fecha | Descripción y Justificación de Cambios |
|--------------|-------------|-------|----------------------------------------|
| Equipo Naranja | | | Versión inicial |
 
---

## RF_05 — Mejorar criaturas

| | |
|---|---|
| **FUNCIONALIDAD:** | |
| **Código:** | RF_05 |
| **Nombre:** | Mejorar criaturas |

| | |
|---|---|
| **Descripción:** | El usuario puede mejorar las estadísticas y habilidades de sus criaturas para hacerlas más poderosas en combate. |
| **Cómo se ejecutará:** | Mediante una sección de mejoras en el detalle de cada criatura. |
| **Actor principal:** | Usuario |
| **Precondiciones:** | El usuario debe estar autenticado y tener al menos una criatura en su inventario. |

**DATOS DE ENTRADA**

| Nombre | Descripción | Tipo de campo | Reglas / Aplicación | Obligatorio |
|--------|------------|---------------|---------------------|-------------|
| ID de criatura | Identificador de la criatura a mejorar | Long | Debe pertenecer al usuario | Sí |
| ID de mejora | Identificador del tipo de mejora a aplicar | Long | Debe estar disponible para esa criatura | Sí |

**DATOS DE SALIDA**

| Nombre | Descripción | Tipo de campo | Reglas / Aplicación | Obligatorio |
|--------|------------|---------------|---------------------|-------------|
| Criatura mejorada | Objeto con las estadísticas actualizadas de la criatura | Object (Criatura) | | Sí |

**FLUJO BÁSICO:**

| Paso | Actor | Descripción | Excepciones |
|------|-------|-------------|-------------|
| 1 | Usuario | Accede al detalle de una criatura de su inventario | |
| 2 | Usuario | Selecciona una mejora disponible | |
| 3 | Sistema | Valida que la mejora pueda aplicarse | Mejora no disponible o requisitos no cumplidos |
| 4 | Sistema | Aplica la mejora y actualiza las estadísticas | |

**FLUJO ALTERNO:**

| Paso | Actor | Descripción | Excepciones |
|------|-------|-------------|-------------|
| 3 | Sistema | Si no se cumplen los requisitos para la mejora, muestra mensaje de error | |

| | |
|---|---|
| **Notas y comentarios:** | El sistema de mejoras debe estar balanceado para garantizar combates justos. |

**REGLAS DE NEGOCIO**

| No. | Descripción |
|-----|------------|
| 1 | Cada criatura tiene un nivel máximo de mejora. |
| 2 | Las mejoras deben aplicarse de forma progresiva y no pueden revertirse. |

**HISTORIAL DE REVISIÓN**

| Elaborado por | Aprobado por | Fecha | Descripción y Justificación de Cambios |
|--------------|-------------|-------|----------------------------------------|
| Equipo Naranja | | | Versión inicial |
 
---

## RF_06 — Gestionar inventario

| | |
|---|---|
| **FUNCIONALIDAD:** | |
| **Código:** | RF_06 |
| **Nombre:** | Gestionar inventario |

| | |
|---|---|
| **Descripción:** | El usuario puede consultar y organizar su inventario de criaturas Bakugan. |
| **Cómo se ejecutará:** | Mediante una sección de inventario en la plataforma web. |
| **Actor principal:** | Usuario |
| **Precondiciones:** | El usuario debe estar autenticado. |

**DATOS DE ENTRADA**

| Nombre | Descripción | Tipo de campo | Reglas / Aplicación | Obligatorio |
|--------|------------|---------------|---------------------|-------------|
| Filtro por nombre | Nombre o parte del nombre de la criatura | String | | No |
| Filtro por nivel | Nivel de la criatura | Integer | Valor entre 1 y el nivel máximo | No |

**DATOS DE SALIDA**

| Nombre | Descripción | Tipo de campo | Reglas / Aplicación | Obligatorio |
|--------|------------|---------------|---------------------|-------------|
| Lista de criaturas | Criaturas del usuario con sus estadísticas actuales | List (Criatura) | | Sí |

**FLUJO BÁSICO:**

| Paso | Actor | Descripción | Excepciones |
|------|-------|-------------|-------------|
| 1 | Usuario | Accede a la sección de inventario | |
| 2 | Sistema | Muestra todas las criaturas del usuario | Inventario vacío |
| 3 | Usuario | Opcionalmente aplica filtros | |
| 4 | Sistema | Actualiza la lista según los filtros aplicados | |

**FLUJO ALTERNO:**

| Paso | Actor | Descripción | Excepciones |
|------|-------|-------------|-------------|
| 2 | Sistema | Si el inventario está vacío, muestra mensaje informativo | |

| | |
|---|---|
| **Notas y comentarios:** | El inventario debe mostrar el nivel y estadísticas actuales de cada criatura. |

**REGLAS DE NEGOCIO**

| No. | Descripción |
|-----|------------|
| 1 | El inventario solo muestra las criaturas que pertenecen al usuario autenticado. |

**HISTORIAL DE REVISIÓN**

| Elaborado por | Aprobado por | Fecha | Descripción y Justificación de Cambios |
|--------------|-------------|-------|----------------------------------------|
| Equipo Naranja | | | Versión inicial |
 
---

## RF_07 — Crear combate

| | |
|---|---|
| **FUNCIONALIDAD:** | |
| **Código:** | RF_07 |
| **Nombre:** | Crear combate |

| | |
|---|---|
| **Descripción:** | El usuario puede iniciar un combate contra otro jugador seleccionando su criatura y al oponente. |
| **Cómo se ejecutará:** | Mediante una sección de combates en la plataforma web. |
| **Actor principal:** | Usuario |
| **Precondiciones:** | El usuario debe estar autenticado y tener al menos una criatura en su inventario. |

**DATOS DE ENTRADA**

| Nombre | Descripción | Tipo de campo | Reglas / Aplicación | Obligatorio |
|--------|------------|---------------|---------------------|-------------|
| ID de criatura | Identificador de la criatura del usuario que participará | Long | Debe pertenecer al usuario | Sí |
| ID de oponente | Identificador del jugador retado | Long | Debe ser un usuario diferente al retador | Sí |

**DATOS DE SALIDA**

| Nombre | Descripción | Tipo de campo | Reglas / Aplicación | Obligatorio |
|--------|------------|---------------|---------------------|-------------|
| ID de combate | Identificador del combate creado | Long | | Sí |
| Estado del combate | Estado inicial del combate | String (Enum: PENDIENTE) | | Sí |

**FLUJO BÁSICO:**

| Paso | Actor | Descripción | Excepciones |
|------|-------|-------------|-------------|
| 1 | Usuario | Accede a la sección de combates | |
| 2 | Usuario | Selecciona su criatura y al oponente | |
| 3 | Sistema | Valida que el combate pueda realizarse | Oponente no disponible |
| 4 | Sistema | Crea el combate y notifica al oponente | |

**FLUJO ALTERNO:**

| Paso | Actor | Descripción | Excepciones |
|------|-------|-------------|-------------|
| 3 | Sistema | Si el oponente no está disponible, muestra mensaje informativo | |

| | |
|---|---|
| **Notas y comentarios:** | Los combates no son en tiempo real, pero deben mantener consistencia en los resultados. |

**REGLAS DE NEGOCIO**

| No. | Descripción |
|-----|------------|
| 1 | Un usuario no puede retarse a sí mismo. |
| 2 | El oponente debe tener al menos una criatura en su inventario. |

**HISTORIAL DE REVISIÓN**

| Elaborado por | Aprobado por | Fecha | Descripción y Justificación de Cambios |
|--------------|-------------|-------|----------------------------------------|
| Equipo Naranja | | | Versión inicial |
 
---

## RF_08 — Ejecutar combate

| | |
|---|---|
| **FUNCIONALIDAD:** | |
| **Código:** | RF_08 |
| **Nombre:** | Ejecutar combate |

| | |
|---|---|
| **Descripción:** | El sistema ejecuta el combate entre dos jugadores y determina el resultado de forma consistente basándose en las estadísticas de las criaturas. |
| **Cómo se ejecutará:** | Proceso automático del sistema al aceptar el combate. |
| **Actor principal:** | Sistema |
| **Precondiciones:** | El combate debe haber sido creado y el oponente debe haberlo aceptado. |

**DATOS DE ENTRADA**

| Nombre | Descripción | Tipo de campo | Reglas / Aplicación | Obligatorio |
|--------|------------|---------------|---------------------|-------------|
| ID de combate | Identificador del combate a ejecutar | Long | Debe existir y estar en estado PENDIENTE | Sí |
| ID de criatura oponente | Criatura seleccionada por el oponente | Long | Debe pertenecer al oponente | Sí |

**DATOS DE SALIDA**

| Nombre | Descripción | Tipo de campo | Reglas / Aplicación | Obligatorio |
|--------|------------|---------------|---------------------|-------------|
| ID ganador | Identificador del jugador ganador | Long | | Sí |
| ID perdedor | Identificador del jugador perdedor | Long | | Sí |
| Resumen | Descripción del desarrollo del combate | String | | Sí |

**FLUJO BÁSICO:**

| Paso | Actor | Descripción | Excepciones |
|------|-------|-------------|-------------|
| 1 | Oponente | Acepta el combate y selecciona su criatura | |
| 2 | Sistema | Calcula el resultado basándose en las estadísticas de ambas criaturas | |
| 3 | Sistema | Registra el resultado y notifica a ambos jugadores | |
| 4 | Sistema | Actualiza el ranking y estadísticas de ambos jugadores | |

**FLUJO ALTERNO:**

| Paso | Actor | Descripción | Excepciones |
|------|-------|-------------|-------------|
| 1 | Oponente | Si rechaza el combate, se notifica al retador y el combate queda cancelado | |

| | |
|---|---|
| **Notas y comentarios:** | El resultado debe ser determinista dado el mismo estado de las criaturas para garantizar consistencia. |

**REGLAS DE NEGOCIO**

| No. | Descripción |
|-----|------------|
| 1 | El resultado del combate debe ser consistente y reproducible. |
| 2 | Las estadísticas del ranking se actualizan automáticamente tras cada combate. |

**HISTORIAL DE REVISIÓN**

| Elaborado por | Aprobado por | Fecha | Descripción y Justificación de Cambios |
|--------------|-------------|-------|----------------------------------------|
| Equipo Naranja | | | Versión inicial |
 
---

## RF_09 — Emparejamiento de jugadores

| | |
|---|---|
| **FUNCIONALIDAD:** | |
| **Código:** | RF_09 |
| **Nombre:** | Emparejamiento de jugadores |

| | |
|---|---|
| **Descripción:** | El sistema sugiere emparejamientos justos entre jugadores con niveles similares para garantizar combates equilibrados. |
| **Cómo se ejecutará:** | Mediante un sistema de matchmaking automático en la plataforma. |
| **Actor principal:** | Sistema |
| **Precondiciones:** | El usuario debe estar autenticado y tener al menos una criatura en su inventario. |

**DATOS DE ENTRADA**

| Nombre | Descripción | Tipo de campo | Reglas / Aplicación | Obligatorio |
|--------|------------|---------------|---------------------|-------------|
| ID de usuario | Identificador del usuario que solicita emparejamiento | Long | Debe estar autenticado | Sí |

**DATOS DE SALIDA**

| Nombre | Descripción | Tipo de campo | Reglas / Aplicación | Obligatorio |
|--------|------------|---------------|---------------------|-------------|
| ID de oponente sugerido | Identificador del jugador sugerido | Long | | Sí |
| Puntuación del oponente | Puntuación actual del oponente sugerido | Integer | | Sí |

**FLUJO BÁSICO:**

| Paso | Actor | Descripción | Excepciones |
|------|-------|-------------|-------------|
| 1 | Usuario | Solicita un emparejamiento automático | |
| 2 | Sistema | Busca jugadores con nivel similar | Sin jugadores disponibles |
| 3 | Sistema | Sugiere un oponente al usuario | |
| 4 | Usuario | Acepta o rechaza el emparejamiento sugerido | |

**FLUJO ALTERNO:**

| Paso | Actor | Descripción | Excepciones |
|------|-------|-------------|-------------|
| 2 | Sistema | Si no hay jugadores disponibles con nivel similar, amplía el rango de búsqueda | |

| | |
|---|---|
| **Notas y comentarios:** | El criterio exacto de nivel similar debe ser validado con el cliente. |

**REGLAS DE NEGOCIO**

| No. | Descripción |
|-----|------------|
| 1 | El sistema debe priorizar emparejamientos entre jugadores con puntuaciones similares. |
| 2 | Un usuario no puede ser emparejado consigo mismo. |

**HISTORIAL DE REVISIÓN**

| Elaborado por | Aprobado por | Fecha | Descripción y Justificación de Cambios |
|--------------|-------------|-------|----------------------------------------|
| Equipo Naranja | | | Versión inicial |
 
---

## RF_10 — Historial de combates

| | |
|---|---|
| **FUNCIONALIDAD:** | |
| **Código:** | RF_10 |
| **Nombre:** | Historial de combates |

| | |
|---|---|
| **Descripción:** | El usuario puede consultar el historial completo de sus combates anteriores con sus resultados. |
| **Cómo se ejecutará:** | Mediante una sección de historial en la plataforma web. |
| **Actor principal:** | Usuario |
| **Precondiciones:** | El usuario debe estar autenticado y haber participado en al menos un combate. |

**DATOS DE ENTRADA**

| Nombre | Descripción | Tipo de campo | Reglas / Aplicación | Obligatorio |
|--------|------------|---------------|---------------------|-------------|
| Fecha inicio | Fecha desde la cual filtrar combates | LocalDate | Debe ser anterior o igual a fecha fin | No |
| Fecha fin | Fecha hasta la cual filtrar combates | LocalDate | Debe ser posterior o igual a fecha inicio | No |
| Resultado | Filtrar por resultado del combate | String (Enum: VICTORIA, DERROTA) | | No |

**DATOS DE SALIDA**

| Nombre | Descripción | Tipo de campo | Reglas / Aplicación | Obligatorio |
|--------|------------|---------------|---------------------|-------------|
| Lista de combates | Combates anteriores con fecha, oponente y resultado | List (Combate) | | Sí |

**FLUJO BÁSICO:**

| Paso | Actor | Descripción | Excepciones |
|------|-------|-------------|-------------|
| 1 | Usuario | Accede a la sección de historial | |
| 2 | Sistema | Muestra todos los combates del usuario ordenados por fecha | Sin combates registrados |
| 3 | Usuario | Opcionalmente aplica filtros | |
| 4 | Sistema | Actualiza la lista según los filtros | |

**FLUJO ALTERNO:**

| Paso | Actor | Descripción | Excepciones |
|------|-------|-------------|-------------|
| 2 | Sistema | Si no hay combates, muestra mensaje informativo | |

| | |
|---|---|
| **Notas y comentarios:** | Los resultados de los combates deben persistir incluso si un jugador elimina su cuenta. |

**REGLAS DE NEGOCIO**

| No. | Descripción |
|-----|------------|
| 1 | El historial debe mostrar únicamente los combates en los que participó el usuario autenticado. |
| 2 | Los combates se muestran en orden cronológico descendente por defecto. |

**HISTORIAL DE REVISIÓN**

| Elaborado por | Aprobado por | Fecha | Descripción y Justificación de Cambios |
|--------------|-------------|-------|----------------------------------------|
| Equipo Naranja | | | Versión inicial |
 
---

## RF_11 — Rankings

| | |
|---|---|
| **FUNCIONALIDAD:** | |
| **Código:** | RF_11 |
| **Nombre:** | Rankings |

| | |
|---|---|
| **Descripción:** | El sistema calcula y muestra un ranking global de jugadores basado en sus resultados de combate. |
| **Cómo se ejecutará:** | Mediante una sección de rankings en la plataforma web. |
| **Actor principal:** | Sistema (consulta: todos los usuarios) |
| **Precondiciones:** | Debe haber al menos un combate registrado en el sistema. |

**DATOS DE ENTRADA**

| Nombre | Descripción | Tipo de campo | Reglas / Aplicación | Obligatorio |
|--------|------------|---------------|---------------------|-------------|
| — | No requiere entrada manual. Se calcula a partir de los resultados de combates | — | | — |

**DATOS DE SALIDA**

| Nombre | Descripción | Tipo de campo | Reglas / Aplicación | Obligatorio |
|--------|------------|---------------|---------------------|-------------|
| Lista de jugadores | Jugadores ordenados por puntuación | List (Usuario) | | Sí |
| Posición del usuario | Posición actual del usuario en el ranking | Integer | | Sí |
| Puntuación | Puntuación acumulada de cada jugador | Integer | | Sí |

**FLUJO BÁSICO:**

| Paso | Actor | Descripción | Excepciones |
|------|-------|-------------|-------------|
| 1 | Usuario | Accede a la sección de rankings | |
| 2 | Sistema | Calcula y muestra el ranking actualizado | |

**FLUJO ALTERNO:**

| Paso | Actor | Descripción | Excepciones |
|------|-------|-------------|-------------|
| 2 | Sistema | Si no hay combates registrados, muestra ranking vacío | |

| | |
|---|---|
| **Notas y comentarios:** | El ranking se actualiza automáticamente tras cada combate. |

**REGLAS DE NEGOCIO**

| No. | Descripción |
|-----|------------|
| 1 | El ranking se ordena por puntuación de mayor a menor. |
| 2 | La puntuación se calcula en base a victorias, derrotas y nivel de los oponentes. |

**HISTORIAL DE REVISIÓN**

| Elaborado por | Aprobado por | Fecha | Descripción y Justificación de Cambios |
|--------------|-------------|-------|----------------------------------------|
| Equipo Naranja | | | Versión inicial |
 
---

## RF_12 — Persistencia de partidas

| | |
|---|---|
| **FUNCIONALIDAD:** | |
| **Código:** | RF_12 |
| **Nombre:** | Persistencia de partidas |

| | |
|---|---|
| **Descripción:** | El sistema almacena de forma permanente la información de todos los combates, incluyendo estado, resultado y participantes. |
| **Cómo se ejecutará:** | Proceso automático del sistema al finalizar cada combate. |
| **Actor principal:** | Sistema |
| **Precondiciones:** | Debe haber finalizado un combate. |

**DATOS DE ENTRADA**

| Nombre | Descripción | Tipo de campo | Reglas / Aplicación | Obligatorio |
|--------|------------|---------------|---------------------|-------------|
| ID retador | Identificador del jugador que inició el combate | Long | | Sí |
| ID oponente | Identificador del jugador retado | Long | | Sí |
| ID criatura retador | Identificador de la criatura del retador | Long | | Sí |
| ID criatura oponente | Identificador de la criatura del oponente | Long | | Sí |
| ID ganador | Identificador del jugador ganador | Long | | Sí |
| Fecha | Fecha y hora en que se realizó el combate | LocalDateTime | | Sí |

**DATOS DE SALIDA**

| Nombre | Descripción | Tipo de campo | Reglas / Aplicación | Obligatorio |
|--------|------------|---------------|---------------------|-------------|
| ID de registro | Identificador del combate persistido | Long | | Sí |

**FLUJO BÁSICO:**

| Paso | Actor | Descripción | Excepciones |
|------|-------|-------------|-------------|
| 1 | Sistema | Al finalizar un combate, recopila todos los datos relevantes | |
| 2 | Sistema | Almacena la información en la base de datos | Error de persistencia |
| 3 | Sistema | Confirma el almacenamiento y actualiza el historial de ambos jugadores | |

**FLUJO ALTERNO:**

| Paso | Actor | Descripción | Excepciones |
|------|-------|-------------|-------------|
| 2 | Sistema | Si ocurre un error de persistencia, reintenta el almacenamiento | |

| | |
|---|---|
| **Notas y comentarios:** | La información de los combates no debe perderse bajo ninguna circunstancia. |

**REGLAS DE NEGOCIO**

| No. | Descripción |
|-----|------------|
| 1 | Todo combate finalizado debe quedar registrado en el sistema. |
| 2 | Los datos de un combate no pueden ser modificados una vez persistidos. |

**HISTORIAL DE REVISIÓN**

| Elaborado por | Aprobado por | Fecha | Descripción y Justificación de Cambios |
|--------------|-------------|-------|----------------------------------------|
| Equipo Naranja | | | Versión inicial |
 
---

# Requerimientos No Funcionales

| Código | Nombre | Descripción |
|--------|--------|-------------|
| RNF_01 | Seguridad | Las contraseñas deben almacenarse cifradas con bcrypt y las comunicaciones deben realizarse sobre HTTPS. |
| RNF_02 | Disponibilidad | El sistema debe estar disponible al menos el 95% del tiempo. |
| RNF_03 | Consistencia de datos | El sistema debe garantizar que los resultados de los combates sean consistentes y no presenten inconsistencias. |
| RNF_04 | Compatibilidad | La plataforma debe funcionar correctamente en Chrome, Firefox, Edge y Safari (últimas 2 versiones). |