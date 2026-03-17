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

---
# UC3: Display "Hello" with Command-Line Argument or Default Message

### 1. Description
The app greets a specific name from `args[0]` or defaults to "World" if no input is provided.

### 2. Disadvantages of UC2
UC2 was "fragile." If a user forgot the argument, the app would throw an `ArrayIndexOutOfBoundsException` and crash.

### 3. Main Flow
1. App checks `args.length`.
2. If `length > 0`, `name = args[0]`.
3. Else, `name = "World"`.
4. App prints the greeting.

### 4. Concepts Learned
* **Ternary Operator:** Concise one-line conditional assignment.
* **Defensive Programming:** Anticipating the missing argument to prevent crashes.
* **Operator Overloading:** The `+` sign adds numbers but joins (concatenates) Strings.

---
# UC4: Display "Hello" with Multiple Command-Line Arguments

### 1. Description
The app accepts multiple names as arguments and greets them all in a single comma-separated line.

### 2. Disadvantages of UC3
UC3 could only greet one person at a time. Users had to restart the app for every new name, which is inefficient.

### 3. Main Flow
1. App detects the number of arguments.
2. If multiple names exist, a `for` loop iterates through the `args` array.
3. `StringBuilder` collects and formats the names.
4. App prints the combined greeting.

### 4. Concepts Learned
* **StringBuilder:** A mutable class used to create strings without creating multiple objects in memory.
* **For Loops:** Iterating through an array using an index (`i`).
* **Logic inside Loops:** Using an `if` condition to avoid adding a comma after the very last name.

