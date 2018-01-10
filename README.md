# Android WiFi ImageView

Android widget showing signal WiFi signal strength.

Uses internally Reactive WiFi - https://github.com/pwittchen/ReactiveWiFi

## Importing into your project

**Gradle**

Add the following to your parent project Gradle file

```
allprojects {
        repositories {
           maven { url "https://dl.bintray.com/mikefot/maven/" }
        }
    }
```

And the following to your module Gradle file:

`compile 'com.michaelfotiadis:android-wifi-imageview:1.0.0'`

**Maven**

```
<dependency>
  <groupId>com.michaelfotiadis</groupId>
  <artifactId>android-wifi-imageview</artifactId>
  <version>1.0.0</version>
  <type>pom</type>
</dependency>
```

**Bintray Project**
https://bintray.com/mikefot/maven/android-wifi-imageview
