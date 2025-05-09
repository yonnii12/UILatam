# Busqueda de vuelos LATAM

Automatización de pruebas UI para la búsqueda de vuelos en el sitio de LATAM Airlines: [https://www.latamairlines.com/co/es](https://www.latamairlines.com/co/es)  

---

## Tecnologías Utilizadas

- **Java 17**
- **Playwright Java** para automatización de navegador
- **Maven** como manejador de dependencias
- **TestNG** como framework de ejecución
- **Cucumber** para definición de pruebas BDD (Gherkin)
- **Allure** para generación de reportes bonitos

---

## Patron de diseño del Proyecto

- **POM** 


# Pasos para ejecutar localmente

1. Clona el repositorio con el comando: <br>
   git clone https://github.com/yonnii12/UILatam.git

2. Ejecuta pruebas con el comando: <br>
   mvn clean test

3. Instalar Allure CLI (una sola vez) con el comando: <br>
   npm install -g allure-commandline --save-dev

4. Ver el reporte con el comando <br>
   allure serve target/allure-results

# Nota:

- Debido al tiempo no se logro configurar el pipeline reusable para ejecucion desde GiyHub Actions


