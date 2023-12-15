package com.sanketdd.generator.utility;


import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeeEdGenerator implements IdentifierGenerator {



    @Override
    public Object generate(SharedSessionContractImplementor sharedSessionContractImplementor, Object o) {
        String  prefix ="EMP";
        String suffix="";
        String finalVal = null;
        try {

            Connection connection= sharedSessionContractImplementor.getJdbcConnectionAccess().obtainConnection();
            Statement statement=connection.createStatement();
            // for mysql use this

            String sql = " select employee_seq.next_val from  employee_seq";


            // String sql = "select nextval('employee_seq')";
            // for postgresql use this


            ResultSet rs= statement.executeQuery(sql);
            if (rs.next()){
                Long value=rs.getLong(1);
                suffix=value.toString();
            }

            finalVal=prefix+suffix;

            System.out.println("Final value is "+ finalVal);
        }catch (Exception e){
            e.printStackTrace();
        }

        return finalVal ;
    }
}
