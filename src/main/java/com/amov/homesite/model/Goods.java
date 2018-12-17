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
public class Goods implements Serializable {

    private static final long serialVersionUID = 1544694199509L;


    /**
    * 主键
    * 商品主键
    * isNullAble:0
    */
    private Integer goodsId;

    /**
    * 商品简介
    * isNullAble:1
    */
    private String intro;

    /**
    * 商品图片url
    * isNullAble:1
    */
    private String profileUrl;

    /**
    * 价格
    * isNullAble:1,defaultVal:0
    */
    private Integer price;

    /**
    * 标题
    * isNullAble:1
    */
    private String title;

    /**
    * 更多url
    * isNullAble:1
    */
    private String learnMoreUrl;

    /**
    * 标题下的名称
    * isNullAble:1
    */
    private String name;


    public void setGoodsId(Integer goodsId){this.goodsId = goodsId;}

    public Integer getGoodsId(){return this.goodsId;}

    public void setIntro(String intro){this.intro = intro;}

    public String getIntro(){return this.intro;}

    public void setProfileUrl(String profileUrl){this.profileUrl = profileUrl;}

    public String getProfileUrl(){return this.profileUrl;}

    public void setPrice(Integer price){this.price = price;}

    public Integer getPrice(){return this.price;}

    public void setTitle(String title){this.title = title;}

    public String getTitle(){return this.title;}

    public void setLearnMoreUrl(String learnMoreUrl){this.learnMoreUrl = learnMoreUrl;}

    public String getLearnMoreUrl(){return this.learnMoreUrl;}

    public void setName(String name){this.name = name;}

    public String getName(){return this.name;}
    @Override
    public String toString() {
        return "Goods{" +
                "goodsId='" + goodsId + '\'' +
                "intro='" + intro + '\'' +
                "profileUrl='" + profileUrl + '\'' +
                "price='" + price + '\'' +
                "title='" + title + '\'' +
                "learnMoreUrl='" + learnMoreUrl + '\'' +
                "name='" + name + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private Goods set;

        private ConditionBuilder where;

        public UpdateBuilder set(Goods set){
            this.set = set;
            return this;
        }

        public Goods getSet(){
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

    public static class QueryBuilder extends Goods{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> goodsIdList;

        public List<Integer> getGoodsIdList(){return this.goodsIdList;}

        private Integer goodsIdSt;

        private Integer goodsIdEd;

        public Integer getGoodsIdSt(){return this.goodsIdSt;}

        public Integer getGoodsIdEd(){return this.goodsIdEd;}

        private List<String> introList;

        public List<String> getIntroList(){return this.introList;}


        private List<String> fuzzyIntro;

        public List<String> getFuzzyIntro(){return this.fuzzyIntro;}

        private List<String> rightFuzzyIntro;

        public List<String> getRightFuzzyIntro(){return this.rightFuzzyIntro;}
        private List<String> profileUrlList;

        public List<String> getProfileUrlList(){return this.profileUrlList;}


        private List<String> fuzzyProfileUrl;

        public List<String> getFuzzyProfileUrl(){return this.fuzzyProfileUrl;}

        private List<String> rightFuzzyProfileUrl;

        public List<String> getRightFuzzyProfileUrl(){return this.rightFuzzyProfileUrl;}
        private List<Integer> priceList;

        public List<Integer> getPriceList(){return this.priceList;}

        private Integer priceSt;

        private Integer priceEd;

        public Integer getPriceSt(){return this.priceSt;}

        public Integer getPriceEd(){return this.priceEd;}

        private List<String> titleList;

        public List<String> getTitleList(){return this.titleList;}


        private List<String> fuzzyTitle;

        public List<String> getFuzzyTitle(){return this.fuzzyTitle;}

        private List<String> rightFuzzyTitle;

        public List<String> getRightFuzzyTitle(){return this.rightFuzzyTitle;}
        private List<String> learnMoreUrlList;

        public List<String> getLearnMoreUrlList(){return this.learnMoreUrlList;}


        private List<String> fuzzyLearnMoreUrl;

        public List<String> getFuzzyLearnMoreUrl(){return this.fuzzyLearnMoreUrl;}

        private List<String> rightFuzzyLearnMoreUrl;

        public List<String> getRightFuzzyLearnMoreUrl(){return this.rightFuzzyLearnMoreUrl;}
        private List<String> nameList;

        public List<String> getNameList(){return this.nameList;}


        private List<String> fuzzyName;

        public List<String> getFuzzyName(){return this.fuzzyName;}

        private List<String> rightFuzzyName;

        public List<String> getRightFuzzyName(){return this.rightFuzzyName;}
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder goodsIdBetWeen(Integer goodsIdSt,Integer goodsIdEd){
            this.goodsIdSt = goodsIdSt;
            this.goodsIdEd = goodsIdEd;
            return this;
        }

        public QueryBuilder goodsIdGreaterEqThan(Integer goodsIdSt){
            this.goodsIdSt = goodsIdSt;
            return this;
        }
        public QueryBuilder goodsIdLessEqThan(Integer goodsIdEd){
            this.goodsIdEd = goodsIdEd;
            return this;
        }


        public QueryBuilder goodsId(Integer goodsId){
            setGoodsId(goodsId);
            return this;
        }

        public QueryBuilder goodsIdList(Integer ... goodsId){
            this.goodsIdList = solveNullList(goodsId);
            return this;
        }

        public QueryBuilder goodsIdList(List<Integer> goodsId){
            this.goodsIdList = goodsId;
            return this;
        }

        public QueryBuilder fetchGoodsId(){
            setFetchFields("fetchFields","goodsId");
            return this;
        }

        public QueryBuilder excludeGoodsId(){
            setFetchFields("excludeFields","goodsId");
            return this;
        }

        public QueryBuilder fuzzyIntro (List<String> fuzzyIntro){
            this.fuzzyIntro = fuzzyIntro;
            return this;
        }

        public QueryBuilder fuzzyIntro (String ... fuzzyIntro){
            this.fuzzyIntro = solveNullList(fuzzyIntro);
            return this;
        }

        public QueryBuilder rightFuzzyIntro (List<String> rightFuzzyIntro){
            this.rightFuzzyIntro = rightFuzzyIntro;
            return this;
        }

        public QueryBuilder rightFuzzyIntro (String ... rightFuzzyIntro){
            this.rightFuzzyIntro = solveNullList(rightFuzzyIntro);
            return this;
        }

        public QueryBuilder intro(String intro){
            setIntro(intro);
            return this;
        }

        public QueryBuilder introList(String ... intro){
            this.introList = solveNullList(intro);
            return this;
        }

        public QueryBuilder introList(List<String> intro){
            this.introList = intro;
            return this;
        }

        public QueryBuilder fetchIntro(){
            setFetchFields("fetchFields","intro");
            return this;
        }

        public QueryBuilder excludeIntro(){
            setFetchFields("excludeFields","intro");
            return this;
        }

        public QueryBuilder fuzzyProfileUrl (List<String> fuzzyProfileUrl){
            this.fuzzyProfileUrl = fuzzyProfileUrl;
            return this;
        }

        public QueryBuilder fuzzyProfileUrl (String ... fuzzyProfileUrl){
            this.fuzzyProfileUrl = solveNullList(fuzzyProfileUrl);
            return this;
        }

        public QueryBuilder rightFuzzyProfileUrl (List<String> rightFuzzyProfileUrl){
            this.rightFuzzyProfileUrl = rightFuzzyProfileUrl;
            return this;
        }

        public QueryBuilder rightFuzzyProfileUrl (String ... rightFuzzyProfileUrl){
            this.rightFuzzyProfileUrl = solveNullList(rightFuzzyProfileUrl);
            return this;
        }

        public QueryBuilder profileUrl(String profileUrl){
            setProfileUrl(profileUrl);
            return this;
        }

        public QueryBuilder profileUrlList(String ... profileUrl){
            this.profileUrlList = solveNullList(profileUrl);
            return this;
        }

        public QueryBuilder profileUrlList(List<String> profileUrl){
            this.profileUrlList = profileUrl;
            return this;
        }

        public QueryBuilder fetchProfileUrl(){
            setFetchFields("fetchFields","profileUrl");
            return this;
        }

        public QueryBuilder excludeProfileUrl(){
            setFetchFields("excludeFields","profileUrl");
            return this;
        }

        public QueryBuilder priceBetWeen(Integer priceSt,Integer priceEd){
            this.priceSt = priceSt;
            this.priceEd = priceEd;
            return this;
        }

        public QueryBuilder priceGreaterEqThan(Integer priceSt){
            this.priceSt = priceSt;
            return this;
        }
        public QueryBuilder priceLessEqThan(Integer priceEd){
            this.priceEd = priceEd;
            return this;
        }


        public QueryBuilder price(Integer price){
            setPrice(price);
            return this;
        }

        public QueryBuilder priceList(Integer ... price){
            this.priceList = solveNullList(price);
            return this;
        }

        public QueryBuilder priceList(List<Integer> price){
            this.priceList = price;
            return this;
        }

        public QueryBuilder fetchPrice(){
            setFetchFields("fetchFields","price");
            return this;
        }

        public QueryBuilder excludePrice(){
            setFetchFields("excludeFields","price");
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

        public QueryBuilder fuzzyLearnMoreUrl (List<String> fuzzyLearnMoreUrl){
            this.fuzzyLearnMoreUrl = fuzzyLearnMoreUrl;
            return this;
        }

        public QueryBuilder fuzzyLearnMoreUrl (String ... fuzzyLearnMoreUrl){
            this.fuzzyLearnMoreUrl = solveNullList(fuzzyLearnMoreUrl);
            return this;
        }

        public QueryBuilder rightFuzzyLearnMoreUrl (List<String> rightFuzzyLearnMoreUrl){
            this.rightFuzzyLearnMoreUrl = rightFuzzyLearnMoreUrl;
            return this;
        }

        public QueryBuilder rightFuzzyLearnMoreUrl (String ... rightFuzzyLearnMoreUrl){
            this.rightFuzzyLearnMoreUrl = solveNullList(rightFuzzyLearnMoreUrl);
            return this;
        }

        public QueryBuilder learnMoreUrl(String learnMoreUrl){
            setLearnMoreUrl(learnMoreUrl);
            return this;
        }

        public QueryBuilder learnMoreUrlList(String ... learnMoreUrl){
            this.learnMoreUrlList = solveNullList(learnMoreUrl);
            return this;
        }

        public QueryBuilder learnMoreUrlList(List<String> learnMoreUrl){
            this.learnMoreUrlList = learnMoreUrl;
            return this;
        }

        public QueryBuilder fetchLearnMoreUrl(){
            setFetchFields("fetchFields","learnMoreUrl");
            return this;
        }

        public QueryBuilder excludeLearnMoreUrl(){
            setFetchFields("excludeFields","learnMoreUrl");
            return this;
        }

        public QueryBuilder fuzzyName (List<String> fuzzyName){
            this.fuzzyName = fuzzyName;
            return this;
        }

        public QueryBuilder fuzzyName (String ... fuzzyName){
            this.fuzzyName = solveNullList(fuzzyName);
            return this;
        }

        public QueryBuilder rightFuzzyName (List<String> rightFuzzyName){
            this.rightFuzzyName = rightFuzzyName;
            return this;
        }

        public QueryBuilder rightFuzzyName (String ... rightFuzzyName){
            this.rightFuzzyName = solveNullList(rightFuzzyName);
            return this;
        }

        public QueryBuilder name(String name){
            setName(name);
            return this;
        }

        public QueryBuilder nameList(String ... name){
            this.nameList = solveNullList(name);
            return this;
        }

        public QueryBuilder nameList(List<String> name){
            this.nameList = name;
            return this;
        }

        public QueryBuilder fetchName(){
            setFetchFields("fetchFields","name");
            return this;
        }

        public QueryBuilder excludeName(){
            setFetchFields("excludeFields","name");
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

        public Goods build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> goodsIdList;

        public List<Integer> getGoodsIdList(){return this.goodsIdList;}

        private Integer goodsIdSt;

        private Integer goodsIdEd;

        public Integer getGoodsIdSt(){return this.goodsIdSt;}

        public Integer getGoodsIdEd(){return this.goodsIdEd;}

        private List<String> introList;

        public List<String> getIntroList(){return this.introList;}


        private List<String> fuzzyIntro;

        public List<String> getFuzzyIntro(){return this.fuzzyIntro;}

        private List<String> rightFuzzyIntro;

        public List<String> getRightFuzzyIntro(){return this.rightFuzzyIntro;}
        private List<String> profileUrlList;

        public List<String> getProfileUrlList(){return this.profileUrlList;}


        private List<String> fuzzyProfileUrl;

        public List<String> getFuzzyProfileUrl(){return this.fuzzyProfileUrl;}

        private List<String> rightFuzzyProfileUrl;

        public List<String> getRightFuzzyProfileUrl(){return this.rightFuzzyProfileUrl;}
        private List<Integer> priceList;

        public List<Integer> getPriceList(){return this.priceList;}

        private Integer priceSt;

        private Integer priceEd;

        public Integer getPriceSt(){return this.priceSt;}

        public Integer getPriceEd(){return this.priceEd;}

        private List<String> titleList;

        public List<String> getTitleList(){return this.titleList;}


        private List<String> fuzzyTitle;

        public List<String> getFuzzyTitle(){return this.fuzzyTitle;}

        private List<String> rightFuzzyTitle;

        public List<String> getRightFuzzyTitle(){return this.rightFuzzyTitle;}
        private List<String> learnMoreUrlList;

        public List<String> getLearnMoreUrlList(){return this.learnMoreUrlList;}


        private List<String> fuzzyLearnMoreUrl;

        public List<String> getFuzzyLearnMoreUrl(){return this.fuzzyLearnMoreUrl;}

        private List<String> rightFuzzyLearnMoreUrl;

        public List<String> getRightFuzzyLearnMoreUrl(){return this.rightFuzzyLearnMoreUrl;}
        private List<String> nameList;

        public List<String> getNameList(){return this.nameList;}


        private List<String> fuzzyName;

        public List<String> getFuzzyName(){return this.fuzzyName;}

        private List<String> rightFuzzyName;

        public List<String> getRightFuzzyName(){return this.rightFuzzyName;}

        public ConditionBuilder goodsIdBetWeen(Integer goodsIdSt,Integer goodsIdEd){
            this.goodsIdSt = goodsIdSt;
            this.goodsIdEd = goodsIdEd;
            return this;
        }

        public ConditionBuilder goodsIdGreaterEqThan(Integer goodsIdSt){
            this.goodsIdSt = goodsIdSt;
            return this;
        }
        public ConditionBuilder goodsIdLessEqThan(Integer goodsIdEd){
            this.goodsIdEd = goodsIdEd;
            return this;
        }


        public ConditionBuilder goodsIdList(Integer ... goodsId){
            this.goodsIdList = solveNullList(goodsId);
            return this;
        }

        public ConditionBuilder goodsIdList(List<Integer> goodsId){
            this.goodsIdList = goodsId;
            return this;
        }

        public ConditionBuilder fuzzyIntro (List<String> fuzzyIntro){
            this.fuzzyIntro = fuzzyIntro;
            return this;
        }

        public ConditionBuilder fuzzyIntro (String ... fuzzyIntro){
            this.fuzzyIntro = solveNullList(fuzzyIntro);
            return this;
        }

        public ConditionBuilder rightFuzzyIntro (List<String> rightFuzzyIntro){
            this.rightFuzzyIntro = rightFuzzyIntro;
            return this;
        }

        public ConditionBuilder rightFuzzyIntro (String ... rightFuzzyIntro){
            this.rightFuzzyIntro = solveNullList(rightFuzzyIntro);
            return this;
        }

        public ConditionBuilder introList(String ... intro){
            this.introList = solveNullList(intro);
            return this;
        }

        public ConditionBuilder introList(List<String> intro){
            this.introList = intro;
            return this;
        }

        public ConditionBuilder fuzzyProfileUrl (List<String> fuzzyProfileUrl){
            this.fuzzyProfileUrl = fuzzyProfileUrl;
            return this;
        }

        public ConditionBuilder fuzzyProfileUrl (String ... fuzzyProfileUrl){
            this.fuzzyProfileUrl = solveNullList(fuzzyProfileUrl);
            return this;
        }

        public ConditionBuilder rightFuzzyProfileUrl (List<String> rightFuzzyProfileUrl){
            this.rightFuzzyProfileUrl = rightFuzzyProfileUrl;
            return this;
        }

        public ConditionBuilder rightFuzzyProfileUrl (String ... rightFuzzyProfileUrl){
            this.rightFuzzyProfileUrl = solveNullList(rightFuzzyProfileUrl);
            return this;
        }

        public ConditionBuilder profileUrlList(String ... profileUrl){
            this.profileUrlList = solveNullList(profileUrl);
            return this;
        }

        public ConditionBuilder profileUrlList(List<String> profileUrl){
            this.profileUrlList = profileUrl;
            return this;
        }

        public ConditionBuilder priceBetWeen(Integer priceSt,Integer priceEd){
            this.priceSt = priceSt;
            this.priceEd = priceEd;
            return this;
        }

        public ConditionBuilder priceGreaterEqThan(Integer priceSt){
            this.priceSt = priceSt;
            return this;
        }
        public ConditionBuilder priceLessEqThan(Integer priceEd){
            this.priceEd = priceEd;
            return this;
        }


        public ConditionBuilder priceList(Integer ... price){
            this.priceList = solveNullList(price);
            return this;
        }

        public ConditionBuilder priceList(List<Integer> price){
            this.priceList = price;
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

        public ConditionBuilder fuzzyLearnMoreUrl (List<String> fuzzyLearnMoreUrl){
            this.fuzzyLearnMoreUrl = fuzzyLearnMoreUrl;
            return this;
        }

        public ConditionBuilder fuzzyLearnMoreUrl (String ... fuzzyLearnMoreUrl){
            this.fuzzyLearnMoreUrl = solveNullList(fuzzyLearnMoreUrl);
            return this;
        }

        public ConditionBuilder rightFuzzyLearnMoreUrl (List<String> rightFuzzyLearnMoreUrl){
            this.rightFuzzyLearnMoreUrl = rightFuzzyLearnMoreUrl;
            return this;
        }

        public ConditionBuilder rightFuzzyLearnMoreUrl (String ... rightFuzzyLearnMoreUrl){
            this.rightFuzzyLearnMoreUrl = solveNullList(rightFuzzyLearnMoreUrl);
            return this;
        }

        public ConditionBuilder learnMoreUrlList(String ... learnMoreUrl){
            this.learnMoreUrlList = solveNullList(learnMoreUrl);
            return this;
        }

        public ConditionBuilder learnMoreUrlList(List<String> learnMoreUrl){
            this.learnMoreUrlList = learnMoreUrl;
            return this;
        }

        public ConditionBuilder fuzzyName (List<String> fuzzyName){
            this.fuzzyName = fuzzyName;
            return this;
        }

        public ConditionBuilder fuzzyName (String ... fuzzyName){
            this.fuzzyName = solveNullList(fuzzyName);
            return this;
        }

        public ConditionBuilder rightFuzzyName (List<String> rightFuzzyName){
            this.rightFuzzyName = rightFuzzyName;
            return this;
        }

        public ConditionBuilder rightFuzzyName (String ... rightFuzzyName){
            this.rightFuzzyName = solveNullList(rightFuzzyName);
            return this;
        }

        public ConditionBuilder nameList(String ... name){
            this.nameList = solveNullList(name);
            return this;
        }

        public ConditionBuilder nameList(List<String> name){
            this.nameList = name;
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

        private Goods obj;

        public Builder(){
            this.obj = new Goods();
        }

        public Builder goodsId(Integer goodsId){
            this.obj.setGoodsId(goodsId);
            return this;
        }
        public Builder intro(String intro){
            this.obj.setIntro(intro);
            return this;
        }
        public Builder profileUrl(String profileUrl){
            this.obj.setProfileUrl(profileUrl);
            return this;
        }
        public Builder price(Integer price){
            this.obj.setPrice(price);
            return this;
        }
        public Builder title(String title){
            this.obj.setTitle(title);
            return this;
        }
        public Builder learnMoreUrl(String learnMoreUrl){
            this.obj.setLearnMoreUrl(learnMoreUrl);
            return this;
        }
        public Builder name(String name){
            this.obj.setName(name);
            return this;
        }
        public Goods build(){return obj;}
    }

}
