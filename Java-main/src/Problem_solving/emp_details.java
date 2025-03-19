package Problem_solving;

class emp{
    private int Emp_id = 101;
    private String Emp_Name = "Vikrant";
    private int Salary = 25000;
    private String Add = "Red street";
    private String Phone;

    public String getPhone(){
        return Phone;
    }

    public void setPhone(String Phone){
        this.Phone = Phone;
    }

}


public class emp_details {
    public static void main(String[] args) {
        emp ex = new emp();
        ex.setPhone("234335345");
        System.out.println(ex.getPhone());
    }

}
