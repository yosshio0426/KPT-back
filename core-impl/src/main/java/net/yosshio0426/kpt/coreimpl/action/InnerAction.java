package net.yosshio0426.kpt.coreimpl.action;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import net.yosshio0426.kpt.core.action.ActionId;
import net.yosshio0426.kpt.core.value.Description;
import net.yosshio0426.kpt.core.value.Title;

/**
 * Actionの実体部分.
 */
@AllArgsConstructor
@EqualsAndHashCode
class InnerAction {

    /**
     * ID 不変
     */
    private final ActionId id;

    /**
     * 属性情報 可変
     */
    private ActionAttribute attribute;

    public ActionId id() {
        return id;
    }

    public Title title() {
        return attribute.getTitle();
    }

    public Description description() {
        return attribute.getDescription();
    }
}
