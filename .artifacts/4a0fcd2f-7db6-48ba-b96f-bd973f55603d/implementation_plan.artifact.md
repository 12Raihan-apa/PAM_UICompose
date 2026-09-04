# Fix Gradle Sync Error: Protected Access to 'config'

The project is currently failing to sync because of a naming conflict in `app/build.gradle.kts`. The alias `libs.plugins.config.compiler` attempts to access a property named `config`, which is a protected field in Gradle's generated `PluginFactory` class.

Additionally, the `config-compiler` plugin and several other libraries referenced in `app/build.gradle.kts` are missing from `gradle/libs.versions.toml`.

## User Review Required

> [!IMPORTANT]
> The fix involves renaming the plugin alias from `config.compiler` to `compose.compiler` to avoid the reserved keyword conflict. I will also be adding several missing library definitions to your `libs.versions.toml` to ensure the project can sync successfully.

## Proposed Changes

### Build Configuration

#### [MODIFY] [libs.versions.toml](file:///D:/Tugas%20Kuliah/SEM%205/PAM/PAM_UICompose/gradle/libs.versions.toml)
- Add `kotlin` and `composeBom` versions.
- Add the `compose-compiler` plugin definition.
- Add missing Compose and Retrofit library definitions used in `app/build.gradle.kts`.

#### [MODIFY] [app/build.gradle.kts](file:///D:/Tugas%20Kuliah/SEM%205/PAM/PAM_UICompose/app/build.gradle.kts)
- Rename `libs.plugins.config.compiler` to `libs.plugins.compose.compiler`.

## Verification Plan

### Automated Tests
- Run `./gradlew :app:assembleDebug` to verify the build configuration is valid.
- Perform a Gradle Sync in Android Studio.

### Manual Verification
- Verify that the sync error "Cannot access 'field config'" no longer appears.
