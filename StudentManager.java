import java.sql.*;
import java.util.Scanner;

public class StudentManager {
    
    public static void insertStudent(Connection conn, int rollno, String name, String standard, Date dob, double fees) throws SQLException {
        String sql = "INSERT INTO student (Rollno, StudentName, Standard, Date_Of_Birth, Fees) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, rollno);
            pstmt.setString(2, name);
            pstmt.setString(3, standard);
            pstmt.setDate(4, dob);
            pstmt.setDouble(5, fees);
            pstmt.executeUpdate();
        }
    }
    
    public static void displayAllStudents(Connection conn) throws SQLException {
        String sql = "SELECT * FROM student";
        try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                int rollno = rs.getInt("Rollno");
                String name = rs.getString("StudentName");
                String standard = rs.getString("Standard");
                Date dob = rs.getDate("Date_Of_Birth");
                double fees = rs.getDouble("Fees");
                System.out.println("Roll No: " + rollno + ", Name: " + name + ", Standard: " + standard + ", Date of Birth: " + dob + ", Fees: " + fees);
            }
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Connection conn = DatabaseConnector.getConnection();
            
            while (true) {
                System.out.println("1. Insert Student");
                System.out.println("2. Display All Students");
                System.out.println("3. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine();  // Consume newline

                if (choice == 1) {
                    System.out.print("Enter Roll No: ");
                    int rollno = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Standard: ");
                    String standard = scanner.nextLine();
                    System.out.print("Enter Date of Birth (YYYY-MM-DD): ");
                    String dobStr = scanner.nextLine();
                    Date dob = Date.valueOf(dobStr);
                    System.out.print("Enter Fees: ");
                    double fees = scanner.nextDouble();
                    insertStudent(conn, rollno, name, standard, dob, fees);
                } else if (choice == 2) {
                    displayAllStudents(conn);
                } else if (choice == 3) {
                    break;
                } else {
                    System.out.println("Invalid choice. Please try again.");
                }
            }
            
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
