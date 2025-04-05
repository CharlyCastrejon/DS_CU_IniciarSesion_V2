# 💻 Diseño de Software - CU Iniciar Sesión (Versión V2)

Este proyecto implementa el **Caso de Uso "Iniciar Sesión"** como parte de un sistema más amplio, siguiendo una arquitectura modular basada en el modelo 4+1. Esta **Versión V2** incluye importantes **mejoras arquitectónicas**, aplicando principios como separación de responsabilidades, subsistemas *stateless* y uso del **Patrón Singleton** para objetos de negocio.

---

## 📌 Cambios principales en la Versión V2

- El **control de presentación** ya no guarda referencias directas a subsistemas.
- Los **subsistemas de negocio** ahora son *stateless* y delegan su lógica a una clase interna.
- Se integra un **Objeto de Negocio** `UsuarioON` que encapsula el almacenamiento simulado de usuarios.
- Se implementa el **Patrón Singleton** en `UsuarioON` para mantener una única instancia.
- Se agregan métodos como `agregar()`, `eliminar()` y `validar()` en el objeto de negocio.
- Se actualizó la estructura para cumplir con las consideraciones estructurales y de diseño solicitadas para la Versión 2.

---

## 🧱 Estructura del proyecto

```
DS_CU_IniciarSesion_V2/
├── dto_negocios/                 # Proyecto DTO
├── objetos_negocio/             # Objeto de Negocio (UsuarioON)
├── negocios_controlSesion/      # Subsistema de negocio (mock) + lógica delegada
├── presentacion_iniciarSesion/  # Interfaz gráfica (Swing)
│   └── lib/
│       ├── dto_negocios.jar
│       └── negocios_controlSesion.jar
├── .gitignore
└── README.md
```

---

## 🚀 Requisitos

- Java JDK 8 o superior
- NetBeans (recomendado para abrir los 4 proyectos fácilmente)

---

## 📦 Cómo abrir el proyecto

1. Clona el repositorio:

   ```bash
   git clone https://github.com/CharlyCastrejon/DS_CU_IniciarSesion_V2.git
   ```

2. Abre **NetBeans**.

3. Selecciona **Archivo > Abrir proyecto** y abre los siguientes cuatro proyectos:
   - `dto_negocios`
   - `objetos_negocio`
   - `negocios_controlSesion`
   - `presentacion_iniciarSesion`

4. En `presentacion_iniciarSesion`:
   - Verifica que estén configuradas las bibliotecas:
     - `lib/dto_negocios.jar`
     - `lib/negocios_controlSesion.jar`
   - Ejecuta la clase `InicioSesion.java` como clase principal.

---

## 🎨 Interfaz Gráfica

- Construida con **Java Swing**
- Campos: Tipo de Usuario, Usuario, Contraseña
- Fondo azul claro, logo superior, estilo alineado
- Mensajes visuales mediante `JOptionPane`

---

## 🧠 Patrón Singleton en Objeto de Negocio

- La clase `UsuarioON` implementa el patrón Singleton:
  - Almacena internamente una lista de `UsuarioDTO`
  - Tiene métodos como `validar()`, `agregarUsuario()`, `obtenerUsuarios()`
  - Garantiza una única instancia simulando un acceso centralizado a datos

---

## 📚 Arquitectura Aplicada

| Capa              | Proyecto                | Descripción                                              |
|-------------------|-------------------------|----------------------------------------------------------|
| Presentación       | `presentacion_iniciarSesion` | Contiene los formularios y clase control                |
| Subsistema de negocio | `negocios_controlSesion`    | Interfaz, fachada y clase delegada (stateless)           |
| Objeto de negocio | `objetos_negocio`       | Lógica encapsulada del dominio, con lista de usuarios    |
| Transferencia DTOs | `dto_negocios`          | Definición de `UsuarioDTO`                               |

---

## ✅ Estado

✅ Proyecto estructurado conforme a la Versión V2  
🔁 Listo para integrarse con nuevos subsistemas o persistencia real  
📦 Cumple con separación de capas, uso de Singleton, y subsistemas sin estado

---

## 👤 Autor

Carlos A. Ruiz Castrejón  
Proyecto académico ejemplo de implementación modular con patrones de diseño en Java
