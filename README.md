# The Great Robbery minigame

A Java OOP simulation game where a gang of criminals attempts repeated heists across a city — until the police finally catches them.



---

##  How It Works

1. A **Gang** of criminals picks a random building in the city to rob
2. The robbery succeeds based on the **combined success percentage** of all gang members
3. If successful, all items from that building are stolen and their value is accumulated
4. After each robbery attempt, the **Police** tries to catch the gang based on the detective's success percentage
5. The loop continues until the criminals are caught

---

## Project Structure

```
├── Person.java           # Abstract base class for all characters
├── Criminal.java         # Extends Person — has a robbery success percentage
├── Detective.java         # Extends Person — has an arrest success percentage
├── Gang.java             # Manages criminals, robbery logic, and stolen value tracking
├── Police.java           # Manages the detective and arrest logic
├── City.java             # Creates the city with 4 buildings
├── Building.java         # Represents a location with items inside
├── Item.java             # Represents a stealable item with a name and value
└── GreatRobberyApp.java  # Main entry point — sets up and runs the simulation
```

---

## OOP Concepts Demonstrated

| Concept | Where |
|---|---|
| **Abstract class** | `Person` — cannot be instantiated directly |
| **Inheritance** | `Criminal` and `Detective` both extend `Person` |
| **Method overriding** | `printBioData()` overridden in both subclasses |
| **Encapsulation** | All fields are private with public getters |
| **Composition** | `Gang` contains `Criminal[]`, `Police` contains `Detective`, `Building` contains `Item[]` |
| **Randomness** | `java.util.Random` used for robbery and arrest outcomes |

---

## City Layout

| Building | Items |
|---|---|
| 🏦 Bank | Money (10,000), Safe (5,022,200) |
| 🏠 House | Scissors (100), Laptop (500) |
| 🏢 Office | Stapler (120), Printer (1,000) |
| 🏥 Hospital | Nurse Uniform (120), Hospital Bed (1,000) |

---

## How to Run

1. Clone the repository
2. Open in **IntelliJ IDEA** (or any Java IDE)
3. Run `GreatRobberyApp.java`

Requires **Java 17+** (uses `Random.nextDouble(min, max)` and `Random.nextInt(min, max)`)


