package step3;

import step3.view.RacingInputView;

public class RacingGamePlayer {

    public void playRacingGame() {
        final int carCount = RacingInputView.carCount();
        final int tryCount = RacingInputView.tryCount();
    }

    public static void main(String[] args) {
        final RacingGamePlayer racingGamePlayer = new RacingGamePlayer();

        racingGamePlayer.playRacingGame();
    }

}
