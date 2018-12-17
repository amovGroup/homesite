package com.amov.homesite.model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author author
*/
public class ClassifyConfig implements Serializable {

    private static final long serialVersionUID = 1544694108668L;


    /**
    * 主键
    * 主键
    * isNullAble:0
    */
    private Integer classifyConfigId;

    /**
    * 分类名称
    * isNullAble:1
    */
    private String content;


    public void setClassifyConfigId(Integer classifyConfigId){this.classifyConfigId = classifyConfigId;}

    public Integer getClassifyConfigId(){return this.classifyConfigId;}

    public void setContent(String content){this.content = content;}

    public String getContent(){return this.content;}
    @Override
    public String toString() {
        return "ClassifyConfig{" +
                "classifyConfigId='" + classifyConfigId + '\'' +
                "content='" + content + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private ClassifyConfig set;

        private ConditionBuilder where;

        public UpdateBuilder set(ClassifyConfig set){
            this.set = set;
            return this;
        }

        public ClassifyConfig getSet(){
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

    public static class QueryBuilder extends ClassifyConfig{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> classifyConfigIdList;

        public List<Integer> getClassifyConfigIdList(){return this.classifyConfigIdList;}

        private Integer classifyConfigIdSt;

        private Integer classifyConfigIdEd;

        public Integer getClassifyConfigIdSt(){return this.classifyConfigIdSt;}

        public Integer getClassifyConfigIdEd(){return this.classifyConfigIdEd;}

        private List<String> contentList;

        public List<String> getContentList(){return this.contentList;}


        private List<String> fuzzyContent;

        public List<String> getFuzzyContent(){return this.fuzzyContent;}

        private List<String> rightFuzzyContent;

        public List<String> getRightFuzzyContent(){return this.rightFuzzyContent;}
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder classifyConfigIdBetWeen(Integer classifyConfigIdSt,Integer classifyConfigIdEd){
            this.classifyConfigIdSt = classifyConfigIdSt;
            this.classifyConfigIdEd = classifyConfigIdEd;
            return this;
        }

        public QueryBuilder classifyConfigIdGreaterEqThan(Integer classifyConfigIdSt){
            this.classifyConfigIdSt = classifyConfigIdSt;
            return this;
        }
        public QueryBuilder classifyConfigIdLessEqThan(Integer classifyConfigIdEd){
            this.classifyConfigIdEd = classifyConfigIdEd;
            return this;
        }


        public QueryBuilder classifyConfigId(Integer classifyConfigId){
            setClassifyConfigId(classifyConfigId);
            return this;
        }

        public QueryBuilder classifyConfigIdList(Integer ... classifyConfigId){
            this.classifyConfigIdList = solveNullList(classifyConfigId);
            return this;
        }

        public QueryBuilder classifyConfigIdList(List<Integer> classifyConfigId){
            this.classifyConfigIdList = classifyConfigId;
            return this;
        }

        public QueryBuilder fetchClassifyConfigId(){
            setFetchFields("fetchFields","classifyConfigId");
            return this;
        }

        public QueryBuilder excludeClassifyConfigId(){
            setFetchFields("excludeFields","classifyConfigId");
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

        public ClassifyConfig build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> classifyConfigIdList;

        public List<Integer> getClassifyConfigIdList(){return this.classifyConfigIdList;}

        private Integer classifyConfigIdSt;

        private Integer classifyConfigIdEd;

        public Integer getClassifyConfigIdSt(){return this.classifyConfigIdSt;}

        public Integer getClassifyConfigIdEd(){return this.classifyConfigIdEd;}

        private List<String> contentList;

        public List<String> getContentList(){return this.contentList;}


        private List<String> fuzzyContent;

        public List<String> getFuzzyContent(){return this.fuzzyContent;}

        private List<String> rightFuzzyContent;

        public List<String> getRightFuzzyContent(){return this.rightFuzzyContent;}

        public ConditionBuilder classifyConfigIdBetWeen(Integer classifyConfigIdSt,Integer classifyConfigIdEd){
            this.classifyConfigIdSt = classifyConfigIdSt;
            this.classifyConfigIdEd = classifyConfigIdEd;
            return this;
        }

        public ConditionBuilder classifyConfigIdGreaterEqThan(Integer classifyConfigIdSt){
            this.classifyConfigIdSt = classifyConfigIdSt;
            return this;
        }
        public ConditionBuilder classifyConfigIdLessEqThan(Integer classifyConfigIdEd){
            this.classifyConfigIdEd = classifyConfigIdEd;
            return this;
        }


        public ConditionBuilder classifyConfigIdList(Integer ... classifyConfigId){
            this.classifyConfigIdList = solveNullList(classifyConfigId);
            return this;
        }

        public ConditionBuilder classifyConfigIdList(List<Integer> classifyConfigId){
            this.classifyConfigIdList = classifyConfigId;
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

        private ClassifyConfig obj;

        public Builder(){
            this.obj = new ClassifyConfig();
        }

        public Builder classifyConfigId(Integer classifyConfigId){
            this.obj.setClassifyConfigId(classifyConfigId);
            return this;
        }
        public Builder content(String content){
            this.obj.setContent(content);
            return this;
        }
        public ClassifyConfig build(){return obj;}
    }

}
