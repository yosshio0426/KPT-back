package net.yosshio0426.kpt.coreimpl.action;

import lombok.RequiredArgsConstructor;
import net.yosshio0426.kpt.core.action.ActionFactory;
import net.yosshio0426.kpt.core.action.Keep;
import net.yosshio0426.kpt.core.action.Try;
import net.yosshio0426.kpt.core.value.Description;
import net.yosshio0426.kpt.core.value.Title;

/**
 * .
 */
@RequiredArgsConstructor
public class ActionFactoryImpl implements ActionFactory {

    private final UniqueActionIdGenerator idGenerator;

    @Override
    public Keep newKeep(Title title, Description description) {
        return new KeepImpl(createInnerAction(title, description));
    }

    @Override
    public Try newTry(Title title, Description description) {
        return new TryImpl(createInnerAction(title, description));
    }

    private InnerAction createInnerAction(Title title, Description description) {
        return new InnerAction(idGenerator.generate(), createActionAttribute(title, description));
    }

    private ActionAttribute createActionAttribute(Title title, Description description) {
        return new ActionAttribute(title, description);
    }
}
