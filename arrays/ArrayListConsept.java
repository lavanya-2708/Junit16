package arrays;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConsept {
    public static void main(String[] args) {
        ArrayList ar=new ArrayList();
        ar.add(10);
        ar.add(20);
        ar.add(50);
        ar.add("lavi");
        ar.add('v');

        System.out.println(ar.size());
        System.out.println(ar.get(2));

        for(int i=0; i<ar.size(); i++ ){
            System.out.println(ar.get(i));
        }

        Employee e=new Employee("lavi","tester",100000,"Amazon");
        Employee e1=new Employee("veera","manager",500000,"tcs");
        Employee e2=new Employee("sekhar","seniorengineer",500000,"railways");

        ArrayList<Employee> e3=new ArrayList<Employee>();
        e3.add(e);
        e3.add(e1);
        e3.add(e2);

        Iterator<Employee> it=e3.iterator();
        while(it.hasNext()){
            Employee emp=it.next();
            System.out.println(emp.companyName);
            System.out.println(emp.designation);
            System.out.println(emp.name);
            System.out.println(emp.salary);
        }


    }
}
