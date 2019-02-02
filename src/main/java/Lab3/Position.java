package Lab3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import com.github.javafaker.Faker;

public class Position {
    private String title;
    private String description;
    private Employee employee;
    private List<Position> inferiorList;
    private Position superior;

    public Employee getEmployee() {
        return employee;
    }

    public List<Position> getInferiorList() {
        return inferiorList;
    }

    public Position getSuperior() {
        return superior;
    }


    public void fillRandomData(){
        Faker faker = new Faker();
        setTitle(faker.name().title());
        setDescription(faker.lorem().fixedString(5));
        Employee employee = new Employee();
        employee.fillRandomData();
        setEmployee(employee);

    }


    public Position() {

    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void printDownLine() {
        System.out.print('\t');
        if (inferiorList.isEmpty()) {
            return;
        }
        System.out.println("Position" + getTitle());
        System.out.println("Employee" + employee.toString());
        for (Position position : inferiorList) {
            position.printDownLine();
        }
    }

    public void setInferiorList(List<Position> inferiorList) {
        this.inferiorList = inferiorList;
    }

    public void setSuperior(Position superior) {
        this.superior = superior;

    }

    public void addInferior(Position inferiorPosition) {
        inferiorList.add(inferiorPosition);
        inferiorPosition.superior = this;

    }

    public Position(Employee employee) {
        this.employee = employee;
        this.inferiorList = new ArrayList<>();
    }

    public Position(String title, String description, Employee employee, List<Position> inferiorList, Position superior) {
        this.title = title;
        this.description = description;
        this.employee = employee;
        this.inferiorList = inferiorList;
        this.superior = superior;
    }

    public Position(String title, String description, Employee employee) {
        this.title = title;
        this.description = description;
        this.employee = employee;
        inferiorList = new ArrayList<>();
    }

//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }


    public Position clone() {
        Position clone = new Position();
        clone.setDescription(this.getDescription());
        clone.setEmployee(this.getEmployee());
        clone.setInferiorList(this.getInferiorList());
        clone.setTitle(this.getTitle());
        return clone;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public double getSalary() {
        if (employee != null) {
            return employee.getSalary();
        }
        return 0.0;
    }


    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return Objects.equals(title, position.title) &&
                Objects.equals(description, position.description) &&
                Objects.equals(employee, position.employee) &&
                Objects.equals(inferiorList, position.inferiorList) &&
                Objects.equals(superior, position.superior);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, description, employee, inferiorList, superior);
    }

    //
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Position)) {
//            return false;
//        }
//        Position position = (Position) o;
//        return getSalary() == position.getSalary() &&
//                (getTitle().compareTo(position.getTitle()) == 0) &&
//                (getDescription().compareTo(position.getDescription()) == 0);
//    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();


        stringBuilder.append("Position{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'');
        if (employee != null) {
            stringBuilder.append(", employee=" + employee.toString() +
                    '}');
        } else {
            stringBuilder.append(", employee=\"null\"} ");
        }
        return stringBuilder.toString();


    }

    public void print() {
    }
}
