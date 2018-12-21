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
public class Carousel implements Serializable {

    private static final long serialVersionUID = 1545382455367L;


    /**
    * 主键
    * 轮播图主键
    * isNullAble:0
    */
    private Integer carouselId;

    /**
    * 图片的url
    * isNullAble:1
    */
    private String imageUrl;

    /**
    * 图片位置
    * isNullAble:1,defaultVal:0
    */
    private Integer location;

    /**
    * 图片说明
    * isNullAble:1
    */
    private String title;

    /**
    * 跳转的目的地址
    * isNullAble:1
    */
    private String destinationUrl;


    public void setCarouselId(Integer carouselId){this.carouselId = carouselId;}

    public Integer getCarouselId(){return this.carouselId;}

    public void setImageUrl(String imageUrl){this.imageUrl = imageUrl;}

    public String getImageUrl(){return this.imageUrl;}

    public void setLocation(Integer location){this.location = location;}

    public Integer getLocation(){return this.location;}

    public void setTitle(String title){this.title = title;}

    public String getTitle(){return this.title;}

    public void setDestinationUrl(String destinationUrl){this.destinationUrl = destinationUrl;}

    public String getDestinationUrl(){return this.destinationUrl;}
    @Override
    public String toString() {
        return "Carousel{" +
                "carouselId='" + carouselId + '\'' +
                "imageUrl='" + imageUrl + '\'' +
                "location='" + location + '\'' +
                "title='" + title + '\'' +
                "destinationUrl='" + destinationUrl + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private Carousel set;

        private ConditionBuilder where;

        public UpdateBuilder set(Carousel set){
            this.set = set;
            return this;
        }

        public Carousel getSet(){
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

    public static class QueryBuilder extends Carousel{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> carouselIdList;

        public List<Integer> getCarouselIdList(){return this.carouselIdList;}

        private Integer carouselIdSt;

        private Integer carouselIdEd;

        public Integer getCarouselIdSt(){return this.carouselIdSt;}

        public Integer getCarouselIdEd(){return this.carouselIdEd;}

        private List<String> imageUrlList;

        public List<String> getImageUrlList(){return this.imageUrlList;}


        private List<String> fuzzyImageUrl;

        public List<String> getFuzzyImageUrl(){return this.fuzzyImageUrl;}

        private List<String> rightFuzzyImageUrl;

        public List<String> getRightFuzzyImageUrl(){return this.rightFuzzyImageUrl;}
        private List<Integer> locationList;

        public List<Integer> getLocationList(){return this.locationList;}

        private Integer locationSt;

        private Integer locationEd;

        public Integer getLocationSt(){return this.locationSt;}

        public Integer getLocationEd(){return this.locationEd;}

        private List<String> titleList;

        public List<String> getTitleList(){return this.titleList;}


        private List<String> fuzzyTitle;

        public List<String> getFuzzyTitle(){return this.fuzzyTitle;}

        private List<String> rightFuzzyTitle;

        public List<String> getRightFuzzyTitle(){return this.rightFuzzyTitle;}
        private List<String> destinationUrlList;

        public List<String> getDestinationUrlList(){return this.destinationUrlList;}


        private List<String> fuzzyDestinationUrl;

        public List<String> getFuzzyDestinationUrl(){return this.fuzzyDestinationUrl;}

        private List<String> rightFuzzyDestinationUrl;

        public List<String> getRightFuzzyDestinationUrl(){return this.rightFuzzyDestinationUrl;}
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder carouselIdBetWeen(Integer carouselIdSt,Integer carouselIdEd){
            this.carouselIdSt = carouselIdSt;
            this.carouselIdEd = carouselIdEd;
            return this;
        }

        public QueryBuilder carouselIdGreaterEqThan(Integer carouselIdSt){
            this.carouselIdSt = carouselIdSt;
            return this;
        }
        public QueryBuilder carouselIdLessEqThan(Integer carouselIdEd){
            this.carouselIdEd = carouselIdEd;
            return this;
        }


        public QueryBuilder carouselId(Integer carouselId){
            setCarouselId(carouselId);
            return this;
        }

        public QueryBuilder carouselIdList(Integer ... carouselId){
            this.carouselIdList = solveNullList(carouselId);
            return this;
        }

        public QueryBuilder carouselIdList(List<Integer> carouselId){
            this.carouselIdList = carouselId;
            return this;
        }

        public QueryBuilder fetchCarouselId(){
            setFetchFields("fetchFields","carouselId");
            return this;
        }

        public QueryBuilder excludeCarouselId(){
            setFetchFields("excludeFields","carouselId");
            return this;
        }

        public QueryBuilder fuzzyImageUrl (List<String> fuzzyImageUrl){
            this.fuzzyImageUrl = fuzzyImageUrl;
            return this;
        }

        public QueryBuilder fuzzyImageUrl (String ... fuzzyImageUrl){
            this.fuzzyImageUrl = solveNullList(fuzzyImageUrl);
            return this;
        }

        public QueryBuilder rightFuzzyImageUrl (List<String> rightFuzzyImageUrl){
            this.rightFuzzyImageUrl = rightFuzzyImageUrl;
            return this;
        }

        public QueryBuilder rightFuzzyImageUrl (String ... rightFuzzyImageUrl){
            this.rightFuzzyImageUrl = solveNullList(rightFuzzyImageUrl);
            return this;
        }

        public QueryBuilder imageUrl(String imageUrl){
            setImageUrl(imageUrl);
            return this;
        }

        public QueryBuilder imageUrlList(String ... imageUrl){
            this.imageUrlList = solveNullList(imageUrl);
            return this;
        }

        public QueryBuilder imageUrlList(List<String> imageUrl){
            this.imageUrlList = imageUrl;
            return this;
        }

        public QueryBuilder fetchImageUrl(){
            setFetchFields("fetchFields","imageUrl");
            return this;
        }

        public QueryBuilder excludeImageUrl(){
            setFetchFields("excludeFields","imageUrl");
            return this;
        }

        public QueryBuilder locationBetWeen(Integer locationSt,Integer locationEd){
            this.locationSt = locationSt;
            this.locationEd = locationEd;
            return this;
        }

        public QueryBuilder locationGreaterEqThan(Integer locationSt){
            this.locationSt = locationSt;
            return this;
        }
        public QueryBuilder locationLessEqThan(Integer locationEd){
            this.locationEd = locationEd;
            return this;
        }


        public QueryBuilder location(Integer location){
            setLocation(location);
            return this;
        }

        public QueryBuilder locationList(Integer ... location){
            this.locationList = solveNullList(location);
            return this;
        }

        public QueryBuilder locationList(List<Integer> location){
            this.locationList = location;
            return this;
        }

        public QueryBuilder fetchLocation(){
            setFetchFields("fetchFields","location");
            return this;
        }

        public QueryBuilder excludeLocation(){
            setFetchFields("excludeFields","location");
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

        public QueryBuilder fuzzyDestinationUrl (List<String> fuzzyDestinationUrl){
            this.fuzzyDestinationUrl = fuzzyDestinationUrl;
            return this;
        }

        public QueryBuilder fuzzyDestinationUrl (String ... fuzzyDestinationUrl){
            this.fuzzyDestinationUrl = solveNullList(fuzzyDestinationUrl);
            return this;
        }

        public QueryBuilder rightFuzzyDestinationUrl (List<String> rightFuzzyDestinationUrl){
            this.rightFuzzyDestinationUrl = rightFuzzyDestinationUrl;
            return this;
        }

        public QueryBuilder rightFuzzyDestinationUrl (String ... rightFuzzyDestinationUrl){
            this.rightFuzzyDestinationUrl = solveNullList(rightFuzzyDestinationUrl);
            return this;
        }

        public QueryBuilder destinationUrl(String destinationUrl){
            setDestinationUrl(destinationUrl);
            return this;
        }

        public QueryBuilder destinationUrlList(String ... destinationUrl){
            this.destinationUrlList = solveNullList(destinationUrl);
            return this;
        }

        public QueryBuilder destinationUrlList(List<String> destinationUrl){
            this.destinationUrlList = destinationUrl;
            return this;
        }

        public QueryBuilder fetchDestinationUrl(){
            setFetchFields("fetchFields","destinationUrl");
            return this;
        }

        public QueryBuilder excludeDestinationUrl(){
            setFetchFields("excludeFields","destinationUrl");
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

        public Carousel build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> carouselIdList;

        public List<Integer> getCarouselIdList(){return this.carouselIdList;}

        private Integer carouselIdSt;

        private Integer carouselIdEd;

        public Integer getCarouselIdSt(){return this.carouselIdSt;}

        public Integer getCarouselIdEd(){return this.carouselIdEd;}

        private List<String> imageUrlList;

        public List<String> getImageUrlList(){return this.imageUrlList;}


        private List<String> fuzzyImageUrl;

        public List<String> getFuzzyImageUrl(){return this.fuzzyImageUrl;}

        private List<String> rightFuzzyImageUrl;

        public List<String> getRightFuzzyImageUrl(){return this.rightFuzzyImageUrl;}
        private List<Integer> locationList;

        public List<Integer> getLocationList(){return this.locationList;}

        private Integer locationSt;

        private Integer locationEd;

        public Integer getLocationSt(){return this.locationSt;}

        public Integer getLocationEd(){return this.locationEd;}

        private List<String> titleList;

        public List<String> getTitleList(){return this.titleList;}


        private List<String> fuzzyTitle;

        public List<String> getFuzzyTitle(){return this.fuzzyTitle;}

        private List<String> rightFuzzyTitle;

        public List<String> getRightFuzzyTitle(){return this.rightFuzzyTitle;}
        private List<String> destinationUrlList;

        public List<String> getDestinationUrlList(){return this.destinationUrlList;}


        private List<String> fuzzyDestinationUrl;

        public List<String> getFuzzyDestinationUrl(){return this.fuzzyDestinationUrl;}

        private List<String> rightFuzzyDestinationUrl;

        public List<String> getRightFuzzyDestinationUrl(){return this.rightFuzzyDestinationUrl;}

        public ConditionBuilder carouselIdBetWeen(Integer carouselIdSt,Integer carouselIdEd){
            this.carouselIdSt = carouselIdSt;
            this.carouselIdEd = carouselIdEd;
            return this;
        }

        public ConditionBuilder carouselIdGreaterEqThan(Integer carouselIdSt){
            this.carouselIdSt = carouselIdSt;
            return this;
        }
        public ConditionBuilder carouselIdLessEqThan(Integer carouselIdEd){
            this.carouselIdEd = carouselIdEd;
            return this;
        }


        public ConditionBuilder carouselIdList(Integer ... carouselId){
            this.carouselIdList = solveNullList(carouselId);
            return this;
        }

        public ConditionBuilder carouselIdList(List<Integer> carouselId){
            this.carouselIdList = carouselId;
            return this;
        }

        public ConditionBuilder fuzzyImageUrl (List<String> fuzzyImageUrl){
            this.fuzzyImageUrl = fuzzyImageUrl;
            return this;
        }

        public ConditionBuilder fuzzyImageUrl (String ... fuzzyImageUrl){
            this.fuzzyImageUrl = solveNullList(fuzzyImageUrl);
            return this;
        }

        public ConditionBuilder rightFuzzyImageUrl (List<String> rightFuzzyImageUrl){
            this.rightFuzzyImageUrl = rightFuzzyImageUrl;
            return this;
        }

        public ConditionBuilder rightFuzzyImageUrl (String ... rightFuzzyImageUrl){
            this.rightFuzzyImageUrl = solveNullList(rightFuzzyImageUrl);
            return this;
        }

        public ConditionBuilder imageUrlList(String ... imageUrl){
            this.imageUrlList = solveNullList(imageUrl);
            return this;
        }

        public ConditionBuilder imageUrlList(List<String> imageUrl){
            this.imageUrlList = imageUrl;
            return this;
        }

        public ConditionBuilder locationBetWeen(Integer locationSt,Integer locationEd){
            this.locationSt = locationSt;
            this.locationEd = locationEd;
            return this;
        }

        public ConditionBuilder locationGreaterEqThan(Integer locationSt){
            this.locationSt = locationSt;
            return this;
        }
        public ConditionBuilder locationLessEqThan(Integer locationEd){
            this.locationEd = locationEd;
            return this;
        }


        public ConditionBuilder locationList(Integer ... location){
            this.locationList = solveNullList(location);
            return this;
        }

        public ConditionBuilder locationList(List<Integer> location){
            this.locationList = location;
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

        public ConditionBuilder fuzzyDestinationUrl (List<String> fuzzyDestinationUrl){
            this.fuzzyDestinationUrl = fuzzyDestinationUrl;
            return this;
        }

        public ConditionBuilder fuzzyDestinationUrl (String ... fuzzyDestinationUrl){
            this.fuzzyDestinationUrl = solveNullList(fuzzyDestinationUrl);
            return this;
        }

        public ConditionBuilder rightFuzzyDestinationUrl (List<String> rightFuzzyDestinationUrl){
            this.rightFuzzyDestinationUrl = rightFuzzyDestinationUrl;
            return this;
        }

        public ConditionBuilder rightFuzzyDestinationUrl (String ... rightFuzzyDestinationUrl){
            this.rightFuzzyDestinationUrl = solveNullList(rightFuzzyDestinationUrl);
            return this;
        }

        public ConditionBuilder destinationUrlList(String ... destinationUrl){
            this.destinationUrlList = solveNullList(destinationUrl);
            return this;
        }

        public ConditionBuilder destinationUrlList(List<String> destinationUrl){
            this.destinationUrlList = destinationUrl;
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

        private Carousel obj;

        public Builder(){
            this.obj = new Carousel();
        }

        public Builder carouselId(Integer carouselId){
            this.obj.setCarouselId(carouselId);
            return this;
        }
        public Builder imageUrl(String imageUrl){
            this.obj.setImageUrl(imageUrl);
            return this;
        }
        public Builder location(Integer location){
            this.obj.setLocation(location);
            return this;
        }
        public Builder title(String title){
            this.obj.setTitle(title);
            return this;
        }
        public Builder destinationUrl(String destinationUrl){
            this.obj.setDestinationUrl(destinationUrl);
            return this;
        }
        public Carousel build(){return obj;}
    }

}
