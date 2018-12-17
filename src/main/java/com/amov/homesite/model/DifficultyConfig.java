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
public class DifficultyConfig implements Serializable {

    private static final long serialVersionUID = 1544694193823L;


    /**
    * 主键
    * 主键
    * isNullAble:0
    */
    private Integer difficultyConfigId;

    /**
    * 难度程度
    * isNullAble:1
    */
    private String content;


    public void setDifficultyConfigId(Integer difficultyConfigId){this.difficultyConfigId = difficultyConfigId;}

    public Integer getDifficultyConfigId(){return this.difficultyConfigId;}

    public void setContent(String content){this.content = content;}

    public String getContent(){return this.content;}
    @Override
    public String toString() {
        return "DifficultyConfig{" +
                "difficultyConfigId='" + difficultyConfigId + '\'' +
                "content='" + content + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private DifficultyConfig set;

        private ConditionBuilder where;

        public UpdateBuilder set(DifficultyConfig set){
            this.set = set;
            return this;
        }

        public DifficultyConfig getSet(){
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

    public static class QueryBuilder extends DifficultyConfig{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> difficultyConfigIdList;

        public List<Integer> getDifficultyConfigIdList(){return this.difficultyConfigIdList;}

        private Integer difficultyConfigIdSt;

        private Integer difficultyConfigIdEd;

        public Integer getDifficultyConfigIdSt(){return this.difficultyConfigIdSt;}

        public Integer getDifficultyConfigIdEd(){return this.difficultyConfigIdEd;}

        private List<String> contentList;

        public List<String> getContentList(){return this.contentList;}


        private List<String> fuzzyContent;

        public List<String> getFuzzyContent(){return this.fuzzyContent;}

        private List<String> rightFuzzyContent;

        public List<String> getRightFuzzyContent(){return this.rightFuzzyContent;}
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder difficultyConfigIdBetWeen(Integer difficultyConfigIdSt,Integer difficultyConfigIdEd){
            this.difficultyConfigIdSt = difficultyConfigIdSt;
            this.difficultyConfigIdEd = difficultyConfigIdEd;
            return this;
        }

        public QueryBuilder difficultyConfigIdGreaterEqThan(Integer difficultyConfigIdSt){
            this.difficultyConfigIdSt = difficultyConfigIdSt;
            return this;
        }
        public QueryBuilder difficultyConfigIdLessEqThan(Integer difficultyConfigIdEd){
            this.difficultyConfigIdEd = difficultyConfigIdEd;
            return this;
        }


        public QueryBuilder difficultyConfigId(Integer difficultyConfigId){
            setDifficultyConfigId(difficultyConfigId);
            return this;
        }

        public QueryBuilder difficultyConfigIdList(Integer ... difficultyConfigId){
            this.difficultyConfigIdList = solveNullList(difficultyConfigId);
            return this;
        }

        public QueryBuilder difficultyConfigIdList(List<Integer> difficultyConfigId){
            this.difficultyConfigIdList = difficultyConfigId;
            return this;
        }

        public QueryBuilder fetchDifficultyConfigId(){
            setFetchFields("fetchFields","difficultyConfigId");
            return this;
        }

        public QueryBuilder excludeDifficultyConfigId(){
            setFetchFields("excludeFields","difficultyConfigId");
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

        public DifficultyConfig build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> difficultyConfigIdList;

        public List<Integer> getDifficultyConfigIdList(){return this.difficultyConfigIdList;}

        private Integer difficultyConfigIdSt;

        private Integer difficultyConfigIdEd;

        public Integer getDifficultyConfigIdSt(){return this.difficultyConfigIdSt;}

        public Integer getDifficultyConfigIdEd(){return this.difficultyConfigIdEd;}

        private List<String> contentList;

        public List<String> getContentList(){return this.contentList;}


        private List<String> fuzzyContent;

        public List<String> getFuzzyContent(){return this.fuzzyContent;}

        private List<String> rightFuzzyContent;

        public List<String> getRightFuzzyContent(){return this.rightFuzzyContent;}

        public ConditionBuilder difficultyConfigIdBetWeen(Integer difficultyConfigIdSt,Integer difficultyConfigIdEd){
            this.difficultyConfigIdSt = difficultyConfigIdSt;
            this.difficultyConfigIdEd = difficultyConfigIdEd;
            return this;
        }

        public ConditionBuilder difficultyConfigIdGreaterEqThan(Integer difficultyConfigIdSt){
            this.difficultyConfigIdSt = difficultyConfigIdSt;
            return this;
        }
        public ConditionBuilder difficultyConfigIdLessEqThan(Integer difficultyConfigIdEd){
            this.difficultyConfigIdEd = difficultyConfigIdEd;
            return this;
        }


        public ConditionBuilder difficultyConfigIdList(Integer ... difficultyConfigId){
            this.difficultyConfigIdList = solveNullList(difficultyConfigId);
            return this;
        }

        public ConditionBuilder difficultyConfigIdList(List<Integer> difficultyConfigId){
            this.difficultyConfigIdList = difficultyConfigId;
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

        private DifficultyConfig obj;

        public Builder(){
            this.obj = new DifficultyConfig();
        }

        public Builder difficultyConfigId(Integer difficultyConfigId){
            this.obj.setDifficultyConfigId(difficultyConfigId);
            return this;
        }
        public Builder content(String content){
            this.obj.setContent(content);
            return this;
        }
        public DifficultyConfig build(){return obj;}
    }

}
