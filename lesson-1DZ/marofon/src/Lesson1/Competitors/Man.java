package Lesson1.Competitors;

public class Man implements Competitor {
    String name;

    int maxRunDistance;
    int maxJumpHeight;

    boolean active;

    public Man( String name, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.active = true;
    }

    public Man(String name) {
        this(name,3000,3);

    }



    public void run(int dist) {
        if (dist <= maxRunDistance) {
            System.out.println(name + " успешно преодолел кросс");
        } else {
            System.out.println(name + " не справился с кроссом");
            active = false;
        }
    }


    public void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println(name + " успешно перепрыгнул стену ");
        } else {
            System.out.println(name + " не смог перепрыгнуть стену");
            active = false;
        }
    }

    public boolean isOnDistance() {
        return active;
    }


    public void info() {
        System.out.println(name + " " + (active ? " на дистанции" : " выбыл из соревнований"));
    }

}
