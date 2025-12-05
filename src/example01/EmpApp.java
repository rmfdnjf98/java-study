package example01;

public class EmpApp {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];  // 사용하는 이유) employees e1.printInfo();부터 e10까지 출력하기 편하게 하기 위해

        // 1. 객체를 생성자로 초기화해서 등장
        Employee e1 = new Employee("홍길동", "01022223333");

        // 2. 객체의 상태를 변경
        e1.setEmpNo(1);
        e1.setDept("총무팀");
        e1.setSalary(1000);
        e1.setAccount("999888");

        Employee e2 = new Employee("장보고", "01033334444","개발팀");

        e2.setEmpNo(2);
        e2.setSalary(2500);
        e2.setAccount("070-111-111");

        Employee e3 = new Employee("임꺽정","01044445555", "인사팀", 3, 1000, "070-111-222", "사원");
        Employee e4 = new Employee("신돌석","01055556666", "인사팀");

        e4.setEmpNo(4);
        e4.setSalary(1000);
        e4.setAccount("070-222-222");

        Employee e5 = new Employee("세종대왕", "01066667777", "개발팀", 5, 2500, "070-222-333", "대리");
        Employee e6 = new Employee("안창호", "01033335555", "인사팀", 6, 4000, "070-333-444", "과장" );
        Employee e7 = new Employee("류승룡", "01088889999", "개발팀");

        e7.setEmpNo(7);
        e7.setSalary(1000);
        e7.setAccount("070-333-333");

        Employee e8 = new Employee("율곡이이", "01099990000", "개발팀", 8, 4000, "070-444-555", "과장" );
        Employee e9 = new Employee("대조영", "01012341234", "인사팀", 9, 8000, "070-555-666", "부장");
        Employee e10 = new Employee("정조대왕", "010-1111-2222", "개발팀", 10, 8000, "070-666-777", "부장");

        employees[0] = e1;
        employees[1] = e2;
        employees[2] = e3;
        employees[3] = e4;
        employees[4] = e5;
        employees[5] = e6;
        employees[6] = e7;
        employees[7] = e8;
        employees[8] = e9;
        employees[9] = e10;

        for (int i = 0; i < 9; i++) {
            employees[i].printInfo();
        }



        // 전체 직원의 연봉 출력 (다 합쳐서)
        int totalcalYearSalary = 0;
        for (int i = 0; i < 9; i++) {
            totalcalYearSalary = totalcalYearSalary + employees[i].calYearSalary();
        }
        System.out.println("기본 연봉 총액 = "+ totalcalYearSalary + "원");

        // 이번달 직원 월급 총액
        int totalSalary = 0;
        for (int i = 0; i < 9; i++) {
            totalSalary = totalSalary + employees[i].getSalary();
        }
        System.out.println("이번 달 월급 총액 = " + totalSalary + "원");

        //보너스 포함 연봉 총액
        int totalYearSalaryWithBonus = 0;
        for (int i = 0; i < 9; i++) {
            totalYearSalaryWithBonus = totalYearSalaryWithBonus + employees[i].calYearSalaryWithBonus();
        }
        System.out.println("보너스 포함 연봉 총액 = "+ totalYearSalaryWithBonus + "원");

        //율곡이이 승진 시키기
        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getName().equals("율곡이이")){
                employees[i].promote();
            }
        }

        for (int i = 0; i < 9; i++) {
            employees[i].printInfo();
        }


        //월급 이체
        System.out.println("===이번 달 월급 이체 시작===");
        for (int i = 0; i < employees.length; i++) {
            employees[i].payAll();
        }




    }

}
