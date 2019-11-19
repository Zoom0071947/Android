public enum DayOfWeek {
    SUNDAY(1,0),
    MONDAY(2,8),
    TUESDAY(3,8),
    WEDNESDAY(4,8),
    THURSDAY(5,8),
    FRIDAY(6,7),
    SATURDAY(7,0);

    private final int dayNumber;
    private final int workHours;

    DayOfWeek (int dayNumber, int workHours){
        this.dayNumber = dayNumber;
        this.workHours = workHours;
    }
    public int getWorkHours(){
        return this.workHours;
    }
    public int getDayNumber(){
        return this.dayNumber;
    }
    static DayOfWeek convertIntToDay (int number){
        for(DayOfWeek day: values())
            if(day.dayNumber == number)
                return day;
        return null;
    }
}