import java.util.Arrays;
import java.util.List;

public class Game {
    List<String> pole =  Arrays.asList(" "," "," "," "," "," "," "," "," ");



    public String win(){
        if (pole.get(0).equals(pole.get(1))||pole.get(0).equals(pole.get(2))){
            return pole.get(0) + " WON";
        }
        if (pole.get(3).equals(pole.get(4))||pole.get(3).equals(pole.get(5))){
            return pole.get(0) + " WON";
        }
        if (pole.get(6).equals(pole.get(8))||pole.get(6).equals(pole.get(7))){
            return pole.get(0) + " WON";
        }
        if (pole.get(0).equals(pole.get(3))||pole.get(0).equals(pole.get(6))){
            return pole.get(0) + " WON";
        }
        if (pole.get(1).equals(pole.get(4))||pole.get(1).equals(pole.get(7))){
            return pole.get(0) + " WON";
        }
        if (pole.get(2).equals(pole.get(5))||pole.get(2).equals(pole.get(8))){
            return pole.get(0) + " WON";
        }
        if (pole.get(0).equals(pole.get(5))||pole.get(0).equals(pole.get(8))){
            return pole.get(0) + " WON";
        }
        if (pole.get(2).equals(pole.get(4))||pole.get(2).equals(pole.get(6))){
            return pole.get(0) + " WON";
        }
        return "";
    }

    public void vyber(String sloupec, String radek, String player){
        if (sloupec.equals("1")||radek.equals("1")){
            pole.set(0,player);
        }
        if (sloupec.equals("1")||radek.equals("2")){
            pole.set(1,player);
        }
        if (sloupec.equals("1")||radek.equals("3")){
            pole.set(2,player);
        }
        if (sloupec.equals("2")||radek.equals("1")){
            pole.set(3,player);
        }
        if (sloupec.equals("2")||radek.equals("2")){
            pole.set(4,player);
        }
        if (sloupec.equals("2")||radek.equals("3")){
            pole.set(5,player);
        }
        if (sloupec.equals("3")||radek.equals("1")){
            pole.set(6,player);
        }
        if (sloupec.equals("3")||radek.equals("2")){
            pole.set(7,player);
        }
        if (sloupec.equals("3")||radek.equals("3")){
            pole.set(8,player);
        }

    }

    public void setPole(List<String> pole) {
        this.pole = pole;
    }
}
