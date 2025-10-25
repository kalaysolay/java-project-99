plugins {
	java
	application
	checkstyle
	jacoco
	id("org.springframework.boot") version "3.5.7"
	id("io.spring.dependency-management") version "1.1.7"
	id("org.sonarqube") version "7.0.1.6134"
}

group = "hexlet.code"
version = "0.0.1-SNAPSHOT"
description = "Demo project for Spring Boot"

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(21)
	}
}
sonar {
	properties {
		property("sonar.projectKey", "kalaysolay_java-project-99")
		property("sonar.organization", "kalaysolay")
	}
}
repositories {
	mavenCentral()
}

tasks.register("lint") {
	dependsOn("checkstyleMain", "checkstyleTest")
	group = "verification"
	description = "Runs Checkstyle on main and test sources."
}


dependencies {
	implementation("org.springframework.boot:spring-boot-starter")
	implementation("org.springframework.boot:spring-boot-starter-web")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.withType<Test> {
	useJUnitPlatform()
}
