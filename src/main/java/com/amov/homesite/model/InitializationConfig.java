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
public class InitializationConfig implements Serializable {

    private static final long serialVersionUID = 1544801198366L;


    /**
    * 主键
    * 主键
    * isNullAble:0
    */
    private Integer initializationConfigId;

    /**
    * key键
    * isNullAble:0
    */
    private String keyName;

    /**
    * value键
    * isNullAble:1
    */
    private String valueName;

    /**
    * 页面位置说明
    * isNullAble:1
    */
    private String content;


    public void setInitializationConfigId(Integer initializationConfigId){this.initializationConfigId = initializationConfigId;}

    public Integer getInitializationConfigId(){return this.initializationConfigId;}

    public void setKeyName(String keyName){this.keyName = keyName;}

    public String getKeyName(){return this.keyName;}

    public void setValueName(String valueName){this.valueName = valueName;}

    public String getValueName(){return this.valueName;}

    public void setContent(String content){this.content = content;}

    public String getContent(){return this.content;}
    @Override
    public String toString() {
        return "InitializationConfig{" +
                "initializationConfigId='" + initializationConfigId + '\'' +
                "keyName='" + keyName + '\'' +
                "valueName='" + valueName + '\'' +
                "content='" + content + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private InitializationConfig set;

        private ConditionBuilder where;

        public UpdateBuilder set(InitializationConfig set){
            this.set = set;
            return this;
        }

        public InitializationConfig getSet(){
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

    public static class QueryBuilder extends InitializationConfig{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> initializationConfigIdList;

        public List<Integer> getInitializationConfigIdList(){return this.initializationConfigIdList;}

        private Integer initializationConfigIdSt;

        private Integer initializationConfigIdEd;

        public Integer getInitializationConfigIdSt(){return this.initializationConfigIdSt;}

        public Integer getInitializationConfigIdEd(){return this.initializationConfigIdEd;}

        private List<String> keyNameList;

        public List<String> getKeyNameList(){return this.keyNameList;}


        private List<String> fuzzyKeyName;

        public List<String> getFuzzyKeyName(){return this.fuzzyKeyName;}

        private List<String> rightFuzzyKeyName;

        public List<String> getRightFuzzyKeyName(){return this.rightFuzzyKeyName;}
        private List<String> valueNameList;

        public List<String> getValueNameList(){return this.valueNameList;}


        private List<String> fuzzyValueName;

        public List<String> getFuzzyValueName(){return this.fuzzyValueName;}

        private List<String> rightFuzzyValueName;

        public List<String> getRightFuzzyValueName(){return this.rightFuzzyValueName;}
        private List<String> contentList;

        public List<String> getContentList(){return this.contentList;}


        private List<String> fuzzyContent;

        public List<String> getFuzzyContent(){return this.fuzzyContent;}

        private List<String> rightFuzzyContent;

        public List<String> getRightFuzzyContent(){return this.rightFuzzyContent;}
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder initializationConfigIdBetWeen(Integer initializationConfigIdSt,Integer initializationConfigIdEd){
            this.initializationConfigIdSt = initializationConfigIdSt;
            this.initializationConfigIdEd = initializationConfigIdEd;
            return this;
        }

        public QueryBuilder initializationConfigIdGreaterEqThan(Integer initializationConfigIdSt){
            this.initializationConfigIdSt = initializationConfigIdSt;
            return this;
        }
        public QueryBuilder initializationConfigIdLessEqThan(Integer initializationConfigIdEd){
            this.initializationConfigIdEd = initializationConfigIdEd;
            return this;
        }


        public QueryBuilder initializationConfigId(Integer initializationConfigId){
            setInitializationConfigId(initializationConfigId);
            return this;
        }

        public QueryBuilder initializationConfigIdList(Integer ... initializationConfigId){
            this.initializationConfigIdList = solveNullList(initializationConfigId);
            return this;
        }

        public QueryBuilder initializationConfigIdList(List<Integer> initializationConfigId){
            this.initializationConfigIdList = initializationConfigId;
            return this;
        }

        public QueryBuilder fetchInitializationConfigId(){
            setFetchFields("fetchFields","initializationConfigId");
            return this;
        }

        public QueryBuilder excludeInitializationConfigId(){
            setFetchFields("excludeFields","initializationConfigId");
            return this;
        }

        public QueryBuilder fuzzyKeyName (List<String> fuzzyKeyName){
            this.fuzzyKeyName = fuzzyKeyName;
            return this;
        }

        public QueryBuilder fuzzyKeyName (String ... fuzzyKeyName){
            this.fuzzyKeyName = solveNullList(fuzzyKeyName);
            return this;
        }

        public QueryBuilder rightFuzzyKeyName (List<String> rightFuzzyKeyName){
            this.rightFuzzyKeyName = rightFuzzyKeyName;
            return this;
        }

        public QueryBuilder rightFuzzyKeyName (String ... rightFuzzyKeyName){
            this.rightFuzzyKeyName = solveNullList(rightFuzzyKeyName);
            return this;
        }

        public QueryBuilder keyName(String keyName){
            setKeyName(keyName);
            return this;
        }

        public QueryBuilder keyNameList(String ... keyName){
            this.keyNameList = solveNullList(keyName);
            return this;
        }

        public QueryBuilder keyNameList(List<String> keyName){
            this.keyNameList = keyName;
            return this;
        }

        public QueryBuilder fetchKeyName(){
            setFetchFields("fetchFields","keyName");
            return this;
        }

        public QueryBuilder excludeKeyName(){
            setFetchFields("excludeFields","keyName");
            return this;
        }

        public QueryBuilder fuzzyValueName (List<String> fuzzyValueName){
            this.fuzzyValueName = fuzzyValueName;
            return this;
        }

        public QueryBuilder fuzzyValueName (String ... fuzzyValueName){
            this.fuzzyValueName = solveNullList(fuzzyValueName);
            return this;
        }

        public QueryBuilder rightFuzzyValueName (List<String> rightFuzzyValueName){
            this.rightFuzzyValueName = rightFuzzyValueName;
            return this;
        }

        public QueryBuilder rightFuzzyValueName (String ... rightFuzzyValueName){
            this.rightFuzzyValueName = solveNullList(rightFuzzyValueName);
            return this;
        }

        public QueryBuilder valueName(String valueName){
            setValueName(valueName);
            return this;
        }

        public QueryBuilder valueNameList(String ... valueName){
            this.valueNameList = solveNullList(valueName);
            return this;
        }

        public QueryBuilder valueNameList(List<String> valueName){
            this.valueNameList = valueName;
            return this;
        }

        public QueryBuilder fetchValueName(){
            setFetchFields("fetchFields","valueName");
            return this;
        }

        public QueryBuilder excludeValueName(){
            setFetchFields("excludeFields","valueName");
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

        public InitializationConfig build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> initializationConfigIdList;

        public List<Integer> getInitializationConfigIdList(){return this.initializationConfigIdList;}

        private Integer initializationConfigIdSt;

        private Integer initializationConfigIdEd;

        public Integer getInitializationConfigIdSt(){return this.initializationConfigIdSt;}

        public Integer getInitializationConfigIdEd(){return this.initializationConfigIdEd;}

        private List<String> keyNameList;

        public List<String> getKeyNameList(){return this.keyNameList;}


        private List<String> fuzzyKeyName;

        public List<String> getFuzzyKeyName(){return this.fuzzyKeyName;}

        private List<String> rightFuzzyKeyName;

        public List<String> getRightFuzzyKeyName(){return this.rightFuzzyKeyName;}
        private List<String> valueNameList;

        public List<String> getValueNameList(){return this.valueNameList;}


        private List<String> fuzzyValueName;

        public List<String> getFuzzyValueName(){return this.fuzzyValueName;}

        private List<String> rightFuzzyValueName;

        public List<String> getRightFuzzyValueName(){return this.rightFuzzyValueName;}
        private List<String> contentList;

        public List<String> getContentList(){return this.contentList;}


        private List<String> fuzzyContent;

        public List<String> getFuzzyContent(){return this.fuzzyContent;}

        private List<String> rightFuzzyContent;

        public List<String> getRightFuzzyContent(){return this.rightFuzzyContent;}

        public ConditionBuilder initializationConfigIdBetWeen(Integer initializationConfigIdSt,Integer initializationConfigIdEd){
            this.initializationConfigIdSt = initializationConfigIdSt;
            this.initializationConfigIdEd = initializationConfigIdEd;
            return this;
        }

        public ConditionBuilder initializationConfigIdGreaterEqThan(Integer initializationConfigIdSt){
            this.initializationConfigIdSt = initializationConfigIdSt;
            return this;
        }
        public ConditionBuilder initializationConfigIdLessEqThan(Integer initializationConfigIdEd){
            this.initializationConfigIdEd = initializationConfigIdEd;
            return this;
        }


        public ConditionBuilder initializationConfigIdList(Integer ... initializationConfigId){
            this.initializationConfigIdList = solveNullList(initializationConfigId);
            return this;
        }

        public ConditionBuilder initializationConfigIdList(List<Integer> initializationConfigId){
            this.initializationConfigIdList = initializationConfigId;
            return this;
        }

        public ConditionBuilder fuzzyKeyName (List<String> fuzzyKeyName){
            this.fuzzyKeyName = fuzzyKeyName;
            return this;
        }

        public ConditionBuilder fuzzyKeyName (String ... fuzzyKeyName){
            this.fuzzyKeyName = solveNullList(fuzzyKeyName);
            return this;
        }

        public ConditionBuilder rightFuzzyKeyName (List<String> rightFuzzyKeyName){
            this.rightFuzzyKeyName = rightFuzzyKeyName;
            return this;
        }

        public ConditionBuilder rightFuzzyKeyName (String ... rightFuzzyKeyName){
            this.rightFuzzyKeyName = solveNullList(rightFuzzyKeyName);
            return this;
        }

        public ConditionBuilder keyNameList(String ... keyName){
            this.keyNameList = solveNullList(keyName);
            return this;
        }

        public ConditionBuilder keyNameList(List<String> keyName){
            this.keyNameList = keyName;
            return this;
        }

        public ConditionBuilder fuzzyValueName (List<String> fuzzyValueName){
            this.fuzzyValueName = fuzzyValueName;
            return this;
        }

        public ConditionBuilder fuzzyValueName (String ... fuzzyValueName){
            this.fuzzyValueName = solveNullList(fuzzyValueName);
            return this;
        }

        public ConditionBuilder rightFuzzyValueName (List<String> rightFuzzyValueName){
            this.rightFuzzyValueName = rightFuzzyValueName;
            return this;
        }

        public ConditionBuilder rightFuzzyValueName (String ... rightFuzzyValueName){
            this.rightFuzzyValueName = solveNullList(rightFuzzyValueName);
            return this;
        }

        public ConditionBuilder valueNameList(String ... valueName){
            this.valueNameList = solveNullList(valueName);
            return this;
        }

        public ConditionBuilder valueNameList(List<String> valueName){
            this.valueNameList = valueName;
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

        private InitializationConfig obj;

        public Builder(){
            this.obj = new InitializationConfig();
        }

        public Builder initializationConfigId(Integer initializationConfigId){
            this.obj.setInitializationConfigId(initializationConfigId);
            return this;
        }
        public Builder keyName(String keyName){
            this.obj.setKeyName(keyName);
            return this;
        }
        public Builder valueName(String valueName){
            this.obj.setValueName(valueName);
            return this;
        }
        public Builder content(String content){
            this.obj.setContent(content);
            return this;
        }
        public InitializationConfig build(){return obj;}
    }

}
