package com.instagram.demo.dao;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.instagram.demo.model.student;

@Repository
public interface StudentRepositoty extends JpaRepository<student,Integer>{

	public default List<student> sortAppModel(String field){
		return findAll(Sort.by(Direction.ASC,field));
	}
	public List<student>findByNameStartingWith(String prefix);
	public List<student>findByNameEndingWith(String suffix);
	public List<student>findByDepartment(String dept);
	public List<student>findByEmail(String email);
	
	@Modifying
	@Query(value="select * from student ",nativeQuery=true)
	public List<student> GetAll();
    @Modifying
	@Query("delete from student i where i.username=?1")
	public int DeleteItemByUsername(String username);
    @Modifying

	@Query("update student e set e.username=?1 where e.regno=?2")

	public int UpdateItemById(String username,int regno);
	
	//positional parameter
	@Query("select s from student s where s.department=?1 and s.name=?2" )
	public List<student> getStudentsByDepartment(String dept,String name);
	
	
	
	student  findByUsername(String username);
}
