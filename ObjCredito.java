public class ObjCredito {

    private int Idsolicitud;
    private String NombreCliente;
    private String Documento;
    private String TipoCredito;
    private String ValorSolicitado;
    private String EstadoCredito;

    
    public ObjCredito(int idsolicitud, String nombreCliente, String documento, String tipoCredito,
            String valorSolicitado, String estadoCredito) {
        Idsolicitud = idsolicitud;
        NombreCliente = nombreCliente;
        Documento = documento;
        TipoCredito = tipoCredito;
        ValorSolicitado = valorSolicitado;
        EstadoCredito = estadoCredito;
    }


    public ObjCredito() {
    }


    public int getIdsolicitud() {
        return Idsolicitud;
    }


    public void setIdsolicitud(int idsolicitud) {
        Idsolicitud = idsolicitud;
    }


    public String getNombreCliente() {
        return NombreCliente;
    }


    public void setNombreCliente(String nombreCliente) {
        NombreCliente = nombreCliente;
    }


    public String getDocumento() {
        return Documento;
    }


    public void setDocumento(String documento) {
        Documento = documento;
    }


    public String getTipoCredito() {
        return TipoCredito;
    }


    public void setTipoCredito(String tipoCredito) {
        TipoCredito = tipoCredito;
    }


    public String getValorSolicitado() {
        return ValorSolicitado;
    }


    public void setValorSolicitado(String valorSolicitado) {
        ValorSolicitado = valorSolicitado;
    }


    public String getEstadoCredito() {
        return EstadoCredito;
    }


    public void setEstadoCredito(String estadoCredito) {
        EstadoCredito = estadoCredito;
    }
    
}
