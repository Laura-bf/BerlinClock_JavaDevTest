# Berlin Clock

![Java](https://img.shields.io/badge/Java-8-ED8B00?logo=openjdk)
![Maven](https://img.shields.io/badge/Maven-3-C71A36?logo=apachemaven)
![JUnit](https://img.shields.io/badge/JUnit-4.11-25A162?logo=junit5)
![Kata](https://img.shields.io/badge/Kata-Berlin_Clock-6A0DAD)

A Java kata that converts digital time (`HH:mm:ss`) into the **Berlin Clock** (Mengenlehreuhr) display format.

## What is the Berlin Clock?

The Berlin Clock is a public clock in Berlin, Germany, that tells the time using illuminated coloured fields. The time is encoded as follows:

| Row | Lights | Meaning |
|-----|--------|---------|
| **Seconds** | 1 | Blinks **Y**ellow on even seconds |
| **Hours (top)** | 4 | Each **R**ed light = 5 hours |
| **Hours (bottom)** | 4 | Each **R**ed light = 1 hour |
| **Minutes (top)** | 11 | Each **Y**ellow light = 5 minutes; **R**ed at 15, 30, 45 |
| **Minutes (bottom)** | 4 | Each **Y**ellow light = 1 minute |

### Example

`13:17:01` produces:

```
O
RROO
RRRO
YYROOOOOOOO
YYOO
```

## Getting Started

### Prerequisites

- Java 8+
- Apache Maven 3.x

### Build

```bash
mvn clean package
```

### Run Tests

```bash
mvn test
```

## Usage

```java
BerlinClockConverter converter = new BerlinClockConverter();
String result = converter.convert("13:17:01");
System.out.println(result);
```

## Project Structure

```
src/
├── main/java/com/kps/exercises/berlinclock/
│   └── BerlinClockConverter.java
└── test/java/com/kps/exercises/berlinclock/
    └── BerlinClockConverterTest.java
pom.xml
```

## How It Works

The conversion breaks down the input time into hours, minutes, and seconds, then maps each component to the corresponding Berlin Clock rows:

- **Seconds row** — A single lamp that is yellow (`Y`) when seconds are even, off (`O`) otherwise.
- **Top hours row** — 4 red lamps; each lamp represents 5 hours.
- **Bottom hours row** — 4 red lamps; each lamp represents 1 hour.
- **Top minutes row** — 11 lamps; yellow (`Y`) for each 5-minute block, red (`R`) at quarters (15, 30, 45).
- **Bottom minutes row** — 4 yellow lamps; each lamp represents 1 minute.

## Built With

- [Java 8](https://openjdk.org/)
- [JUnit 4.11](https://junit.org/junit4/)
- [Apache Maven](https://maven.apache.org/)
