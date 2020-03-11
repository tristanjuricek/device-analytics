plugins {
    kotlin("jvm") version "1.3.70"
    application
    kotlin("plugin.spring") version "1.3.70"
}

dependencies {
    implementation(platform("org.springframework.boot:spring-boot-dependencies:2.2.5.RELEASE"))


    constraints {
        implementation("org.apache.commons:commons-csv:1.8")
    }

    implementation(kotlin("stdlib-jdk8"))
    implementation(kotlin("reflect"))
    implementation("org.springframework.boot:spring-boot-starter-thymeleaf")
    implementation("org.springframework.boot:spring-boot-starter-web")
}

// TODO: I can't figure out the "gradle way" of adding the jsMain "browser distribution"
//       to this spring boot project.