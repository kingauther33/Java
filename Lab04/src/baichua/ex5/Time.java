package baichua.ex5;

public class Time {
    private int second;
    private int hour;
    private int minute;

    public void setSecond(int second) {
        if (second >= 0 && second <= 59) {
            this.second = second;
        } else {
            second = 0;
            throw new IllegalArgumentException("invalid second input");
        }
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute <= 59) {
            this.minute = minute;
        } else {
            minute = 0;
            throw new IllegalArgumentException("invalid minute input");
        }
    }

    public void setHour(int hour) {
        if (hour >= 0 && hour <= 24){
            this.hour = hour;
        } else {
            hour = 0;
            throw new IllegalArgumentException("invalid hour input");
        }
    }

    public void setTime(int second, int minute, int hour) {
        this.setSecond(second);
        this.setMinute(minute);
        this.setHour(hour);
    }

    public Time() {
        second = 0;
        minute = 0;
        hour = 0;
    }

    public Time(int second, int minute, int hour) {
        this.setTime(second, minute, hour);
    }

    public int getSecond() {
        return second;
    }

    public int getMinute() {
        return minute;
    }

    public int getHour() {
        return hour;
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

}
