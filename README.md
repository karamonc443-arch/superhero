# 🦸 SUPERHERO

## 🎯 Objetivo del proyecto

El objetivo principal de este proyecto es aprender, practicar y profundizar en los siguientes conceptos:

1. **Clean Architecture:** comprender sus principios fundamentales y aprender a aplicarlos en el desarrollo de aplicaciones Android.
2. **Kotlin:** afrontar nuevos retos, explorar ideas diferentes y, sobre todo, disfrutar del proceso de programación utilizando Kotlin como lenguaje principal.
3. **MVVM (Model-View-ViewModel):** comprender este patrón arquitectónico y aplicarlo para separar las responsabilidades de la interfaz de usuario, la lógica de presentación y los datos.

Este proyecto nace con la intención de aprender haciendo, experimentar con nuevas ideas y mejorar progresivamente mis habilidades como desarrollador.

## 🏗️ Estructura del proyecto

La aplicación se organiza siguiendo una estructura modular por funcionalidades, aplicando los principios de **Clean Architecture** y utilizando **MVVM** en la capa de presentación.

La estructura inicial del proyecto es la siguiente:

```text
superhero/
└── feature/
    └── superhero/
        ├── data/
        │   ├── local/
        │   └── remote/
        ├── domain/
        │   ├── Superhero.kt
        │   ├── SuperheroRepository.kt
        │   └── GetSuperheroUseCase.kt
        └── presentation/
            └── SuperheroListViewModel.kt
```

## 📦 Descripción de las capas

- **Data:** se encarga de gestionar el acceso a los datos, tanto desde fuentes locales (`local`) como remotas (`remote`).
- **Domain:** contiene la lógica de negocio de la aplicación, incluyendo el modelo `Superhero`, el contrato `SuperheroRepository` y el caso de uso `GetSuperheroUseCase`.
- **Presentation:** contiene la lógica de presentación y los componentes encargados de gestionar el estado de la interfaz de usuario, como `SuperheroListViewModel`.

## 🚀 Conclusión

Este proyecto representa un punto de partida para profundizar en **Clean Architecture, MVVM y Kotlin**, aplicando estos conceptos de forma práctica mediante el desarrollo de una aplicación de superhéroes.

El objetivo no es únicamente construir una aplicación funcional, sino también comprender las decisiones arquitectónicas que hay detrás de ella y disfrutar del proceso de aprendizaje y desarrollo.
- ## 👩‍🏫Estructura grafica inicial del proyecto 
<img width="505" height="584" alt="image" src="https://github.com/user-attachments/assets/f9a4a577-4c05-42fc-9431-47e01817094a" />
