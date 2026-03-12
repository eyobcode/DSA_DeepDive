# Java Memory Deep Dive (Stack vs Heap vs GC)

## 1. Stack Memory
- Fast, automatic, thread-local
- Stores: primitive types + **references** to objects
- Size: usually 1MB per thread (can be increased)
- LIFO → dies when method ends

## 2. Heap Memory
- Where **all objects** live (ArrayList, String, your custom classes)
- Shared across threads
- Managed by Garbage Collector
- Divided into: Young Gen (Eden + Survivor) + Old Gen

## 3. Key Java Memory Rules You Must Know

| Thing                    | Stored In     | Size Example          | Important Note                     |
|--------------------------|---------------|-----------------------|------------------------------------|
| `int x = 5;`             | Stack         | 4 bytes               | Primitive = fast                   |
| `Integer x = 5;`         | Heap          | ~16 bytes + object    | Autoboxing creates object          |
| `int[] arr = new int[10]`| Heap          | 40 bytes + 16 header  | Array itself is object             |
| `String s = "hello"`     | Heap (String Pool) | ~40 bytes         | String pool optimization           |
| `new Student()`          | Heap          | depends on fields     | Reference lives on stack           |

## 4. Garbage Collection (GC) in one sentence
"Java automatically deletes objects that have **zero references** pointing to them."

**Common memory mistakes:**
- Keeping unnecessary references → memory leak
- Creating millions of temporary objects in loops
- Using `String` concatenation in loops instead of `StringBuilder`

## 5. Pro Tips for DSA
- Prefer primitives over wrapper classes in competitive coding
- Use `StringBuilder` for heavy string work
- Understand that passing objects = passing reference (not copy)

**Next:** After this, you will **never** be confused why your code is slow or uses too much RAM.
