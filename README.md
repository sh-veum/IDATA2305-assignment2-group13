# assignment2-group13

## How to run code:

Start your IDE of choice and run the main method in the Main.java file.

## Observation:

Records avaiable seats as 10 because the threads hasn't had time to deduct the booked seats.

**output logs:**

```
Hi,Sam : 10 : Seats available for Troll
Hi,Andreas : 10 : Seats available for Troll
Hi,Ilaria : 10 : Seats available for Troll
Hi,Xiangming : 10 : Seats available for Troll
Hi,Ilaria : 2 Seats booked successfully forTroll
Hi,Andreas : 4 Seats booked successfully forTroll
Hi,Sam : 3 Seats booked successfully forTroll
Hi,Xiangming : Seats not available for Troll
```

## Fix:

Added "synchronized" to the bookTicket method in MovieTicketServer.java

**fixed output logs:**

```
Hi,Xiangming : 10 : Seats available for Troll
Hi,Xiangming : 3 Seats booked successfully forTroll
Hi,Andreas : 7 : Seats available for Troll
Hi,Andreas : 4 Seats booked successfully forTroll
Hi,Sam : 3 : Seats available for Troll
Hi,Sam : 3 Seats booked successfully forTroll
Hi,Ilaria : 0 : Seats available for Troll
Hi,Ilaria : Seats not available for Troll
```
