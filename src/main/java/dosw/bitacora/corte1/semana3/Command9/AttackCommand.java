package dosw.bitacora.corte1.semana3.Command9;

public class AttackCommand implements Command {
    private GameCharacter character;

    public AttackCommand(GameCharacter character) {
        this.character = character;
    }

    @Override
    public void execute() {
        character.attack();
    }
}