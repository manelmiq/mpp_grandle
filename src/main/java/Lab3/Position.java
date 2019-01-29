package Lab3;

import java.util.ArrayList;
import java.util.List;

public class Position {
    private String title;
    private String description;
    private Employee employee;
    private List<Position> inferiorList;
    private Position superior;

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void printDownLine(){
        System.out.print('\t');
        if(inferiorList.isEmpty()){
            return;
        }
        System.out.println("Position" + getTitle());
        System.out.println("Employee" + employee.toString());
        for(Position position : inferiorList){
            position.printDownLine();
        }
    }

    public void setInferiorList(List<Position> inferiorList) {
        this.inferiorList = inferiorList;
    }

    public void setSuperior(Position superior) {
        this.superior = superior;

    }

    public void addInferior(Position inferiorPosition  ){
        inferiorList.add(inferiorPosition);
        inferiorPosition.superior = this;

    }

    public Position(Employee employee){
        this.employee  = employee;
        this.inferiorList = new ArrayList<>();
    }


    public Position(String title, String description, Employee employee) {
        this.title = title;
        this.description = description;
        this.employee = employee;
        inferiorList = new ArrayList<>();
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

    public double getSalary(){
        if(employee != null){
            return  employee.getSalary();
        }
        return 0.0;
    }


    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();


        stringBuilder.append("Position{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'');
        if (employee != null) {
            stringBuilder.append(", employee=" + employee.toString() +
                    '}');
        }else{
            stringBuilder.append(", employee=\"null\"} " );
        }
        return stringBuilder.toString();



    }

    public void print() {
    }
}
