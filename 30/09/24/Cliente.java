public class Cliente {
    
    private Long cedula;
    private String nombre ;
    private String apellido;
    public Cliente(Long cedula, String nombre, String apellido) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public void setCedula(Long cedula) {
        this.cedula = cedula;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    
}
