package SE2;

public class Admin  extends EmptyQueueException {
	//implement\

   private  Department[] departmentList;

    public Admin(Department[] department) {
        this.departmentList = department;
    }

    public String format(String name, String msg){
        return name + ":" + msg + "\n";
    }



    public String hourlyCompanyMessage() {
        StringBuilder stringBuilder = new StringBuilder();
        for(Department department : departmentList){
                try {
                    String msg = department.nextMessage();
                    stringBuilder.append(format(department.getName(), msg));
                }catch (EmptyQueueException e){
                    return e.toString();
                }
        }
        return stringBuilder.toString();
    }
	
}
