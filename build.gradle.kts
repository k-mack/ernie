plugins {
    id("org.asciidoctor.jvm.convert") version "3.3.2"
}

repositories {
    mavenCentral()
}

asciidoctorj {
    setVersion("2.5.10")
}

tasks {
    "asciidoctor"(org.asciidoctor.gradle.jvm.AsciidoctorTask::class) {
        baseDirFollowsSourceDir()
        resources {
            from("src/docs/asciidoc/img")
            into("./img")
        }
    }
}
