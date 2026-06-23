# 🍎 Shree Fruit — Fruit Sales Management App

A full-stack web application to manage and track fruit sales records in real-time.
Built with **Java Spring Boot** (Backend) and **HTML/CSS/JavaScript** (Frontend).

---

## 🌐 Live Demo

- 🛒 **Customer Form:** [Coming Soon — Netlify Link]
- 👑 **Admin Dashboard:** [Coming Soon — Netlify Link]
- ⚙️ **Backend API:** [Coming Soon — Railway Link]

---

## ✨ Features

### 👥 For Colleagues (Customer Form)
- Enter customer sale details — Name, Contact, Fruit, Weight, Address
- Beautiful fruit selector with emoji cards 🥭🍈🍋🍐
- Real-time data save to backend
- Mobile responsive design
- Success popup on form submission

### 👑 For Admin (Dashboard)
- Secure login (username + password protected)
- View all sales records in a table
- Live stats — Total entries, Unique fruits, Total weight, Today's sales
- Export all data to Excel (.xlsx) file
- Refresh data anytime

---

## 🛠️ Tech Stack

| Layer | Technology |
|---|---|
| Frontend | HTML5, CSS3, Vanilla JavaScript |
| Backend | Java 21, Spring Boot 3.5 |
| Database | MySQL |
| ORM | Spring Data JPA + Hibernate |
| Build Tool | Maven |
| Hosting (Frontend) | Netlify |
| Hosting (Backend) | Railway |

---

## 📁 Project Structure

```
shree-fruit-app/
├── backend/                          # Spring Boot Project
│   └── src/main/java/com/shreefruit/
│       ├── controller/
│       │   └── SaleEntryController.java
│       ├── model/
│       │   └── SaleEntry.java
│       ├── repository/
│       │   └── SaleEntryRepository.java
│       ├── service/
│       │   └── SaleEntryService.java
│       └── ShreefruitappApplication.java
│
├── frontend/                         # HTML/CSS/JS
│   ├── index.html                    # Customer Sale Form
│   └── admin.html                    # Admin Dashboard
│
└── README.md
```

---

## 🚀 How to Run Locally

### Prerequisites
- Java 17+
- MySQL
- Maven

### Backend Setup

```bash
# 1. Clone the repo
git clone https://github.com/Nikhillilhare/Shree-Fruit-App.git

# 2. Go to backend folder
cd shreefruitapp

# 3. Create MySQL database
mysql -u root -p
CREATE DATABASE shreefruit_db;

# 4. Configure application.properties
spring.datasource.url=jdbc:mysql://localhost:3306/shreefruit_db
spring.datasource.username=W1_92793_Nikhil
spring.datasource.password=manager

# 5. Run the app
mvn spring-boot:run
```

### Frontend Setup

```bash
# Open index.html with Live Server in VS Code
# OR simply open index.html in browser
```

---

## 📡 API Endpoints

| Method | Endpoint | Description |
|---|---|---|
| POST | `/sales` | Save new sale entry |
| GET | `/sales` | Get all sale entries |

---

## 📸 Screenshots

> Coming Soon

---

## 👨‍💻 Developer

**Nikhil Lilhare**
- 🎓 MCA Graduate — Dr. D.Y. Patil Institute, Pune
- 💼 Java Full Stack Developer
- 📍 Pune, Maharashtra
- 🔗 [LinkedIn](https://www.linkedin.com/in/your-linkedin)
- 📧 nikhillilhare90gmail.com

---

## 📄 License

This project is open source and available under the [MIT License](LICENSE).
