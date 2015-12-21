package net.yosshio0426.kpt.coreimpl.problem;

import lombok.EqualsAndHashCode;
import net.yosshio0426.kpt.core.problem.Solved;

/**
 * Solvedの実装型.
 */
@EqualsAndHashCode(callSuper = true)
final class SolvedImpl extends AbstractProblem implements Solved {

    /**
     * コンストラクタ
     * 生成はFactoryからのみ
     * @param problem 内部情報
     */
    SolvedImpl(InnerProblem problem) {
        super(problem);
    }
}
