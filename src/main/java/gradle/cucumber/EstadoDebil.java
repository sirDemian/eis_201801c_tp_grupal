package gradle.cucumber;


public class EstadoDebil implements EstadoFantasma{

    @Override
    public Boolean esDebil() {
        return true;
    }

    @Override
    public Boolean esSinCuerpo() {
        return false;
    }
}
