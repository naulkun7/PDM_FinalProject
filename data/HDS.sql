CREATE DATABASE HDS;
USE HDS;

CREATE TABLE registration(
Name varchar(50) not null,
UserName varchar(50) not null,
Password varchar(50) not null
);

CREATE TABLE Doctor(
DoctorID int primary key not null,
Doctor_Name varchar(50) not null,
Doctor_Phone varchar(11) not null,
Department varchar(50) not null
);

INSERT INTO Doctor(DoctorID, Doctor_Name, Doctor_Phone, Department)
VALUES
(01, 'Nguyen Thi Kim Anh', '0907714363', 'Surgery'),
(02, 'Tran Minh Duc', '0918768909', 'Medicine'),
(03, 'Pham Thi Mai', '0915789302', 'Surgery'),
(04, 'Le Van Huy', '0915684993', 'Neurology'),
(05, 'Vu Thi Thuy', '0915684990', 'Hepatologist'),
(06, 'Hoang Quoc Bao', '0913889499', 'Neurosurgon'),
(07, 'Doan Thi Ngoc', '0913728192', 'Gaynoulogist'),
(08, 'Nguyen Van Phuc', '0916627389', 'Medicine'),
(09, 'Truong Thi Thu', '0919647382', 'Surgery'),
(10, 'Nguyen Dinh Tuan', '0913998746', 'Neourology'),
(11, 'Hoang Thi Thanh', '0919882764', 'Surgery'),
(12, 'Tran Van Long', '0919882736', 'Neurology');


CREATE TABLE Patient(
PatientID int primary key not null,
Patient_Name varchar(50) not null,
Phone_no varchar(11) not null,
Age int not null,
Address varchar(50) not null,
Disease varchar(50) not null,
Gender varchar(10) not null,
DoctorID int,
foreign key (DoctorID) references Doctor(DoctorID) ON DELETE CASCADE 
);

INSERT INTO patient(PatientID, Patient_Name, Phone_no, Age, Address, Disease, Gender, DoctorID)
VALUES
(01, 'Tran Van Dat', '01871627437', 30, 'Jatrabari', 'Cancer', 'Male', 12),
(02, 'Nguyen Van Huy', '01987654321', 20, 'Rampura', 'Cold', 'Male', 01),
(03, 'Pham Thi Thu', '01987654321', 30, 'Mogbazar', 'Fever', 'Female', 03),
(04,'Le Thanh Tam', '01987654321', 10, 'Wireless_Mogbazar', 'Cholera', 'Female', 06),
(05, 'Nguyen Thi Hang', '01987654321', 25, 'Dhaka', 'Fever', 'Female', 05),
(06, 'Tran Thi Yen', '01987654321', 45, 'Jigatola', 'Diaria', 'Female', 11),
(07, 'Le Thanh Trung', '01987654321', 26, 'Khilgaon', 'Cold', 'Male', 10),
(08, 'Tran Tran', '01987654321', 35, 'Mirpur', 'Heart_Attack', 'Male', 09),
(09, 'Dung Dung', '01987654321', 40, 'Mirpur', 'Rahh', 'Male', 02),
(10, 'Dung De', '01987654321', 22, 'Uttra', 'Fever', 'Male', 06),
(11, 'Cong Phuong', '01987654321', 39, 'Mirpur', 'Cold', 'Male', 08),
(12, 'Duy Nhat', '01987654321', 47, 'Jigatola', 'Cold', 'Male', 01),
(13, 'Van Hau', '01871627437', 28, 'Uttra', 'Cancer', 'Male', 11),
(14, 'Hieu Thu 2', '01909856772', 10, 'Kamargao', 'Cold', 'Male', 02),
(15, 'Phuc GPA4.', '01987654321', 11, 'Sreenagar', 'Fever', 'Female', 09),
(16, 'Tai Chilling', '01988909876', 15, 'Dhaka', 'Cold', 'Male', 11)


CREATE TABLE Lab(
Lab_No int primary key not null,
Admission_Date date not null,
DoctorID int not null,
PatientID int not null,
Category varchar(50) not null,
Amount float not null,
foreign key (DoctorID) references Doctor(DoctorID) ON DELETE CASCADE,
foreign key (PatientID) references patient(PatientID) ON DELETE CASCADE
);

INSERT INTO Lab(Lab_No, Admission_Date, DoctorID, PatientID, Category, Amount)
VALUES
(01, '2023-02-01', 01, 01, 'X-Ray', 1500),
(02, '2022-03-01', 12, 11, 'Ultrasonography', 12000),
(03, '2021-01-01', 11, 13, 'MRI', 15000),
(04, '2020-02-01', 10, 09, 'X-Ray', 11000),
(05, '2019-02-01', 08, 07, 'Blood', 200),
(06, '2013-02-01', 06, 06, 'CT-Scan', 25500),
(07, '2014-02-01', 05, 04, 'Urin', 150),
(08, '2023-01-01', 03, 05, 'Hagu', 100),
(09, '2023-02-03', 02, 03, 'CT-Scan', 2550),
(10, '2015-02-01', 09, 02, 'Urin', 150),
(11, '2010-02-01', 10, 07, 'Urin', 150),
(12, '2009-12-01', 11, 10, 'ECG', 17500);


CREATE TABLE Bill(
BillID int primary key not null auto_increment,
Release_Date date not null,
PatientID int not null,
foreign key (PatientID) references patient(PatientID) ON DELETE CASCADE
);

INSERT INTO Bill (Release_Date, PatientID) VALUES
('2023-12-19', 11),
('2023-11-28', 01),
('2023-10-27', 12),
('2023-09-26', 09),
('2023-08-20', 04),
('2023-07-15', 03),
('2023-06-19', 05),
('2023-05-12', 06),
('2023-04-08', 10),
('2023-03-09', 13);


CREATE TABLE Room(
Room_No int primary key not null,
PatientID int unique not null,
Room_Type varchar(50) not null,
Room_Status varchar(50) NOT NULL,
Room_Charge int not null,
foreign key (PatientID) references patient(PatientID) ON DELETE CASCADE
);

INSERT INTO Room(Room_No, PatientID, Room_Type, Room_Status, Room_Charge) VALUES
(413, 02, 'Child_Bed', 'Available', 1500),
(414, 04, 'Bed', 'UnAvailable', 1600),
(415, 06, 'Child_Bed', 'Available', 1300),
(416, 08, 'Bed', 'UnAvailable', 1500),
(417, 10, 'Bed', 'Available', 1200),
(418, 12, 'Child_Bed', 'Available', 1400),
(419, 11, 'Bed', 'Available', 4000),
(420, 09, 'Child_Bed', 'UnAvailable', 9000),
(421, 07, 'Child_Bed', 'Available', 3500),
(422, 05, 'Bed', 'Available', 2500),
(423, 03, 'Bed', 'UnAvailable', 3500),
(424, 01, 'Child_Bed', 'Available', 1360);