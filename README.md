# Number to Words (Java Library)

A lightweight open-source Java library to convert numbers into words
following the Indian Numbering System (Lakh, Crore).

## ✨ Example

```java
NumberToWords.convert(253);       // two hundred and fifty three
NumberToWords.convert(1000000);   // ten lakh



---

## 🧠 Summary

| Step | Action | Description |
|------|--------|--------------|
| 1️⃣ | Create Maven project | with clean `pom.xml` |
| 2️⃣ | Push to GitHub | `git push origin main` |
| 3️⃣ | Tag version | `git tag v1.0.0` |
| 4️⃣ | Build on JitPack | `https://jitpack.io` |
| 5️⃣ | Use dependency | via Maven or Gradle |

---
##maven dependency

        <repositories>
		<repository>
			<id>central</id>
			<url>https://repo.maven.apache.org/maven2</url>
		</repository>
		<repository>
			<id>github</id>
			<name>GitHub mayankjainx Apache Maven Packages</name>
			<url>https://maven.pkg.github.com/mayankjainx</url>
                </repository>
        </repositories>


                <dependency>
			<groupId>com.github.mayankjainx</groupId>
			<artifactId>num2words-in</artifactId>
			<version>1.0.0</version>
		</dependency>
