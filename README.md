# 🚖 Taxi Booking Application (Java Console)

A simple Java console application that simulates a **taxi booking system**.  
The system assigns taxis to customer requests based on **availability**, **proximity**, and **earnings**, while tracking bookings and total fare earned by each taxi.

This project is intentionally small and readable — ideal for **learning**, **practice**, and **extension**.

---

## 🔧 Features

- Assigns the **nearest available taxi** to a pickup location
- **Tie-breaker rule**:
  - If multiple taxis are at the same distance, the taxi with **lower total earnings** is chosen
- Fare calculation based on **distance traveled**
- Tracks:
  - Taxi location
  - Free time
  - Total earnings
  - Booking history per taxi
- Prints clear **allocation / cancellation messages** to the console

---

## 🧠 How It Works (Brief)

1. All taxis start:
   - At position **`'A'`**
   - Free at **time 0**
2. A booking request includes:
   - `customerId`
   - `pickupPoint` (e.g., `'A'`)
   - `dropPoint`
   - `pickupTime`
3. The system:
   - Filters taxis that are **free at the requested pickup time**
   - Chooses the taxi with the **minimum distance** to the pickup point
   - Applies **lower earnings** as a tie-breaker
4. Once assigned:
   - Taxi’s **location**, **free time**, and **earnings** are updated
   - Booking details are stored in the taxi’s history
5. If no taxi is available:
   - The booking is **cancelled**

---

## ⚙️ Requirements

- Java **8+** (or any modern JDK)
- Command-line access

---

## ▶️ Build & Run

### Option A — Compile & Run from `src`

```bash
cd src
javac *.java
java Main
