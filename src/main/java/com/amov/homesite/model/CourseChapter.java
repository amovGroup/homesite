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
public class CourseChapter implements Serializable {

    private static final long serialVersionUID = 1544694150806L;


    /**
    * 主键
    * 课程章节主键
    * isNullAble:0
    */
    private Integer courseChapterId;

    /**
    * 课程章节ID，作为外键，一对多
    * isNullAble:0
    */
    private Integer courseId;

    /**
    * 章节标题，第一章，第二章....
    * isNullAble:1
    */
    private String title;


    public void setCourseChapterId(Integer courseChapterId){this.courseChapterId = courseChapterId;}

    public Integer getCourseChapterId(){return this.courseChapterId;}

    public void setCourseId(Integer courseId){this.courseId = courseId;}

    public Integer getCourseId(){return this.courseId;}

    public void setTitle(String title){this.title = title;}

    public String getTitle(){return this.title;}
    @Override
    public String toString() {
        return "CourseChapter{" +
                "courseChapterId='" + courseChapterId + '\'' +
                "courseId='" + courseId + '\'' +
                "title='" + title + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private CourseChapter set;

        private ConditionBuilder where;

        public UpdateBuilder set(CourseChapter set){
            this.set = set;
            return this;
        }

        public CourseChapter getSet(){
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

    public static class QueryBuilder extends CourseChapter{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> courseChapterIdList;

        public List<Integer> getCourseChapterIdList(){return this.courseChapterIdList;}

        private Integer courseChapterIdSt;

        private Integer courseChapterIdEd;

        public Integer getCourseChapterIdSt(){return this.courseChapterIdSt;}

        public Integer getCourseChapterIdEd(){return this.courseChapterIdEd;}

        private List<Integer> courseIdList;

        public List<Integer> getCourseIdList(){return this.courseIdList;}

        private Integer courseIdSt;

        private Integer courseIdEd;

        public Integer getCourseIdSt(){return this.courseIdSt;}

        public Integer getCourseIdEd(){return this.courseIdEd;}

        private List<String> titleList;

        public List<String> getTitleList(){return this.titleList;}


        private List<String> fuzzyTitle;

        public List<String> getFuzzyTitle(){return this.fuzzyTitle;}

        private List<String> rightFuzzyTitle;

        public List<String> getRightFuzzyTitle(){return this.rightFuzzyTitle;}
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder courseChapterIdBetWeen(Integer courseChapterIdSt,Integer courseChapterIdEd){
            this.courseChapterIdSt = courseChapterIdSt;
            this.courseChapterIdEd = courseChapterIdEd;
            return this;
        }

        public QueryBuilder courseChapterIdGreaterEqThan(Integer courseChapterIdSt){
            this.courseChapterIdSt = courseChapterIdSt;
            return this;
        }
        public QueryBuilder courseChapterIdLessEqThan(Integer courseChapterIdEd){
            this.courseChapterIdEd = courseChapterIdEd;
            return this;
        }


        public QueryBuilder courseChapterId(Integer courseChapterId){
            setCourseChapterId(courseChapterId);
            return this;
        }

        public QueryBuilder courseChapterIdList(Integer ... courseChapterId){
            this.courseChapterIdList = solveNullList(courseChapterId);
            return this;
        }

        public QueryBuilder courseChapterIdList(List<Integer> courseChapterId){
            this.courseChapterIdList = courseChapterId;
            return this;
        }

        public QueryBuilder fetchCourseChapterId(){
            setFetchFields("fetchFields","courseChapterId");
            return this;
        }

        public QueryBuilder excludeCourseChapterId(){
            setFetchFields("excludeFields","courseChapterId");
            return this;
        }

        public QueryBuilder courseIdBetWeen(Integer courseIdSt,Integer courseIdEd){
            this.courseIdSt = courseIdSt;
            this.courseIdEd = courseIdEd;
            return this;
        }

        public QueryBuilder courseIdGreaterEqThan(Integer courseIdSt){
            this.courseIdSt = courseIdSt;
            return this;
        }
        public QueryBuilder courseIdLessEqThan(Integer courseIdEd){
            this.courseIdEd = courseIdEd;
            return this;
        }


        public QueryBuilder courseId(Integer courseId){
            setCourseId(courseId);
            return this;
        }

        public QueryBuilder courseIdList(Integer ... courseId){
            this.courseIdList = solveNullList(courseId);
            return this;
        }

        public QueryBuilder courseIdList(List<Integer> courseId){
            this.courseIdList = courseId;
            return this;
        }

        public QueryBuilder fetchCourseId(){
            setFetchFields("fetchFields","courseId");
            return this;
        }

        public QueryBuilder excludeCourseId(){
            setFetchFields("excludeFields","courseId");
            return this;
        }

        public QueryBuilder fuzzyTitle (List<String> fuzzyTitle){
            this.fuzzyTitle = fuzzyTitle;
            return this;
        }

        public QueryBuilder fuzzyTitle (String ... fuzzyTitle){
            this.fuzzyTitle = solveNullList(fuzzyTitle);
            return this;
        }

        public QueryBuilder rightFuzzyTitle (List<String> rightFuzzyTitle){
            this.rightFuzzyTitle = rightFuzzyTitle;
            return this;
        }

        public QueryBuilder rightFuzzyTitle (String ... rightFuzzyTitle){
            this.rightFuzzyTitle = solveNullList(rightFuzzyTitle);
            return this;
        }

        public QueryBuilder title(String title){
            setTitle(title);
            return this;
        }

        public QueryBuilder titleList(String ... title){
            this.titleList = solveNullList(title);
            return this;
        }

        public QueryBuilder titleList(List<String> title){
            this.titleList = title;
            return this;
        }

        public QueryBuilder fetchTitle(){
            setFetchFields("fetchFields","title");
            return this;
        }

        public QueryBuilder excludeTitle(){
            setFetchFields("excludeFields","title");
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

        public CourseChapter build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> courseChapterIdList;

        public List<Integer> getCourseChapterIdList(){return this.courseChapterIdList;}

        private Integer courseChapterIdSt;

        private Integer courseChapterIdEd;

        public Integer getCourseChapterIdSt(){return this.courseChapterIdSt;}

        public Integer getCourseChapterIdEd(){return this.courseChapterIdEd;}

        private List<Integer> courseIdList;

        public List<Integer> getCourseIdList(){return this.courseIdList;}

        private Integer courseIdSt;

        private Integer courseIdEd;

        public Integer getCourseIdSt(){return this.courseIdSt;}

        public Integer getCourseIdEd(){return this.courseIdEd;}

        private List<String> titleList;

        public List<String> getTitleList(){return this.titleList;}


        private List<String> fuzzyTitle;

        public List<String> getFuzzyTitle(){return this.fuzzyTitle;}

        private List<String> rightFuzzyTitle;

        public List<String> getRightFuzzyTitle(){return this.rightFuzzyTitle;}

        public ConditionBuilder courseChapterIdBetWeen(Integer courseChapterIdSt,Integer courseChapterIdEd){
            this.courseChapterIdSt = courseChapterIdSt;
            this.courseChapterIdEd = courseChapterIdEd;
            return this;
        }

        public ConditionBuilder courseChapterIdGreaterEqThan(Integer courseChapterIdSt){
            this.courseChapterIdSt = courseChapterIdSt;
            return this;
        }
        public ConditionBuilder courseChapterIdLessEqThan(Integer courseChapterIdEd){
            this.courseChapterIdEd = courseChapterIdEd;
            return this;
        }


        public ConditionBuilder courseChapterIdList(Integer ... courseChapterId){
            this.courseChapterIdList = solveNullList(courseChapterId);
            return this;
        }

        public ConditionBuilder courseChapterIdList(List<Integer> courseChapterId){
            this.courseChapterIdList = courseChapterId;
            return this;
        }

        public ConditionBuilder courseIdBetWeen(Integer courseIdSt,Integer courseIdEd){
            this.courseIdSt = courseIdSt;
            this.courseIdEd = courseIdEd;
            return this;
        }

        public ConditionBuilder courseIdGreaterEqThan(Integer courseIdSt){
            this.courseIdSt = courseIdSt;
            return this;
        }
        public ConditionBuilder courseIdLessEqThan(Integer courseIdEd){
            this.courseIdEd = courseIdEd;
            return this;
        }


        public ConditionBuilder courseIdList(Integer ... courseId){
            this.courseIdList = solveNullList(courseId);
            return this;
        }

        public ConditionBuilder courseIdList(List<Integer> courseId){
            this.courseIdList = courseId;
            return this;
        }

        public ConditionBuilder fuzzyTitle (List<String> fuzzyTitle){
            this.fuzzyTitle = fuzzyTitle;
            return this;
        }

        public ConditionBuilder fuzzyTitle (String ... fuzzyTitle){
            this.fuzzyTitle = solveNullList(fuzzyTitle);
            return this;
        }

        public ConditionBuilder rightFuzzyTitle (List<String> rightFuzzyTitle){
            this.rightFuzzyTitle = rightFuzzyTitle;
            return this;
        }

        public ConditionBuilder rightFuzzyTitle (String ... rightFuzzyTitle){
            this.rightFuzzyTitle = solveNullList(rightFuzzyTitle);
            return this;
        }

        public ConditionBuilder titleList(String ... title){
            this.titleList = solveNullList(title);
            return this;
        }

        public ConditionBuilder titleList(List<String> title){
            this.titleList = title;
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

        private CourseChapter obj;

        public Builder(){
            this.obj = new CourseChapter();
        }

        public Builder courseChapterId(Integer courseChapterId){
            this.obj.setCourseChapterId(courseChapterId);
            return this;
        }
        public Builder courseId(Integer courseId){
            this.obj.setCourseId(courseId);
            return this;
        }
        public Builder title(String title){
            this.obj.setTitle(title);
            return this;
        }
        public CourseChapter build(){return obj;}
    }

}
