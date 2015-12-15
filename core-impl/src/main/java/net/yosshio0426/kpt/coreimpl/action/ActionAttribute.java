package net.yosshio0426.kpt.coreimpl.action;

import lombok.Value;
import net.yosshio0426.kpt.core.value.Description;
import net.yosshio0426.kpt.core.value.Title;

/**
 * 取り組みに関する属性情報.
 */
@Value
final class ActionAttribute {

    /**
     * タイトル
     */
    private final Title title;

    /**
     * 詳細説明
     */
    private final Description description;
}
