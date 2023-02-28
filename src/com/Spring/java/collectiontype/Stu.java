package com.Spring.java.collectiontype;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Stu {
    //1.数组类型的属性
    private String[] courses;
    private List<String> list;
    private Map<String, String> maps;
    private Set<String> sets;


    //学生的课程集合
    private List<Course> courseList;
    //对象集合的set方法
    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }


    public void setSets(Set<String> sets) {
        this.sets = sets;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Stu{" +
                "courses=" + Arrays.toString(courses) +
                ", list=" + list +
                ", maps=" + maps +
                ", sets=" + sets +
                ", courseList=" + courseList +
                '}';
    }
}
