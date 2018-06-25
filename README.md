This project does not compile.


There is a bug where imported functions declared in other packages cannot be used in buildscript blocks of build.gradle.kts files.

In order to allow the project to compile, comment out line 5 and 7 in build.gradle.kts.
Even though these same functions work elsewhere in the file, they cannot be used inside the builscript block.

The build fails like so:
```
> Configure project :
e: /Users/no/dev/TripletBug/build.gradle.kts:7:5: Unresolved reference: `ext`
e: /Users/no/dev/TripletBug/build.gradle.kts:9:5: Unresolved reference: notUsableInBuildscript

FAILURE: Build failed with an exception.

* Where:
Build file '/Users/no/dev/TripletBug/build.gradle.kts' line: 7

* What went wrong:
Script compilation errors:

  Line 7:     `ext`["kotlin_version"] = "1.2.50"
              ^ Unresolved reference: `ext`

  Line 9:     notUsableInBuildscript()
              ^ Unresolved reference: notUsableInBuildscript

2 errors

* Try:
Run with --stacktrace option to get the stack trace. Run with --info or --debug option to get more log output. Run with --scan to get full insights.

* Get more help at https://help.gradle.org
```
