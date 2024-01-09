import org.jetbrains.kotlin.gradle.internal.Kapt3GradleSubplugin.Companion.findKaptConfiguration

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}



android {
    namespace = "com.example.ciclapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.ciclapp"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        viewBinding = true
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.2"
    }

    packaging {
        resources {
            excludes += "/META-INF/{AL2.0, LGPL2.1}"
        }
    }

}

dependencies {

    implementation("androidx.core:core-ktx:1.9.0") // 1

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.8.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")

    testImplementation("junit:junit:4.13.2") // 9
    androidTestImplementation("androidx.test.ext:junit:1.1.5") //10
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1") // 11
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.2")

    implementation("androidx.databinding:databinding-runtime:8.2.1")
    implementation("androidx.fragment:fragment-ktx:1.6.2")
    implementation("androidx.activity:activity-ktx:1.8.2")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.2")
    implementation("androidx.recyclerview:recyclerview:1.3.2")

    implementation("androidx.activity:activity-compose:1.8.2") // 3
    implementation(platform("androidx.compose:compose-bom:2023.10.01")) // 4
    implementation("androidx.compose.ui:ui:1.5.4") // 5
    implementation("androidx.compose.ui:ui-graphics") // 6
    implementation("androidx.compose.ui:ui-tooling-preview") // 7
    implementation("androidx.compose.material3:material3") // 8
    androidTestImplementation(platform("androidx.compose:compose-bom:2023.10.01")) // 12
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")
    debugImplementation("androidx.compose.ui:ui-tooling")
    debugImplementation("androidx.compose.ui:ui-test-manifest")


    // Location Services
    implementation("com.google.android.gms:play-services-location:21.0.1")

    // Convert API
    implementation("com.google.code.gson:gson:2.10.1")
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.okhttp3:okhttp:4.12.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
    // Loading Network image
    implementation("io.coil-kt:coil-compose:2.4.0")
    // Display Awesome Font
    implementation("com.github.Gurupreet:FontAwesomeCompose:1.0.0")
    // Full layout without Status Bar
    implementation("com.google.accompanist:accompanist-systemuicontroller:0.33.1-alpha")
    implementation("com.squareup.okhttp3:logging-interceptor:4.9.1")

}