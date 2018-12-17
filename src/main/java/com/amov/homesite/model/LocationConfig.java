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
public class LocationConfig implements Serializable {

    private static final long serialVersionUID = 1544694239195L;


    /**
    * 主键
    * 主键
    * isNullAble:0
    */
    private Integer locationConfigId;

    /**
    * 页面位置说明
    * isNullAble:1
    */
    private String content;


    public void setLocationConfigId(Integer locationConfigId){this.locationConfigId = locationConfigId;}

    public Integer getLocationConfigId(){return this.locationConfigId;}

    public void setContent(String content){this.content = content;}

    public String getContent(){return this.content;}
    @Override
    public String toString() {
        return "LocationConfig{" +
                "locationConfigId='" + locationConfigId + '\'' +
                "content='" + content + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private LocationConfig set;

        private ConditionBuilder where;

        public UpdateBuilder set(LocationConfig set){
            this.set = set;
            return this;
        }

        public LocationConfig getSet(){
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

    public static class QueryBuilder extends LocationConfig{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> locationConfigIdList;

        public List<Integer> getLocationConfigIdList(){return this.locationConfigIdList;}

        private Integer locationConfigIdSt;

        private Integer locationConfigIdEd;

        public Integer getLocationConfigIdSt(){return this.locationConfigIdSt;}

        public Integer getLocationConfigIdEd(){return this.locationConfigIdEd;}

        private List<String> contentList;

        public List<String> getContentList(){return this.contentList;}


        private List<String> fuzzyContent;

        public List<String> getFuzzyContent(){return this.fuzzyContent;}

        private List<String> rightFuzzyContent;

        public List<String> getRightFuzzyContent(){return this.rightFuzzyContent;}
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder locationConfigIdBetWeen(Integer locationConfigIdSt,Integer locationConfigIdEd){
            this.locationConfigIdSt = locationConfigIdSt;
            this.locationConfigIdEd = locationConfigIdEd;
            return this;
        }

        public QueryBuilder locationConfigIdGreaterEqThan(Integer locationConfigIdSt){
            this.locationConfigIdSt = locationConfigIdSt;
            return this;
        }
        public QueryBuilder locationConfigIdLessEqThan(Integer locationConfigIdEd){
            this.locationConfigIdEd = locationConfigIdEd;
            return this;
        }


        public QueryBuilder locationConfigId(Integer locationConfigId){
            setLocationConfigId(locationConfigId);
            return this;
        }

        public QueryBuilder locationConfigIdList(Integer ... locationConfigId){
            this.locationConfigIdList = solveNullList(locationConfigId);
            return this;
        }

        public QueryBuilder locationConfigIdList(List<Integer> locationConfigId){
            this.locationConfigIdList = locationConfigId;
            return this;
        }

        public QueryBuilder fetchLocationConfigId(){
            setFetchFields("fetchFields","locationConfigId");
            return this;
        }

        public QueryBuilder excludeLocationConfigId(){
            setFetchFields("excludeFields","locationConfigId");
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

        public LocationConfig build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> locationConfigIdList;

        public List<Integer> getLocationConfigIdList(){return this.locationConfigIdList;}

        private Integer locationConfigIdSt;

        private Integer locationConfigIdEd;

        public Integer getLocationConfigIdSt(){return this.locationConfigIdSt;}

        public Integer getLocationConfigIdEd(){return this.locationConfigIdEd;}

        private List<String> contentList;

        public List<String> getContentList(){return this.contentList;}


        private List<String> fuzzyContent;

        public List<String> getFuzzyContent(){return this.fuzzyContent;}

        private List<String> rightFuzzyContent;

        public List<String> getRightFuzzyContent(){return this.rightFuzzyContent;}

        public ConditionBuilder locationConfigIdBetWeen(Integer locationConfigIdSt,Integer locationConfigIdEd){
            this.locationConfigIdSt = locationConfigIdSt;
            this.locationConfigIdEd = locationConfigIdEd;
            return this;
        }

        public ConditionBuilder locationConfigIdGreaterEqThan(Integer locationConfigIdSt){
            this.locationConfigIdSt = locationConfigIdSt;
            return this;
        }
        public ConditionBuilder locationConfigIdLessEqThan(Integer locationConfigIdEd){
            this.locationConfigIdEd = locationConfigIdEd;
            return this;
        }


        public ConditionBuilder locationConfigIdList(Integer ... locationConfigId){
            this.locationConfigIdList = solveNullList(locationConfigId);
            return this;
        }

        public ConditionBuilder locationConfigIdList(List<Integer> locationConfigId){
            this.locationConfigIdList = locationConfigId;
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

        private LocationConfig obj;

        public Builder(){
            this.obj = new LocationConfig();
        }

        public Builder locationConfigId(Integer locationConfigId){
            this.obj.setLocationConfigId(locationConfigId);
            return this;
        }
        public Builder content(String content){
            this.obj.setContent(content);
            return this;
        }
        public LocationConfig build(){return obj;}
    }

}
