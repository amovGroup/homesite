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
public class KnowledgePoint implements Serializable {

    private static final long serialVersionUID = 1544694236029L;


    /**
    * 主键
    * 知识点主键
    * isNullAble:0
    */
    private Integer knowledgePointId;

    /**
    * 课时ID，作为外键
    * isNullAble:0
    */
    private Integer coursePeriodId;

    /**
    * 知识点内容
    * isNullAble:1
    */
    private String content;


    public void setKnowledgePointId(Integer knowledgePointId){this.knowledgePointId = knowledgePointId;}

    public Integer getKnowledgePointId(){return this.knowledgePointId;}

    public void setCoursePeriodId(Integer coursePeriodId){this.coursePeriodId = coursePeriodId;}

    public Integer getCoursePeriodId(){return this.coursePeriodId;}

    public void setContent(String content){this.content = content;}

    public String getContent(){return this.content;}
    @Override
    public String toString() {
        return "KnowledgePoint{" +
                "knowledgePointId='" + knowledgePointId + '\'' +
                "coursePeriodId='" + coursePeriodId + '\'' +
                "content='" + content + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private KnowledgePoint set;

        private ConditionBuilder where;

        public UpdateBuilder set(KnowledgePoint set){
            this.set = set;
            return this;
        }

        public KnowledgePoint getSet(){
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

    public static class QueryBuilder extends KnowledgePoint{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> knowledgePointIdList;

        public List<Integer> getKnowledgePointIdList(){return this.knowledgePointIdList;}

        private Integer knowledgePointIdSt;

        private Integer knowledgePointIdEd;

        public Integer getKnowledgePointIdSt(){return this.knowledgePointIdSt;}

        public Integer getKnowledgePointIdEd(){return this.knowledgePointIdEd;}

        private List<Integer> coursePeriodIdList;

        public List<Integer> getCoursePeriodIdList(){return this.coursePeriodIdList;}

        private Integer coursePeriodIdSt;

        private Integer coursePeriodIdEd;

        public Integer getCoursePeriodIdSt(){return this.coursePeriodIdSt;}

        public Integer getCoursePeriodIdEd(){return this.coursePeriodIdEd;}

        private List<String> contentList;

        public List<String> getContentList(){return this.contentList;}


        private List<String> fuzzyContent;

        public List<String> getFuzzyContent(){return this.fuzzyContent;}

        private List<String> rightFuzzyContent;

        public List<String> getRightFuzzyContent(){return this.rightFuzzyContent;}
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder knowledgePointIdBetWeen(Integer knowledgePointIdSt,Integer knowledgePointIdEd){
            this.knowledgePointIdSt = knowledgePointIdSt;
            this.knowledgePointIdEd = knowledgePointIdEd;
            return this;
        }

        public QueryBuilder knowledgePointIdGreaterEqThan(Integer knowledgePointIdSt){
            this.knowledgePointIdSt = knowledgePointIdSt;
            return this;
        }
        public QueryBuilder knowledgePointIdLessEqThan(Integer knowledgePointIdEd){
            this.knowledgePointIdEd = knowledgePointIdEd;
            return this;
        }


        public QueryBuilder knowledgePointId(Integer knowledgePointId){
            setKnowledgePointId(knowledgePointId);
            return this;
        }

        public QueryBuilder knowledgePointIdList(Integer ... knowledgePointId){
            this.knowledgePointIdList = solveNullList(knowledgePointId);
            return this;
        }

        public QueryBuilder knowledgePointIdList(List<Integer> knowledgePointId){
            this.knowledgePointIdList = knowledgePointId;
            return this;
        }

        public QueryBuilder fetchKnowledgePointId(){
            setFetchFields("fetchFields","knowledgePointId");
            return this;
        }

        public QueryBuilder excludeKnowledgePointId(){
            setFetchFields("excludeFields","knowledgePointId");
            return this;
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

        public KnowledgePoint build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> knowledgePointIdList;

        public List<Integer> getKnowledgePointIdList(){return this.knowledgePointIdList;}

        private Integer knowledgePointIdSt;

        private Integer knowledgePointIdEd;

        public Integer getKnowledgePointIdSt(){return this.knowledgePointIdSt;}

        public Integer getKnowledgePointIdEd(){return this.knowledgePointIdEd;}

        private List<Integer> coursePeriodIdList;

        public List<Integer> getCoursePeriodIdList(){return this.coursePeriodIdList;}

        private Integer coursePeriodIdSt;

        private Integer coursePeriodIdEd;

        public Integer getCoursePeriodIdSt(){return this.coursePeriodIdSt;}

        public Integer getCoursePeriodIdEd(){return this.coursePeriodIdEd;}

        private List<String> contentList;

        public List<String> getContentList(){return this.contentList;}


        private List<String> fuzzyContent;

        public List<String> getFuzzyContent(){return this.fuzzyContent;}

        private List<String> rightFuzzyContent;

        public List<String> getRightFuzzyContent(){return this.rightFuzzyContent;}

        public ConditionBuilder knowledgePointIdBetWeen(Integer knowledgePointIdSt,Integer knowledgePointIdEd){
            this.knowledgePointIdSt = knowledgePointIdSt;
            this.knowledgePointIdEd = knowledgePointIdEd;
            return this;
        }

        public ConditionBuilder knowledgePointIdGreaterEqThan(Integer knowledgePointIdSt){
            this.knowledgePointIdSt = knowledgePointIdSt;
            return this;
        }
        public ConditionBuilder knowledgePointIdLessEqThan(Integer knowledgePointIdEd){
            this.knowledgePointIdEd = knowledgePointIdEd;
            return this;
        }


        public ConditionBuilder knowledgePointIdList(Integer ... knowledgePointId){
            this.knowledgePointIdList = solveNullList(knowledgePointId);
            return this;
        }

        public ConditionBuilder knowledgePointIdList(List<Integer> knowledgePointId){
            this.knowledgePointIdList = knowledgePointId;
            return this;
        }

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

        private KnowledgePoint obj;

        public Builder(){
            this.obj = new KnowledgePoint();
        }

        public Builder knowledgePointId(Integer knowledgePointId){
            this.obj.setKnowledgePointId(knowledgePointId);
            return this;
        }
        public Builder coursePeriodId(Integer coursePeriodId){
            this.obj.setCoursePeriodId(coursePeriodId);
            return this;
        }
        public Builder content(String content){
            this.obj.setContent(content);
            return this;
        }
        public KnowledgePoint build(){return obj;}
    }

}
