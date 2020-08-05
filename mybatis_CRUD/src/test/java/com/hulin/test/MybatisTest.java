package com.hulin.test;

import com.hulin.dao.IUserDao;
import com.hulin.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.annotation.Resources;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @program: mybatis_environment
 * @description: mybatis的测试类
 * @author: Su
 * @create: 2020-08-03 18:09
 **/
public class MybatisTest {
    public static void main(String[] args) throws IOException {
        //1.读取配置文件
        InputStream in= Resources.class.getResourceAsStream("SqlMapConfig.xml");
        //2.创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
        SqlSessionFactory factory=builder.build(in);
        //3.使用工厂生产SqlSession对象
        SqlSession sqlSession=factory.openSession();
        //4.使用SqlSession创建Dao接口的代理对象
        IUserDao userDao =sqlSession.getMapper(IUserDao.class);
        //5.使用代理对象执行方法
        List<User> users=userDao.findAll();
        for(User user:users){
            System.out.println(user);
        }
        //6.释放资源
        sqlSession.close();
        in.close();
    }
}
