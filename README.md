# Min Journal – Backend

En snabb guide för att starta Spring Boot-backenden lokalt. Frontendförklaringen finns här: https://github.com/OlssonElliott/Journal-Frontend

## Krav

- Java 21+
- Maven 3.9+
- Eget MongoDB Atlas-konto eller annan MongoDB-instans

## Kom igång

Skapa/Uppdatera miljövariabler. (Se nedan.)
Starta projektet i VSC.
Backenden använder normalt http://localhost:8080/.

## Miljövariabler och databasen

Backenden använder Spring Data MongoDB. Du behöver koppla ihop en egen databas:

- Ange ett fullständigt MongoDB-URI i spring.data.mongodb.uri.

Standard-konfig i src/main/resources/application.properties läser in en .env-fil från samma katalog. Skapa filen och sätt antingen lösenordsvariabeln från URI:n 

# steg 1: Skapa en .env fil. Lägg ditt password i en .env inuti resources mappen. Kopiera nedstående rad och byt ut innehållet till ditt lösenord.

PASSWORD=byt_till_ditt_lösenord

# steg 2: Skriv över nuvarande anslutningssträngen inuti application.properties till din egna databas.

SPRING_DATA_MONGODB_URI=mongodb+srv://user:password@cluster.mongodb.net/Journal

## API & autentisering

Backenden exponerar REST-endpoints under "/api/v1/..." för att hantera konton och dagboksinlägg.
Autentisering utgår ifrån Spring Security. (Security.java, AuthController.java, AuthService.java.)
Journalinläggen använder (JournalController.java, JournalService.java, JournalRepository.java.)
Skapa/använda konton använder (UserController.java, UserService.java, UserRepository.java)

## Konton

När både backend och frontend är igång:

1. Öppna http://localhost:4200/.
2. Skapa ett konto via frontendens formulär.
3. Logga in, skriv dagboksinlägg och se statistik som lagras via MongoDB.
