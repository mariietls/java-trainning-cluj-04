public class People{
    public static void main(String[] args) {
        Person person= new Person.PersonBuilder("Park Jimin")
                .setJob("singer")
                .build();
        System.out.println(person);
    }
}
