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
public class Product implements Serializable {

    private static final long serialVersionUID = 1545023385050L;


    /**
    * 主键
    * 产品主键
    * isNullAble:0
    */
    private Integer productId;

    /**
    * 产品简介
    * isNullAble:1
    */
    private String intro;

    /**
    * 产品图片url
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
    * 平台类型 0:硬件平台 1:周边硬件平台 2:软件平台
    * isNullAble:1,defaultVal:-1
    */
    private Integer platformType;


    public void setProductId(Integer productId){this.productId = productId;}

    public Integer getProductId(){return this.productId;}

    public void setIntro(String intro){this.intro = intro;}

    public String getIntro(){return this.intro;}

    public void setProfileUrl(String profileUrl){this.profileUrl = profileUrl;}

    public String getProfileUrl(){return this.profileUrl;}

    public void setPrice(Integer price){this.price = price;}

    public Integer getPrice(){return this.price;}

    public void setTitle(String title){this.title = title;}

    public String getTitle(){return this.title;}

    public void setPlatformType(Integer platformType){this.platformType = platformType;}

    public Integer getPlatformType(){return this.platformType;}
    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                "intro='" + intro + '\'' +
                "profileUrl='" + profileUrl + '\'' +
                "price='" + price + '\'' +
                "title='" + title + '\'' +
                "platformType='" + platformType + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private Product set;

        private ConditionBuilder where;

        public UpdateBuilder set(Product set){
            this.set = set;
            return this;
        }

        public Product getSet(){
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

    public static class QueryBuilder extends Product{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> productIdList;

        public List<Integer> getProductIdList(){return this.productIdList;}

        private Integer productIdSt;

        private Integer productIdEd;

        public Integer getProductIdSt(){return this.productIdSt;}

        public Integer getProductIdEd(){return this.productIdEd;}

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
        private List<Integer> platformTypeList;

        public List<Integer> getPlatformTypeList(){return this.platformTypeList;}

        private Integer platformTypeSt;

        private Integer platformTypeEd;

        public Integer getPlatformTypeSt(){return this.platformTypeSt;}

        public Integer getPlatformTypeEd(){return this.platformTypeEd;}

        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder productIdBetWeen(Integer productIdSt,Integer productIdEd){
            this.productIdSt = productIdSt;
            this.productIdEd = productIdEd;
            return this;
        }

        public QueryBuilder productIdGreaterEqThan(Integer productIdSt){
            this.productIdSt = productIdSt;
            return this;
        }
        public QueryBuilder productIdLessEqThan(Integer productIdEd){
            this.productIdEd = productIdEd;
            return this;
        }


        public QueryBuilder productId(Integer productId){
            setProductId(productId);
            return this;
        }

        public QueryBuilder productIdList(Integer ... productId){
            this.productIdList = solveNullList(productId);
            return this;
        }

        public QueryBuilder productIdList(List<Integer> productId){
            this.productIdList = productId;
            return this;
        }

        public QueryBuilder fetchProductId(){
            setFetchFields("fetchFields","productId");
            return this;
        }

        public QueryBuilder excludeProductId(){
            setFetchFields("excludeFields","productId");
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

        public QueryBuilder platformTypeBetWeen(Integer platformTypeSt,Integer platformTypeEd){
            this.platformTypeSt = platformTypeSt;
            this.platformTypeEd = platformTypeEd;
            return this;
        }

        public QueryBuilder platformTypeGreaterEqThan(Integer platformTypeSt){
            this.platformTypeSt = platformTypeSt;
            return this;
        }
        public QueryBuilder platformTypeLessEqThan(Integer platformTypeEd){
            this.platformTypeEd = platformTypeEd;
            return this;
        }


        public QueryBuilder platformType(Integer platformType){
            setPlatformType(platformType);
            return this;
        }

        public QueryBuilder platformTypeList(Integer ... platformType){
            this.platformTypeList = solveNullList(platformType);
            return this;
        }

        public QueryBuilder platformTypeList(List<Integer> platformType){
            this.platformTypeList = platformType;
            return this;
        }

        public QueryBuilder fetchPlatformType(){
            setFetchFields("fetchFields","platformType");
            return this;
        }

        public QueryBuilder excludePlatformType(){
            setFetchFields("excludeFields","platformType");
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

        public Product build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> productIdList;

        public List<Integer> getProductIdList(){return this.productIdList;}

        private Integer productIdSt;

        private Integer productIdEd;

        public Integer getProductIdSt(){return this.productIdSt;}

        public Integer getProductIdEd(){return this.productIdEd;}

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
        private List<Integer> platformTypeList;

        public List<Integer> getPlatformTypeList(){return this.platformTypeList;}

        private Integer platformTypeSt;

        private Integer platformTypeEd;

        public Integer getPlatformTypeSt(){return this.platformTypeSt;}

        public Integer getPlatformTypeEd(){return this.platformTypeEd;}


        public ConditionBuilder productIdBetWeen(Integer productIdSt,Integer productIdEd){
            this.productIdSt = productIdSt;
            this.productIdEd = productIdEd;
            return this;
        }

        public ConditionBuilder productIdGreaterEqThan(Integer productIdSt){
            this.productIdSt = productIdSt;
            return this;
        }
        public ConditionBuilder productIdLessEqThan(Integer productIdEd){
            this.productIdEd = productIdEd;
            return this;
        }


        public ConditionBuilder productIdList(Integer ... productId){
            this.productIdList = solveNullList(productId);
            return this;
        }

        public ConditionBuilder productIdList(List<Integer> productId){
            this.productIdList = productId;
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

        public ConditionBuilder platformTypeBetWeen(Integer platformTypeSt,Integer platformTypeEd){
            this.platformTypeSt = platformTypeSt;
            this.platformTypeEd = platformTypeEd;
            return this;
        }

        public ConditionBuilder platformTypeGreaterEqThan(Integer platformTypeSt){
            this.platformTypeSt = platformTypeSt;
            return this;
        }
        public ConditionBuilder platformTypeLessEqThan(Integer platformTypeEd){
            this.platformTypeEd = platformTypeEd;
            return this;
        }


        public ConditionBuilder platformTypeList(Integer ... platformType){
            this.platformTypeList = solveNullList(platformType);
            return this;
        }

        public ConditionBuilder platformTypeList(List<Integer> platformType){
            this.platformTypeList = platformType;
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

        private Product obj;

        public Builder(){
            this.obj = new Product();
        }

        public Builder productId(Integer productId){
            this.obj.setProductId(productId);
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
        public Builder platformType(Integer platformType){
            this.obj.setPlatformType(platformType);
            return this;
        }
        public Product build(){return obj;}
    }

}
