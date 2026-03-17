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

---
# UC5: Multiple Arguments using Enhanced For Loop

### 1. Description
The app processes multiple names using a for-each loop and provides a fallback to "World".

### 2. Disadvantages of UC4
UC4 used a traditional `for` loop which requires manual index management (`i++`, `args[i]`). This increases the chance of "off-by-one" errors.

### 3. Main Flow
1. App checks if `args.length` is zero.
2. If yes, it prints "Hello, World!".
3. If no, it uses an **Enhanced For Loop** to traverse the array.
4. A `StringBuilder` joins names with a comma delimiter.

### 4. Concepts Learned
* **Enhanced For Loop:** Simplifies code by removing the need for an index variable.
* **Conditional Delimiter:** Using `nameList.length() > 0` is a smart way to ensure commas only appear *between* names, not at the end.

---
# UC6: Multiple Arguments using substring() Cleanup

### 1. Description
The app processes multiple names and uses the `substring()` method to remove the trailing comma and space after the loop.

### 2. Disadvantages of UC5
UC5 required a conditional check `if (nameList.length() > 0)` inside the loop. UC6 simplifies the loop by moving the formatting logic to a single step after the loop finishes.

### 3. Main Flow
1. App iterates through all names and blindly appends `, ` to each.
2. After the loop, the app calculates the length of the string.
3. `substring(0, length - 2)` is called to "cut off" the final unwanted comma.
4. The cleaned string is printed.

### 4. Concepts Learned
* **substring(start, end):** Extracts a specific range of characters.
* **Post-processing:** Building a "dirty" string first and cleaning it up at the end.
* **Immutability:** Recognizing that `substring()` returns a *new* string and doesn't change the original `StringBuilder`.

