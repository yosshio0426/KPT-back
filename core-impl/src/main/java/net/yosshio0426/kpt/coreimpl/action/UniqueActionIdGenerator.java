package net.yosshio0426.kpt.coreimpl.action;

import net.yosshio0426.kpt.core.action.ActionId;

/**
 * 一意のActionIdを生成する.
 */
public interface UniqueActionIdGenerator {

    /**
     * ActionIdを生成する
     * @return 新規発行のActionId
     */
    ActionId generate();
}
