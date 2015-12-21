package net.yosshio0426.kpt.coreimpl.problem;

import lombok.Value;
import net.yosshio0426.kpt.core.value.Description;
import net.yosshio0426.kpt.core.value.Title;

/**
 * Problemに関する属性情報.
 */
@Value
final class ProblemAttribute {

    /**
     * タイトル
     */
    private final Title title;

    /**
     * 詳細説明
     */
    private final Description description;
}
