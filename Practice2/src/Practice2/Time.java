package Practice2;

public class Time implements Comparable<Time> {
    int hour;
    int minute;
    int second;

    public Time() {
        this(0, 0, 0);
    }

    public Time(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    public void setTime(int hour, int minute, int second) {
        if (hour < 0 || hour > 23 || minute < 0 || minute > 59 || second < 0 || second > 59) {
            System.out.println("data is invalid");
            return;
        }
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toString() {
        return toUniversal();
    }

    public String toUniversal() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public String toStandard() {
        String dayPart = hour < 12 ? "AM" : "PM";
        int displayHour = hour % 12;
        if (displayHour == 0) displayHour = 12;
        return String.format("%02d:%02d:%02d %s", displayHour, minute, second, dayPart);
    }

    public static int toSeconds(Time time) {
        return time.hour * 3600 + time.minute * 60 + time.second;
    }

    public static Time add(Time t1, Time t2) {
        int sumInSeconds = toSeconds(t1) + toSeconds(t2);
        int newHour = (sumInSeconds / 3600) % 24;
        sumInSeconds %= 3600;
        int newMinute = (sumInSeconds / 60) % 60;
        int newSecond = sumInSeconds % 60;
        return new Time(newHour, newMinute, newSecond);
    }

    public Time add(Time t) {
        return add(this, t);
    }

    @Override
    public int compareTo(Time o) {
        if (this.hour != o.hour) return Integer.compare(this.hour, o.hour);
        if (this.minute != o.minute) return Integer.compare(this.minute, o.minute);
        return Integer.compare(this.second, o.second);
    }
}
