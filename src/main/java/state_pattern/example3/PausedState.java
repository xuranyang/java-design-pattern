package state_pattern.example3;

public class PausedState implements MediaPlayerState{
    private MediaPlayerContext mediaPlayer;

    public PausedState(MediaPlayerContext mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
    }

    @Override
    public void play() {
        mediaPlayer.setState(mediaPlayer.getPlayingState());
        System.out.println("Playing");
    }

    @Override
    public void pause() {
        System.out.println("Already paused");
    }

    @Override
    public void stop() {
        mediaPlayer.setState(mediaPlayer.getStoppedState());
        System.out.println("Stopped");
    }
}
