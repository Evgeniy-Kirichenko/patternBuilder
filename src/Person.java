import java.util.OptionalInt;

public class Person {
    private final   String name;
    private   final String surName;
    private int age;
    private String address;

    public Person(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    public Person(String name, String surName, int age) {
        this.name = name;
        this.surName = surName;
        this.age = age;
    }

    public Person(String name, String surName, int age, String address) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getAddress() {
        return address;
    }

    public OptionalInt getAge() {
        return OptionalInt.of(age);
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean hasAge() {
        return age != 0;
    }

    public void happyBirthday() {
        if (hasAge()) age++;
    }

    public boolean hasAddress() {
        return address != null;
    }

    public PersonBuilder newChildBuilder(){
        PersonBuilder personBuilder = new PersonBuilder();
        personBuilder.setSurName(getSurName());
        personBuilder.setAge(10);
        if (hasAddress()) personBuilder.setAddress(getAddress());
        return personBuilder;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Имя='" + name + '\'' +
                ", Фамилия='" + surName + '\'' +
                ", возраст=" + age +
                ", адрес='" + address + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        if (name != null ? !name.equals(person.name) : person.name != null) return false;
        if (surName != null ? !surName.equals(person.surName) : person.surName != null) return false;
        return address != null ? address.equals(person.address) : person.address == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surName != null ? surName.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        return result;
    }






}
