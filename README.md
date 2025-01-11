# AdvancedSlimePaper API (Java 8 Build-Time Dependency)

## Overview
This project is designed to support development in Java 8 environments as a build-time dependency. However, the API cannot be used at runtime with Java 8. To run your project, you must use the official AdvancedSlimePaper Server, which requires Java 21.

## Usage

### Gradle
Add it in your root build.gradle at the end of repositories:
```gradle
	repositories {
		mavenCentral()
		maven { url = 'https://jitpack.io' }
	}
```
```gradle
	dependencies {
	        compileOnly 'com.github.ConnorChickenway:AdvancedSlimePaper-API:1.0'
	}
```
### Maven
```xml
	<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
```
```xml
	<dependency>
	    <groupId>com.github.ConnorChickenway</groupId>
	    <artifactId>AdvancedSlimePaper-API</artifactId>
	    <version>1.0</version>
	</dependency>
```
