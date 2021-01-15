package domain;
/**
 *  Java-пакет, що опиуєс клас {@link Employee}, з якого наслідуються {@link Artist}, {@link Manager}
 * @author Я
 */
public class Employee {

    /**
     *  перевантаження  оператора {@link toString} 
     * @return рядок, що  містить інформацію про працівника
     */
    
    @Override
    public String toString() {
        return "\nEmployee ID= " + ID + "\nName= " + name + "\nJobTitle= " + jobTitle + "\nLevel= " + level + "\nDept= " + dept;
    }

    private String name;
    private String jobTitle;
    private int ID;
    private int level;
    private String dept;

   // private static int employeesCount = 0;
    /**
     * конструктор класу {@link Employee},
     * встановлює дефолтні значення для таких параметрів:
     *{@link skiils} - описує набір навичок працівника; 
     * {@link name} - ім'я праціника компанії;
     * {@link jobTitle} -  назва посади працівника;
     * {@link level} -  напрям працівника / спрямованість/ фахова градація(juniorm middle etc);
     * {@link dept}  - посада працівника компанії;

     * 
     */
    public Employee(String name, String jobTitle, int level, String dept) {
        this();
        setName(name);
        this.jobTitle = jobTitle;
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
        this.dept = dept;
    }
        /**
         * конструктор классу {@link Employee} 
         *  створюється екземпляр класу з присвоєним {@link ID}
         */
    public Employee() {
        ID = (int)(Math.random()*1000);
//        if (ID > 10000) {
//            throw new NumberFormatException("ERROR! Employee's ID cannot be greater than 10000. Employee is not created!");
//        }
    }
    /**
     * При роботі з приватними змінними ми не можемо встановити їхнє значення напряму, {@link setLevel} слугує для зміни даних про посаду робітника;
     * @param job - встановлюється не за замовчуванням 
     */
    public void setJobTitle(String job) {
        jobTitle = job;
    }
    /**
     * При роботі з приватними змінними ми не можемо отримати їхнє значення напряму, {@link getJobTitle} слугує для отримання даних про посаду робітника;
     * @return  {@link jobTitle} 
     */
    public String getJobTitle() {
        return jobTitle;
    }
    /**
     * При роботі з приватними змінними ми не можемо отримати їхнє значення напряму, {@link getName} слугує для отримання даних про ім'я робітника;
     * @return {@link name}
     */
    public String getName() {
        return name;
    }
    /**
     *При роботі з приватними змінними ми не можемо встановити їхнє значення напряму, {@link setLevel} слугує для зміни даних про рівень працівника;
     *  {@link level} - встановлюється не за замовчуванням 
     */
    public void setLevel(int level) {
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
    }
/**
 *  При роботі з приватними змінними ми не можемо отримати їхнє значення напряму, {@link getLevel} слугує для отримання даних про рівень рпацівника;
 * @return {@link level} 
 */
    public int getLevel() {
        return level;
    }
/**
 * При роботі з приватними змінними ми не можемо отримати їхнє значення напряму, {@link getDept} слугує для отримання даних про посаду працівника;
 * @return {@link dept} 
 */
    public String getDept() {
        return dept;
    }
/**
 * При роботі з приватними змінними ми не можемо встановити їхнє значення напряму, {@link setDept} слугує для зміни даних про посаду працівника;
 * {@link dept} встановлюється не за замовчуванням 
 */
    public void setDept(String dept) {
        this.dept = dept;
    }
/**
 * При роботі з приватними змінними ми не можемо встановити їхнє значення напряму, {@link setName} слугує для зміни даних про ім'я працівника;
 * @param name встановлюється, якщо пройдена перевірка на коректність вводу
 */
    public void setName(String name) {
//        boolean correctName = true;
//        for (int i = 0; i < name.length(); i++) {
//            char s = name.charAt(i);
//            if (Character.isDigit(s)) {
//                correctName = false;
//            }
//        }
//        if (correctName) {
//            this.name = name;
//        } else {
//            this.name = "John Doe";
//        }
        if (name.matches("^([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]*)+[ ]([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]+)+$")) {
            this.name = name;
        } else {
            this.name = "John Doe";
        }
    }
}
