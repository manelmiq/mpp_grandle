// Program 1: IntStreamOperations.java

// Demonstrating IntStream operations.

package  Lambda;

import java.util.Arrays;

import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;



public class IntStreamOperations

{

    public static void main(String[] args)

    {

        int[] values = {3, 10, 6, 1, 4, 8, 2, 5, 9, 7};

// display original values

        System.out.print("Original values: ");

        IntStream.of(values)

                .forEach(value -> System.out.printf("%d ", value));

        System.out.println();

// count, min, max, sum and average of the values

        System.out.printf("%nCount: %d%n", IntStream.of(values).count());

        System.out.printf("Min: %d%n",

                IntStream.of(values).min().getAsInt());

        System.out.printf("Max: %d%n",

                IntStream.of(values).max().getAsInt());

        System.out.printf("Sum: %d%n", IntStream.of(values).sum());

        System.out.printf("Average: %.2f%n",

                IntStream.of(values).average().getAsDouble());

// sum of values with reduce method

        System.out.printf("%nSum via reduce method: %d%n",

                IntStream.of(values)

                        .reduce(0, (x, y) -> x + y));

// sum of squares of values with reduce method

        System.out.printf("Sum of squares via reduce method: %d%n",

                IntStream.of(values)

                        .reduce(0, (x, y) -> x + y * y)); //Will Not work without

//the first argument! (JL).

// product of values with reduce method

        System.out.printf("Product via reduce method: %d%n",

                IntStream.of(values)

                        .reduce(1, (x, y) -> x * y));

// even values displayed in sorted order

        System.out.printf("%nEven values displayed in sorted order: ");

        IntStream.of(values)

                .filter(value -> value % 2 == 0)

                .sorted()

                .forEach(value -> System.out.printf("%d ", value));

        System.out.println();

// odd values multiplied by 10 and displayed in sorted order

        System.out.printf(

                "Odd values multiplied by 10 displayed in sorted order: ");

        IntStream.of(values)

                .filter(value -> value % 2 != 0)

                .map(value -> value * 10)

                .sorted()

                .forEach(value -> System.out.printf("%d ", value));

        System.out.println();

// sum range of integers from 1 to 10, exlusive

        System.out.printf("%nSum of integers from 1 to 9: %d%n",

                IntStream.range(1, 10).sum());

// sum range of integers from 1 to 10, inclusive

        System.out.printf("Sum of integers from 1 to 10: %d%n",

                IntStream.rangeClosed(1, 10).sum());

    }

} // end class IntStreamOperations

/*************************************************************************/

// Program 2: ArraysAndStreams.java

// Demonstrating lambdas and streams with an array of Integers.



 class ArraysAndStreams

{

    public static void main(String[] args)

    {

        Integer[] values = {2, 9, 5, 0, 3, 7, 1, 4, 8, 6};

// display original values

        System.out.printf("Original values: %s%n", Arrays.asList(values));

// sort values in ascending order with streams

        System.out.printf("Sorted values: %s%n",

                Arrays.stream(values)

                        .sorted()

                        .collect(Collectors.toList()));

// values greater than 4

        List<Integer> greaterThan4 =

                Arrays.stream(values)

                        .filter(value -> value > 4)

                        .collect(Collectors.toList());

        System.out.printf("Values greater than 4: %s%n", greaterThan4);

// filter values greater than 4 then sort the results

        System.out.printf("Sorted values greater than 4: %s%n",

                Arrays.stream(values)

                        .filter(value -> value > 4)

                        .sorted()

                        .collect(Collectors.toList())); //This list will go to the

//toString() method (JL).

// greaterThan4 List sorted with streams

        System.out.printf(

                "Values greater than 4 (ascending with streams): %s%n",

                greaterThan4.stream()

                        .sorted()

                        .collect(Collectors.toList()));

    }

} // end class ArraysAndStreams

/*************************************************************************/

// Program 3: ArraysAndStreams2.java

// Demonstrating lambdas and streams with an array of Strings.



 class ArraysAndStreams2

{

    public static void main(String[] args)

    {

        String[] strings =

                {"Red", "orange", "Yellow", "green", "Blue", "indigo", "Violet"};

// display original strings

        System.out.printf("Original strings: %s%n", Arrays.asList(strings));

// strings in uppercase

        System.out.printf("strings in uppercase: %s%n",

                Arrays.stream(strings)

                        .map(String::toUpperCase)

                        .collect(Collectors.toList()));

// strings greater than "m" (case insensitive) sorted ascending

        System.out.printf("strings greater than m sorted ascending: %s%n",

                Arrays.stream(strings)

                        .filter(s -> s.compareToIgnoreCase("m") > 0)

                        .sorted(String.CASE_INSENSITIVE_ORDER)

                        .collect(Collectors.toList()));

// strings greater than "m" (case insensitive) sorted descending

        System.out.printf("strings greater than m sorted descending: %s%n",

                Arrays.stream(strings)

                        .filter(s -> s.compareToIgnoreCase("m") > 0)

                        .sorted(String.CASE_INSENSITIVE_ORDER.reversed())

                        .collect(Collectors.toList()));

    }

} // end class ArraysAndStreams2

/*********************************************************************/


// Program 4: Employee.java

// Employee class.

 class Employee

{

    private String firstName;

    private String lastName;

    private double salary;

    private String department;

// constructor

    public Employee(String firstName, String lastName,

                    double salary, String department)

    {

        this.firstName = firstName;

        this.lastName = lastName;

        this.salary = salary;

        this.department = department;

    }

// set firstName

    public void setFirstName(String firstName)

    {

        this.firstName = firstName;

    }

// get firstName

    public String getFirstName()

    {

        return firstName;

    }

// set lastName

    public void setLastName(String lastName)

    {

        this.lastName = lastName;

    }

// get lastName

    public String getLastName()

    {

        return lastName;

    }

// set salary

    public void setSalary(double salary)

    {

        this.salary = salary;

    }

// get salary

    public double getSalary()

    {

        return salary;

    }

// set department

    public void setDepartment(String department)

    {

        this.department = department;

    }

// get department

    public String getDepartment()

    {

        return department;

    }

// return Employee's first and last name combined

    public String getName()

    {

        return String.format("%s %s", getFirstName(), getLastName());

    }

// return a String containing the Employee's information

    @Override

    public String toString()

    {

        return String.format("%-8s %-8s %8.2f %s",

                getFirstName(), getLastName(), getSalary(), getDepartment());

    } // end method toString

} // end class Employee

//-----------------------------------------------------------

// Program 4: ProcessingEmployees.java

// Processing streams of Employee objects.

 class ProcessingEmployees

{

    public static void main(String[] args)

    {

// initialize array of Employees

        Employee[] employees = {

                new Employee("Jason", "Red", 5000, "IT"),

                new Employee("Ashley", "Green", 7600, "IT"),

                new Employee("Matthew", "Indigo", 3587.5, "Sales"),

                new Employee("James", "Indigo", 4700.77, "Marketing"),

                new Employee("Luke", "Indigo", 6200, "IT"),

                new Employee("Jason", "Blue", 3200, "Sales"),

                new Employee("Wendy", "Brown", 4236.4, "Marketing")};

// get List view of the Employees

        List<Employee> list = Arrays.asList(employees);

// display all Employees

        System.out.println("Complete Employee list:");

        list.stream().forEach(System.out::println); //A method reference.

// Predicate (boolean-valued function) that returns true for salaries

//in the range $4000-$6000

        Predicate<Employee> fourToSixThousand =

                e -> (e.getSalary() >= 4000 && e.getSalary() <= 6000);

// Display Employees with salaries in the range $4000-$6000

// sorted into ascending order by salary

        System.out.printf(

                "%nEmployees earning $4000-$6000 per month sorted by salary:%n");

        list.stream()

                .filter(fourToSixThousand)

                .sorted(Comparator.comparing(Employee::getSalary))

                .forEach(System.out::println);

// Display first Employee with salary in the range $4000-$6000

        System.out.printf("%nFirst employee who earns $4000-$6000:%n%s%n",

                list.stream()

                        .filter(fourToSixThousand)

                        .findFirst()

                        .get());

// Functions for getting first and last names from an Employee

        Function<Employee, String> byFirstName = Employee::getFirstName;

        Function<Employee, String> byLastName = Employee::getLastName;

// Comparator for comparing Employees by first name then last name

        Comparator<Employee> lastThenFirst =

                Comparator.comparing(byLastName).thenComparing(byFirstName);

// sort employees by last name, then first name

        System.out.printf(

                "%nEmployees in ascending order by last name then first:%n");

        list.stream()

                .sorted(lastThenFirst)

                .forEach(System.out::println);

// sort employees in descending order by last name, then first name

        System.out.printf(

                "%nEmployees in descending order by last name then first:%n");

        list.stream()

                .sorted(lastThenFirst.reversed())

                .forEach(System.out::println);

// display unique employee last names sorted

        System.out.printf("%nUnique employee last names:%n");

        list.stream()

                .map(Employee::getLastName)

                .distinct()

                .sorted()

                .forEach(System.out::println);

// display only first and last names

        System.out.printf(

                "%nEmployee names in order by last name then first name:%n");

        list.stream()

                .sorted(lastThenFirst)

                .map(Employee::getName)

                .forEach(System.out::println);

// group Employees by department

        System.out.printf("%nEmployees by department:%n");

        Map<String, List<Employee>> groupedByDepartment =

                list.stream()

                        .collect(Collectors.groupingBy(Employee::getDepartment));

        groupedByDepartment.forEach(

                (department, employeesInDepartment) ->

                {

                    System.out.println(department);

                    employeesInDepartment.forEach(

                            employee -> System.out.printf(" %s%n", employee));

                }

        );

// count number of Employees in each department

        System.out.printf("%nCount of Employees by department:%n");

        Map<String, Long> employeeCountByDepartment =

                list.stream()

                        .collect(Collectors.groupingBy(Employee::getDepartment,

                                TreeMap::new, Collectors.counting()));

        employeeCountByDepartment.forEach(

                (department, count) -> System.out.printf(

                        "%s has %d employee(s)%n", department, count));

/* Output looks something like :

HR 4

IT 8

Sales 12

*/

// sum of Employee salaries with DoubleStream sum method

        System.out.printf(

                "%nSum of Employees' salaries (via sum method): %.2f%n",

                list.stream()

                        .mapToDouble(Employee::getSalary)

                        .sum());

// calculate sum of Employee salaries with Stream reduce method

        System.out.printf(

                "Sum of Employees' salaries (via reduce method): %.2f%n",

                list.stream()

                        .mapToDouble(Employee::getSalary)

                        .reduce(0, (value1, value2) -> value1 + value2));

// average of Employee salaries with DoubleStream average method

        System.out.printf("Average of Employees' salaries: %.2f%n",

                list.stream()

                        .mapToDouble(Employee::getSalary)

                        .average()

                        .getAsDouble());

    } // end main

} // end class ProcessingEmployees

//************************************************************
//
//        *********************************************************************
//
//        TEACH THE PEEK() METHOD
//
//        This method exists mainly to support debugging, where you want to see the elements as they flow past a certain point in a pipeline:
//
//        Stream.of("one", "two", "three", "four")
//
//        .filter(e -> e.length() > 3)
//
//        .peek(e -> System.out.println("Filtered value: " + e))
//
//        .map(String::toUpperCase)
//
//        .peek(e -> System.out.println("Mapped value: " + e))
//
//        .collect(Collectors.toList());