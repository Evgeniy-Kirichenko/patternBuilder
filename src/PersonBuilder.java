public class PersonBuilder {
    private String name;
    private String surName;
    private int age;
    private String address;

    public PersonBuilder setName(String name)  {
        if (name == null || name.equals("")) throw new IllegalStateException("Не введено имя");
        this.name = name;
        return this;
    }

    public PersonBuilder setSurName(String surName)  {
        if (surName == null || surName.equals("")) throw new IllegalStateException("Не введена фамилия");
        this.surName = surName;
        return this;
    }

    public PersonBuilder setAge(int age)  {
        if (age <= 0) {
            throw new IllegalArgumentException("Неверно указан возраст");
        }
        this.age = age;
        return this;
    }
    public PersonBuilder setAddress(String address){
        this.address = address;
        return this;
    }

    public Person builder() {
        return new Person(this.name, this.surName, this.age,this.address);
    }
}
