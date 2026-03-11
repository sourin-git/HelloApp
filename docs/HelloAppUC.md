# UC1: Display Hello World

**Description:** The app displays "Hello World" on the console.
**Main Flow:-** 
1. User runs the app.
2. App prints "Hello World".
3. App terminates.
---
# UC2: Display "Hello" with Command-Line Argument

### 1. Description
The application accepts a user's name as a command-line argument and displays a personalized greeting.

### 2. Disadvantages of UC1
UC1 was static. UC2 allows for interaction by using external input to change the program's behavior.

### 3. Main Flow
1. User runs: `mvn exec:java -Dexec.args="Sourin"`
2. App reads `args[0]`.
3. App prints "Hello, Sourin!".

### 4. Concepts Learned
* **Command-Line Arguments:** Passing data via `String[] args`.
* **Conditional Logic:** Using `if-else` to handle missing inputs.
* **Array Safety:** Checking `args.length` to avoid `ArrayIndexOutOfBoundsException`.