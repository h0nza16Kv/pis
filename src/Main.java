import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Game game  = new Game();
        System.out.println(game.pole);
        while (true){
            System.out.println("Vyberte soupec");
            String hracuvSloupec = scanner.next();
            System.out.println("Vyberte radek");
            String hracuvRadek = scanner.next();
            game.vyber(hracuvSloupec,hracuvRadek,"O");
            System.out.println("Vyberte soupec");
            String hracuvSloupec1 = scanner.next();
            System.out.println("Vyberte radek");
            String hracuvRadek1 = scanner.next();
            game.vyber(hracuvSloupec1,hracuvRadek1,"X");


        }

    }
}