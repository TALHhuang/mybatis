package edu.talh.learning.mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import edu.talh.learning.model.Student;

import java.util.Date;
import java.util.List;
public class Test {
	public static void main(String[] args) {
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		try {
			SqlSessionFactory sessionFactory = builder.build(Resources.getResourceAsReader("mybatis-config.xml"));
			SqlSession session = sessionFactory.openSession();
/*			selectList无参数查询
			List<Student> list = session.selectList("test.selectAll");*/
			
/*		   selectList有单一参数查询
			List<Student> list = session.selectList("test.selectAll",1);*/
			
/*			selectOne返回“唯一”数据，返回结果必须是一条数据或者null，通常用于跟主键查询
			Student s=session.selectOne("test.selectById", 2);*/
			
/*			Student model = session.selectOne("/mybatis/src/main/java/IDao/students.selectById", 2);
			List<Student> lists= session.selectList("/mybatis/src/main/java/IDao/students.selectmodel",model);*/
			
/*			//接口映射
			Student stu = session.selectOne("/mybatis/src/main/java/IDao/students.selectbyid",1);*/
			 System.out.println();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
