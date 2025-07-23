The NEU Library offers a variety of resources, including books, theses, capstones, internet access, journals, and newspapers.

Currently, the **Student** object has methods like **borrowBook()** and **borrowJournal()** with a parameter of title, which directly depends on specific resource types.

To adhere to the **Dependency Inversion Principle (DIP)** and ensure flexibility for future changes (such as introducing audio books or e-journals), we need to refactor the program while maintaining <ins>SOLID principles</ins>. The goal is to create a robust system that can seamlessly accommodate new resource types in the future.

Your solution should not violate other <ins>SOLID principles</ins>.

Make sure you have a **TestProgram** that will validate the proposed refactored codes.

### **UML Class Diagram:**
![UML Class Diagram](https://github.com/ArenJohnD/Lab-Assignment-7/assets/152838648/d5516a56-1814-4f78-8db1-c1577b9de1dd)
