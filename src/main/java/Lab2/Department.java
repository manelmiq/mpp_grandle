package Lab2;

import java.util.*;

public class Department {

    private String name;
    private List<Person> list;

    public void addPerson(Person person) {
        list.add(person);
    }

    public void convertStaffStudent(Staff staff) {
        for (Person p : list) {
            if (p.equals(staff)) {
                Date now = new Date();
//				list.remove(staff);
                StudentStaff studentStaff = new StudentStaff(staff.getName(), staff.getPhone(), staff.getAge(),
                        0, staff.getSalary(), now);
                list.add(studentStaff);
                list.remove(staff);
                break;
            }
        }
    }

    public List<Person> getList(String className) {
        List<Person> listFilterByClass = new ArrayList<>();
        for (Person p : list) {
            if (p.getClass().getSimpleName().equals(className)) {
                listFilterByClass.add(p);
            }
        }
        return listFilterByClass;
    }


    public void studentsPerFaculty() {
        System.out.println("_____");
        List<Person> facultiesList = getList("Faculty");
        List<Person> studentList = getList("Student");
        for (Person p : facultiesList) {
            Faculty faculty = (Faculty) p;
            System.out.println(faculty);
            System.out.println("Students of this faculty");
            List<Course> listCourse = faculty.getCourseList();
            Set<Student> studentSet = new TreeSet<>();
            for (Course course : listCourse) {
                for (Person student : studentList) {
                    Student student1 = (Student) student;
                    List<Course> listCourseOfStudent = student1.getListCourses();
                    for (Course courseOfStudent : listCourseOfStudent) {
                        if (course.equals(courseOfStudent)) {
                            studentSet.add(student1);
                        }
                    }
                }
            }
            for (Student s : studentSet) {
                System.out.println(s);
            }
            studentSet.clear();
            System.out.println("_____");
        }



    }


    public void unitsPerFaculty() {
        for (Person p : list) {
            if (p.getClass().getSimpleName().equals("Faculty")) {
                System.out.println(p);
                System.out.println("Total of units" + p.getUnits());
                ;
            }
        }
    }

    public void showAllMembers() {
        Integer index = 0;
        for (Person p : list) {
            System.out.println((++index).toString() + p);
        }
    }


    public double getTotalSalary() {
        double sum = 0.0;
        for (Person p : list) {
            sum += p.getSalary();
        }
        return sum;
    }


    public Department(String name) {
        this.name = name;
        list = new ArrayList<Person>();
    }

}
