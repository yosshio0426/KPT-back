package net.yosshio0426.kpt.coreimpl.problem;

import lombok.RequiredArgsConstructor;
import net.yosshio0426.kpt.core.problem.ProblemFactory;
import net.yosshio0426.kpt.core.problem.Raised;
import net.yosshio0426.kpt.core.value.Description;
import net.yosshio0426.kpt.core.value.Title;

/**
 * ProblemFactoryの実装.
 */
@RequiredArgsConstructor
public class ProblemFactoryImpl implements ProblemFactory {

    /**
     * IDを生成する.
     */
    private final UniqueProblemIdGenerator idGenerator;

    @Override
    public Raised raiseProblem(Title title, Description description) {
        return new RaisedImpl(createInnerProblem(title, description));
    }

    private InnerProblem createInnerProblem(Title title, Description description) {
        return new InnerProblem(idGenerator.generate(), createProblemAttribute(title, description));
    }

    private ProblemAttribute createProblemAttribute(Title title, Description description) {
        return new ProblemAttribute(title, description);
    }
}
