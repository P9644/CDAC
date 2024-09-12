package org.arra;
import java.util.Scanner;
public class AirplaneSeating {
    private char[][] seats;  
    	public AirplaneSeating(int rows, int columns) {
        seats = new char[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                seats[i][j] = 'A';
            }
        }
    }

    public void bookSeat(int row, int col) {
        if (isValidSeat(row, col)) {
            if (seats[row][col] == 'A') {
                seats[row][col] = 'O';
                System.out.println("Seat " + (row + 1) + (char)(col + 'A') + " booked successfully.");
            } else {
                System.out.println("Seat is already occupied.");
            }
        } else {
            System.out.println("Invalid seat.");
        }
    }

    public void cancelBooking(int row, int col) {
        if (isValidSeat(row, col)) {
            if (seats[row][col] == 'O') {
                seats[row][col] = 'A';
                System.out.println("Seat " + (row + 1) + (char)(col + 'A') + " canceled successfully.");
            } else {
                System.out.println("Seat is not currently booked.");
            }
        } else {
            System.out.println("Invalid seat.");
        }
    }

    public boolean isSeatAvailable(int row, int col) {
        if (isValidSeat(row, col)) {
            return seats[row][col] == 'A';
        } else {
            System.out.println("Invalid seat.");
            return false;
        }
    }
    public void displaySeatingChart() {
        System.out.println("Seating Chart:");
        System.out.print("  ");
        
        for (int col = 0; col < seats[0].length; col++) {
            System.out.print((char) ('A' + col) + " ");
        }
        System.out.println();

        for (int row = 0; row < seats.length; row++) {
            System.out.print((row + 1) + " ");
            for (int col = 0; col < seats[0].length; col++) {
                System.out.print(seats[row][col] + " ");
            }
            System.out.println();
        }
    }

    private boolean isValidSeat(int row, int col) {
        return row >= 0 && row < seats.length && col >= 0 && col < seats[0].length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       AirplaneSeating airplaneSeating = new AirplaneSeating(5, 4);

        airplaneSeating.displaySeatingChart();

        airplaneSeating.bookSeat(0, 0); 
        airplaneSeating.bookSeat(2, 1);  
        airplaneSeating.bookSeat(4, 3);  
        airplaneSeating.displaySeatingChart();

        boolean isAvailable = airplaneSeating.isSeatAvailable(0, 0);  
        System.out.println("Seat 1A available: " + isAvailable);

        airplaneSeating.cancelBooking(0, 0);  
        airplaneSeating.displaySeatingChart();
    }
}

/*9.	You need to implement a system to manage airplane seat assignments. The airplane has seats arranged in rows and columns. Implement functionalities to:
•	Initialize the seating arrangement with a given number of rows and columns.
•	Book a seat to mark it as occupied.
•	Cancel a booking to mark a seat as available.
•	Check seat availability to determine if a specific seat is available.
•	Display the current seating chart.
*/