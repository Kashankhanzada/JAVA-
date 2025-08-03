public class time {
    public static void main(String[] args) {
        long totalmillisec = System.currentTimeMillis();

        long totalsec = totalmillisec / 1000;

        long currentsec = totalsec % 60;

        long totalmin = totalsec / 60;

        long currentmin = totalmin % 60;

        long totalhours = totalmin / 60;

        long currenthours = totalhours % 24;

        System.out.println("Current time is : " + currenthours + ":" + currentmin + ":" + currentsec + "GMT");
    }
}
