# 00_fundamentals 🚀

**The absolute foundation of DSA.**  
Before touching any data structure, you **must** master:
- How to calculate & compare efficiency (Big O)
- How Java actually uses memory (stack vs heap, references, GC)

### Goals of this module
- Never again say "O(n²) is fine" without understanding why
- Write code that is both fast **and** memory-efficient in Java
- Develop the "complexity eye" for every future problem

### Big O Cheatsheet (Memorize This Table)

| Complexity     | Name              | Example                          | When it's acceptable          |
|----------------|-------------------|----------------------------------|-------------------------------|
| O(1)           | Constant          | HashMap get(), Array access      | Always perfect                |
| O(log n)       | Logarithmic       | Binary Search, BST operations    | Excellent                     |
| O(n)           | Linear            | Single loop, Linear search       | Good for most problems        |
| O(n log n)     | Linearithmic      | Merge Sort, Quick Sort           | Best for sorting              |
| O(n²)          | Quadratic         | Nested loops (Bubble, Selection) | Only for n ≤ 10³              |
| O(n³)          | Cubic             | 3 nested loops                   | Rarely acceptable             |
| O(2ⁿ)          | Exponential       | Recursive Fibonacci, Subsets     | Only for n ≤ 20–25            |
| O(n!)          | Factorial         | Traveling Salesman (brute)       | Only for n ≤ 10               |

**Pro tip**: Drop one level (e.g. n² → n) = massive difference in real interviews.

### Java-Specific Rules You Must Know
- Array access = O(1)
- `ArrayList` add at end = amortized O(1)
- `LinkedList` get(index) = O(n)
- HashMap / HashSet average = O(1), worst = O(n) (before Java 8 tree-ification)

### Next Steps (Check when done)
- [ ] Read & understand BigO_Analysis.java
- [ ] Read & understand Memory_Java_DeepDive.md
- [ ] Can explain Big O of any code snippet in <10 seconds
- [ ] Can draw Java memory diagram for any object

**Ready?** Move to `01_arrays_and_strings` when you can teach this topic to someone else.
