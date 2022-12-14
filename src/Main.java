public class Main {
    public static void main(String[] args) {
        Person person = null;
        person = new PersonBuilder().setName("Иван").setSurName("Петров").setAge(28).builder();
        person.setAddress("Рязань");
        System.out.println(person);
        person.happyBirthday();
        System.out.println(person);
        Person person1 = null;
        person1 = person.newChildBuilder().setName("").builder();

        System.out.println(person1);
    }
}
