# Indigo_Flights_Manager
A backend project created using core Java concepts as well as the Java Database Connectivity to connect the database. Contains booking flight tickets, flight information, cancelling ticket, generating boarding pass and other basic functionalities.
Integrated the database through MySQL Workbench.
This project focuses on a single airline company, i.e. Indigo 6E.
The database I created is of the name airlinesite. The database contains different tables which handles the data of the various functionalities of the application. 
The name of tables are: 
  1. Reservation: It contains the details such as the PNR number, Ticket Number, Aadhar number, Name, Nationality, source and destination, flight name and code, and departure date  of the user.
  2. Login: It contains the login password of the user(Please see that I have created only one user and Signup page is not available).
  3. Passenger: It contains the details of the passenger such as Name, Nationality, Phone number, address, aadhar, and gender.
  4. Flight: It contains the data that is relevant to the flight details like Flight code, Flight name, Sourc, and destination of the flight.
  5. Cancel: This table keeps the record of the flight ticket that is cancelled. It includes details like PNR number, Name of the user, cancellation number, Flight code, and date.

Please see: I could not create the function to provide the notification on SMS or Email as I was encountring errors with it which in the end disturbed the actual working of the project.
The login credentials for the login page of the java application are:
Username: admin
Password: root
