

plugins {
    kotlin("multiplatform") version "1.3.70"
//    kotlin("jvm") version "1.3.70"
    application
    kotlin("plugin.spring") version "1.3.70"
}

kotlin {
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(kotlin("stdlib-common"))
                implementation(project(":client"))
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test-common"))
                implementation(kotlin("test-annotations-common"))
            }
        }
    }

    jvm {
        val main by compilations.getting {
            kotlinOptions {
                jvmTarget = "1.8"
            }
        }

        val jvmMain by sourceSets.getting {
            // TODO: I can't get BOM import working with multiplatform builds.
            dependencies {
                implementation(project(":client"))
                implementation(kotlin("stdlib-jdk8"))
                implementation(kotlin("reflect"))
                implementation("org.springframework.boot:spring-boot-starter-thymeleaf:2.2.5.RELEASE")
                implementation("org.springframework.boot:spring-boot-starter-web:2.2.5.RELEASE")
            }
        }
    }
}


// TODO: I can't figure out the "gradle way" of adding the jsMain "browser distribution"
//       to this spring boot project.