# Java LinkedList — Complete Methods Reference.

> LinkedList is a special class in Java that works as BOTH a List AND a Queue/Deque.
> Import: `import java.util.LinkedList;`

---

## What is LinkedList?

```
ArrayList:  [10] [20] [30] [40]  ← stored in one block of memory

LinkedList: [10] → [20] → [30] → [40]  ← each node points to next node
             ↑                     ↑
            HEAD                  TAIL
```

| Feature | ArrayList | LinkedList |
|---------|-----------|------------|
| Access by index | ✅ Fast | ❌ Slow |
| Insert at beginning | ❌ Slow | ✅ Fast |
| Insert at end | ✅ Fast | ✅ Fast |
| Delete from middle | ❌ Slow | ✅ Fast |
| Memory usage | Less | More (stores pointers) |
| Best for | Random access | Frequent insert/delete |

---

## Setup

```java
import java.util.LinkedList;

LinkedList<String> list = new LinkedList<>();
// OR
LinkedList<Integer> nums = new LinkedList<>();
```

---

## 1. ADDING ELEMENTS

| Method | What It Does | Example | Output |
|--------|-------------|---------|--------|
| `.add(value)` | Adds at the END | `list.add("Ravi")` | `[Ravi]` |
| `.add(index, value)` | Adds at specific position | `list.add(1, "Amit")` | inserts at index 1 |
| `.addFirst(value)` | Adds at the BEGINNING | `list.addFirst("Zara")` | `[Zara, Ravi]` |
| `.addLast(value)` | Adds at the END | `list.addLast("John")` | `[Zara, Ravi, John]` |
| `.offer(value)` | Adds at end (Queue style) | `list.offer("Sam")` | adds to end |
| `.offerFirst(value)` | Adds at beginning (Queue style) | `list.offerFirst("Tom")` | adds to front |
| `.offerLast(value)` | Adds at end (Queue style) | `list.offerLast("Kim")` | adds to end |
| `.push(value)` | Adds at FRONT (Stack style) | `list.push("Alex")` | adds to front |

### Code Example

```java
LinkedList<String> list = new LinkedList<>();

list.add("Banana");        // [Banana]
list.add("Mango");         // [Banana, Mango]
list.addFirst("Apple");    // [Apple, Banana, Mango]
list.addLast("Grapes");    // [Apple, Banana, Mango, Grapes]
list.add(2, "Cherry");     // [Apple, Banana, Cherry, Mango, Grapes]

System.out.println(list);  // [Apple, Banana, Cherry, Mango, Grapes]
```

---

## 2. REMOVING ELEMENTS

| Method | What It Does | Example | Output |
|--------|-------------|---------|--------|
| `.remove()` | Removes FIRST element | `list.remove()` | removes head |
| `.remove(index)` | Removes at specific index | `list.remove(2)` | removes index 2 |
| `.remove("value")` | Removes first match of value | `list.remove("Amit")` | removes "Amit" |
| `.removeFirst()` | Removes FIRST element | `list.removeFirst()` | removes head |
| `.removeLast()` | Removes LAST element | `list.removeLast()` | removes tail |
| `.poll()` | Removes & returns FIRST (Queue style) | `list.poll()` | returns + removes head |
| `.pollFirst()` | Removes & returns first | `list.pollFirst()` | returns + removes head |
| `.pollLast()` | Removes & returns last | `list.pollLast()` | returns + removes tail |
| `.pop()` | Removes & returns FIRST (Stack style) | `list.pop()` | returns + removes head |
| `.clear()` | Removes ALL elements | `list.clear()` | `[]` |

### Code Example

```java
LinkedList<String> list = new LinkedList<>();
list.add("Apple");
list.add("Banana");
list.add("Mango");
list.add("Grapes");

list.removeFirst();        // removes Apple  → [Banana, Mango, Grapes]
list.removeLast();         // removes Grapes → [Banana, Mango]
list.remove("Banana");     // removes Banana → [Mango]

System.out.println(list);  // [Mango]
```

---

## 3. GETTING / VIEWING ELEMENTS

| Method | What It Does | Example | Output |
|--------|-------------|---------|--------|
| `.get(index)` | Gets element at index | `list.get(0)` | first element |
| `.getFirst()` | Gets FIRST element (no remove) | `list.getFirst()` | head value |
| `.getLast()` | Gets LAST element (no remove) | `list.getLast()` | tail value |
| `.peek()` | Views FIRST element (no remove) | `list.peek()` | head value |
| `.peekFirst()` | Views first element | `list.peekFirst()` | head value |
| `.peekLast()` | Views last element | `list.peekLast()` | tail value |
| `.element()` | Like peek() — views first | `list.element()` | head value |
| `.indexOf("val")` | Finds first position of value | `list.indexOf("Mango")` | index number |
| `.lastIndexOf("val")` | Finds last position of value | `list.lastIndexOf("Mango")` | index number |

### peek() vs get() — Key Difference

```java
LinkedList<String> list = new LinkedList<>();
list.add("First");
list.add("Second");
list.add("Third");

// peek — just LOOKS, does NOT remove
System.out.println(list.peek());     // First
System.out.println(list);            // [First, Second, Third] — still there!

// poll — LOOKS and REMOVES
System.out.println(list.poll());     // First
System.out.println(list);            // [Second, Third] — First is gone!
```

---

## 4. CHECKING & INFO METHODS

| Method | What It Does | Example | Output |
|--------|-------------|---------|--------|
| `.size()` | Returns number of elements | `list.size()` | `4` |
| `.isEmpty()` | Checks if list is empty | `list.isEmpty()` | `true/false` |
| `.contains("val")` | Checks if value exists | `list.contains("Mango")` | `true/false` |
| `.set(index, "val")` | Replaces element at index | `list.set(0, "Kiwi")` | replaces index 0 |

---

## 5. CONVERTING LinkedList

| Method | What It Does | Example |
|--------|-------------|---------|
| `.toArray()` | LinkedList → Array | `Object[] arr = list.toArray()` |
| `.toString()` | LinkedList → String | `list.toString()` |
| `new LinkedList<>(arrayList)` | ArrayList → LinkedList | `new LinkedList<>(myArrayList)` |
| `new ArrayList<>(linkedList)` | LinkedList → ArrayList | `new ArrayList<>(myLinkedList)` |

### Code Example

```java
// ArrayList to LinkedList
ArrayList<Integer> arrayList = new ArrayList<>();
arrayList.add(1); arrayList.add(2); arrayList.add(3);

LinkedList<Integer> linkedList = new LinkedList<>(arrayList);
System.out.println(linkedList); // [1, 2, 3]

// LinkedList to Array
Object[] arr = linkedList.toArray();
System.out.println(arr[0]);     // 1
```

---

## 6. LinkedList AS A STACK (LIFO)

> LIFO = Last In, First Out (like a stack of plates)

```java
LinkedList<String> stack = new LinkedList<>();

// Push — add to top
stack.push("First");
stack.push("Second");
stack.push("Third");
System.out.println(stack); // [Third, Second, First]

// Pop — remove from top
System.out.println(stack.pop()); // Third
System.out.println(stack.pop()); // Second
System.out.println(stack);       // [First]
```

---

## 7. LinkedList AS A QUEUE (FIFO)

> FIFO = First In, First Out (like a line/queue at a shop)

```java
LinkedList<String> queue = new LinkedList<>();

// offer — join the line
queue.offer("Customer 1");
queue.offer("Customer 2");
queue.offer("Customer 3");
System.out.println(queue); // [Customer 1, Customer 2, Customer 3]

// poll — serve from front
System.out.println(queue.poll()); // Customer 1
System.out.println(queue.poll()); // Customer 2
System.out.println(queue);        // [Customer 3]
```

---

## 8. FULL REAL-WORLD EXAMPLE

```java
import java.util.LinkedList;

public class BrowserHistory {
    public static void main(String[] args) {

        LinkedList<String> history = new LinkedList<>();

        // User visits pages
        history.addLast("google.com");
        history.addLast("youtube.com");
        history.addLast("github.com");
        history.addLast("stackoverflow.com");

        System.out.println("Full history: " + history);
        // [google.com, youtube.com, github.com, stackoverflow.com]

        // Current page
        System.out.println("Current page: " + history.getLast());
        // stackoverflow.com

        // Go back (remove last page)
        history.removeLast();
        System.out.println("After going back: " + history.getLast());
        // github.com

        // Check if visited
        System.out.println("Visited YouTube? " + history.contains("youtube.com"));
        // true

        // Total pages in history
        System.out.println("Pages visited: " + history.size());
        // 3
    }
}
```

---

## 9. QUICK METHOD CHEAT SHEET

### Adding
| Want to... | Use |
|-----------|-----|
| Add at end | `.add()` or `.addLast()` or `.offer()` |
| Add at front | `.addFirst()` or `.push()` |
| Add at position | `.add(index, value)` |

### Removing
| Want to... | Use |
|-----------|-----|
| Remove from front | `.removeFirst()` or `.poll()` or `.pop()` |
| Remove from end | `.removeLast()` or `.pollLast()` |
| Remove specific value | `.remove("value")` |
| Remove everything | `.clear()` |

### Viewing (without removing)
| Want to... | Use |
|-----------|-----|
| See first element | `.getFirst()` or `.peek()` |
| See last element | `.getLast()` or `.peekLast()` |
| See any element | `.get(index)` |

---

## 10. ArrayList vs LinkedList — When to Use What?

| Use ArrayList when... | Use LinkedList when... |
|----------------------|----------------------|
| You need fast access by index | You insert/delete frequently |
| You mostly read data | You use it as Stack or Queue |
| Memory efficiency matters | Order of operations matters |
| Simple list storage | Implementing undo/redo features |

---

*Pro tip: In 90% of real projects, ArrayList is enough. Use LinkedList when you specifically need Stack or Queue behavior, or when you're inserting/deleting from the front very often.*
