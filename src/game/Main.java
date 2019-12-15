package game;

import game.characters.Pupil;
import game.scenes.*;

public class Main {

    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.setMood(100);
        pupil.setRate(0);
        pupil.setHunger(10);
        pupil.setSelfRating(50);

        Scene_1_EnterToClass scene1EnterToClass = new Scene_1_EnterToClass();
        scene1EnterToClass.run(pupil);
        System.out.println(); System.out.println(); System.out.println();
        Scene_2_mathLesson scene2MathLesson = new Scene_2_mathLesson();
        scene2MathLesson.run(pupil);
        System.out.println(); System.out.println(); System.out.println();
        Scene_3_peLesson scene3PeLesson = new Scene_3_peLesson();
        scene3PeLesson.run(pupil);
        System.out.println(); System.out.println(); System.out.println();
        Scene_4_enLesson scene4EnLesson = new Scene_4_enLesson();
        scene4EnLesson.run(pupil);
        System.out.println(); System.out.println(); System.out.println();
        Scene_5_geoLesson scene5GeoLesson = new Scene_5_geoLesson();
        scene5GeoLesson.run(pupil);
        System.out.println(); System.out.println(); System.out.println();
        Scene_6_chemLesson scene6ChemLesson = new Scene_6_chemLesson();
        scene6ChemLesson.run(pupil);
        System.out.println(); System.out.println(); System.out.println();
        Scene_7_ruLesson scene7RuLesson = new Scene_7_ruLesson();
        scene7RuLesson.run(pupil);
        System.out.println(); System.out.println(); System.out.println();
        Scene_8_litLesson scene8LitLesson = new Scene_8_litLesson();
        scene8LitLesson.run(pupil);
        System.out.println(); System.out.println(); System.out.println();
        Scene_9_bioLesson scene9BioLesson = new Scene_9_bioLesson();
        scene9BioLesson.run(pupil);
        System.out.println(); System.out.println(); System.out.println();
        pupil.setHunger(10);
        Scene_10_goHome scene10GoHome = new Scene_10_goHome();
        scene10GoHome.run(pupil);
        System.out.println(); System.out.println(); System.out.println();
        System.out.println("Ваши финальные показатели:");
        System.out.println("Рейтинг - " + pupil.getRate() + ", самооценка - " + pupil.getSelfRating() + ", настроение - " + pupil.getMood() + ", голод - " + pupil.getHunger() + ".");
        System.out.println("Спасибо за то что играли в нашу игру! До новых встреч.");
    }
}
