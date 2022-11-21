package bridge;

import java.util.ArrayList;
import java.util.List;

/**
 * 사용자에게 게임 진행 상황과 결과를 출력하는 역할을 한다.
 * 메서드의 이름은 변경할 수 없고, 인자와 반환 타입은 추가 및 변경 가능하다.
 * 값 출력을 위한 메서드를 추가할 수 있다.
 */
public class OutputView {
    public void printBeforeGame() {
        System.out.println("다리 건너기 게임을 시작합니다.");
    }

    /**
     * 현재까지 이동한 다리의 상태를 정해진 형식에 맞춰 출력한다.
     * <p>
     * 출력을 위해 필요한 메서드의 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public void printMap(BridgeGame bridgeGame) {
        List<String> upMap = bridgeGame.getMap(MovingEnum.U);
        List<String> downMap = bridgeGame.getMap(MovingEnum.D);

        String upMapResult = "[ " + String.join(" | ", upMap) + " ]";
        String downMapResult = "[ " + String.join(" | ", downMap) + " ]";
        System.out.println(upMapResult);
        System.out.println(downMapResult);
    }

    /**
     * 게임의 최종 결과를 정해진 형식에 맞춰 출력한다.
     * <p>
     * 출력을 위해 필요한 메서드의 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public void printResult(BridgeGame bridgeGame) {
        System.out.println("최종 게임 결과");
        printMap(bridgeGame);
        System.out.println();
        System.out.println("게임 성공 여부: " + bridgeGame.getGameResult());
        System.out.println("총 시도한 횟수: " + bridgeGame.getTryCount());
    }
}
