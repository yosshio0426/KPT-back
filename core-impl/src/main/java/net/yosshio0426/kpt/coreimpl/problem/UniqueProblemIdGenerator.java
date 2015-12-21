package net.yosshio0426.kpt.coreimpl.problem;

import net.yosshio0426.kpt.core.problem.ProblemId;

/**
 * 一意のProblemIdを生成する.
 */
public interface UniqueProblemIdGenerator {

    /**
     * ProblemIdを生成する
     * @return 新規発行のProblemId
     */
    ProblemId generate();
}
