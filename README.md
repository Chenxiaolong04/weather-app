# WeatherApp - Applicazione Meteo con Spring Boot

**WeatherApp** è un'applicazione Java sviluppata con **Spring Boot** che consente di visualizzare le condizioni meteo attuali per varie città italiane, sfruttando l'API di [OpenWeatherMap](https://openweathermap.org/). L'app è containerizzata con **Docker** per garantire portabilità e semplicità di deploy.

---

## Tecnologie utilizzate

- Java 17
- Spring Boot 3
- Spring Web
- RestTemplate (per chiamate HTTP)
- Thymeleaf (per il frontend)
- OpenWeatherMap API
- Docker & Docker Compose

---

## Funzionalità principali

- Ricerca meteo per città italiane (nome città)
- Visualizzazione:
  - Temperatura
  - Descrizione condizioni meteo (es. pioggia, sereno)
  - Umidità
- Interfaccia web semplice ed intuitiva

---

## Configurazione iniziale

### 1. Clona il progetto

```bash
git clone https://github.com/Chenxiaolong04/weather-app.git
```
### 2. Registrati sul sito OpenWeather e copiati la chiave API nel profilo
Vai nel file application.properties e aggiunti la tua API come nell'esempio openweathermap.api.key=ec82b5f58ce5178c944bb8b2e9f2a6ad.

### 3. Avvio tramite Docker
```bash
docker-compose up --build
```
### 3. Avvio browser
Da inserire come url
```bash
localhost:8080/
```
