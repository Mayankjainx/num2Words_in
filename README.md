# 🇮🇳 num2words-in

A lightweight Java library to convert numbers into **words using the Indian numbering system**  
(e.g., lakh, crore) — simple, fast, and dependency-free.

---

## 📦 Example Usage

```java
import org.mayank.numbertowords.NumberToWords;

public class Example {
    public static void main(String[] args) {
        System.out.println(NumberToWords.convert(253));       // two hundred and fifty three
        System.out.println(NumberToWords.convert(1000000));   // ten lakh
        System.out.println(NumberToWords.convert(987654321)); // ninety eight crore seventy six lakh fifty four thousand three hundred and twenty one
    }
}

# Add GitHub Package Repository

<repositories>
    <repository>
        <id>github</id>
        <name>GitHub Packages – mayankjainx</name>
        <url>https://maven.pkg.github.com/mayankjainx</url>
    </repository>
</repositories>


#Add Maven dependency

<dependencies>
    <dependency>
        <groupId>com.github.mayankjainx</groupId>
        <artifactId>num2words-in</artifactId>
        <version>1.0.0</version>
    </dependency>
</dependencies>


# Authentication setup
#Add this to your ~/.m2/settings.xml file:
<settings>
  <servers>
    <server>
      <id>github</id>
      <username>YOUR_GITHUB_USERNAME</username>
      <password>YOUR_GITHUB_PERSONAL_ACCESS_TOKEN</password>
    </server>
  </servers>
</settings>


# Clone repository
git clone https://github.com/mayankjainx/num2words-in.git
cd num2words-in

# Build with Maven
mvn clean install
