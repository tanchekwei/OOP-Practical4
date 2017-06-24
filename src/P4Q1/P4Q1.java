package P4Q1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chek Wei
 */
public class P4Q1 {
    public static void main(String[] args){
    Employee emp1 =  new Employee("Chek Wei", 2500);
    Employee emp2 =  new Employee("Han Zong", 3000);
       
    emp1.raiseSalary(8);
    emp2.raiseSalary(8);
    
    if(emp1.getSalary() > emp2.getSalary()){
        System.out.println(emp1.getName() + " current salary is " + emp1.getSalary());
    }
    else{
        System.out.println(emp2.getName() + " current salary is " + emp2.getSalary());
    }
    
    double totalSalary = emp1.getSalary() + emp2.getSalary();
    
    System.out.println("Total salary of " + emp1.getName() + " and " + emp2.getName() + " is " + totalSalary);
    }
}
