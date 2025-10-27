plugins {
    id("spotted.java")
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":spotted-java"))
}

tasks.withType<JavaCompile>().configureEach {
    // Allow using more modern APIs, like `List.of` and `Map.of`, in examples.
    options.release.set(9)
}

application {
    // Use `./gradlew :spotted-java-example:run` to run `Main`
    // Use `./gradlew :spotted-java-example:run -Pexample=Something` to run `SomethingExample`
    mainClass = "com.spotted.api.example.${
        if (project.hasProperty("example"))
            "${project.property("example")}Example"
        else
            "Main"
    }"
}
