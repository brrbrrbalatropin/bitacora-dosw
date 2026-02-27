package dosw.bitacora.semana3.Command9;

public class WalkCommand implements Command {
    private GameCharacter character;

    public WalkCommand(GameCharacter character) {
        this.character = character;
    }

    @Override
    public void execute() {
        character.walk();
    }
}