package domain;
/**
 * Java-пакет, що описує клас {@link Manager}, наслідується з класу {@link Employee}
 * @author Я
 */
public class Manager extends Employee {
    /**
     * конструктор класу {@link Manager}, який встановлює за замовчуванням настні параметри:
     * {@link employees},
     * {@link name},
     * {@link jobTitle},
     * {@link level},
     * {@link dept};
     */
    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = employees;
    }

    @Override
    /**
     * @see Employee
     */
    public String toString() {
        return super.toString()+"\nEmployees: "+getEmployees(); 
    }
    /**
     * конструктор класу {@link Manager}
     * @param employees - встановлює параметри  до масиву  {@link employees }  
     */
    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }
    /**
     * конструктор класу {@link Manager}
     *  створює новий масив {@link employees}  
     */
    public Manager() {
        super();
        employees = new Employee[10];
    }
    
    private Employee[] employees;
    /**
     * При роботі з приватними змінними ми не можеммо отримати їх напряму, тоиу використовуємо метод {@link getEmployees}
     * @return {@link s}
     */
    public String getEmployees() {
        String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        s=s.substring(0, s.length() - 2);
        return s;
    }
    /**
     * При роботі з приватними змінними ми не можемо змінювати їхнє значення напряму, {@link setEmployees} слугує для зміни даних про робітника;
     * @param employees - вхідний масив даних
     */
    public void setEmployees(Employee[] employees) {
        this.employees=employees;
    }
    /**
     * Метод для отримання списку усіх працівників
     * @return {@link employees}
     */
    public Employee[] getEmployeesList() {
        return employees;
    }

    
}
