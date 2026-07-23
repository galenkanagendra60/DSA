// sort employees by salary
import java.util.ArrayList;
import java.util.Collections;
class Employee implements Comparable<Employee>
{
  int id ;
  String name;
  double salary;
  Employee(int id,String name,double salary)
  {
    this.id = id;
    this.name = name;
    this.salary = salary;
  }
  @Override
  public int  compareTo(Employee e)
  {
  return Double.compare(this.salary, e.salary);
  }
  // Display
  void display()
  {
    System.out.println(id+" "+name+" "+salary);
  }
}



class EmployeeSort
{
  public static void main(String[] args)
  {
    ArrayList<Employee>employees = new ArrayList<>();
    employees.add(new Employee(101,"niranjan",600000));
    employees.add(new Employee(102,"nagaraj",650000));
    employees.add(new Employee(103,"naresh",  500000));
    employees.add(new Employee(104,"nagendra",400000));
    Collections.sort(employees);
    System.out.println("sorted arraylist:");
    for(Employee e : employees)
    {
      e.display();
    }



  }
}