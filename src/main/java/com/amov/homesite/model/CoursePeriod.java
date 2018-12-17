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
public class CoursePeriod implements Serializable {

    private static final long serialVersionUID = 1544694187380L;


    /**
    * 主键
    * 课时主键
    * isNullAble:0
    */
    private Integer coursePeriodId;

    /**
    * 课程章节ID，作为外键，一对多
    * isNullAble:0
    */
    private Integer courseChapterId;

    /**
    * 课时标题
    * isNullAble:1
    */
    private String title;

    /**
    * 难度，说明等内容
    * isNullAble:1
    */
    private String content;


    public void setCoursePeriodId(Integer coursePeriodId){this.coursePeriodId = coursePeriodId;}

    public Integer getCoursePeriodId(){return this.coursePeriodId;}

    public void setCourseChapterId(Integer courseChapterId){this.courseChapterId = courseChapterId;}

    public Integer getCourseChapterId(){return this.courseChapterId;}

    public void setTitle(String title){this.title = title;}

    public String getTitle(){return this.title;}

    public void setContent(String content){this.content = content;}

    public String getContent(){return this.content;}
    @Override
    public String toString() {
        return "CoursePeriod{" +
                "coursePeriodId='" + coursePeriodId + '\'' +
                "courseChapterId='" + courseChapterId + '\'' +
                "title='" + title + '\'' +
                "content='" + content + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private CoursePeriod set;

        private ConditionBuilder where;

        public UpdateBuilder set(CoursePeriod set){
            this.set = set;
            return this;
        }

        public CoursePeriod getSet(){
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

    public static class QueryBuilder extends CoursePeriod{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> coursePeriodIdList;

        public List<Integer> getCoursePeriodIdList(){return this.coursePeriodIdList;}

        private Integer coursePeriodIdSt;

        private Integer coursePeriodIdEd;

        public Integer getCoursePeriodIdSt(){return this.coursePeriodIdSt;}

        public Integer getCoursePeriodIdEd(){return this.coursePeriodIdEd;}

        private List<Integer> courseChapterIdList;

        public List<Integer> getCourseChapterIdList(){return this.courseChapterIdList;}

        private Integer courseChapterIdSt;

        private Integer courseChapterIdEd;

        public Integer getCourseChapterIdSt(){return this.courseChapterIdSt;}

        public Integer getCourseChapterIdEd(){return this.courseChapterIdEd;}

        private List<String> titleList;

        public List<String> getTitleList(){return this.titleList;}


        private List<String> fuzzyTitle;

        public List<String> getFuzzyTitle(){return this.fuzzyTitle;}

        private List<String> rightFuzzyTitle;

        public List<String> getRightFuzzyTitle(){return this.rightFuzzyTitle;}
        private List<String> contentList;

        public List<String> getContentList(){return this.contentList;}


        private List<String> fuzzyContent;

        public List<String> getFuzzyContent(){return this.fuzzyContent;}

        private List<String> rightFuzzyContent;

        public List<String> getRightFuzzyContent(){return this.rightFuzzyContent;}
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder coursePeriodIdBetWeen(Integer coursePeriodIdSt,Integer coursePeriodIdEd){
            this.coursePeriodIdSt = coursePeriodIdSt;
            this.coursePeriodIdEd = coursePeriodIdEd;
            return this;
        }

        public QueryBuilder coursePeriodIdGreaterEqThan(Integer coursePeriodIdSt){
            this.coursePeriodIdSt = coursePeriodIdSt;
            return this;
        }
        public QueryBuilder coursePeriodIdLessEqThan(Integer coursePeriodIdEd){
            this.coursePeriodIdEd = coursePeriodIdEd;
            return this;
        }


        public QueryBuilder coursePeriodId(Integer coursePeriodId){
            setCoursePeriodId(coursePeriodId);
            return this;
        }

        public QueryBuilder coursePeriodIdList(Integer ... coursePeriodId){
            this.coursePeriodIdList = solveNullList(coursePeriodId);
            return this;
        }

        public QueryBuilder coursePeriodIdList(List<Integer> coursePeriodId){
            this.coursePeriodIdList = coursePeriodId;
            return this;
        }

        public QueryBuilder fetchCoursePeriodId(){
            setFetchFields("fetchFields","coursePeriodId");
            return this;
        }

        public QueryBuilder excludeCoursePeriodId(){
            setFetchFields("excludeFields","coursePeriodId");
            return this;
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

        public CoursePeriod build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> coursePeriodIdList;

        public List<Integer> getCoursePeriodIdList(){return this.coursePeriodIdList;}

        private Integer coursePeriodIdSt;

        private Integer coursePeriodIdEd;

        public Integer getCoursePeriodIdSt(){return this.coursePeriodIdSt;}

        public Integer getCoursePeriodIdEd(){return this.coursePeriodIdEd;}

        private List<Integer> courseChapterIdList;

        public List<Integer> getCourseChapterIdList(){return this.courseChapterIdList;}

        private Integer courseChapterIdSt;

        private Integer courseChapterIdEd;

        public Integer getCourseChapterIdSt(){return this.courseChapterIdSt;}

        public Integer getCourseChapterIdEd(){return this.courseChapterIdEd;}

        private List<String> titleList;

        public List<String> getTitleList(){return this.titleList;}


        private List<String> fuzzyTitle;

        public List<String> getFuzzyTitle(){return this.fuzzyTitle;}

        private List<String> rightFuzzyTitle;

        public List<String> getRightFuzzyTitle(){return this.rightFuzzyTitle;}
        private List<String> contentList;

        public List<String> getContentList(){return this.contentList;}


        private List<String> fuzzyContent;

        public List<String> getFuzzyContent(){return this.fuzzyContent;}

        private List<String> rightFuzzyContent;

        public List<String> getRightFuzzyContent(){return this.rightFuzzyContent;}

        public ConditionBuilder coursePeriodIdBetWeen(Integer coursePeriodIdSt,Integer coursePeriodIdEd){
            this.coursePeriodIdSt = coursePeriodIdSt;
            this.coursePeriodIdEd = coursePeriodIdEd;
            return this;
        }

        public ConditionBuilder coursePeriodIdGreaterEqThan(Integer coursePeriodIdSt){
            this.coursePeriodIdSt = coursePeriodIdSt;
            return this;
        }
        public ConditionBuilder coursePeriodIdLessEqThan(Integer coursePeriodIdEd){
            this.coursePeriodIdEd = coursePeriodIdEd;
            return this;
        }


        public ConditionBuilder coursePeriodIdList(Integer ... coursePeriodId){
            this.coursePeriodIdList = solveNullList(coursePeriodId);
            return this;
        }

        public ConditionBuilder coursePeriodIdList(List<Integer> coursePeriodId){
            this.coursePeriodIdList = coursePeriodId;
            return this;
        }

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

        private CoursePeriod obj;

        public Builder(){
            this.obj = new CoursePeriod();
        }

        public Builder coursePeriodId(Integer coursePeriodId){
            this.obj.setCoursePeriodId(coursePeriodId);
            return this;
        }
        public Builder courseChapterId(Integer courseChapterId){
            this.obj.setCourseChapterId(courseChapterId);
            return this;
        }
        public Builder title(String title){
            this.obj.setTitle(title);
            return this;
        }
        public Builder content(String content){
            this.obj.setContent(content);
            return this;
        }
        public CoursePeriod build(){return obj;}
    }

}
