report:
	./gradlew jacocoTestReport
test:
	./gradlew test
installDist:
	./gradlew installDist
clean:
	./gradlew clean
build:
	./gradlew clean build
lint:
	./gradlew checkStyleMain checkStyleTest