import java.util.List;
import org.sql2o.*;

public class Doctor{
  private int dId;
  private String name;
  private int id_specialization;

  public Doctor(String name, int sId){
    this.name = name;
    this.id_specialization = sId;
  }

  public void save(){
    try(Connection con = DB.sql2o.open()) {
      String sql = "INSERT INTO doctors(name, speciality)"
    }
  }

  public int getId(){
    return dId;
  }
  public String getName(){
    return name;
  }
}
