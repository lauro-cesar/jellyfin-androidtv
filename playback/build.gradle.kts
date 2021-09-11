plugins {
	id("com.android.library")
	kotlin("android")
}

android {
	compileSdkVersion(30)

	defaultConfig {
		minSdkVersion(21)
		targetSdkVersion(30)
	}

	buildFeatures {
		viewBinding = true
	}

	sourceSets["main"].java.srcDirs("src/main/kotlin")
	sourceSets["test"].java.srcDirs("src/test/kotlin")
	compileOptions {
		sourceCompatibility = JavaVersion.VERSION_1_8
		targetCompatibility = JavaVersion.VERSION_1_8
	}
	buildToolsVersion = "29.0.2"
	ndkVersion = "20.0.5594570"
	buildTypes {
		getByName("release") {
			isMinifyEnabled = true
		}
	}
}

dependencies {
	
}
