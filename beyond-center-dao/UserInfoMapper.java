package com.beyond.mapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.beyond.model.UserInfo;

@Component
@SuppressWarnings({ "unchecked", "rawtypes" })
public class UserInfoMapper {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<UserInfo> selectUserInfoList() {
        // TODO Auto-generated method stub
        String sql = "select * from t_user_info ";
        return (List<UserInfo>) jdbcTemplate.query(sql, new BeanPropertyRowMapper(UserInfo.class));
    }

    public void insertUserInfo(UserInfo userInfo) {
        // TODO Auto-generated method stub
        String sql = "insert into t_user_info (name, password, age) values(?, ?, ?)";
        this.jdbcTemplate.update(sql, userInfo.getName(), userInfo.getPassword(), userInfo.getAge());
    }

    public void updateUserInfo(UserInfo userInfo) {
        // TODO Auto-generated method stub
        String sql = "update t_user_info set name=?, password=?, age=? where id=?";
        this.jdbcTemplate.update(sql, userInfo.getName(), userInfo.getPassword(), userInfo.getAge(), userInfo.getId());
    }

    public void deleteUserInfoById(Integer id) {
        // TODO Auto-generated method stub
        String sql = "delete from t_user_info where id=?";
        this.jdbcTemplate.update(sql, id);
    }

    public Map<String, Object> getUserInfoById(Integer id) {
        // TODO Auto-generated method stub
        String sql = "select * from t_user_info where id=?";
        return jdbcTemplate.queryForMap(sql, new Object[] { id });
    }

    public JSONArray getInfo() {
        // TODO Auto-generated method stub
        List list=new ArrayList();
        UserInfo user1=new UserInfo(1,"Joy","741",22);
        UserInfo user2=new UserInfo(2,"White","963",24);
        list.add(user1);
        list.add(user2);
        JSONArray json=JSONArray.fromObject(list);//将集合放入JSON数组中

        //String jsonStr=json.toString(); 将数据String后，传出字符串也可以
        return json;
    }

}