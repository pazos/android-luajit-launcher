# proguard is used to shrink and optimize dependencies.
-dontobfuscate
-keep class org.koreader.launcher.** { *; }

# keep kotlin.Metadata annotations
-keepattributes RuntimeVisibleAnnotations
-keep class kotlin.Metadata { *; }
-dontwarn org.tukaani.xz.LZMAInputStream

# preserve the line number information for debugging stack traces.
-keepattributes SourceFile,LineNumberTable
