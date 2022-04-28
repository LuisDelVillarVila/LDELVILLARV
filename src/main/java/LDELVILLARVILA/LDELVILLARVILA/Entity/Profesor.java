package LDELVILLARVILA.LDELVILLARVILA.Entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "profesor")
@PrimaryKeyJoinColumn(referencedColumnName="idpersona")
public class Profesor extends Persona  {

    @Column(name = "salario",length = 12,nullable = false)
    private  String salario;

    public Profesor() {
    }

    public Profesor(String salario) {
        this.salario = salario;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "salario='" + salario + '\'' +
                '}';
    }
}
