This project does not compile.


There is an issue with using `build.gradle.kts` with Gradle 4.8 and the Triplet Play Publisher plugin.

There are three options to allow the project to compile:
1. Uncomment the `id("com.github.triplet.play")` line in the `app/build.gradle.kts` to allow the project to compile.
2. Downgrade to Gradle 4.7
3. Convert the `build.gradle.kts` file to a `build.gradle` file.

Otherwise the build fails like so:
```
FAILURE: Build failed with an exception.

* Where:
Build file '/Users/no/dev/TripletBug/app/build.gradle.kts' line: 8

* What went wrong:
org/gradle/kotlin/dsl/AccessorsKt

* Try:
Run with --stacktrace option to get the stack trace. Run with --info or --debug option to get more log output. Run with --scan to get full insights.

* Get more help at https://help.gradle.org
```
