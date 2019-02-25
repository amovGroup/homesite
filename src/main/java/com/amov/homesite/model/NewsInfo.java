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
public class NewsInfo implements Serializable {

    private static final long serialVersionUID = 1547486751794L;


    /**
    * 主键
    * 新闻主页
    * isNullAble:0
    */
    private Integer newsInfoId;

    /**
    * 新闻id
    * isNullAble:0
    */
    private Integer newsId;

    /**
    * 正文
    * isNullAble:1
    */
    private String body;


    public void setNewsInfoId(Integer newsInfoId){this.newsInfoId = newsInfoId;}

    public Integer getNewsInfoId(){return this.newsInfoId;}

    public void setNewsId(Integer newsId){this.newsId = newsId;}

    public Integer getNewsId(){return this.newsId;}

    public void setBody(String body){this.body = body;}

    public String getBody(){return this.body;}
    @Override
    public String toString() {
        return "NewsInfo{" +
                "newsInfoId='" + newsInfoId + '\'' +
                "newsId='" + newsId + '\'' +
                "body='" + body + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private NewsInfo set;

        private ConditionBuilder where;

        public UpdateBuilder set(NewsInfo set){
            this.set = set;
            return this;
        }

        public NewsInfo getSet(){
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

    public static class QueryBuilder extends NewsInfo{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> newsInfoIdList;

        public List<Integer> getNewsInfoIdList(){return this.newsInfoIdList;}

        private Integer newsInfoIdSt;

        private Integer newsInfoIdEd;

        public Integer getNewsInfoIdSt(){return this.newsInfoIdSt;}

        public Integer getNewsInfoIdEd(){return this.newsInfoIdEd;}

        private List<Integer> newsIdList;

        public List<Integer> getNewsIdList(){return this.newsIdList;}

        private Integer newsIdSt;

        private Integer newsIdEd;

        public Integer getNewsIdSt(){return this.newsIdSt;}

        public Integer getNewsIdEd(){return this.newsIdEd;}

        private List<String> bodyList;

        public List<String> getBodyList(){return this.bodyList;}


        private List<String> fuzzyBody;

        public List<String> getFuzzyBody(){return this.fuzzyBody;}

        private List<String> rightFuzzyBody;

        public List<String> getRightFuzzyBody(){return this.rightFuzzyBody;}
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder newsInfoIdBetWeen(Integer newsInfoIdSt,Integer newsInfoIdEd){
            this.newsInfoIdSt = newsInfoIdSt;
            this.newsInfoIdEd = newsInfoIdEd;
            return this;
        }

        public QueryBuilder newsInfoIdGreaterEqThan(Integer newsInfoIdSt){
            this.newsInfoIdSt = newsInfoIdSt;
            return this;
        }
        public QueryBuilder newsInfoIdLessEqThan(Integer newsInfoIdEd){
            this.newsInfoIdEd = newsInfoIdEd;
            return this;
        }


        public QueryBuilder newsInfoId(Integer newsInfoId){
            setNewsInfoId(newsInfoId);
            return this;
        }

        public QueryBuilder newsInfoIdList(Integer ... newsInfoId){
            this.newsInfoIdList = solveNullList(newsInfoId);
            return this;
        }

        public QueryBuilder newsInfoIdList(List<Integer> newsInfoId){
            this.newsInfoIdList = newsInfoId;
            return this;
        }

        public QueryBuilder fetchNewsInfoId(){
            setFetchFields("fetchFields","newsInfoId");
            return this;
        }

        public QueryBuilder excludeNewsInfoId(){
            setFetchFields("excludeFields","newsInfoId");
            return this;
        }

        public QueryBuilder newsIdBetWeen(Integer newsIdSt,Integer newsIdEd){
            this.newsIdSt = newsIdSt;
            this.newsIdEd = newsIdEd;
            return this;
        }

        public QueryBuilder newsIdGreaterEqThan(Integer newsIdSt){
            this.newsIdSt = newsIdSt;
            return this;
        }
        public QueryBuilder newsIdLessEqThan(Integer newsIdEd){
            this.newsIdEd = newsIdEd;
            return this;
        }


        public QueryBuilder newsId(Integer newsId){
            setNewsId(newsId);
            return this;
        }

        public QueryBuilder newsIdList(Integer ... newsId){
            this.newsIdList = solveNullList(newsId);
            return this;
        }

        public QueryBuilder newsIdList(List<Integer> newsId){
            this.newsIdList = newsId;
            return this;
        }

        public QueryBuilder fetchNewsId(){
            setFetchFields("fetchFields","newsId");
            return this;
        }

        public QueryBuilder excludeNewsId(){
            setFetchFields("excludeFields","newsId");
            return this;
        }

        public QueryBuilder fuzzyBody (List<String> fuzzyBody){
            this.fuzzyBody = fuzzyBody;
            return this;
        }

        public QueryBuilder fuzzyBody (String ... fuzzyBody){
            this.fuzzyBody = solveNullList(fuzzyBody);
            return this;
        }

        public QueryBuilder rightFuzzyBody (List<String> rightFuzzyBody){
            this.rightFuzzyBody = rightFuzzyBody;
            return this;
        }

        public QueryBuilder rightFuzzyBody (String ... rightFuzzyBody){
            this.rightFuzzyBody = solveNullList(rightFuzzyBody);
            return this;
        }

        public QueryBuilder body(String body){
            setBody(body);
            return this;
        }

        public QueryBuilder bodyList(String ... body){
            this.bodyList = solveNullList(body);
            return this;
        }

        public QueryBuilder bodyList(List<String> body){
            this.bodyList = body;
            return this;
        }

        public QueryBuilder fetchBody(){
            setFetchFields("fetchFields","body");
            return this;
        }

        public QueryBuilder excludeBody(){
            setFetchFields("excludeFields","body");
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

        public NewsInfo build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> newsInfoIdList;

        public List<Integer> getNewsInfoIdList(){return this.newsInfoIdList;}

        private Integer newsInfoIdSt;

        private Integer newsInfoIdEd;

        public Integer getNewsInfoIdSt(){return this.newsInfoIdSt;}

        public Integer getNewsInfoIdEd(){return this.newsInfoIdEd;}

        private List<Integer> newsIdList;

        public List<Integer> getNewsIdList(){return this.newsIdList;}

        private Integer newsIdSt;

        private Integer newsIdEd;

        public Integer getNewsIdSt(){return this.newsIdSt;}

        public Integer getNewsIdEd(){return this.newsIdEd;}

        private List<String> bodyList;

        public List<String> getBodyList(){return this.bodyList;}


        private List<String> fuzzyBody;

        public List<String> getFuzzyBody(){return this.fuzzyBody;}

        private List<String> rightFuzzyBody;

        public List<String> getRightFuzzyBody(){return this.rightFuzzyBody;}

        public ConditionBuilder newsInfoIdBetWeen(Integer newsInfoIdSt,Integer newsInfoIdEd){
            this.newsInfoIdSt = newsInfoIdSt;
            this.newsInfoIdEd = newsInfoIdEd;
            return this;
        }

        public ConditionBuilder newsInfoIdGreaterEqThan(Integer newsInfoIdSt){
            this.newsInfoIdSt = newsInfoIdSt;
            return this;
        }
        public ConditionBuilder newsInfoIdLessEqThan(Integer newsInfoIdEd){
            this.newsInfoIdEd = newsInfoIdEd;
            return this;
        }


        public ConditionBuilder newsInfoIdList(Integer ... newsInfoId){
            this.newsInfoIdList = solveNullList(newsInfoId);
            return this;
        }

        public ConditionBuilder newsInfoIdList(List<Integer> newsInfoId){
            this.newsInfoIdList = newsInfoId;
            return this;
        }

        public ConditionBuilder newsIdBetWeen(Integer newsIdSt,Integer newsIdEd){
            this.newsIdSt = newsIdSt;
            this.newsIdEd = newsIdEd;
            return this;
        }

        public ConditionBuilder newsIdGreaterEqThan(Integer newsIdSt){
            this.newsIdSt = newsIdSt;
            return this;
        }
        public ConditionBuilder newsIdLessEqThan(Integer newsIdEd){
            this.newsIdEd = newsIdEd;
            return this;
        }


        public ConditionBuilder newsIdList(Integer ... newsId){
            this.newsIdList = solveNullList(newsId);
            return this;
        }

        public ConditionBuilder newsIdList(List<Integer> newsId){
            this.newsIdList = newsId;
            return this;
        }

        public ConditionBuilder fuzzyBody (List<String> fuzzyBody){
            this.fuzzyBody = fuzzyBody;
            return this;
        }

        public ConditionBuilder fuzzyBody (String ... fuzzyBody){
            this.fuzzyBody = solveNullList(fuzzyBody);
            return this;
        }

        public ConditionBuilder rightFuzzyBody (List<String> rightFuzzyBody){
            this.rightFuzzyBody = rightFuzzyBody;
            return this;
        }

        public ConditionBuilder rightFuzzyBody (String ... rightFuzzyBody){
            this.rightFuzzyBody = solveNullList(rightFuzzyBody);
            return this;
        }

        public ConditionBuilder bodyList(String ... body){
            this.bodyList = solveNullList(body);
            return this;
        }

        public ConditionBuilder bodyList(List<String> body){
            this.bodyList = body;
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

        private NewsInfo obj;

        public Builder(){
            this.obj = new NewsInfo();
        }

        public Builder newsInfoId(Integer newsInfoId){
            this.obj.setNewsInfoId(newsInfoId);
            return this;
        }
        public Builder newsId(Integer newsId){
            this.obj.setNewsId(newsId);
            return this;
        }
        public Builder body(String body){
            this.obj.setBody(body);
            return this;
        }
        public NewsInfo build(){return obj;}
    }

}
