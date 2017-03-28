import java.util.List;
import org.sql2o.*;

public class Patient{
  private int id_patient;
  private String name;
  private String birthday;

  public Patient(String name, Sting birthday){
    this.name = name;
    this.birthday = birthday;
  }

  public void save(){
    try(Connection con = DB.sql2o.open()) {
      String sql = "INSERT INTO patient(name, speciality) VALUES (:name, :speciality);";
      this.id = (int) con.createQuery(sqlCommand, true)
        .addParameter("name", this.name)
        .executeUpdate()
        .getKey();
    }
  }

  public int getName()){
    return name;
  }

  public int getId(){
    return id;
  }
}
