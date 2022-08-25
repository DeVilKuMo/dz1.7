public class Main {
    public static void main(String[] args) {
        task1();task2();task3();
    }public static void task1() {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";

        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println(" ФИО сотрудника - " + fullName);
        System.out.println();
    }public static void task2() {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";

        String fullName = lastName + " " + firstName + " " + middleName;
        String result = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + result);
        System.out.println();
    }public static void task3(){
        String fullName = "Иванов Семён Семёнович";
        String[] split = fullName.split(" ");
        String result = " ";
        for (String current : split){
            if (current.contains("ё")) {
                String tex = current.replace("ё", "е");
                result += tex;
            }else {
                result += current;
            }
            result += " ";
        }
        System.out.println("Данные ФИО сотрудника —" + result);
    }
}