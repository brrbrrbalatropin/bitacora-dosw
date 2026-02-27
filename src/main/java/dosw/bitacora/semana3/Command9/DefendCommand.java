package dosw.bitacora.semana3.Command9;

public class DefendCommand implements Command {
    private GameCharacter character;

    public DefendCommand(GameCharacter character) {
        this.character = character;
    }

    @Override
    public void execute() {
        character.defend();
    }
}