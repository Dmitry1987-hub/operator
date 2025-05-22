//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int age = 20;
        if (age >= 18) {
            System.out.println("Ты можешь водить!");
        } else {
            System.out.println("Ты не можещь водить");
        }
        int age1 = 19;
        boolean canNotGoSchol = age1 < 7 || age1 > 18;
        if (age1 >= 18 && age1 < 21) {
            System.out.println("Ты достаточно взрослый, чтобы водить автомобиль, но недостаточно взрослый чтобы пить алкоголь");

        }
        if (canNotGoSchol) ;
        System.out.println("Я думаю что ты не ходишь в школу");


        int age2 = 17;
        if (age2 >= 18)
            System.out.println("ты совершеннолетний");
        else
            System.out.println("Недостигт совершеннолетия и нужно немного подождать");

        int t = 3;
        if (t >= 5)
            System.out.println("Если температура на улице можно идти без шапки");
        else
            System.out.println("Если температура на улице нужно одевать шапку");

        int speed = 75;
        if (speed > 60)
            System.out.println("придет штраф за превышение скорости");
        else
            System.out.println("штафа нет, можно ехать спокойно");

        int yares = 38;
        boolean yares1 = yares < 2 && yares > 6;
        if (yares < 2 && yares > 6)
            System.out.println(" тебе надо идти в садик");
        boolean yares2 = yares < 7 && yares > 17;
        if (yares < 7 && yares > 17)
            System.out.println("тебе надо идти в школу");
        boolean yares3 = yares >= 18 && 24 <= yares;
        if (yares <= 18 && yares >= 24)
            System.out.println(" тебе надо идти в университет");
        boolean yares4 = yares < 24;
        if (yares > 24)
            System.out.println("тебе надо иди на работу");

        int baby = 6;
        boolean baby1 = baby < 5;
        if (baby < 5)
            System.out.println("ребенку кататься нельзя");
        boolean baby2 = baby > 5 || baby < 14;
        if (baby > 5 || baby <= 14)
            System.out.println("ребенку можно кататься в сопровождении взрослого");
        boolean baby3 = baby > 14;
        if (baby > 14)
            System.out.println("ребенку можно кататься без сопровождения взрослого");

        int vagen = 102;
        if (vagen < 60) {
            System.out.println("Есть сидячие места.");
        } else if (vagen >= 60 && vagen < 102) {
            System.out.println("Есть стоячие места.");
        } else {
            System.out.println("Мест нет");
        }

        int one = 10;
        int two = 20;
        int three = 30;
        if (one > two && one > three) {
            System.out.println("Первое число самое большое");
        } else if (two > one && two > three) {
            System.out.println("Второе число самое большое");
        } else {
            System.out.println("Третье число самое большое");
        }
    }
}