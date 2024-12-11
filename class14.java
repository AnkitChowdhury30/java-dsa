
class Access {

    private int num; // private means only access in this class 
    public String name; // public means  can access anywhere
    int[] arr; // default means can access in this package but cant access outside this package
    protected String naam; // can be access in same package and diff package ka subclass mai  lekin diff package ka diff subclass mai access nhi hoga

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Access(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}

public class class14 {

    public static void main(String[] args) {
        Access a = new Access(10, "Ankit");

        // need to do few things
    }
}
/*
  private used for sensitive data which can be only manipulated by gettter and setter methode

  defualt used when we want data to be accessed in only one package

  protected means when we want only accesss in same package and other package in same subclass

  *********************** packages 2.0 *************************

  pavkages 2 types user defined and in built 

  user defined done 

  in built ye sb java folder mai hoga

  1) lang --> contain essential things for java primitive , plus minus, ye autumatically import ho jata h
 
  2) io --> buffer reader 

  3) util --> contain data structures stuff like arraylist other things and collections

  4) applet -->

  5) awt

  6) net -->

  ******** everything in java directly or indirectly extends object class

  chatgpt

  Key Built-In Packages
1. java.lang
Purpose: Provides classes fundamental to the design of the Java programming language.
Key Classes:
Object: The root class of all Java classes.
String: Represents a sequence of characters.
Math: Provides methods for mathematical operations (e.g., sqrt, pow, sin).
System: Contains system-related utilities (e.g., System.out.println).
Note: This package is automatically imported, so you don’t need to explicitly import it.

2. java.util
Purpose: Provides utility classes for data structures, collections, and other utilities.
Key Classes:
ArrayList, LinkedList, HashSet, HashMap: For collections.
Date, Calendar: For date and time manipulation.
Random: For generating random numbers.
Scanner: For reading user input.
3. java.io
Purpose: Facilitates input and output operations.
Key Classes:
File: For handling files.
FileReader and FileWriter: For reading and writing text files.
BufferedReader and BufferedWriter: For efficient text input/output.
InputStream and OutputStream: For binary input/output.
4. java.nio
Purpose: Offers non-blocking I/O operations (faster and scalable than java.io).
Key Classes:
Path: Represents file paths.
Files: Contains static methods for file operations (e.g., copying, moving).
ByteBuffer: For byte manipulation in non-blocking I/O.
5. java.net
Purpose: For networking capabilities.
Key Classes:
URL: Represents a Uniform Resource Locator.
HttpURLConnection: For HTTP connections.
Socket: For client-server communication.
6. java.sql
Purpose: For database access and manipulation.
Key Classes:
Connection: Represents a database connection.
Statement and PreparedStatement: For executing SQL queries.
ResultSet: Holds the result of a database query.
7. java.time
Purpose: Provides a modern date and time API.
Key Classes:
LocalDate, LocalTime, LocalDateTime: For handling dates and times.
Duration, Period: For time intervals.
DateTimeFormatter: For formatting date/time.
8. java.math
Purpose: Provides classes for performing precise mathematical operations.
Key Classes:
BigInteger: For handling arbitrarily large integers.
BigDecimal: For handling precise decimal values.
9. java.security
Purpose: Provides security features like encryption and authentication.
Key Classes:
MessageDigest: For generating cryptographic hash values.
SecureRandom: For generating cryptographically strong random values.
 
  */
