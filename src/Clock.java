
public class Clock {

    public static void main(String[] args) {
        
        
        int seconds = getSeconds(18, 32, 47);
        System.out.println(seconds);

    }
    
    public static int getSeconds (int hour, int min, int sec) {
        int seconds = hour * 60 * 60 + min *60  + sec;
        return seconds;
    }

}
