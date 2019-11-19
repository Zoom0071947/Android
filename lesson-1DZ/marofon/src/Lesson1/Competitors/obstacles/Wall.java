package Lesson1.Competitors.obstacles;

import Lesson1.Competitors.Competitor;

public class Wall extends Obstacle {
    int height;

    public Wall(int height) {
        this.height = height;
    }

    public void doIt(Competitor competitor) {
        competitor.jump(height);
    }
}
