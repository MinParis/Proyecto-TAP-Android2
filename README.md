# 📱 Proyecto Móvil Android

**Tecnología:** Java con Android Studio  
**Materia:** Tópicos de Programación  
**Unidad:** Proyecto final

---

## 🎯 Objetivo

Desarrollar una aplicación móvil en Android Studio que refuerce los conocimientos de la **primera unidad**, mediante la implementación de:

- 🔐 Un **login funcional**
- 📲 Una **navegación básica entre actividades**
- 🧩 Visualización de **ejercicios prácticos**

---

## 🚀 Características

- Interfaz de login con validación de correo y contraseña.
- Menú principal con acceso a 10 ejercicios distintos.
- Actividades independientes para cada ejercicio con botón de regreso.
- Diseño funcional y visualmente claro para facilitar la comprensión.

---

## 🛠️ Tecnologías utilizadas

- **Lenguaje:** Java  
- **IDE:** Android Studio  
- **Sistema de control de versiones:** Git & GitHub  
- **Diseño:** XML para interfaces gráficas

---

## 🧭 Navegación General

La aplicación cuenta con un **menú principal** que permite a los usuarios acceder fácilmente a distintas funcionalidades desde una sola vista.

---

## 🔐 Inicio de Sesión

Antes de ingresar al menú, los usuarios deben iniciar sesión correctamente.  
Esta pantalla incluye:

- 📧 **Campo de correo electrónico**  
  - Debe tener un **formato válido** (ejemplo: usuario@dominio.com).
  
- 🔒 **Campo de contraseña**  
  - Se valida que **coincida con los datos registrados** previamente.
  ![image](https://github.com/user-attachments/assets/b4c60f1e-d636-4042-a999-5355994d01bf)


- 🔘 **Botón "Iniciar Sesión"**

✅ Solo si ambos campos son válidos, se permite el acceso al menú principal.
![image](https://github.com/user-attachments/assets/9309f3b6-5ae5-4519-8fa8-d11c9137717d)

---

## 🗂️ Menú Principal

Una vez iniciada la sesión correctamente, se muestra un menú compuesto por:

- 🔟 **10 botones principales**, organizados como:

  - `Actividad 1`
  - `Actividad 2`
  - `Actividad 3`
  - ...
  - `Actividad 10`

Cada botón dirige al usuario a una actividad diferente dentro de la app, donde se desarrollan funcionalidades específicas.
![image](https://github.com/user-attachments/assets/da05dcaa-4f1c-40f9-b4b1-3e9c1c36e25f)


---

## 🚪 Cerrar Sesión

En la parte inferior del menú hay un botón especial:

- ❌ **Botón "Cerrar Sesión"**
  - Al presionarlo, la app regresa a la pantalla de inicio de sesión.
  - Se limpia la sesión actual para proteger la seguridad del usuario.
![image](https://github.com/user-attachments/assets/a7b0a125-437b-4e07-8262-1658ee50bf56)

---

