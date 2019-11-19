package Lesson1.Competitors;

import Lesson1.Competitors.obstacles.Cross;
import Lesson1.Competitors.obstacles.Wall;


public class Main {
    public static void main(String[] args ) {
        Competitor[] competitors ={
                new Man("Павел"),
                new Man("Дима"),
                new Cat("Барсик"),
                new Cat("Мурка"),
                new Robot("R2D2"),
                new Robot("MiBot"),

        };

        Lesson1.Competitors.obstacles.Obstacle[] obstacles ={
                new Cross(2900),
                new Wall(3),
                new Cross(3900),
                new Wall(4),
                new Cross(6000),
                new Wall(12),
        };

        for (Competitor c :competitors) {
            for (Lesson1.Competitors.obstacles.Obstacle o :obstacles ) {
                o.doIt(c);
                if (!c.isOnDistance()){
                    break;
                }
            }
        }

        for (Competitor c :competitors) {
            c.info();
        }
    }
}

