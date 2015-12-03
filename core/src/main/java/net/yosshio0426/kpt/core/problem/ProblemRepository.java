package net.yosshio0426.kpt.core.problem;

/**
 * 課題を保存する先.
 */
public interface ProblemRepository {

    /**
     * 保存する.
     * @param problem 保存する課題
     */
    void persist(Problem problem);
}
