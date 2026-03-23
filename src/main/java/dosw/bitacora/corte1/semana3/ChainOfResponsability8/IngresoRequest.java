package dosw.bitacora.corte1.semana3.ChainOfResponsability8;

public class IngresoRequest {
    private boolean pasaporteValido;
    private boolean antecedentesLimpios;
    private boolean motivoValido;
    private boolean aprobado;

    public IngresoRequest(boolean pasaporteValido, boolean antecedentesLimpios, boolean motivoValido) {
        this.pasaporteValido = pasaporteValido;
        this.antecedentesLimpios = antecedentesLimpios;
        this.motivoValido = motivoValido;
        this.aprobado = false;
    }

    public boolean isPasaporteValido() { return pasaporteValido; }
    public boolean isAntecedentesLimpios() { return antecedentesLimpios; }
    public boolean isMotivoValido() { return motivoValido; }
    public boolean isAprobado() { return aprobado; }

    public void setPasaporteValido(boolean pasaporteValido) { this.pasaporteValido = pasaporteValido; }
    public void setAntecedentesLimpios(boolean antecedentesLimpios) { this.antecedentesLimpios = antecedentesLimpios; }
    public void setMotivoValido(boolean motivoValido) { this.motivoValido = motivoValido; }
    public void setAprobado(boolean aprobado) { this.aprobado = aprobado; }
}