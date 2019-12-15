package game.scenes;

import game.characters.Pupil;

import java.util.Scanner;

public class Scene_10_goHome extends BaseScene {

    Pupil pupil;

    @Override
    public void run(Pupil pupil) {
        this.pupil = pupil;
        printHistory();
        int ansver = choiseAction();
        moveNext(ansver);
    }

    private void printHistory(){
        printLn("Уроки в школе закончились, ученик пришел домой");
        printLn("Вы поели и восполнили себе голод");
        printLn("Вы садитесь за стол и решаете чем заняться");
        printLn("выберите варианты ответа (введиите число):");
        printLn("1 - сделать уроки");
        printLn("2 - играть в танки в 4К");
        printLn("3 - играть в майнкрафт на суперкомпьютере");
    }

    private int choiseAction(){
        Scanner in = new Scanner(System.in);
        printLn("ваш вариант?");
        int variant = in.nextInt();
        return variant;
    }

    @Override
    public void moveNext(int action) {
        switch (action){
            case 1: {
                printLn("Настроение -40, рейтинг +60, голод -2");
                pupil.setRate(pupil.getRate() +60);
                pupil.setMood(pupil.getMood()-40);
                pupil.setHunger(pupil.getHunger()-2);
                break;
            }
            case 2: {
                printLn("Настроение +75, рейтинг -40, голод -1");
                pupil.setMood(pupil.getMood() + 75);
                pupil.setHunger(pupil.getHunger()-1);
                pupil.setRate(pupil.getRate()-40);
                break;
            }
            case 3: {
                printLn("Настроение +75, рейтинг -40, голод -1");
                pupil.setHunger(pupil.getHunger()-1);
                pupil.setRate(pupil.getRate()-40);
                pupil.setMood(pupil.getMood()+75);
                break;
            }
        }
    }
}
