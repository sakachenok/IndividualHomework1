public class Utils {
    public int x;
    public int y;
    public int z;
    public int day;
    public int month;

    public Utils(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Utils(int day, int month) {
        this.day = day;
        this.month = month;
    }


    public static void check(int x, int y, int z) {
        if (x > 0 && y > 0 && z > 0) {
            System.out.println("excellent");
        } else if (x > 0 & y > 0 & z <= 0) {
            System.out.println("good");
        } else if (x > 0 & z > 0 & y <= 0) {
            System.out.println("good");
        } else if (x <= 0 & y > 0 & z > 0) {
            System.out.println("good");
        } else if (x > 0 & y <= 0 & z <= 0) {
            System.out.println("fine");
        } else if (x <= 0 & y > 0 & z <= 0) {
            System.out.println("fine");
        } else if (x <= 0 & y <= 0 & z > 0) {
            System.out.println("fine");
        } else if (x <= 0 & y <= 0 & z <= 0) {
            System.out.println("bad");
        }
    }

    public static void checkDayAndMonthIsHoliday(int day, int month) {
        for (int i = 1; i < 13; i++) {
            for (int j = 1; j < 32; j++) {
                if (i == month && j == day) {
                    if (day == 31 && month == 2) {
                        System.out.println("this date doesn't exist");
                    } else if (day == 30 && month == 2) {
                        System.out.println("this date doesn't exist");
                    } else if (day == 1 && month == 1) {
                        System.out.println("holiday");
                    } else if (day == 7 && month == 1) {
                        System.out.println("holiday");
                    } else if (day == 8 && month == 3) {
                        System.out.println("holiday");
                    } else if (day == 1 && month == 5) {
                        System.out.println("holiday");
                    } else if (day == 9 && month == 5) {
                        System.out.println("holiday");
                    } else if (day == 3 && month == 7) {
                        System.out.println("holiday");
                    } else if (day == 7 && month == 11) {
                        System.out.println("holiday");
                    } else if (day == 25 && month == 12) {
                        System.out.println("holiday");
                    } else
                        System.out.println("not holiday");
                }
            }
        }
    }
}
