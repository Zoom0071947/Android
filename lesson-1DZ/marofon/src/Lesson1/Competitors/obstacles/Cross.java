package Lesson1.Competitors.obstacles;

import Lesson1.Competitors.Competitor;

public class Cross extends Obstacle {

    int length;

    public Cross(int length) {
        this.length = length;
    }

    public void doIt(Competitor competitor) {
        competitor.run(length);
    }
}
