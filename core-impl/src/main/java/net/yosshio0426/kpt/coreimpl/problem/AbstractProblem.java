package net.yosshio0426.kpt.coreimpl.problem;

import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Delegate;
import net.yosshio0426.kpt.core.problem.Pending;
import net.yosshio0426.kpt.core.problem.Problem;
import net.yosshio0426.kpt.core.problem.Solved;

/**
 * Problemの共通処理を記述するクラス.
 */
@RequiredArgsConstructor
@EqualsAndHashCode
abstract class AbstractProblem implements Problem {

    /**
     * IFで定義された処理の一部を委譲する
     */
    @Delegate
    private final InnerProblem problem;

    @Override
    public Solved solved() {
        return new SolvedImpl(problem);
    }

    @Override
    public Pending pend() {
        return new PendingImpl(problem);
    }
}
