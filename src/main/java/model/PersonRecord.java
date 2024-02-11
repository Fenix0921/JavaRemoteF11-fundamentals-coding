package model;

public record PersonRecord(
        //component
        String name,
        String surname,
        int age
) {
    public static final int AVERAGE_Age = 80;
    @Override
    public String name() {
        System.out.println("Reading name");
        return name;
    }

    public String nameWithSurname() {
        return name + " " + surname;
    }
}
