package net.yosshio0426.kpt.coreimpl.problem;

import lombok.EqualsAndHashCode;
import net.yosshio0426.kpt.core.problem.Pending;

/**
 * Pendingの実装型.
 */
@EqualsAndHashCode(callSuper = true)
final class PendingImpl extends AbstractProblem implements Pending {

    /**
     * コンストラクタ
     * 生成はFactoryからのみ
     * @param problem 内部情報
     */
    PendingImpl(InnerProblem problem) {
        super(problem);
    }
}
