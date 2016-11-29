package com.ttt.jdbc.dao.implementation;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import com.ttt.jdbc.dao.Dao;
import com.ttt.entites.User;

public class UserDao extends Dao<User> {

    public UserDao(Connection c) {
        super(c);
    }

    @Override
    public boolean create(User x) {
        // TODO Auto-generated method stub

        String req = "INSERT INTO users (`user` , `password`) "
                + "VALUES ('" + x.getUsername() + "','" + x.getPassword() + "')";

        //System.out.println("REQUETE "+req);

        Statement stm = null;
        try {
            stm = cnx.createStatement();
            int n = stm.executeUpdate(req);
            if (n > 0) {
                stm.close();
                return true;
            }
        } 
        catch (SQLException exp) {
        } finally {
            if (stm != null) {
                try {
                    stm.close();
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }

        return false;
    }

    @Override
    public boolean delete(User x) {
        // TODO Auto-generated method stub
        Statement stm = null;
        try {
            stm = cnx.createStatement();
            int n = stm.executeUpdate("DELETE FROM users WHERE user='" + x.getUsername() + "'");
            if (n > 0) {
                stm.close();
                return true;
            }
        } catch (SQLException exp) {
        } finally {
            if (stm != null) {
                try {
                    stm.close();
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
        return false;
    }

    @Override
    public User read(String id) {
        // TODO Auto-generated method stub
        try {
            Statement stm = cnx.createStatement();
            ResultSet r = stm.executeQuery("SELECT * FROM users WHERE user = '" + id + "'");
            if (r.next()) {
                User c = new User(r.getString("user"),r.getString("password"));
                r.close();
                stm.close();
                return c;
            }
        } catch (SQLException exp) {
        }
        return null;
    }

    @Override
    public boolean update(User x) {
        // TODO Auto-generated method stub
        Statement stm = null;
        try {
            String req = "UPDATE users SET password = '" + x.getPassword() + "'"
                    + " WHERE user = '" + x.getUsername() + "'";
            //System.out.println("REQUETE "+req);
            stm = cnx.createStatement();
            int n = stm.executeUpdate(req);
            if (n > 0) {
                stm.close();
                return true;
            }
        } catch (SQLException exp) {
        } finally {
            if (stm != null) {
                try {
                    stm.close();
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
        return false;
    }

    @Override
    public List<User> findAll() {
        // TODO Auto-generated method stub
        List<User> liste = new LinkedList<User>();
        try {
            Statement stm = cnx.createStatement();
            ResultSet r = stm.executeQuery("SELECT * FROM users");
            while (r.next()) {
                User c = new User(r.getString("user"),
                        r.getString("password"));
                liste.add(c);
            }
            r.close();
            stm.close();
        } catch (SQLException exp) {
        }
        return liste;
    }
}
