package state_pattern.example3;

public class StoppedState implements MediaPlayerState {
    private MediaPlayerContext mediaPlayer;

    public StoppedState(MediaPlayerContext mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
    }

    @Override
    public void play() {
        mediaPlayer.setState(mediaPlayer.getPlayingState());
        System.out.println("Playing");
    }

    @Override
    public void pause() {
        System.out.println("Can't pause, not playing");
    }

    @Override
    public void stop() {
        System.out.println("Already stopped");
    }
}
