## Cab Driver Billing System

#### Expectations and Guidelines

1. **Time Allotted:** 90 minutes
2. **Internet Usage:** You may use the internet only for syntax references.
3. **Programming Language:** You may use any language of your choice.
4. **External Libraries:** Do not use any external libraries. All code should be written by you.
5. Make sure that you have working and demonstrable code for all the above requirements.
6.
7. Platform Capabilities should be strictly followed. Work on the expected output first and
   then move on the Bonus Capabilities.
8. Use of proper abstraction, separation of concerns is required.
9. Code should easily accommodate new requirements with minimal changes.
10. Proper exception handling is required.
11. Code should be modular, readable and unit-testable.

### Important Notes:

1. Do not use any database store, use in-memory data structure.
2. Do not create any UI for the application.
3. Do not build a Command line interface, Executing test cases or simple Main function
   should be sufficient
4. Do not make any assumption, please ask it out.

### Evaluation Metrics -

Your code would be evaluated on basis of -

1. Functional Correctness
2. Completeness
3. Exceptional Handling


# Cab Driver Billing System

## Problem Statement:

You are part of a cab aggregator company, Allen Cabs, which allows you to book a cab like
ola/uber.
As a part of the Driver Billing team, you need to create a system which generates bills for drivers
periodically based on the kms they have driven.

## Platform Capabilities:

```
● Drivers get onboarded to Allen Cabs and assigned a unique Id.
● Based on model of car, cars are divided into 3 categories
○ Economy
○ Premium
○ Luxury
● Billing is calculated based on the distance driven by drivers during the booking/trip
period.
● Trips can be of type - intra-city or outstation
● For billing, Price/km is based on different car categories.
Intra-city charges are as follows :
○ Economy - Rs 5/km
○ Premium - Rs 12/km
○ Luxury - Rs 15/km
● Charges for outstation are 2x of the intra-city.
● If a trip is canceled by a driver, the driver is fined a fixed amount of Rs 10, else if it’s
canceled by a customer, the driver is compensated by a fixed amount of Rs.10.
● Bill the driver on the basis of Kms driven and its car category, along with the cancellation
cases.
```
#### Bonus Capabilities:

```
● If your program can charge a variable cancellation fee based on the trip type and car
category.
● Get Bill of driver for a time interval
● Drivers can use their own vehicle or may lease it from the Allen Cabs.
● Allen Cabs charges a commission (x %), if the vehicle is leased to the driver.
[Scroll down for test cases]
```

#### Test Cases:

1. AddDriver
   a. AddDriver("Sachin", "+91-9936673000", "DL_01")
   b. AddDriver("Ramesh", "+91-9936673011", "DL_02")
   c. AddDriver("Manjunath", "+91-993667301", "DL_03")
2. AddVehicle
   a. AddVehicle(“KA-01-2222”, “Maruti Suzuki”, “ECONOMY”)
   b. AddVehicle(“KA-01-2223”, “Ertiga”, “PREMIUM”)
3. MapDriverToVehicle
   a. MapDriverToVehicle(“Ramesh”, “KA-01-2222”)
   b. MapDriverToVehicle(“Manjunath”, “KA-01-2223”)
4. AddTrip
   // AddTrip(distance-in-kms, trip-start-time, trip-end-time, trip-type, trip-status,
   driver-name)
   a. AddTrip( 50, 1723116023, 1723117023 ,”INTRACITY”, “COMPLETED”,
   “Ramesh”) -
   b. AddTrip( 1050, 1723116023, 1723117023, “OUTSTATION”, “COMPLETED”,
   “Ramesh”)
   c. AddTrip( 50, 1723116023, 1723117023, “INTRACITY”,
   CANCELED_CUSTOMER, “Ramesh”)
   d. AddTrip( 50, 1723116023, 1723117023, “OUTSTATION”, CANCELED_DRIVER,
   “Manjunath”)
   e. AddTrip( 70, 1723116023, 1723117023, “OUTSTATION”, COMPLETED,
   “Manjunath”)
5. GetBill
   a. GetBill(“Ramesh”)
   (50 * 5 ) + (1050 * 5*2) + 10 = Rs 10760
   b. GetBill(“Manjunath”)
   (-10) + (70 * 12 * 2) = Rs 1670



