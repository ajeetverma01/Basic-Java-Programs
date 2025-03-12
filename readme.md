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

### 6️⃣ **Number Reversal Tool** (`GetReverse.java`)

🔹 **Description:** A simple Java program that takes an integer input and returns its reverse.

#### 🚀 Usage:

```sh
javac GetReverse.java
java GetReverse
```

#### ⌨️ Example Input:

```
Enter a number: 12345
```

#### 📌 Example Output:

```
Reversed number: 54321
```


### 7️⃣ **Linear Search** (`LinearSearch.java`)

🔹 **Description:** Searches for a specific number in an array using the Linear Search algorithm and returns its index if found.

#### 🚀 Usage:

```sh
javac LinearSearch.java
java LinearSearch
```  

#### ⌨️ Example Input:

```
Enter the number to search: 66
```  

#### 📌 Example Output:

```
Element found at index no. 5
```  

### 8️⃣ **Selection Sort** (`SelectionSort.java`)

🔹 **Description:** Implements the Selection Sort algorithm to sort an array in ascending order.

#### 🚀 Usage:

```sh
javac SelectionSort.java
java SelectionSort
```  

#### 📌 Example Output:

```
Sorted...
0 1 2 3 4 5 6 7 8 9
```  

### 9️⃣ **String Operations** (`StringOperations.java`)

🔹 **Description:** Performs basic string operations such as converting to uppercase, lowercase, checking if empty, and verifying the starting substring.

#### 🚀 Usage:

```sh
javac StringOperations.java
java StringOperations
```  

#### ⌨️ Example Input:

```
Enter input string: HelloWorld
```  

#### 📌 Example Output:

```
Uppercase:  HELLOWORLD
Lowercase: helloworld
Is empty: false
Starts with HelloWorld: true
```  

### 🔟 **Command Line Argument** (`CommandLineArgument.java`)

🔹 **Description:** Demonstrates how to use command-line arguments in Java by printing a greeting for each provided argument.

#### 🚀 Usage:

```sh
javac CommandLineArgument.java
java CommandLineArgument Ajeet Sujeet Rahul Amit
```  

#### ⌨️ Example Input (Command Line):

```
java CommandLineArgument Ajeet Sujeet Rahul Amit
```  

#### 📌 Example Output:

```
Hello! Ajeet
Hello! Sujeet
Hello! Rahul
Hello! Amit
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
**📌 Description:** Utilizes the `reverse()` method from `StringBuilder` to check if a string is palindrome efficiently.
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
