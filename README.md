# Lab3_FormulaireAndroid

A simple and feature-rich Android application designed as a form questionnaire with navigation and CRUD (Create, Read, Update, Delete) button placeholders.

## 🚀 Features

- **Personal Information Form**: Collects essential details like Name, Email, Telephone, Address, and City.
- **Validation Logic**: Ensures that Name and Email fields are not empty before submission.
- **Multi-Screen Navigation**: Passes data securely between activities using Android Intents.
- **Form Actions**: Includes a dedicated row of buttons at the bottom of the main activity:
    - **Ajouter**: Validates and submits the form to the summary screen.
    - **Chercher**: Placeholder for record search logic (Displays a Toast notification).
    - **Supprimer**: Placeholder for record deletion logic (Displays a Toast notification).

## 🛠️ Tech Stack

- **Language**: Java
- **UI Framework**: Android XML with Material 3 components.
- **Theme**: Material3 DayNight (Support for light/dark modes).
- **Gradle Version**: 8.13
- **Android Gradle Plugin**: 9.0.1 (Targeted Build)

## 📂 Project Structure

- `MainActivity.java`: Handles the form input, validation, and button click events.
- `MainActivity2.java`: Displays the summary recap of the submitted data.
- `activity_main.xml`: The primary form layout with the three CRUD action buttons.
- `activity_main2.xml`: The recap screen layout for displaying formatted data.

## 🔨 Build Instructions

To build the project locally, ensure you have the correct Android SDK installed (API 35+) and run:

```bash
./gradlew clean :app:assembleDebug
```

The APK will be generated in `app/build/outputs/apk/debug/`.

## 📝 Recent Updates

- **Fix**: Downgraded `androidx.activity` to 1.9.3 for environment compatibility.
- **Feature**: Added a horizontal button bar for **Ajouter**, **Chercher**, and **Supprimer** actions.
- **Configuration**: Updated the build system to use the latest Android Gradle Plugin (AGP) 9.0.1.
