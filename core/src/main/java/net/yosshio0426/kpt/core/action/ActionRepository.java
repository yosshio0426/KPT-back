package net.yosshio0426.kpt.core.action;

/**
 * 取り組みを保存する先.
 */
public interface ActionRepository {

    /**
     * 保存する.
     * @param action 保存する取り組み
     */
    void persist(Action action);
}
