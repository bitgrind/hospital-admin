import java.util.List;
import org.sql2o.*;

public class Doctor{
  private int id_doctor;
  private String name;
  private int id_specialization;

  public Doctor(String name, int sId){
    this.name = name;
    this.id_specialization = sId;
  }

  public void save(){
    try(Connection con = DB.sql2o.open()) {
      String sql = "INSERT INTO doctors(name, speciality) VALUES (:x, :y);";
      this.id_doctor = (int) con.createQuery(sql, true)
        .addParameter("x", this.name)
        .addParameter("y", this.id_specialization)
        .executeUpdate()
        .getKey();
    }
  }

  public List<Patient> getPatient(){
    try(Connection con = DB.sql2o.open()){
      String sql = "SELECT * FROM patients WHERE id_doctor=:id;";
      return con.createQuery(sql)
        .addParameter(":id", this.id_doctor)
        .executeAndFetch()    }
  }

  public int getId(){
    return dId;
  }
  public String getName(){
    return name;
  }
}
