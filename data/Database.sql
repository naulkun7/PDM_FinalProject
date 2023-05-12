create database HDSNEW;
use HDSNEW;

-- Create the Registration table
CREATE TABLE Registration (
  Name VARCHAR(50) NOT NULL,
  UserName VARCHAR(50) unique NOT NULL,
  Password VARCHAR(50) NOT NULL
);

-- Create the Doctor table
CREATE TABLE Doctor (
  DoctorID INT PRIMARY KEY NOT NULL,
  Doctor_Name VARCHAR(50) NOT NULL,
  Doctor_Phone VARCHAR(11) unique NOT NULL,
  Department VARCHAR(50) NOT NULL
);

-- Create the patient table
CREATE TABLE Patient (
  PatientID INT PRIMARY KEY NOT NULL,
  Patient_Name VARCHAR(50) NOT NULL,
  Phone_no VARCHAR(11) unique NOT NULL,
  Age INT NOT NULL,
  Address VARCHAR(50) NOT NULL,
  Disease VARCHAR(50) NOT NULL,
  Gender VARCHAR(10) NOT NULL
);

-- Create the Treat table
CREATE TABLE Treat (
  DoctorID INT NOT NULL,
  PatientID INT NOT NULL,
  PRIMARY KEY (DoctorID, PatientID),
  FOREIGN KEY (DoctorID) REFERENCES Doctor(DoctorID) ON DELETE CASCADE,
  FOREIGN KEY (PatientID) REFERENCES patient(PatientID) ON DELETE CASCADE
);

-- Create the Lab table
CREATE TABLE Lab (
  Lab_No INT PRIMARY KEY NOT NULL,
  Admission_Date DATE NOT NULL,
  PatientID INT NOT NULL,
  DoctorID INT NOT NULL,
  Category VARCHAR(50) NOT NULL,
  Amount FLOAT NOT NULL,
  FOREIGN KEY (DoctorID) REFERENCES Doctor(DoctorID) ON DELETE CASCADE,
  FOREIGN KEY (PatientID) REFERENCES patient(PatientID) ON DELETE CASCADE
);

-- Create the Bill table
CREATE TABLE Bill (
  BillID INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
  Release_Date DATE NOT NULL,
  PatientID INT NOT NULL,
  FOREIGN KEY (PatientID) REFERENCES patient(PatientID) ON DELETE CASCADE
);

-- Create the Room table
CREATE TABLE Room (
  Room_No INT PRIMARY KEY NOT NULL,
  PatientID INT UNIQUE,
  Room_Type VARCHAR(50) NOT NULL, 
  Room_Status VARCHAR(50) NOT NULL,
  Room_Charge INT NOT NULL,
  FOREIGN KEY (PatientID) REFERENCES patient(PatientID) ON DELETE CASCADE
);

-- VALUES
-- Values for registration table
INSERT INTO Registration (Name, UserName, Password) VALUES
('Tri', 'password123', 'password123'),
('Luan', 'ace', 'ace'),
('Tai', 'eca', 'eca');

-- Values for Doctor table
INSERT INTO Doctor (DoctorID, Doctor_Name, Doctor_Phone, Department) VALUES
(101, 'Dr. Smith', '555-1234', 'Cardiology'),
(102, 'Dr. Johnson', '555-5678', 'Pediatrics'),
(103, 'Dr. Brown', '555-9012', 'Oncology');

-- Values for patient table
INSERT INTO Patient (PatientID, Patient_Name, Phone_no, Age, Address, Disease, Gender) VALUES
(1001, 'Mary Smith', '555-1111', 35, '123 Main St', 'Heart Disease', 'Female'),
(1002, 'Tom Jones', '555-2222', 45, '456 Oak St', 'Diabetes', 'Male'),
(1003, 'Sue Johnson', '555-3333', 25, '789 Maple St', 'Asthma', 'Female');

-- Values for Treat table
INSERT INTO Treat (DoctorID, PatientID) VALUES
(101, 1001),
(102, 1001),
(102, 1002),
(103, 1003);

-- Values for Lab table
INSERT INTO Lab (Lab_No, Admission_Date, PatientID, DoctorID, Category, Amount) VALUES
(10001, '2023-04-25', 1001, 101, 'Blood Test', 100.00),
(10002, '2023-04-26', 1002, 102, 'Urine Test', 75.00),
(10003, '2023-04-27', 1003, 103, 'X-Ray', 250.00);

-- Values for Bill table
INSERT INTO Bill (Release_Date, PatientID) VALUES
('2023-05-01', 1001),
('2023-05-02', 1002),
('2023-05-03', 1003);

-- Values for Room table
INSERT INTO Room (Room_No, PatientID, Room_Type, Room_Status, Room_Charge) VALUES
(101, 1001, 'Standard', 'Occupied', 100),
(102, NULL, 'Deluxe', 'Vacant', 75),
(103, NULL, 'Deluxe', 'Vacant', 100);