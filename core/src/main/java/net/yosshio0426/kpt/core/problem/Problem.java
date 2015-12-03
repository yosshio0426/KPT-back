package net.yosshio0426.kpt.core.problem;

import net.yosshio0426.kpt.core.problem.Pending;
import net.yosshio0426.kpt.core.problem.Solved;
import net.yosshio0426.kpt.core.value.Description;
import net.yosshio0426.kpt.core.value.Title;

/**
 * 課題.
 */
public interface Problem {

    /**
     * @return 課題のタイトル
     */
    Title title();

    /**
     * @return 課題の詳細説明
     */
    Description description();

    /**
     * 解決した.
     * @return 状態遷移後のオブジェクト
     */
    Solved solved();

    /**
     * 棚上げにした.
     * @return 状態遷移後のオブジェクト
     */
    Pending pend();
}
