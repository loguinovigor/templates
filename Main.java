public class Main {
    public static void main(String[] args) {
        // Создаем человека с именем, фамилией, возрастом и адресом
        Person mom = new PersonBuilder()
                .setName("igor")
                .setSurname("vasya")
                .setAge(12)
                .setAddress("petya")
                .build();

        // Создаем ребенка на основе данных родителя
        Person son = mom.newChildBuilder()
                .setName("Антошка")
                .build();

        System.out.println("У " + mom + " есть сын, " + son);

        // Пример выброса исключения из-за отсутствия обязательных данных
        try {
            new PersonBuilder().build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        // Пример выброса исключения из-за некорректного возраста
        try {
            new PersonBuilder().setAge(-100).build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
