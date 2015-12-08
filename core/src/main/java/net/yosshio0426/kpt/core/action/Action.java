package net.yosshio0426.kpt.core.action;

import net.yosshio0426.kpt.core.action.GivenUp;
import net.yosshio0426.kpt.core.action.Keep;
import net.yosshio0426.kpt.core.problem.ProblemId;
import net.yosshio0426.kpt.core.value.Description;
import net.yosshio0426.kpt.core.value.Title;

/**
 * 取り組み.
 */
public interface Action {

    /**
     * @return 識別子
     */
    ActionId id();

    /**
     * @return 取り組みの名前
     */
    Title title();

    /**
     * @return 取り組みの詳細説明
     */
    Description description();

    /**
     * 今後とも取り組み続ける.
     * @return 状態遷移後のオブジェクト
     */
    Keep stayKeep();

    /**
     * 取り組みをやめる.
     * @return 状態遷移後のオブジェクト
     */
    GivenUp giveup();
}
