import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<MountainHare> hares = List.of(
                new MountainHare(4, 4.4, 120),
                new MountainHare(7, 3.6, 150),
                new MountainHare(1, 2.3, 100)
        );

        System.out.println("В лесу лето!");
        // создайте объект "летний лес с зайцами"
        Forest forest= new Forest(hares);
        forest.setSeason("лето");
        System.out.println("Список зайцев:");
        forest.printHares();
        // напечатайте список всех зайцев
        System.out.println("В лесу зима!");
        forest.setSeason("зима");
        // поменяйте время года на зиму
        System.out.println("Список зайцев:");
        forest.printHares();
        // напечатайте список всех зайцев
    }
}