package state_pattern.example3;

public class MediaPlayerContext {
    private MediaPlayerState playingState;
    private MediaPlayerState pausedState;
    private MediaPlayerState stoppedState;

    private MediaPlayerState currentState;

    public MediaPlayerContext() {
        playingState = new PlayingState(this);
        pausedState = new PausedState(this);
        stoppedState = new StoppedState(this);

        currentState = stoppedState;
    }

    public void setState(MediaPlayerState state) {
        this.currentState = state;
    }

    public MediaPlayerState getPlayingState() {
        return playingState;
    }

    public MediaPlayerState getPausedState() {
        return pausedState;
    }

    public MediaPlayerState getStoppedState() {
        return stoppedState;
    }

    public void play() {
        currentState.play();
    }

    public void pause() {
        currentState.pause();
    }

    public void stop() {
        currentState.stop();
    }

}
