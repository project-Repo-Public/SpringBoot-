package com.app.project.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="test")
public class UserModel {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    
    @Column(name="fname")
    private String fname;

    @Column(name="lname")
    private String lname;

    @Column(name="email")
    private String email;

    //CALLING STORED FUNCTION MYSQL 
    // SimpleJdbcCall STOREDFNC = new SimpleJdbcCall(dataSource).withFunctionName("get_student_name"); // func.name is "get_student_name"
    // SqlParameterSource in = new MapSqlParameterSource().addValue("in_id", id); //in_id is variable name in stored func.
    // String name = STOREDFNC.executeFunction(String.class, in); // name is the output

    // Student student = new Student();
    // student.setId(id);
    // student.setName(name);
}

// private DataSource dataSource;
//    private JdbcTemplate jdbcTemplateObject;
   
//    public void setDataSource(DataSource dataSource) {
//       this.dataSource = dataSource;
//       this.jdbcTemplateObject = new JdbcTemplate(dataSource);
//    }
//    public Student getStudent(Integer id) {
//       SimpleJdbcCall jdbcCall = new SimpleJdbcCall(dataSource).withFunctionName("get_student_name");
//       SqlParameterSource in = new MapSqlParameterSource().addValue("in_id", id);
//       String name = jdbcCall.executeFunction(String.class, in);
      
//       Student student = new Student();
//       student.setId(id);
//       student.setName(name);
//       return student;      
//    }