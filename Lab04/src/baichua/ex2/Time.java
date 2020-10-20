package baichua.ex2;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time() {
        hour = 13;
        minute = 10;
        second = 50;
    }

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public Time nextSecond() {
        ++second;
            if (second >= 60) {
                second = 0;
                minute++;
                if (minute >= 60) {
                    minute = 0;
                    hour++;
                    if (hour >= 24) {
                        hour = 0;
                    }
                }
            }
        return this;
            // eg: t1.nextSecond().nextSecond()
    }

    public Time previousSecond() {
        second--;
        if (second <= 0) {
            second = 59;
            minute--;
            if (minute <= 0) {
                minute = 59;
                hour--;
                if (hour <= 0) {
                    hour = 23;
                }
            }
        }
        return this;
    }

    public String toString() {
        return hour + ":" + minute + ":" + second;
    }


    public static void main(String[] args) {
        Time t1 = new Time(23, 59, 59);
        t1.nextSecond();
        System.out.println(t1);
    }
}
