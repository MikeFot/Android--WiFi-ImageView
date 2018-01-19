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

```
compile('com.michaelfotiadis:android-wifi-imageview:1.1.0') {
        compile 'com.github.pwittchen:reactivewifi-rx2:0.3.0'          
}'

```

or this if you are using the Android Plugin for Gradle 3+:

```
implementation('com.michaelfotiadis:android-wifi-imageview:1.1.0') {
        implementation 'com.github.pwittchen:reactivewifi-rx2:0.3.0'
}'     
```

**Bintray Project**
https://bintray.com/mikefot/maven/android-wifi-imageview
