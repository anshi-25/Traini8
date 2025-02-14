# Traini8

This application provides a comprehensive solution for managing training centers efficiently.
It allows users to add, update, and view training center information, including address details,
student capacity, courses offered, and contact information.

 **Tech Stack Used:**
- Java Spring Boot (Backend)
- MongoDB (Database)
- Lombok (Boilerplate Code Reduction)
- Postman (API Testing)

 **Key Features:**
- Add new training centers with validation.
- View training center details in a structured format.
- Automatic timestamp generation upon creation.

---

## ⚙️ Prerequisites

Ensure the following tools are installed on your system:

- [Java JDK 17+](https://www.oracle.com/java/technologies/downloads/)  
- [Maven](https://maven.apache.org/download.cgi)  
- [MongoDB Community Edition](https://www.mongodb.com/try/download/community)  
- [Postman](https://www.postman.com/downloads/) for API testing  
- An IDE like IntelliJ IDEA or Eclipse  



## 🚀 Project Setup Instructions

Follow these steps to set up the project on your local machine:

1️⃣ **Clone the Repository:**  
```bash
git clone https://github.com/yourusername/TrainingCenterManagement.git
cd TrainingCenterManagement
```

2️⃣ **Open the Project in IDE:**  
- Open IntelliJ IDEA or Eclipse.  
- Select `File > Open` and choose the project directory.  

3️⃣ **Configure MongoDB:**  
- Make sure MongoDB is running locally on port `27017`.  
- You can change the database name in `application.properties` if needed.  

4️⃣ **Build the Project:**  
```bash
mvn clean install
```

5️⃣ **Run the Application:**  
```bash
mvn spring-boot:run
```

6️⃣ **Access the Application:**  
- Open Postman and access the endpoints using `http://localhost:8080/api/training-centers`.  

---

## 🔍 API Endpoints

📌 **Base URL:** `http://localhost:8080/api/training-centers`

### 1️⃣ Add a Training Center
- **Endpoint:** `/add`  
- **Method:** `POST`  
- **Request Body:**  
```json
{
  "centerName": "NIT Training Center",
  "centerCode": "ABC123456789",
  "address": {
    "detailedAddress": "123 Tech Park",
    "city": "Raipur",
    "state": "Chhattisgarh",
    "pincode": "492001"
  },
  "studentCapacity": 100,
  "coursesOffered": ["Java", "Spring Boot", "Python"],
  "contactEmail": "info@nitcenter.com",
  "contactPhone": "9876543210"
}
```
- **Response:**  
```json
{
  "message": "Training Center added successfully!",
  "centerId": "652a5d3c4e5f6a7b8c9d0e1f"
}
```

### 2️⃣ Get All Training Centers
- **Endpoint:** `/all`  
- **Method:** `GET`  
- **Response:**  
```json
[
  {
    "centerName": "NIT Training Center",
    "centerCode": "ABC123456789",
    "address": {
      "detailedAddress": "123 Tech Park",
      "city": "Raipur",
      "state": "Chhattisgarh",
      "pincode": "492001"
    },
    "studentCapacity": 100,
    "coursesOffered": ["Java", "Spring Boot", "Python"],
    "contactEmail": "info@nitcenter.com",
    "contactPhone": "9876543210",
    "createdOn": 1700000000000
  }
]


## 🔐 Validation Rules

The application ensures data integrity with the following validation rules:

- 🟢 **Center Name:** Cannot be empty.  
- 🟢 **Center Code:** Must be exactly 12 alphanumeric characters.  
- 🟢 **Phone Number:** Must be exactly 10 digits.  
- 🟢 **Pincode:** Must be exactly 6 digits.  
- 🟢 **Address Fields:** All fields are mandatory.  

**Error Message Examples:**  
- `Center Name is required.`  
- `Center Code must be exactly 12 alphanumeric characters.`  
- `Phone number must be exactly 10 digits.`  
