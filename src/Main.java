public class Main {
    public static void main(String[] args) {

        // Task 1

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String LastName = "Ivanov";
        String fullName = LastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);
        System.out.println(" ");

        // Task 2

        String bigFullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + bigFullName);
        System.out.println(" ");

        // Task 3

        String fullName2 = "Иванов Семён Семёнович";
        String correctedName = fullName2.replace("ё", "е");
        System.out.printf("Данные ФИО сотрудника — " + correctedName);


    }

}
