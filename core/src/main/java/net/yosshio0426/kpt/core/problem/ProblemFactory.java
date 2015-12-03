package net.yosshio0426.kpt.core.problem;

import net.yosshio0426.kpt.core.value.Description;
import net.yosshio0426.kpt.core.value.Title;

/**
 * 新規に課題を作る.
 */
public interface ProblemFactory {

    /**
     * 課題を挙げる.
     * @param title タイトル
     * @param description 詳細説明
     * @return 作られた課題
     */
    Raised raiseProblem(Title title, Description description);
}
