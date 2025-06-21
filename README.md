# 💱 Conversor de Monedas en Java

Este es un proyecto simple de consola en Java que permite convertir valores entre diferentes monedas utilizando la API gratuita de [ExchangeRate-API](https://app.exchangerate-api.com/).

## 📌 Funcionalidades

- Conversión entre:
  - Dólar ⇄ Peso Argentino
  - Dólar ⇄ Real Brasileño
  - Dólar ⇄ Peso Colombiano
- Interfaz interactiva por consola
- Manejo de errores (conexión fallida, opción no válida, etc.)
- API integrada con `HttpClient` y deserialización con `Gson`

## 🧰 Tecnologías Usadas

- **Java 11** o superior
- `java.net.http.HttpClient` (para las peticiones HTTP)
- `Gson` (para deserializar el JSON)
- API pública: [ExchangeRate-API](https://app.exchangerate-api.com/)

## ⚙️ Requisitos

- Java 11 o superior
- Conexión a internet
- API Key gratuita de [ExchangeRate-API](https://app.exchangerate-api.com/)

## 🏁 Cómo ejecutar

1. Clona el repositorio o descarga los archivos.
2.Abre el proyecto en tu IDE (ej: IntelliJ IDEA).
3.Asegurate de tener Java 11+ seleccionado como JDK.
4.Ejecutá la clase principal:Conversordemonedas.java
