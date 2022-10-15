import java.util.List;

public class Forest {
    private List<MountainHare> hares;

    private static String season;
    // объявите недостающие переменные и добавьте конструктор


    public Forest(String season, List<MountainHare> hares) {
        this.hares = hares;

        setSeason(season);

    }

    // добавьте метод setSeason(String newSeason)
    // в этом методе реализуйте логику смены цвета шубок зайцев-беляков
    static void setSeason(String newSeason){
        season=newSeason;
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