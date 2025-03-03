# 📌 Java Programs Collection

## 📖 Description

This repository contains a collection of Java programs, each showcasing different programming concepts such as prime number checking, city name management, permutations, and more.

## 📝 Programs

### 1️⃣ **Prime Number Finder** (`PrimeFinder.java`)

🔹 **Description:** Determines prime numbers within a given range.

#### 🚀 Usage:

```sh
javac PrimeFinder.java
java PrimeFinder
```

#### ⌨️ Example Input:

```
Enter first number: 10
Enter second number: 20
```

#### 📌 Example Output:

```
Prime numbers between 10 and 20 are: 11 13 17 19
```

---

### 2️⃣ **City Names Manager** (`CitySearchTool.java`)

🔹 **Description:** Allows users to input name of city names and print those which are starting with inputted char.

#### 🚀 Usage:

```sh
javac CitySearchTool.java
java CitySearchTool
```

#### ⌨️ Example Input:

```
Enter city names (type 'done' when finished):
Delhi
Mumbai
Bangalore
done
Enter letters to search: M
```

#### 📌 Example Output:

```
City names in alphabetical order:
Bangalore
Delhi
Mumbai
Cities starting with 'M':
Mumbai
```

---

### 3️⃣ **Number Permutations** (`PossibleNumbers.java`)

🔹 **Description:** Generates all possible numbers by permuting the digits of a given number.

#### 🚀 Usage:

```sh
javac PossibleNumbers.java
java PossibleNumbers
```

#### ⌨️ Example Input:

```
Enter a number: 123
```

#### 📌 Example Output:

```
Possible numbers using the digits of 123 are: [123, 132, 213, 231, 312, 321]
```

---

### 4️⃣ **Even or Odd Checker** (`EvenOrOdd.java`)

🔹 **Description:** Determines whether a given number is even or odd.

#### 🚀 Usage:

```sh
javac EvenOrOdd.java
java EvenOrOdd
```

#### ⌨️ Example Input:

```
Enter a number: 5
```

#### 📌 Example Output:

```
5 is odd
```

---

### 5️⃣ **Reverse Words in a Sentence** (`ReverseWordsInLine.java`)

🔹 **Description:** Reverses each word in a sentence while keeping their original positions intact.

#### 🚀 Usage:

```sh
javac ReverseWordsInLine.java
java ReverseWordsInLine
```

#### ⌨️ Example Input:

```
Enter a line: Hello World
```

#### 📌 Example Output:

```
Answer:
olleH dlroW
```



# 🔍 Palindrome Finder

## 📜 Description
This repository contains multiple Java programs that check whether a given word is a palindrome. Each program demonstrates a different approach to solving the palindrome problem efficiently.

## 📂 Programs

### 1. ✨ **Palindrome Checker using StringBuilder** (`Palindrome1.java`)
**📌 Description:** Uses `StringBuilder` to reverse the string and compares it (case-insensitive) to determine if it is a palindrome.
#### 🛠️ Usage:
```sh
javac Palindrome1.java
java Palindrome1
```
#### 🔢 Example Input:
```
Enter a word: Level
```
#### ✅ Example Output:
```
It is a Palindrome word.
```

---

### 2. 🔄 **Palindrome Checker using Loop** (`Palindrome2.java`)
**📌 Description:** Uses a loop to manually reverse the string and compare it character by character.
#### 🛠️ Usage:
```sh
javac Palindrome2.java
java Palindrome2
```
#### 🔢 Example Input:
```
Enter a word: Racecar
```
#### ✅ Example Output:
```
It is a Palindrome word.
```

---

### 3. 🏆 **Palindrome Checker using StringBuilder Reverse Method** (`Palindrome3.java`)
**📌 Description:** Utilizes the `reverse()` method from `StringBuilder` to check if a string is a palindrome efficiently.
#### 🛠️ Usage:
```sh
javac Palindrome3.java
java Palindrome3
```
#### 🔢 Example Input:
```
Enter a word: Noon
```
#### ✅ Example Output:
```
Palindrome String
```
