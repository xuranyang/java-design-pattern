package state_pattern.example3;

public class PlayingState implements MediaPlayerState {
    private MediaPlayerContext mediaPlayer;

    public PlayingState(MediaPlayerContext mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
    }

    @Override
    public void play() {
        System.out.println("Already playing");
    }

    @Override
    public void pause() {
        mediaPlayer.setState(mediaPlayer.getPausedState());
        System.out.println("Paused");
    }

    @Override
    public void stop() {
        mediaPlayer.setState(mediaPlayer.getStoppedState());
        System.out.println("Stopped");
    }
}
