package example01;

import javax.crypto.spec.PSource;

public class Employee {

    //1.상태 및 게터랑 세터 만들기
    private String name;        // 이름
    private String phone;       // 전화번호
    private String dept;        // 부서
    private int empNo;          // 사원번호
    private int salary;         // 월급 (정수, 단위: 원)
    private String account;     // 계좌번호
    private String position;    // 직급 (예: "사원", "대리", "과장", "부장")


    // 3. 메서드 정의하기
    // 책임: 사원의 모든 정보를 보기 좋게 출력하세요
    void printInfo(){
        System.out.println(name + " / " + phone + " / " + dept + " / 사원번호: " + empNo + " / 직급: " + position + " / 월급: " + salary + " / 계좌: " + account);
    }

    // 세터
    public void setName(String name){
        this.name = name;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
    public void setEmpNo(int empNo){
        this.empNo = empNo;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void setAccount(String account) {
        this.account = account;
    }
    public void setPosition(String position) {
        this.position = position;
    }

    //게터
    public String getName(){
        return name;
    }
    public String getPhone(){
        return phone;
    }
    public String getDept(){
        return dept;
    }
    public int getEmpNo(){
        return empNo;
    }
    public int getSalary(){
        return salary;
    }
    public String getAccount(){
        return account;
    }
    public String getPosition(){
        return position;
    }


    //2. 생성자 만들기(오버로딩)  //

    public Employee(String name, String phone) {
        this.name = name;
        this.phone = phone;
        dept = "미정";
        empNo = 0;
        salary = 0;
        account = " ";
        position = "사원";
    }

    public Employee(String name, String phone, String dept) {
        this.name = name;
        this.phone = phone;
        this.dept = dept;
        empNo = 0;
        salary = 0;
        account = " ";
        position = "사원";
    }

    public Employee(String name, String phone, String dept, int empNo, int salary, String account, String position) {
        this.name = name;
        this.phone = phone;
        this.dept = dept;
        this.empNo = empNo;
        this.salary = salary;
        this.account = account;
        this.position = position;
    }



    int calYearSalary(){
        return salary*12;
    }

    void payAll(){
        System.out.println("[급여 이체 완료 ] "+name+"님께 "+salary+"원이 "+account+"계좌로 지급되었습니다");
    }

    int calYearSalaryWithBonus(){
        if (position.equals("사원")) {
            salary = (int) (salary * 12 * 1.1);
        }
        if (position.equals("대리")) {
            salary = (int) (salary * 12 * 1.2);
        }
        if (position.equals("과장")) {
            salary = (int) (salary * 12 * 1.3);
        }
        if (position.equals("부장")) {
            salary = (int) (salary * 12 * 1.4);
        }
        return salary;
    }

    void promote(){
        if(position.equals("사원")){
            position = "대리";
            salary = (int)(salary * 1.1);
        }else if(position.equals("대리")){
            position = "과장";
            salary = (int)(salary * 1.2);
        }else if(position.equals("과장")){
            position = "부장";
            salary = (int)(salary * 1.3);
        }else{
            System.out.println("승진할 수 없습니다. 데이터가 비워있습니다.");
        }
    }



}


