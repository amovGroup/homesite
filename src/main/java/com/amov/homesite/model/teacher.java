package com.amov.homesite.model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author toy
*/
public class teacher implements Serializable {

    private static final long serialVersionUID = 1544694299042L;


    /**
    * 主键
    * 教师id
    * isNullAble:0
    */
    private Integer teacherId;

    /**
    * 姓名
    * isNullAble:0
    */
    private String name;

    /**
    * 简介
    * isNullAble:1
    */
    private String intro;


    public void setTeacherId(Integer teacherId){this.teacherId = teacherId;}

    public Integer getTeacherId(){return this.teacherId;}

    public void setName(String name){this.name = name;}

    public String getName(){return this.name;}

    public void setIntro(String intro){this.intro = intro;}

    public String getIntro(){return this.intro;}
    @Override
    public String toString() {
        return "teacher{" +
                "teacherId='" + teacherId + '\'' +
                "name='" + name + '\'' +
                "intro='" + intro + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private teacher set;

        private ConditionBuilder where;

        public UpdateBuilder set(teacher set){
            this.set = set;
            return this;
        }

        public teacher getSet(){
            return this.set;
        }

        public UpdateBuilder where(ConditionBuilder where){
            this.where = where;
            return this;
        }

        public ConditionBuilder getWhere(){
            return this.where;
        }

        public UpdateBuilder build(){
            return this;
        }
    }

    public static class QueryBuilder extends teacher{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> teacherIdList;

        public List<Integer> getTeacherIdList(){return this.teacherIdList;}

        private Integer teacherIdSt;

        private Integer teacherIdEd;

        public Integer getTeacherIdSt(){return this.teacherIdSt;}

        public Integer getTeacherIdEd(){return this.teacherIdEd;}

        private List<String> nameList;

        public List<String> getNameList(){return this.nameList;}


        private List<String> fuzzyName;

        public List<String> getFuzzyName(){return this.fuzzyName;}

        private List<String> rightFuzzyName;

        public List<String> getRightFuzzyName(){return this.rightFuzzyName;}
        private List<String> introList;

        public List<String> getIntroList(){return this.introList;}


        private List<String> fuzzyIntro;

        public List<String> getFuzzyIntro(){return this.fuzzyIntro;}

        private List<String> rightFuzzyIntro;

        public List<String> getRightFuzzyIntro(){return this.rightFuzzyIntro;}
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder teacherIdBetWeen(Integer teacherIdSt,Integer teacherIdEd){
            this.teacherIdSt = teacherIdSt;
            this.teacherIdEd = teacherIdEd;
            return this;
        }

        public QueryBuilder teacherIdGreaterEqThan(Integer teacherIdSt){
            this.teacherIdSt = teacherIdSt;
            return this;
        }
        public QueryBuilder teacherIdLessEqThan(Integer teacherIdEd){
            this.teacherIdEd = teacherIdEd;
            return this;
        }


        public QueryBuilder teacherId(Integer teacherId){
            setTeacherId(teacherId);
            return this;
        }

        public QueryBuilder teacherIdList(Integer ... teacherId){
            this.teacherIdList = solveNullList(teacherId);
            return this;
        }

        public QueryBuilder teacherIdList(List<Integer> teacherId){
            this.teacherIdList = teacherId;
            return this;
        }

        public QueryBuilder fetchTeacherId(){
            setFetchFields("fetchFields","teacherId");
            return this;
        }

        public QueryBuilder excludeTeacherId(){
            setFetchFields("excludeFields","teacherId");
            return this;
        }

        public QueryBuilder fuzzyName (List<String> fuzzyName){
            this.fuzzyName = fuzzyName;
            return this;
        }

        public QueryBuilder fuzzyName (String ... fuzzyName){
            this.fuzzyName = solveNullList(fuzzyName);
            return this;
        }

        public QueryBuilder rightFuzzyName (List<String> rightFuzzyName){
            this.rightFuzzyName = rightFuzzyName;
            return this;
        }

        public QueryBuilder rightFuzzyName (String ... rightFuzzyName){
            this.rightFuzzyName = solveNullList(rightFuzzyName);
            return this;
        }

        public QueryBuilder name(String name){
            setName(name);
            return this;
        }

        public QueryBuilder nameList(String ... name){
            this.nameList = solveNullList(name);
            return this;
        }

        public QueryBuilder nameList(List<String> name){
            this.nameList = name;
            return this;
        }

        public QueryBuilder fetchName(){
            setFetchFields("fetchFields","name");
            return this;
        }

        public QueryBuilder excludeName(){
            setFetchFields("excludeFields","name");
            return this;
        }

        public QueryBuilder fuzzyIntro (List<String> fuzzyIntro){
            this.fuzzyIntro = fuzzyIntro;
            return this;
        }

        public QueryBuilder fuzzyIntro (String ... fuzzyIntro){
            this.fuzzyIntro = solveNullList(fuzzyIntro);
            return this;
        }

        public QueryBuilder rightFuzzyIntro (List<String> rightFuzzyIntro){
            this.rightFuzzyIntro = rightFuzzyIntro;
            return this;
        }

        public QueryBuilder rightFuzzyIntro (String ... rightFuzzyIntro){
            this.rightFuzzyIntro = solveNullList(rightFuzzyIntro);
            return this;
        }

        public QueryBuilder intro(String intro){
            setIntro(intro);
            return this;
        }

        public QueryBuilder introList(String ... intro){
            this.introList = solveNullList(intro);
            return this;
        }

        public QueryBuilder introList(List<String> intro){
            this.introList = intro;
            return this;
        }

        public QueryBuilder fetchIntro(){
            setFetchFields("fetchFields","intro");
            return this;
        }

        public QueryBuilder excludeIntro(){
            setFetchFields("excludeFields","intro");
            return this;
        }
        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public QueryBuilder fetchAll(){
            this.fetchFields.put("AllFields",true);
            return this;
        }

        public QueryBuilder addField(String ... fields){
            List<String> list = new ArrayList<>();
            if (fields != null){
                for (String field : fields){
                    list.add(field);
                }
            }
            this.fetchFields.put("otherFields",list);
            return this;
        }
        @SuppressWarnings("unchecked")
        private void setFetchFields(String key,String val){
            Map<String,Boolean> fields= (Map<String, Boolean>) this.fetchFields.get(key);
            if (fields == null){
                fields = new HashMap<>();
            }
            fields.put(val,true);
            this.fetchFields.put(key,fields);
        }

        public teacher build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> teacherIdList;

        public List<Integer> getTeacherIdList(){return this.teacherIdList;}

        private Integer teacherIdSt;

        private Integer teacherIdEd;

        public Integer getTeacherIdSt(){return this.teacherIdSt;}

        public Integer getTeacherIdEd(){return this.teacherIdEd;}

        private List<String> nameList;

        public List<String> getNameList(){return this.nameList;}


        private List<String> fuzzyName;

        public List<String> getFuzzyName(){return this.fuzzyName;}

        private List<String> rightFuzzyName;

        public List<String> getRightFuzzyName(){return this.rightFuzzyName;}
        private List<String> introList;

        public List<String> getIntroList(){return this.introList;}


        private List<String> fuzzyIntro;

        public List<String> getFuzzyIntro(){return this.fuzzyIntro;}

        private List<String> rightFuzzyIntro;

        public List<String> getRightFuzzyIntro(){return this.rightFuzzyIntro;}

        public ConditionBuilder teacherIdBetWeen(Integer teacherIdSt,Integer teacherIdEd){
            this.teacherIdSt = teacherIdSt;
            this.teacherIdEd = teacherIdEd;
            return this;
        }

        public ConditionBuilder teacherIdGreaterEqThan(Integer teacherIdSt){
            this.teacherIdSt = teacherIdSt;
            return this;
        }
        public ConditionBuilder teacherIdLessEqThan(Integer teacherIdEd){
            this.teacherIdEd = teacherIdEd;
            return this;
        }


        public ConditionBuilder teacherIdList(Integer ... teacherId){
            this.teacherIdList = solveNullList(teacherId);
            return this;
        }

        public ConditionBuilder teacherIdList(List<Integer> teacherId){
            this.teacherIdList = teacherId;
            return this;
        }

        public ConditionBuilder fuzzyName (List<String> fuzzyName){
            this.fuzzyName = fuzzyName;
            return this;
        }

        public ConditionBuilder fuzzyName (String ... fuzzyName){
            this.fuzzyName = solveNullList(fuzzyName);
            return this;
        }

        public ConditionBuilder rightFuzzyName (List<String> rightFuzzyName){
            this.rightFuzzyName = rightFuzzyName;
            return this;
        }

        public ConditionBuilder rightFuzzyName (String ... rightFuzzyName){
            this.rightFuzzyName = solveNullList(rightFuzzyName);
            return this;
        }

        public ConditionBuilder nameList(String ... name){
            this.nameList = solveNullList(name);
            return this;
        }

        public ConditionBuilder nameList(List<String> name){
            this.nameList = name;
            return this;
        }

        public ConditionBuilder fuzzyIntro (List<String> fuzzyIntro){
            this.fuzzyIntro = fuzzyIntro;
            return this;
        }

        public ConditionBuilder fuzzyIntro (String ... fuzzyIntro){
            this.fuzzyIntro = solveNullList(fuzzyIntro);
            return this;
        }

        public ConditionBuilder rightFuzzyIntro (List<String> rightFuzzyIntro){
            this.rightFuzzyIntro = rightFuzzyIntro;
            return this;
        }

        public ConditionBuilder rightFuzzyIntro (String ... rightFuzzyIntro){
            this.rightFuzzyIntro = solveNullList(rightFuzzyIntro);
            return this;
        }

        public ConditionBuilder introList(String ... intro){
            this.introList = solveNullList(intro);
            return this;
        }

        public ConditionBuilder introList(List<String> intro){
            this.introList = intro;
            return this;
        }

        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public ConditionBuilder build(){return this;}
    }

    public static class Builder {

        private teacher obj;

        public Builder(){
            this.obj = new teacher();
        }

        public Builder teacherId(Integer teacherId){
            this.obj.setTeacherId(teacherId);
            return this;
        }
        public Builder name(String name){
            this.obj.setName(name);
            return this;
        }
        public Builder intro(String intro){
            this.obj.setIntro(intro);
            return this;
        }
        public teacher build(){return obj;}
    }

}
