package net.yosshio0426.kpt.coreimpl.problem;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import net.yosshio0426.kpt.core.problem.ProblemId;
import net.yosshio0426.kpt.core.value.Description;
import net.yosshio0426.kpt.core.value.Title;

/**
 * Problemの実体部分.
 */
@AllArgsConstructor
@EqualsAndHashCode
class InnerProblem {

    /**
     * ID 不変
     */
    private final ProblemId id;

    /**
     * 属性情報 可変
     */
    private ProblemAttribute attribute;

    public ProblemId id() {
        return id;
    }

    public Title title() {
        return attribute.getTitle();
    }

    public Description description() {
        return attribute.getDescription();
    }
}
