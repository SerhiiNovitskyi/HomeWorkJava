import java.util.Scanner;

public class Qatest {
    public static void main(String args[]) {
//        FirstPerson firstPerson = new FirstPerson("Serj", "Novitskiy");
//        SecondPerson secondPerson = new SecondPerson();
//        secondPerson.setFirstName("Sasha");
//        secondPerson.setSecondName("Sizov");
        ThirdClass thirdClass = new ThirdClass();
        //thirdClass.printInfo(firstPerson,secondPerson);

        Scanner in = new Scanner(System.in);
        System.out.println("Enter First Person's data: ");
        System.out.println("Enter First Name: ");
        String firstPersonName = in.nextLine();
        System.out.println("Enter First Surname: ");
        String firstPersonSurname = in.nextLine();

        System.out.println("Enter Second Person's data: ");
        System.out.println("Enter Second Name: ");
        String secondPersonName = in.nextLine();
        System.out.println("Enter Second Surname: ");
        String secondPersonSurname = in.nextLine();
        SecondPerson secondPerson = new SecondPerson();
        secondPerson.setFirstName(secondPersonName);
        secondPerson.setSecondName(secondPersonSurname);
        thirdClass.printInfo(new FirstPerson(firstPersonName,firstPersonSurname), secondPerson);


    }


}
