package Lab3;

public class CompanyApplication {

    public static void main(String[] args){
        Company company = new Company("Microsoft");
        Department department1 = new Department("Sales", "Florida");
        Department department2 = new Department("Marketing", "Texas");
        Department department3 = new Department("RH", "California");
        company.addDepartment(department1);
        company.addDepartment(department2);
        company.addDepartment(department3);

        Employee employee1 = new Employee(1, "Tom", "132456");
        employee1.setSalary(20000);
        Employee employee2 = new Employee(2, "Stan", "787987");
        employee2.setSalary(30000);
        Employee employee3 = new Employee(3, "Sue", "4564564");
        Employee employee4 = new Employee(4, "Marc", "4564564");
        Employee employee5 = new Employee(5, "Bill", "4564564");
        Employee employee6 = new Employee(6, "Peter", "4564564");
        Employee employee7 = new Employee(7, "Dan", "4564564");
        Employee employee8 = new Employee(8, "Ron", "4564564");
        employee1.setSalary(50000);


        Position position1 = new Position(employee1);
        Position position2 = new Position(employee2);
        Position position3 = new Position(employee3);
        Position position4 = new Position(employee4);
        Position position5 = new Position(employee5);
        Position position6 = new Position(employee6);
        Position position7 = new Position(employee7);
        Position position8 = new Position(employee8);

        position2.addInferior(position1);
//        Position position3 = new Position("Director Admission", "Take care of entries", employee3);
//        position3.addInferior(position2);
//        Position position4 = new Position("Director Admission", "Take care of entries", employee4);
//        position4.addInferior(position3);

        department1.addPosition(position1);
        department1.addPosition(position2);
        department1.addPosition(position3);

        company.print();
        System.out.println("salary" + company.getSalary());


    }
}
