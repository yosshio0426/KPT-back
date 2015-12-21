package net.yosshio0426.kpt.coreimpl.problem;

import lombok.EqualsAndHashCode;
import net.yosshio0426.kpt.core.problem.Raised;

/**
 * Raisedの実装型.
 */
@EqualsAndHashCode(callSuper = true)
final class RaisedImpl extends AbstractProblem implements Raised {

    /**
     * コンストラクタ
     * 生成はFactoryからのみ
     * @param problem 内部情報
     */
    RaisedImpl(InnerProblem problem) {
        super(problem);
    }
}
