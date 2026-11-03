
# SERVICIO NACIONAL DE APRENDIZAJE – SENA

## ANÁLISIS Y DESARROLLO DE SOFTWARE

### EVIDENCIA GA7-220501096-AA1-EV01

**INFORME TÉCNICO DEL PLAN DE TRABAJO PARA LA CONSTRUCCIÓN DE SOFTWARE**

**Proyecto formativo:** RECTISOFT – Sistema de Gestión para una Rectificadora de Motores

**Aprendiz:** Jaime Leonardo Navarrete González

**Instructor:** [Nombre del instructor]

**Centro de formación:** [Nombre del centro]

**Fecha:** Noviembre de 2026

---

# 1. INTRODUCCIÓN

El desarrollo de software requiere una planificación técnica que permita organizar las actividades, seleccionar las herramientas adecuadas y establecer mecanismos de control durante las diferentes etapas de construcción de una aplicación.

El presente informe técnico tiene como finalidad establecer el plan de trabajo para la construcción de RECTISOFT, un sistema de información diseñado para apoyar la gestión administrativa y operativa de una empresa dedicada a la rectificación de motores.

RECTISOFT contempla módulos para administrar clientes, órdenes de trabajo, mecánicos, servicios, inventarios y reportes, facilitando la organización de la información y el seguimiento de los procesos.

Asimismo, se plantea la utilización de herramientas de desarrollo y tecnologías de control de versiones que permitan mantener organizado el código fuente, registrar modificaciones y mejorar la trazabilidad del proyecto.

# 2. OBJETIVOS

## 2.1. Objetivo general

Elaborar un plan de trabajo técnico para la construcción del sistema RECTISOFT, mediante la identificación de herramientas de desarrollo, tecnologías de versionamiento y actividades necesarias para implementar una solución de software organizada, funcional y mantenible.

## 2.2. Objetivos específicos

- Identificar las herramientas y tecnologías apropiadas para desarrollar el sistema RECTISOFT.
- Seleccionar una herramienta de control de versiones para administrar los cambios del código fuente.
- Establecer las etapas y actividades del proceso de construcción del software.
- Documentar la estructura de una clase Java mediante atributos, constructores y métodos.
- Representar la clase Notificacion mediante un diagrama UML.
- Definir mecanismos básicos de verificación, documentación y seguimiento del desarrollo.

---

# 3. DESCRIPCIÓN DEL PROYECTO RECTISOFT

RECTISOFT es una propuesta de software orientada a la administración de una rectificadora de motores.

Su propósito es facilitar el registro y consulta de clientes, la gestión de órdenes de trabajo, el control de servicios realizados, la administración de inventarios y la generación de reportes.

El sistema se proyecta como una aplicación web con una interfaz adaptable a computadores y dispositivos móviles.

Entre sus principales módulos se encuentran:

- **Inicio o dashboard:** visualización general de la información del negocio.
- **Clientes:** registro y actualización de información.
- **Órdenes de trabajo:** creación, consulta y seguimiento de servicios.
- **Mecánicos:** administración de personal técnico.
- **Inventario:** control de productos, repuestos y movimientos.
- **Reportes:** consulta de información administrativa y operativa.
- **Usuarios:** administración de accesos y funciones del sistema.

La implementación de estos módulos busca mejorar la organización de los procesos y reducir la dependencia de registros manuales.

---

# 4. SELECCIÓN DE HERRAMIENTAS DE DESARROLLO

Para la construcción del sistema RECTISOFT se seleccionan herramientas que facilitan la escritura del código, la organización de los archivos, la ejecución de pruebas y el mantenimiento del proyecto.

## 4.1. Visual Studio Code

Se utilizará Visual Studio Code como entorno principal de desarrollo. Permite editar archivos HTML, CSS, JavaScript y Java, organizar carpetas y utilizar extensiones que facilitan el trabajo del desarrollador.

## 4.2. Java Development Kit (JDK)

Se utiliza Java Development Kit para compilar y ejecutar las clases desarrolladas en Java. Para este proyecto se cuenta con OpenJDK 21, distribución Eclipse Temurin 21.0.13.

## 4.3. HTML5

Se utilizará HTML5 para estructurar las páginas y los componentes de la interfaz web de RECTISOFT.

## 4.4. CSS3

Se utilizará CSS3 para definir los estilos, colores, distribución y adaptación de la interfaz a diferentes tamaños de pantalla.

## 4.5. JavaScript

Se utilizará JavaScript para implementar las interacciones de la interfaz, validar formularios y gestionar determinados comportamientos del sistema.

## 4.6. Git

Git es el sistema de control de versiones seleccionado para realizar el seguimiento de los cambios del código fuente. Permite registrar versiones, recuperar modificaciones anteriores y mantener un historial organizado del desarrollo.

## 4.7. GitHub

GitHub se propone como plataforma de alojamiento del repositorio remoto del proyecto. Permitirá mantener una copia del código en la nube, facilitar el trabajo colaborativo y respaldar los avances del sistema.

**Nota:** Visual Studio Code y JDK 21 ya se encuentran instalados y se han utilizado durante el desarrollo. Git y GitHub se contemplan como herramientas de versionamiento que se deben configurar para el seguimiento formal del proyecto.

# 5. TECNOLOGÍAS DE CONTROL DE VERSIONES

El control de versiones permite registrar y administrar los cambios que se realizan durante la construcción de un software.

Para RECTISOFT se propone utilizar Git como herramienta principal de versionamiento y GitHub como repositorio remoto.

## 5.1. Características de Git

- Permite registrar los cambios realizados en los archivos.
- Facilita la recuperación de versiones anteriores.
- Mantiene un historial de modificaciones.
- Permite crear ramas para desarrollar nuevas funcionalidades.
- Facilita la integración de cambios realizados por diferentes colaboradores.

## 5.2. Uso de GitHub

GitHub permitirá alojar el repositorio remoto de RECTISOFT y conservar una copia del proyecto. También facilitará la consulta de los cambios y el seguimiento de las diferentes etapas de construcción.

## 5.3. Estrategia de versionamiento

Se propone aplicar el siguiente procedimiento:

1. Crear un repositorio local para el proyecto RECTISOFT.
2. Registrar la primera versión del código fuente.
3. Realizar confirmaciones de cambios mediante commits.
4. Utilizar ramas para desarrollar nuevas funcionalidades.
5. Integrar los cambios en la rama principal después de revisarlos.
6. Sincronizar los avances con el repositorio remoto de GitHub.

## 5.4. Ejemplo de comandos Git

Los siguientes comandos representan el procedimiento básico propuesto para administrar el proyecto:

```bash
git init
git add .
git commit -m "Primera version de RECTISOFT"
git branch -M main
git remote add origin URL_DEL_REPOSITORIO
git push -u origin main
```

La dirección URL del repositorio deberá reemplazarse por la dirección real que se obtenga al crear el repositorio en GitHub.

---

# 6. PLAN DE TRABAJO PARA LA CONSTRUCCIÓN DEL SOFTWARE

El desarrollo de RECTISOFT se realizará mediante etapas organizadas que permitirán construir, verificar y mejorar progresivamente el sistema de información para la Rectificadora de Motores Navarrete.

## 6.1. Etapas del proyecto

| Etapa | Actividades | Herramientas |
|---|---|---|
| 1. Análisis | Identificación de necesidades y requerimientos del taller. | Documentación, Word |
| 2. Diseño | Diseño de interfaces, estructura del sistema y diagramas UML. | Visual Studio Code, herramientas UML |
| 3. Desarrollo | Construcción de interfaces y programación de funcionalidades. | HTML5, CSS3, JavaScript y Java |
| 4. Base de datos | Diseño y creación de tablas, relaciones y restricciones. | MySQL Workbench |
| 5. Pruebas | Verificación del funcionamiento de las clases y componentes. | JDK 21, Visual Studio Code |
| 6. Versionamiento | Registro y seguimiento de los cambios del código fuente. | Git y GitHub |
| 7. Documentación | Elaboración y organización de los documentos técnicos. | Visual Studio Code, Markdown |

## 6.2. Cronograma de actividades

| Actividad | Tiempo estimado |
|---|---|
| Análisis de requerimientos | Semana 1 |
| Diseño de interfaces y UML | Semana 2 |
| Desarrollo de módulos | Semanas 3 y 4 |
| Construcción de base de datos | Semana 5 |
| Pruebas y correcciones | Semana 6 |
| Control de versiones y documentación | Semana 7 |

## 6.3. Resultados esperados

Al finalizar las etapas se espera contar con una versión funcional y organizada de RECTISOFT, con módulos para la administración de clientes, órdenes de trabajo, servicios, mecánicos, inventario y reportes.

También se espera disponer de documentación técnica, clases programadas en Java, diagramas UML y un procedimiento de control de versiones que permita mantener un historial de los cambios realizados.

# 7. IMPLEMENTACIÓN DE LA CLASE JAVA NOTIFICACION

Como parte del desarrollo orientado a objetos de RECTISOFT, se implementó la clase `Notificacion`, encargada de representar los mensajes informativos que recibe un destinatario dentro del sistema.

## 7.1. Descripción de la clase

La clase Notificacion contiene atributos para almacenar el identificador, destinatario, mensaje, tipo de notificación, fecha de creación y estado de lectura.

## 7.2. Atributos

| Atributo | Tipo de dato | Descripción |
|---|---|---|
| idNotificacion | int | Identificador de la notificación. |
| destinatario | String | Persona que recibe la notificación. |
| mensaje | String | Contenido del mensaje. |
| tipo | String | Categoría de la notificación. |
| fecha | LocalDateTime | Fecha y hora de creación. |
| leida | boolean | Indica si la notificación ha sido leída. |

## 7.3. Métodos principales

- `Notificacion()`: constructor sin parámetros.
- `Notificacion(...)`: constructor con parámetros.
- `marcarComoLeida()`: cambia el estado de lectura.
- `mostrarResumen()`: presenta la información de la notificación.
- Métodos getters y setters: permiten consultar y modificar los atributos.

## 7.4. Importancia dentro de RECTISOFT

Esta clase permitirá representar notificaciones relacionadas con los procesos del sistema, como actualizaciones de órdenes de trabajo, cambios de estado y mensajes informativos para los usuarios.

# 8. DIAGRAMA UML DE LA CLASE NOTIFICACION

El diagrama UML representa gráficamente la estructura de la clase Notificacion, mostrando sus atributos y métodos.

Se utiliza el signo menos (-) para representar atributos privados y el signo más (+) para representar métodos públicos.

El diagrama se encuentra elaborado en el archivo independiente `Diagrama_UML_Notificacion.md`, ubicado en la carpeta `RECTISOFT_GA7`.

Este diagrama mantiene correspondencia con la implementación de la clase Java `Notificacion.java`.

# 9. CONCLUSIONES

La elaboración del plan técnico permitió identificar las herramientas y tecnologías necesarias para la construcción del software RECTISOFT.

La utilización de Visual Studio Code y Java facilita la organización y desarrollo del código fuente, mientras que Git y GitHub se proponen como herramientas para controlar los cambios y conservar el historial de versiones del proyecto.

Asimismo, la implementación de la clase Notificacion permitió aplicar conceptos de programación orientada a objetos, como atributos privados, constructores, métodos y encapsulamiento.

Finalmente, la planificación por etapas facilita la organización del desarrollo y permite establecer actividades y resultados esperados para la construcción del sistema.
