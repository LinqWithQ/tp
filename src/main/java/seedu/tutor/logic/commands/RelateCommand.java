package seedu.tutor.logic.commands;

import seedu.tutor.commons.core.index.Index;

/**
 * Creates RelateAddCommand or RelateDeleteCommand
 */
public abstract class RelateCommand extends Command{

    public static final String COMMAND_WORD = "relate";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Edits the relations of the person identified ";

    /**
     * A factory for the subtypes.
     * @param type Type of {@code RelationCommand} that is intended by the user.
     * @param details A string of relation.
     * @return Either of the subtypes, {@code RelateAddCommand} or {@code RelateDeleteCommand}.
     */
    public static RelateCommand create(Index index, String type, String details) {
        if (type.equals("add")) {
            return new RelateAddCommand(index, details);
        } else if (type.equals("delete")) {
            return new RelateDeleteCommand(index, details);
        } else {
            // should not reach here
            return null;
        }
    }
}
