plugins {
	id("org.springframework.boot") version "3.3.4"       // ✅ aktualna wersja Spring Boot
	id("io.spring.dependency-management") version "1.1.6"
	id("java")
	id("org.jetbrains.kotlin.plugin.spring") version "2.0.21" apply false // opcjonalnie dla Kotlinowych projektów
}

group = "com.example"
version = "1.0.0"
java.sourceCompatibility = JavaVersion.VERSION_22  // lub 21, jeśli chcesz

repositories {
	mavenCentral()
}

dependencies {
	// === SPRING BOOT I HIBERNATE ===
	implementation("org.springframework.boot:spring-boot-starter-data-jpa") // zawiera Hibernate + JPA
	implementation("org.springframework.boot:spring-boot-starter-web")      // REST, servlet, JSON, itp.

	// === POSTGRESQL DRIVER ===
	runtimeOnly("org.postgresql:postgresql:42.7.3")

	// === LOMBOK ===
	compileOnly("org.projectlombok:lombok:1.18.34")
	annotationProcessor("org.projectlombok:lombok:1.18.34")

	// === LOGGING (Logback jest domyślnie w Spring Boot) ===
	implementation("ch.qos.logback:logback-classic")

	// === JAKARTA PERSISTENCE API (dla czystych projektów JPA) ===
	// Spring Boot Starter Data JPA już ją zawiera,
	// ale jeśli chcesz dodać jawnie:
	implementation("jakarta.persistence:jakarta.persistence-api:3.1.0")

	// === TESTY (JUnit 5) ===
	testImplementation("org.springframework.boot:spring-boot-starter-test") {
		exclude(group = "org.junit.vintage") // wyłącza stare JUnit 4
	}
}

tasks.withType<Test> {
	useJUnitPlatform() // JUnit 5
}

