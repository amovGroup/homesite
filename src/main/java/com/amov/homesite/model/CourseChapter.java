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

    private static final long serialVersionUID = 1547897897722L;


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

    /**
    * 学习条目
    * isNullAble:1
    */
    private String learnItem;

    /**
    * 章节编号
    * isNullAble:1
    */
    private Integer number;

    /**
    * 章节子标题
    * isNullAble:1
    */
    private String subtitle;


    public void setCourseChapterId(Integer courseChapterId){this.courseChapterId = courseChapterId;}

    public Integer getCourseChapterId(){return this.courseChapterId;}

    public void setCourseId(Integer courseId){this.courseId = courseId;}

    public Integer getCourseId(){return this.courseId;}

    public void setTitle(String title){this.title = title;}

    public String getTitle(){return this.title;}

    public void setLearnItem(String learnItem){this.learnItem = learnItem;}

    public String getLearnItem(){return this.learnItem;}

    public void setNumber(Integer number){this.number = number;}

    public Integer getNumber(){return this.number;}

    public void setSubtitle(String subtitle){this.subtitle = subtitle;}

    public String getSubtitle(){return this.subtitle;}
    @Override
    public String toString() {
        return "CourseChapter{" +
                "courseChapterId='" + courseChapterId + '\'' +
                "courseId='" + courseId + '\'' +
                "title='" + title + '\'' +
                "learnItem='" + learnItem + '\'' +
                "number='" + number + '\'' +
                "subtitle='" + subtitle + '\'' +
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
        private List<String> learnItemList;

        public List<String> getLearnItemList(){return this.learnItemList;}


        private List<String> fuzzyLearnItem;

        public List<String> getFuzzyLearnItem(){return this.fuzzyLearnItem;}

        private List<String> rightFuzzyLearnItem;

        public List<String> getRightFuzzyLearnItem(){return this.rightFuzzyLearnItem;}
        private List<Integer> numberList;

        public List<Integer> getNumberList(){return this.numberList;}

        private Integer numberSt;

        private Integer numberEd;

        public Integer getNumberSt(){return this.numberSt;}

        public Integer getNumberEd(){return this.numberEd;}

        private List<String> subtitleList;

        public List<String> getSubtitleList(){return this.subtitleList;}


        private List<String> fuzzySubtitle;

        public List<String> getFuzzySubtitle(){return this.fuzzySubtitle;}

        private List<String> rightFuzzySubtitle;

        public List<String> getRightFuzzySubtitle(){return this.rightFuzzySubtitle;}
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

        public QueryBuilder fuzzyLearnItem (List<String> fuzzyLearnItem){
            this.fuzzyLearnItem = fuzzyLearnItem;
            return this;
        }

        public QueryBuilder fuzzyLearnItem (String ... fuzzyLearnItem){
            this.fuzzyLearnItem = solveNullList(fuzzyLearnItem);
            return this;
        }

        public QueryBuilder rightFuzzyLearnItem (List<String> rightFuzzyLearnItem){
            this.rightFuzzyLearnItem = rightFuzzyLearnItem;
            return this;
        }

        public QueryBuilder rightFuzzyLearnItem (String ... rightFuzzyLearnItem){
            this.rightFuzzyLearnItem = solveNullList(rightFuzzyLearnItem);
            return this;
        }

        public QueryBuilder learnItem(String learnItem){
            setLearnItem(learnItem);
            return this;
        }

        public QueryBuilder learnItemList(String ... learnItem){
            this.learnItemList = solveNullList(learnItem);
            return this;
        }

        public QueryBuilder learnItemList(List<String> learnItem){
            this.learnItemList = learnItem;
            return this;
        }

        public QueryBuilder fetchLearnItem(){
            setFetchFields("fetchFields","learnItem");
            return this;
        }

        public QueryBuilder excludeLearnItem(){
            setFetchFields("excludeFields","learnItem");
            return this;
        }

        public QueryBuilder numberBetWeen(Integer numberSt,Integer numberEd){
            this.numberSt = numberSt;
            this.numberEd = numberEd;
            return this;
        }

        public QueryBuilder numberGreaterEqThan(Integer numberSt){
            this.numberSt = numberSt;
            return this;
        }
        public QueryBuilder numberLessEqThan(Integer numberEd){
            this.numberEd = numberEd;
            return this;
        }


        public QueryBuilder number(Integer number){
            setNumber(number);
            return this;
        }

        public QueryBuilder numberList(Integer ... number){
            this.numberList = solveNullList(number);
            return this;
        }

        public QueryBuilder numberList(List<Integer> number){
            this.numberList = number;
            return this;
        }

        public QueryBuilder fetchNumber(){
            setFetchFields("fetchFields","number");
            return this;
        }

        public QueryBuilder excludeNumber(){
            setFetchFields("excludeFields","number");
            return this;
        }

        public QueryBuilder fuzzySubtitle (List<String> fuzzySubtitle){
            this.fuzzySubtitle = fuzzySubtitle;
            return this;
        }

        public QueryBuilder fuzzySubtitle (String ... fuzzySubtitle){
            this.fuzzySubtitle = solveNullList(fuzzySubtitle);
            return this;
        }

        public QueryBuilder rightFuzzySubtitle (List<String> rightFuzzySubtitle){
            this.rightFuzzySubtitle = rightFuzzySubtitle;
            return this;
        }

        public QueryBuilder rightFuzzySubtitle (String ... rightFuzzySubtitle){
            this.rightFuzzySubtitle = solveNullList(rightFuzzySubtitle);
            return this;
        }

        public QueryBuilder subtitle(String subtitle){
            setSubtitle(subtitle);
            return this;
        }

        public QueryBuilder subtitleList(String ... subtitle){
            this.subtitleList = solveNullList(subtitle);
            return this;
        }

        public QueryBuilder subtitleList(List<String> subtitle){
            this.subtitleList = subtitle;
            return this;
        }

        public QueryBuilder fetchSubtitle(){
            setFetchFields("fetchFields","subtitle");
            return this;
        }

        public QueryBuilder excludeSubtitle(){
            setFetchFields("excludeFields","subtitle");
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
        private List<String> learnItemList;

        public List<String> getLearnItemList(){return this.learnItemList;}


        private List<String> fuzzyLearnItem;

        public List<String> getFuzzyLearnItem(){return this.fuzzyLearnItem;}

        private List<String> rightFuzzyLearnItem;

        public List<String> getRightFuzzyLearnItem(){return this.rightFuzzyLearnItem;}
        private List<Integer> numberList;

        public List<Integer> getNumberList(){return this.numberList;}

        private Integer numberSt;

        private Integer numberEd;

        public Integer getNumberSt(){return this.numberSt;}

        public Integer getNumberEd(){return this.numberEd;}

        private List<String> subtitleList;

        public List<String> getSubtitleList(){return this.subtitleList;}


        private List<String> fuzzySubtitle;

        public List<String> getFuzzySubtitle(){return this.fuzzySubtitle;}

        private List<String> rightFuzzySubtitle;

        public List<String> getRightFuzzySubtitle(){return this.rightFuzzySubtitle;}

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

        public ConditionBuilder fuzzyLearnItem (List<String> fuzzyLearnItem){
            this.fuzzyLearnItem = fuzzyLearnItem;
            return this;
        }

        public ConditionBuilder fuzzyLearnItem (String ... fuzzyLearnItem){
            this.fuzzyLearnItem = solveNullList(fuzzyLearnItem);
            return this;
        }

        public ConditionBuilder rightFuzzyLearnItem (List<String> rightFuzzyLearnItem){
            this.rightFuzzyLearnItem = rightFuzzyLearnItem;
            return this;
        }

        public ConditionBuilder rightFuzzyLearnItem (String ... rightFuzzyLearnItem){
            this.rightFuzzyLearnItem = solveNullList(rightFuzzyLearnItem);
            return this;
        }

        public ConditionBuilder learnItemList(String ... learnItem){
            this.learnItemList = solveNullList(learnItem);
            return this;
        }

        public ConditionBuilder learnItemList(List<String> learnItem){
            this.learnItemList = learnItem;
            return this;
        }

        public ConditionBuilder numberBetWeen(Integer numberSt,Integer numberEd){
            this.numberSt = numberSt;
            this.numberEd = numberEd;
            return this;
        }

        public ConditionBuilder numberGreaterEqThan(Integer numberSt){
            this.numberSt = numberSt;
            return this;
        }
        public ConditionBuilder numberLessEqThan(Integer numberEd){
            this.numberEd = numberEd;
            return this;
        }


        public ConditionBuilder numberList(Integer ... number){
            this.numberList = solveNullList(number);
            return this;
        }

        public ConditionBuilder numberList(List<Integer> number){
            this.numberList = number;
            return this;
        }

        public ConditionBuilder fuzzySubtitle (List<String> fuzzySubtitle){
            this.fuzzySubtitle = fuzzySubtitle;
            return this;
        }

        public ConditionBuilder fuzzySubtitle (String ... fuzzySubtitle){
            this.fuzzySubtitle = solveNullList(fuzzySubtitle);
            return this;
        }

        public ConditionBuilder rightFuzzySubtitle (List<String> rightFuzzySubtitle){
            this.rightFuzzySubtitle = rightFuzzySubtitle;
            return this;
        }

        public ConditionBuilder rightFuzzySubtitle (String ... rightFuzzySubtitle){
            this.rightFuzzySubtitle = solveNullList(rightFuzzySubtitle);
            return this;
        }

        public ConditionBuilder subtitleList(String ... subtitle){
            this.subtitleList = solveNullList(subtitle);
            return this;
        }

        public ConditionBuilder subtitleList(List<String> subtitle){
            this.subtitleList = subtitle;
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
        public Builder learnItem(String learnItem){
            this.obj.setLearnItem(learnItem);
            return this;
        }
        public Builder number(Integer number){
            this.obj.setNumber(number);
            return this;
        }
        public Builder subtitle(String subtitle){
            this.obj.setSubtitle(subtitle);
            return this;
        }
        public CourseChapter build(){return obj;}
    }

}
