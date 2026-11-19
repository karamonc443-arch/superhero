plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "educa.iesam.karamon.superhero"
    compileSdk {
        version = release(37)
    }

    defaultConfig {
        applicationId = "educa.iesam.karamon.superhero"
        minSdk = 26
        targetSdk = 37
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            optimization {
                enable = false
            }
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    implementation(libs.androidx.activity.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.core.ktx)
    implementation(libs.material)
    implementation(libs.gson)
    implementation(libs.kotlin)
    testImplementation(libs.mockkAgent)
    testImplementation(libs.mockkAndroid)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(libs.androidx.junit)
}