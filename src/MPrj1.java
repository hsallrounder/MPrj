class Employee {
    int ENo;
    String EName;
    String JDate;
    char DCode;
    String Dept;
    int Basic;
    int HRA;
    int IT;
    String Dsgn;
    int DA;
    int Sal;

    public Employee(int ENo, String EName, String JDate, char DCode, String dept, int basic, int HRA, int IT) {
        this.ENo = ENo;
        this.EName = EName;
        this.JDate = JDate;
        this.DCode = DCode;
        Dept = dept;
        Basic = basic;
        this.HRA = HRA;
        this.IT = IT;
    }

    public int getSal() {
        return Sal;
    }

    public void setSal(int Basic,int HRA,int DA,int IT) {
        Sal = Basic+HRA+DA-IT;
    }
}

public class MPrj1 {
    public static void main(String[] args) {
        Employee[] emp = new Employee[7];
        //1001
        emp[0]=new Employee(1001,"Ashish","01/01/2009",'e',"R&D",20000,8000,3000);
        //1002
        emp[1]=new Employee(1002,"Sushma","23/08/2012",'c',"PM",30000,12000,9000);
        //1003
        emp[2]=new Employee(1003,"Rahul","12/08/2008",'k',"Acct",10000,8000,1000);
        //1004
        emp[3]=new Employee(1004,"Chahat","29/01/2013",'r',"Front Desk",12000,6000,2000);
        //1005
        emp[4]=new Employee(1005,"Ranjan","16/07/2005",'m',"Engg",50000,20000,20000);
        //1006
        emp[5]=new Employee(1006,"Suman","01/01/2000",'e',"Manufacturing",23000,9000,4400);
        //1007
        emp[6]=new Employee(1007,"Tanmay","12/06/2006",'c',"PM",29000,12000,10000);

        if(args.length>0){
            int flag=0;
            for(int i=0;i<emp.length;i++){
                if(Integer.parseInt(args[0])==emp[i].ENo){
                    switch (emp[i].DCode){
                        case 'e' -> {
                            emp[i].Dsgn = "Engineer";
                            emp[i].DA = 20000;
                        }
                        case 'c' -> {
                            emp[i].Dsgn = "Consultant";
                            emp[i].DA = 32000;
                        }
                        case 'k' -> {
                            emp[i].Dsgn = "Clerk";
                            emp[i].DA = 12000;
                        }
                        case 'r' -> {
                            emp[i].Dsgn = "Receptionist";
                            emp[i].DA = 15000;
                        }
                        case 'm' -> {
                            emp[i].Dsgn = "Manager";
                            emp[i].DA = 40000;
                        }
                    }
                    emp[i].setSal(emp[i].Basic,emp[i].HRA,emp[i].DA,emp[i].IT);
                    System.out.printf("%-10s %-11s %-13s %-14s %-10s","Emp No.","Emp Name","Department","Designation","Salary");
                    System.out.println();
                    System.out.printf("%-10d %-11s %-13s %-14s %-10d",emp[i].ENo,emp[i].EName,emp[i].Dept,emp[i].Dsgn,emp[i].getSal());
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.println("There is no employee with empid : "+Integer.parseInt(args[0]));
            }
        }
    }
}
