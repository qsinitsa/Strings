public class Task12 {
    public static void main(String[] args) {
        // Задания 1 и 2
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println(fullName);
        String capital = fullName.toUpperCase();
        System.out.println(capital);
    }
}
