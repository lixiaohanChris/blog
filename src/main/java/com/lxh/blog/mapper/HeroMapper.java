package com.lxh.blog.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
 
import com.lxh.blog.pojo.Hero;
  
@Mapper
public interface HeroMapper {
    public int add(Hero hero);
     
    public void delete(int id);
         
    public Hero get(int id);
       
    public int update(Hero hero); 
         
    public List<Hero> list();
}