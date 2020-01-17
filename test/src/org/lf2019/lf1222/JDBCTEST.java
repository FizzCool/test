package org.lf2019.lf1222;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @ClassName: JDBCTEST
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2019/12/22
 */
public class JDBCTEST {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try {
                long start = System.currentTimeMillis();
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?serverTimezone=UTC&characterEncoding=utf-8&rewriteBatchedStatements=true","root","thelasttime");
                /*Statement stmt =conn.createStatement();
                String sql = "insert into stu(name,age) values('张子愚',22)";
                stmt.execute(sql);*/
                String sql = "insert into stu(name,age) values(?,?)";
                PreparedStatement ps = conn.prepareStatement(sql);
                StringBuffer sb = new StringBuffer();
                /*for(int i =1;i<=1000;i++) {
                    sb.delete(0, sb.length()).append("第").append(i).append("只小兔子");
                    ps.setString(1, sb.toString());
                    ps.setInt(2, 10);
                    ps.executeUpdate();
                }*/

                for(int i =1;i<=1000000;i++) {
                    sb.delete(0, sb.length()).append("第").append(i).append("只小兔子");
                    ps.setString(1, sb.toString());
                    ps.setInt(2, 10);
                    ps.addBatch();
                }
                ps.executeBatch();
                long end =System.currentTimeMillis();
                System.out.println("用时："+(end-start));
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
