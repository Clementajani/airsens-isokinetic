plugins {
    id("com.android.application")
}

android {
    namespace = "com.airsens.isokinetic"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.airsens.isokinetic"
        minSdk = 26
        targetSdk = 35
        versionCode = 2
        versionName = "1.1"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            // Debug signing so the release APK installs straight away.
            // Replace with your own keystore before publishing to Google Play.
            signingConfig = signingConfigs.getByName("debug")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}
