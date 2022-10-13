import java.util.List;

public class Forest {
    private List<MountainHare> hares;
    static String color;
    private static String season;
    // объявите недостающие переменные и добавьте конструктор


    public Forest(List<MountainHare> hares) {
        this.hares = hares;
    }

    // добавьте метод setSeason(String newSeason)
    // в этом методе реализуйте логику смены цвета шубок зайцев-беляков
    static void setSeason(String newSeason){
        Forest.season=newSeason;
        if (season.equals("зима")){
            MountainHare.color="белый";

        }else{
            MountainHare.color="серо-рыжий";
        }
    }



    public void printHares(){
        for (MountainHare hare : hares) {
            System.out.println(hare.toString());
        }
    }
    // добавьте метод printHares()

}