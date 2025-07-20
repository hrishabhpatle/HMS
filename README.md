🏥 Hospital Management System – Backend (Spring Boot)
This is the backend part of the Hospital Management System project. It is built using Spring Boot and exposes RESTful APIs to manage hospital-related entities such as:

👨‍⚕️ Patient

💊 Medicine

📅 Appointment

The frontend is built separately using Angular and connects to this backend through REST APIs.

🚀 Tech Stack
Layer	Technology
Backend	Java 17, Spring Boot
Build Tool	Maven or Gradle
Database	MySQL / H2
API Testing	Postman
Frontend	Angular (separate repo)
IDE	IntelliJ / VS Code

📦 Project Structure
 
src/
├── controller/         --> REST Controllers +   Business Logic Layer
    
├── repository/         --> JPA Repositories
├── model/              --> Entity Classes (Patient, Medicine, Appointment)
└── dto/                --> Request/Response DTOs (optional)
📌 Features
✅ Add / Update / Delete Patient

✅ Add / Update / Delete Medicine

✅ Book Appointments

✅ Fetch patient history

✅ REST APIs for Angular integration

✅ Cross-Origin support for frontend

🔧 API Endpoints
🧑‍⚕️ Patient APIs
Method	Endpoint	Description
GET	/api/patients	Get all patients
POST	/api/patients	Add new patient
PUT	/api/patients/{id}	Update patient
DELETE	/api/patients/{id}	Delete patient

💊 Medicine APIs
Method	Endpoint	Description
GET	/api/medicines	List all medicines
POST	/api/medicines	Add new medicine
PUT	/api/medicines/{id}	Update medicine
DELETE	/api/medicines/{id}	Delete medicine

📅 Appointment APIs
Method	Endpoint	Description
GET	/api/appointments	View all appointments
POST	/api/appointments	Book an appointment
DELETE	/api/appointments/{id}	Cancel appointment

🌐 Cross-Origin Config
To allow Angular frontend to connect:

java
Copy
Edit
@CrossOrigin(origins = "http://localhost:4200")
Or globally via config class.

🛠️ Running the Project
Clone the project

 
git clone https://github.com/your-username/hospital-management-backend.git
cd hospital-management-backend
Configure MySQL (if using)
Update application.properties:

 
spring.datasource.url=jdbc:mysql://localhost:3306/hospital_db
spring.datasource.username=root
spring.datasource.password=your_password
Build & Run

 
mvn spring-boot:run
 

📂 Frontend (Angular)
Angular project is hosted separately in the repo:
🔗 hospital-management-frontend

🙋‍♂️ Author
Hrishabh Patle



