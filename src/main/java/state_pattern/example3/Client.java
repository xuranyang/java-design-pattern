package state_pattern.example3;

public class Client {
    public static void main(String[] args) {
        MediaPlayerContext mediaPlayer = new MediaPlayerContext();

        mediaPlayer.stop(); // Output: Already stopped
        mediaPlayer.play(); // Output: Playing
        mediaPlayer.play(); // Output: Already playing
        mediaPlayer.pause(); // Output: Paused
        mediaPlayer.pause(); // Output: Already paused
        mediaPlayer.play(); // Output: Playing
        mediaPlayer.stop(); // Output: Stopped
        mediaPlayer.pause(); // Output: Can't pause, not playing
    }
}
