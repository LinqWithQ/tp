package seedu.tutor.logic.commands;

import seedu.tutor.logic.commands.exceptions.CommandException;
import seedu.tutor.model.Model;

public class SubjectCommand extends Command{

    public static final String COMMAND_WORD = "subject";

    public enum SubjectCommandType {
        ADD, DELETE, CHANGE
    }

    public SubjectCommand(SubjectCommandType type, String args) {

    }

    @Override
    public CommandResult execute(Model model) throws CommandException {
        return null;
    }
}
