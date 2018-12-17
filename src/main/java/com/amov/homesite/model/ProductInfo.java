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
public class ProductInfo implements Serializable {

    private static final long serialVersionUID = 1544694714237L;


    /**
    * 主键
    * 产品详情主键
    * isNullAble:0
    */
    private Integer productInfoId;

    /**
    * 产品id
    * isNullAble:0
    */
    private Integer productId;

    /**
    * 简介
    * isNullAble:1
    */
    private String intro;

    /**
    * 视频的url
    * isNullAble:1
    */
    private String videoUrl;

    /**
    * 属性
    * isNullAble:1
    */
    private String property;

    /**
    * 功能
    * isNullAble:1
    */
    private String function;

    /**
    * 特色
    * isNullAble:1
    */
    private String feature;


    public void setProductInfoId(Integer productInfoId){this.productInfoId = productInfoId;}

    public Integer getProductInfoId(){return this.productInfoId;}

    public void setProductId(Integer productId){this.productId = productId;}

    public Integer getProductId(){return this.productId;}

    public void setIntro(String intro){this.intro = intro;}

    public String getIntro(){return this.intro;}

    public void setVideoUrl(String videoUrl){this.videoUrl = videoUrl;}

    public String getVideoUrl(){return this.videoUrl;}

    public void setProperty(String property){this.property = property;}

    public String getProperty(){return this.property;}

    public void setFunction(String function){this.function = function;}

    public String getFunction(){return this.function;}

    public void setFeature(String feature){this.feature = feature;}

    public String getFeature(){return this.feature;}
    @Override
    public String toString() {
        return "ProductInfo{" +
                "productInfoId='" + productInfoId + '\'' +
                "productId='" + productId + '\'' +
                "intro='" + intro + '\'' +
                "videoUrl='" + videoUrl + '\'' +
                "property='" + property + '\'' +
                "function='" + function + '\'' +
                "feature='" + feature + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private ProductInfo set;

        private ConditionBuilder where;

        public UpdateBuilder set(ProductInfo set){
            this.set = set;
            return this;
        }

        public ProductInfo getSet(){
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

    public static class QueryBuilder extends ProductInfo{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> productInfoIdList;

        public List<Integer> getProductInfoIdList(){return this.productInfoIdList;}

        private Integer productInfoIdSt;

        private Integer productInfoIdEd;

        public Integer getProductInfoIdSt(){return this.productInfoIdSt;}

        public Integer getProductInfoIdEd(){return this.productInfoIdEd;}

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
        private List<String> videoUrlList;

        public List<String> getVideoUrlList(){return this.videoUrlList;}


        private List<String> fuzzyVideoUrl;

        public List<String> getFuzzyVideoUrl(){return this.fuzzyVideoUrl;}

        private List<String> rightFuzzyVideoUrl;

        public List<String> getRightFuzzyVideoUrl(){return this.rightFuzzyVideoUrl;}
        private List<String> propertyList;

        public List<String> getPropertyList(){return this.propertyList;}


        private List<String> fuzzyProperty;

        public List<String> getFuzzyProperty(){return this.fuzzyProperty;}

        private List<String> rightFuzzyProperty;

        public List<String> getRightFuzzyProperty(){return this.rightFuzzyProperty;}
        private List<String> functionList;

        public List<String> getFunctionList(){return this.functionList;}


        private List<String> fuzzyFunction;

        public List<String> getFuzzyFunction(){return this.fuzzyFunction;}

        private List<String> rightFuzzyFunction;

        public List<String> getRightFuzzyFunction(){return this.rightFuzzyFunction;}
        private List<String> featureList;

        public List<String> getFeatureList(){return this.featureList;}


        private List<String> fuzzyFeature;

        public List<String> getFuzzyFeature(){return this.fuzzyFeature;}

        private List<String> rightFuzzyFeature;

        public List<String> getRightFuzzyFeature(){return this.rightFuzzyFeature;}
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder productInfoIdBetWeen(Integer productInfoIdSt,Integer productInfoIdEd){
            this.productInfoIdSt = productInfoIdSt;
            this.productInfoIdEd = productInfoIdEd;
            return this;
        }

        public QueryBuilder productInfoIdGreaterEqThan(Integer productInfoIdSt){
            this.productInfoIdSt = productInfoIdSt;
            return this;
        }
        public QueryBuilder productInfoIdLessEqThan(Integer productInfoIdEd){
            this.productInfoIdEd = productInfoIdEd;
            return this;
        }


        public QueryBuilder productInfoId(Integer productInfoId){
            setProductInfoId(productInfoId);
            return this;
        }

        public QueryBuilder productInfoIdList(Integer ... productInfoId){
            this.productInfoIdList = solveNullList(productInfoId);
            return this;
        }

        public QueryBuilder productInfoIdList(List<Integer> productInfoId){
            this.productInfoIdList = productInfoId;
            return this;
        }

        public QueryBuilder fetchProductInfoId(){
            setFetchFields("fetchFields","productInfoId");
            return this;
        }

        public QueryBuilder excludeProductInfoId(){
            setFetchFields("excludeFields","productInfoId");
            return this;
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

        public QueryBuilder fuzzyVideoUrl (List<String> fuzzyVideoUrl){
            this.fuzzyVideoUrl = fuzzyVideoUrl;
            return this;
        }

        public QueryBuilder fuzzyVideoUrl (String ... fuzzyVideoUrl){
            this.fuzzyVideoUrl = solveNullList(fuzzyVideoUrl);
            return this;
        }

        public QueryBuilder rightFuzzyVideoUrl (List<String> rightFuzzyVideoUrl){
            this.rightFuzzyVideoUrl = rightFuzzyVideoUrl;
            return this;
        }

        public QueryBuilder rightFuzzyVideoUrl (String ... rightFuzzyVideoUrl){
            this.rightFuzzyVideoUrl = solveNullList(rightFuzzyVideoUrl);
            return this;
        }

        public QueryBuilder videoUrl(String videoUrl){
            setVideoUrl(videoUrl);
            return this;
        }

        public QueryBuilder videoUrlList(String ... videoUrl){
            this.videoUrlList = solveNullList(videoUrl);
            return this;
        }

        public QueryBuilder videoUrlList(List<String> videoUrl){
            this.videoUrlList = videoUrl;
            return this;
        }

        public QueryBuilder fetchVideoUrl(){
            setFetchFields("fetchFields","videoUrl");
            return this;
        }

        public QueryBuilder excludeVideoUrl(){
            setFetchFields("excludeFields","videoUrl");
            return this;
        }

        public QueryBuilder fuzzyProperty (List<String> fuzzyProperty){
            this.fuzzyProperty = fuzzyProperty;
            return this;
        }

        public QueryBuilder fuzzyProperty (String ... fuzzyProperty){
            this.fuzzyProperty = solveNullList(fuzzyProperty);
            return this;
        }

        public QueryBuilder rightFuzzyProperty (List<String> rightFuzzyProperty){
            this.rightFuzzyProperty = rightFuzzyProperty;
            return this;
        }

        public QueryBuilder rightFuzzyProperty (String ... rightFuzzyProperty){
            this.rightFuzzyProperty = solveNullList(rightFuzzyProperty);
            return this;
        }

        public QueryBuilder property(String property){
            setProperty(property);
            return this;
        }

        public QueryBuilder propertyList(String ... property){
            this.propertyList = solveNullList(property);
            return this;
        }

        public QueryBuilder propertyList(List<String> property){
            this.propertyList = property;
            return this;
        }

        public QueryBuilder fetchProperty(){
            setFetchFields("fetchFields","property");
            return this;
        }

        public QueryBuilder excludeProperty(){
            setFetchFields("excludeFields","property");
            return this;
        }

        public QueryBuilder fuzzyFunction (List<String> fuzzyFunction){
            this.fuzzyFunction = fuzzyFunction;
            return this;
        }

        public QueryBuilder fuzzyFunction (String ... fuzzyFunction){
            this.fuzzyFunction = solveNullList(fuzzyFunction);
            return this;
        }

        public QueryBuilder rightFuzzyFunction (List<String> rightFuzzyFunction){
            this.rightFuzzyFunction = rightFuzzyFunction;
            return this;
        }

        public QueryBuilder rightFuzzyFunction (String ... rightFuzzyFunction){
            this.rightFuzzyFunction = solveNullList(rightFuzzyFunction);
            return this;
        }

        public QueryBuilder function(String function){
            setFunction(function);
            return this;
        }

        public QueryBuilder functionList(String ... function){
            this.functionList = solveNullList(function);
            return this;
        }

        public QueryBuilder functionList(List<String> function){
            this.functionList = function;
            return this;
        }

        public QueryBuilder fetchFunction(){
            setFetchFields("fetchFields","function");
            return this;
        }

        public QueryBuilder excludeFunction(){
            setFetchFields("excludeFields","function");
            return this;
        }

        public QueryBuilder fuzzyFeature (List<String> fuzzyFeature){
            this.fuzzyFeature = fuzzyFeature;
            return this;
        }

        public QueryBuilder fuzzyFeature (String ... fuzzyFeature){
            this.fuzzyFeature = solveNullList(fuzzyFeature);
            return this;
        }

        public QueryBuilder rightFuzzyFeature (List<String> rightFuzzyFeature){
            this.rightFuzzyFeature = rightFuzzyFeature;
            return this;
        }

        public QueryBuilder rightFuzzyFeature (String ... rightFuzzyFeature){
            this.rightFuzzyFeature = solveNullList(rightFuzzyFeature);
            return this;
        }

        public QueryBuilder feature(String feature){
            setFeature(feature);
            return this;
        }

        public QueryBuilder featureList(String ... feature){
            this.featureList = solveNullList(feature);
            return this;
        }

        public QueryBuilder featureList(List<String> feature){
            this.featureList = feature;
            return this;
        }

        public QueryBuilder fetchFeature(){
            setFetchFields("fetchFields","feature");
            return this;
        }

        public QueryBuilder excludeFeature(){
            setFetchFields("excludeFields","feature");
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

        public ProductInfo build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> productInfoIdList;

        public List<Integer> getProductInfoIdList(){return this.productInfoIdList;}

        private Integer productInfoIdSt;

        private Integer productInfoIdEd;

        public Integer getProductInfoIdSt(){return this.productInfoIdSt;}

        public Integer getProductInfoIdEd(){return this.productInfoIdEd;}

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
        private List<String> videoUrlList;

        public List<String> getVideoUrlList(){return this.videoUrlList;}


        private List<String> fuzzyVideoUrl;

        public List<String> getFuzzyVideoUrl(){return this.fuzzyVideoUrl;}

        private List<String> rightFuzzyVideoUrl;

        public List<String> getRightFuzzyVideoUrl(){return this.rightFuzzyVideoUrl;}
        private List<String> propertyList;

        public List<String> getPropertyList(){return this.propertyList;}


        private List<String> fuzzyProperty;

        public List<String> getFuzzyProperty(){return this.fuzzyProperty;}

        private List<String> rightFuzzyProperty;

        public List<String> getRightFuzzyProperty(){return this.rightFuzzyProperty;}
        private List<String> functionList;

        public List<String> getFunctionList(){return this.functionList;}


        private List<String> fuzzyFunction;

        public List<String> getFuzzyFunction(){return this.fuzzyFunction;}

        private List<String> rightFuzzyFunction;

        public List<String> getRightFuzzyFunction(){return this.rightFuzzyFunction;}
        private List<String> featureList;

        public List<String> getFeatureList(){return this.featureList;}


        private List<String> fuzzyFeature;

        public List<String> getFuzzyFeature(){return this.fuzzyFeature;}

        private List<String> rightFuzzyFeature;

        public List<String> getRightFuzzyFeature(){return this.rightFuzzyFeature;}

        public ConditionBuilder productInfoIdBetWeen(Integer productInfoIdSt,Integer productInfoIdEd){
            this.productInfoIdSt = productInfoIdSt;
            this.productInfoIdEd = productInfoIdEd;
            return this;
        }

        public ConditionBuilder productInfoIdGreaterEqThan(Integer productInfoIdSt){
            this.productInfoIdSt = productInfoIdSt;
            return this;
        }
        public ConditionBuilder productInfoIdLessEqThan(Integer productInfoIdEd){
            this.productInfoIdEd = productInfoIdEd;
            return this;
        }


        public ConditionBuilder productInfoIdList(Integer ... productInfoId){
            this.productInfoIdList = solveNullList(productInfoId);
            return this;
        }

        public ConditionBuilder productInfoIdList(List<Integer> productInfoId){
            this.productInfoIdList = productInfoId;
            return this;
        }

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

        public ConditionBuilder fuzzyVideoUrl (List<String> fuzzyVideoUrl){
            this.fuzzyVideoUrl = fuzzyVideoUrl;
            return this;
        }

        public ConditionBuilder fuzzyVideoUrl (String ... fuzzyVideoUrl){
            this.fuzzyVideoUrl = solveNullList(fuzzyVideoUrl);
            return this;
        }

        public ConditionBuilder rightFuzzyVideoUrl (List<String> rightFuzzyVideoUrl){
            this.rightFuzzyVideoUrl = rightFuzzyVideoUrl;
            return this;
        }

        public ConditionBuilder rightFuzzyVideoUrl (String ... rightFuzzyVideoUrl){
            this.rightFuzzyVideoUrl = solveNullList(rightFuzzyVideoUrl);
            return this;
        }

        public ConditionBuilder videoUrlList(String ... videoUrl){
            this.videoUrlList = solveNullList(videoUrl);
            return this;
        }

        public ConditionBuilder videoUrlList(List<String> videoUrl){
            this.videoUrlList = videoUrl;
            return this;
        }

        public ConditionBuilder fuzzyProperty (List<String> fuzzyProperty){
            this.fuzzyProperty = fuzzyProperty;
            return this;
        }

        public ConditionBuilder fuzzyProperty (String ... fuzzyProperty){
            this.fuzzyProperty = solveNullList(fuzzyProperty);
            return this;
        }

        public ConditionBuilder rightFuzzyProperty (List<String> rightFuzzyProperty){
            this.rightFuzzyProperty = rightFuzzyProperty;
            return this;
        }

        public ConditionBuilder rightFuzzyProperty (String ... rightFuzzyProperty){
            this.rightFuzzyProperty = solveNullList(rightFuzzyProperty);
            return this;
        }

        public ConditionBuilder propertyList(String ... property){
            this.propertyList = solveNullList(property);
            return this;
        }

        public ConditionBuilder propertyList(List<String> property){
            this.propertyList = property;
            return this;
        }

        public ConditionBuilder fuzzyFunction (List<String> fuzzyFunction){
            this.fuzzyFunction = fuzzyFunction;
            return this;
        }

        public ConditionBuilder fuzzyFunction (String ... fuzzyFunction){
            this.fuzzyFunction = solveNullList(fuzzyFunction);
            return this;
        }

        public ConditionBuilder rightFuzzyFunction (List<String> rightFuzzyFunction){
            this.rightFuzzyFunction = rightFuzzyFunction;
            return this;
        }

        public ConditionBuilder rightFuzzyFunction (String ... rightFuzzyFunction){
            this.rightFuzzyFunction = solveNullList(rightFuzzyFunction);
            return this;
        }

        public ConditionBuilder functionList(String ... function){
            this.functionList = solveNullList(function);
            return this;
        }

        public ConditionBuilder functionList(List<String> function){
            this.functionList = function;
            return this;
        }

        public ConditionBuilder fuzzyFeature (List<String> fuzzyFeature){
            this.fuzzyFeature = fuzzyFeature;
            return this;
        }

        public ConditionBuilder fuzzyFeature (String ... fuzzyFeature){
            this.fuzzyFeature = solveNullList(fuzzyFeature);
            return this;
        }

        public ConditionBuilder rightFuzzyFeature (List<String> rightFuzzyFeature){
            this.rightFuzzyFeature = rightFuzzyFeature;
            return this;
        }

        public ConditionBuilder rightFuzzyFeature (String ... rightFuzzyFeature){
            this.rightFuzzyFeature = solveNullList(rightFuzzyFeature);
            return this;
        }

        public ConditionBuilder featureList(String ... feature){
            this.featureList = solveNullList(feature);
            return this;
        }

        public ConditionBuilder featureList(List<String> feature){
            this.featureList = feature;
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

        private ProductInfo obj;

        public Builder(){
            this.obj = new ProductInfo();
        }

        public Builder productInfoId(Integer productInfoId){
            this.obj.setProductInfoId(productInfoId);
            return this;
        }
        public Builder productId(Integer productId){
            this.obj.setProductId(productId);
            return this;
        }
        public Builder intro(String intro){
            this.obj.setIntro(intro);
            return this;
        }
        public Builder videoUrl(String videoUrl){
            this.obj.setVideoUrl(videoUrl);
            return this;
        }
        public Builder property(String property){
            this.obj.setProperty(property);
            return this;
        }
        public Builder function(String function){
            this.obj.setFunction(function);
            return this;
        }
        public Builder feature(String feature){
            this.obj.setFeature(feature);
            return this;
        }
        public ProductInfo build(){return obj;}
    }

}
