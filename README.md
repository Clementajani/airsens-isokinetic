# Airsens Isokinetic — Android app

Native Android wrapper for the Airsens Isokinetic Flow Monitor. The calculator
runs offline from `app/src/main/assets/index.html` inside a WebView.

- Package: `com.airsens.isokinetic`
- Android 8.0 (API 26) and newer, targets API 35
- No third-party libraries

## Option A — Android Studio (on your computer)

1. Unzip this folder and open it with **File → Open** in Android Studio
   (Ladybug 2024.2 or newer).
2. Let Gradle sync finish (it downloads the Android plugin the first time).
3. Plug in your phone with USB debugging on and press **Run ▶**, or build an
   installable file with **Build → Build App Bundle(s) / APK(s) → Build APK(s)**.
4. The APK lands in `app/build/outputs/apk/debug/app-debug.apk`. Copy it to the
   phone and open it (allow "Install unknown apps" when asked).

## Option B — GitHub, no Android Studio needed

1. Create a new GitHub repository and upload the contents of this folder
   (keep the hidden `.github` folder).
2. Open the **Actions** tab. The **Build APK** workflow runs on every push
   (or start it with **Run workflow**).
3. When it finishes, download **airsens-isokinetic-apk** from the run page.
   It contains `app-debug.apk` and `app-release.apk`; install either on the phone.

## Updating the calculator

Replace `app/src/main/assets/index.html` with a new version of the page and
rebuild. Bump `versionCode` / `versionName` in `app/build.gradle.kts` so the
phone accepts it as an update.

## Before publishing on Google Play

The release build is signed with the debug key so it installs immediately.
For the Play Store, create your own keystore (**Build → Generate Signed App
Bundle**) and build an `.aab` instead.

## Replacing the logo

The launcher icon is `app/src/main/res/drawable/ic_launcher_foreground.xml`.
In Android Studio use **File → New → Image Asset** with the official Airsens
logo to regenerate it. The in-app header logo is the inline SVG at the top of
`index.html`.
