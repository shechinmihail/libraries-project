public class Main {

    public static void main(String[] args) {


        EmployeeBook book1 = new EmployeeBook(10);
        book1.add(new Employee("александров ", "степан ", "юрьевич", 2, 17000));
        book1.add(new Employee("Магамедов ", "Иван ", "Алишерович ", 1, 15000));
        book1.add(new Employee("Пупков ", "Гарик ", "Дмитриевич ", 3, 12500));
        book1.add(new Employee("Семёнов ", "Юрий ", "Дмитриевич ", 4, 13200));
        book1.add(new Employee("Васильев ", "Виталий ", "Николаевич ", 5, 5000));
        book1.add(new Employee("Абдрахимов ", "Артур ", "Ренатович ", 1, 14200));


        book1.printAllEmployees();
//        book1.monthlyAmount();
//        book1.employeeMaxSalary();
//        book1.employeeMinSalary();
//        book1.averageSalary();
//        book1.printFullNameEmployees();
//        book1.indexationSalary(5);
//        book1.minSalaryInDepartment(1);
//        book1.maxSalaryInDepartment(1);
//        book1.departmentalPayrollCosts(4);
//        book1.averageSalaryInDepartment(1);
//        book1.indexationSalaryInDepartment(5, 1);
//        book1.printAllEmployeesInDepartment(1);
//        book1.employeeLessSalary(13500);
//        book1.employeeMoreSalary(13500);
//        book1.deleteEmployee(3);
//        book1.changesEmployee("Абдрахимов", "Артур", "Ренатович", 1, 14200);
//        book1.printOfDepartments(1);

    }

}
