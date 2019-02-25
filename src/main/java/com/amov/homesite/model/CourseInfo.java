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
public class CourseInfo implements Serializable {

    private static final long serialVersionUID = 1547563777582L;


    /**
    * 主键
    * 课程详情主键
    * isNullAble:0
    */
    private Integer courseInfoId;

    /**
    * 课程ID，作为外键，一对一
    * isNullAble:0
    */
    private Integer courseId;

    /**
    * 课程链接
    * isNullAble:1
    */
    private String courseUrl;

    /**
    * 课程简介
    * isNullAble:1
    */
    private String content;


    public void setCourseInfoId(Integer courseInfoId){this.courseInfoId = courseInfoId;}

    public Integer getCourseInfoId(){return this.courseInfoId;}

    public void setCourseId(Integer courseId){this.courseId = courseId;}

    public Integer getCourseId(){return this.courseId;}

    public void setCourseUrl(String courseUrl){this.courseUrl = courseUrl;}

    public String getCourseUrl(){return this.courseUrl;}

    public void setContent(String content){this.content = content;}

    public String getContent(){return this.content;}
    @Override
    public String toString() {
        return "CourseInfo{" +
                "courseInfoId='" + courseInfoId + '\'' +
                "courseId='" + courseId + '\'' +
                "courseUrl='" + courseUrl + '\'' +
                "content='" + content + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private CourseInfo set;

        private ConditionBuilder where;

        public UpdateBuilder set(CourseInfo set){
            this.set = set;
            return this;
        }

        public CourseInfo getSet(){
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

    public static class QueryBuilder extends CourseInfo{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> courseInfoIdList;

        public List<Integer> getCourseInfoIdList(){return this.courseInfoIdList;}

        private Integer courseInfoIdSt;

        private Integer courseInfoIdEd;

        public Integer getCourseInfoIdSt(){return this.courseInfoIdSt;}

        public Integer getCourseInfoIdEd(){return this.courseInfoIdEd;}

        private List<Integer> courseIdList;

        public List<Integer> getCourseIdList(){return this.courseIdList;}

        private Integer courseIdSt;

        private Integer courseIdEd;

        public Integer getCourseIdSt(){return this.courseIdSt;}

        public Integer getCourseIdEd(){return this.courseIdEd;}

        private List<String> courseUrlList;

        public List<String> getCourseUrlList(){return this.courseUrlList;}


        private List<String> fuzzyCourseUrl;

        public List<String> getFuzzyCourseUrl(){return this.fuzzyCourseUrl;}

        private List<String> rightFuzzyCourseUrl;

        public List<String> getRightFuzzyCourseUrl(){return this.rightFuzzyCourseUrl;}
        private List<String> contentList;

        public List<String> getContentList(){return this.contentList;}


        private List<String> fuzzyContent;

        public List<String> getFuzzyContent(){return this.fuzzyContent;}

        private List<String> rightFuzzyContent;

        public List<String> getRightFuzzyContent(){return this.rightFuzzyContent;}
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder courseInfoIdBetWeen(Integer courseInfoIdSt,Integer courseInfoIdEd){
            this.courseInfoIdSt = courseInfoIdSt;
            this.courseInfoIdEd = courseInfoIdEd;
            return this;
        }

        public QueryBuilder courseInfoIdGreaterEqThan(Integer courseInfoIdSt){
            this.courseInfoIdSt = courseInfoIdSt;
            return this;
        }
        public QueryBuilder courseInfoIdLessEqThan(Integer courseInfoIdEd){
            this.courseInfoIdEd = courseInfoIdEd;
            return this;
        }


        public QueryBuilder courseInfoId(Integer courseInfoId){
            setCourseInfoId(courseInfoId);
            return this;
        }

        public QueryBuilder courseInfoIdList(Integer ... courseInfoId){
            this.courseInfoIdList = solveNullList(courseInfoId);
            return this;
        }

        public QueryBuilder courseInfoIdList(List<Integer> courseInfoId){
            this.courseInfoIdList = courseInfoId;
            return this;
        }

        public QueryBuilder fetchCourseInfoId(){
            setFetchFields("fetchFields","courseInfoId");
            return this;
        }

        public QueryBuilder excludeCourseInfoId(){
            setFetchFields("excludeFields","courseInfoId");
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

        public QueryBuilder fuzzyCourseUrl (List<String> fuzzyCourseUrl){
            this.fuzzyCourseUrl = fuzzyCourseUrl;
            return this;
        }

        public QueryBuilder fuzzyCourseUrl (String ... fuzzyCourseUrl){
            this.fuzzyCourseUrl = solveNullList(fuzzyCourseUrl);
            return this;
        }

        public QueryBuilder rightFuzzyCourseUrl (List<String> rightFuzzyCourseUrl){
            this.rightFuzzyCourseUrl = rightFuzzyCourseUrl;
            return this;
        }

        public QueryBuilder rightFuzzyCourseUrl (String ... rightFuzzyCourseUrl){
            this.rightFuzzyCourseUrl = solveNullList(rightFuzzyCourseUrl);
            return this;
        }

        public QueryBuilder courseUrl(String courseUrl){
            setCourseUrl(courseUrl);
            return this;
        }

        public QueryBuilder courseUrlList(String ... courseUrl){
            this.courseUrlList = solveNullList(courseUrl);
            return this;
        }

        public QueryBuilder courseUrlList(List<String> courseUrl){
            this.courseUrlList = courseUrl;
            return this;
        }

        public QueryBuilder fetchCourseUrl(){
            setFetchFields("fetchFields","courseUrl");
            return this;
        }

        public QueryBuilder excludeCourseUrl(){
            setFetchFields("excludeFields","courseUrl");
            return this;
        }

        public QueryBuilder fuzzyContent (List<String> fuzzyContent){
            this.fuzzyContent = fuzzyContent;
            return this;
        }

        public QueryBuilder fuzzyContent (String ... fuzzyContent){
            this.fuzzyContent = solveNullList(fuzzyContent);
            return this;
        }

        public QueryBuilder rightFuzzyContent (List<String> rightFuzzyContent){
            this.rightFuzzyContent = rightFuzzyContent;
            return this;
        }

        public QueryBuilder rightFuzzyContent (String ... rightFuzzyContent){
            this.rightFuzzyContent = solveNullList(rightFuzzyContent);
            return this;
        }

        public QueryBuilder content(String content){
            setContent(content);
            return this;
        }

        public QueryBuilder contentList(String ... content){
            this.contentList = solveNullList(content);
            return this;
        }

        public QueryBuilder contentList(List<String> content){
            this.contentList = content;
            return this;
        }

        public QueryBuilder fetchContent(){
            setFetchFields("fetchFields","content");
            return this;
        }

        public QueryBuilder excludeContent(){
            setFetchFields("excludeFields","content");
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

        public CourseInfo build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> courseInfoIdList;

        public List<Integer> getCourseInfoIdList(){return this.courseInfoIdList;}

        private Integer courseInfoIdSt;

        private Integer courseInfoIdEd;

        public Integer getCourseInfoIdSt(){return this.courseInfoIdSt;}

        public Integer getCourseInfoIdEd(){return this.courseInfoIdEd;}

        private List<Integer> courseIdList;

        public List<Integer> getCourseIdList(){return this.courseIdList;}

        private Integer courseIdSt;

        private Integer courseIdEd;

        public Integer getCourseIdSt(){return this.courseIdSt;}

        public Integer getCourseIdEd(){return this.courseIdEd;}

        private List<String> courseUrlList;

        public List<String> getCourseUrlList(){return this.courseUrlList;}


        private List<String> fuzzyCourseUrl;

        public List<String> getFuzzyCourseUrl(){return this.fuzzyCourseUrl;}

        private List<String> rightFuzzyCourseUrl;

        public List<String> getRightFuzzyCourseUrl(){return this.rightFuzzyCourseUrl;}
        private List<String> contentList;

        public List<String> getContentList(){return this.contentList;}


        private List<String> fuzzyContent;

        public List<String> getFuzzyContent(){return this.fuzzyContent;}

        private List<String> rightFuzzyContent;

        public List<String> getRightFuzzyContent(){return this.rightFuzzyContent;}

        public ConditionBuilder courseInfoIdBetWeen(Integer courseInfoIdSt,Integer courseInfoIdEd){
            this.courseInfoIdSt = courseInfoIdSt;
            this.courseInfoIdEd = courseInfoIdEd;
            return this;
        }

        public ConditionBuilder courseInfoIdGreaterEqThan(Integer courseInfoIdSt){
            this.courseInfoIdSt = courseInfoIdSt;
            return this;
        }
        public ConditionBuilder courseInfoIdLessEqThan(Integer courseInfoIdEd){
            this.courseInfoIdEd = courseInfoIdEd;
            return this;
        }


        public ConditionBuilder courseInfoIdList(Integer ... courseInfoId){
            this.courseInfoIdList = solveNullList(courseInfoId);
            return this;
        }

        public ConditionBuilder courseInfoIdList(List<Integer> courseInfoId){
            this.courseInfoIdList = courseInfoId;
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

        public ConditionBuilder fuzzyCourseUrl (List<String> fuzzyCourseUrl){
            this.fuzzyCourseUrl = fuzzyCourseUrl;
            return this;
        }

        public ConditionBuilder fuzzyCourseUrl (String ... fuzzyCourseUrl){
            this.fuzzyCourseUrl = solveNullList(fuzzyCourseUrl);
            return this;
        }

        public ConditionBuilder rightFuzzyCourseUrl (List<String> rightFuzzyCourseUrl){
            this.rightFuzzyCourseUrl = rightFuzzyCourseUrl;
            return this;
        }

        public ConditionBuilder rightFuzzyCourseUrl (String ... rightFuzzyCourseUrl){
            this.rightFuzzyCourseUrl = solveNullList(rightFuzzyCourseUrl);
            return this;
        }

        public ConditionBuilder courseUrlList(String ... courseUrl){
            this.courseUrlList = solveNullList(courseUrl);
            return this;
        }

        public ConditionBuilder courseUrlList(List<String> courseUrl){
            this.courseUrlList = courseUrl;
            return this;
        }

        public ConditionBuilder fuzzyContent (List<String> fuzzyContent){
            this.fuzzyContent = fuzzyContent;
            return this;
        }

        public ConditionBuilder fuzzyContent (String ... fuzzyContent){
            this.fuzzyContent = solveNullList(fuzzyContent);
            return this;
        }

        public ConditionBuilder rightFuzzyContent (List<String> rightFuzzyContent){
            this.rightFuzzyContent = rightFuzzyContent;
            return this;
        }

        public ConditionBuilder rightFuzzyContent (String ... rightFuzzyContent){
            this.rightFuzzyContent = solveNullList(rightFuzzyContent);
            return this;
        }

        public ConditionBuilder contentList(String ... content){
            this.contentList = solveNullList(content);
            return this;
        }

        public ConditionBuilder contentList(List<String> content){
            this.contentList = content;
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

        private CourseInfo obj;

        public Builder(){
            this.obj = new CourseInfo();
        }

        public Builder courseInfoId(Integer courseInfoId){
            this.obj.setCourseInfoId(courseInfoId);
            return this;
        }
        public Builder courseId(Integer courseId){
            this.obj.setCourseId(courseId);
            return this;
        }
        public Builder courseUrl(String courseUrl){
            this.obj.setCourseUrl(courseUrl);
            return this;
        }
        public Builder content(String content){
            this.obj.setContent(content);
            return this;
        }
        public CourseInfo build(){return obj;}
    }

}
