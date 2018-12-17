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
public class CourseStatistic implements Serializable {

    private static final long serialVersionUID = 1544694190603L;


    /**
    * 主键
    * 课程统计主键
    * isNullAble:0
    */
    private Integer courseStatisticId;

    /**
    * 课程ID，作为外键，一对一
    * isNullAble:0
    */
    private Integer courseId;

    /**
    * page view
    * isNullAble:1,defaultVal:0
    */
    private Integer pageView;

    /**
    * unique visitor
    * isNullAble:1,defaultVal:0
    */
    private Integer uniqueVisitor;

    /**
    * purchased quantity
    * isNullAble:1,defaultVal:0
    */
    private Integer purchaseQuantity;

    /**
    * Internet Protocol 独立ip数量
    * isNullAble:1,defaultVal:0
    */
    private Integer internetProtocol;


    public void setCourseStatisticId(Integer courseStatisticId){this.courseStatisticId = courseStatisticId;}

    public Integer getCourseStatisticId(){return this.courseStatisticId;}

    public void setCourseId(Integer courseId){this.courseId = courseId;}

    public Integer getCourseId(){return this.courseId;}

    public void setPageView(Integer pageView){this.pageView = pageView;}

    public Integer getPageView(){return this.pageView;}

    public void setUniqueVisitor(Integer uniqueVisitor){this.uniqueVisitor = uniqueVisitor;}

    public Integer getUniqueVisitor(){return this.uniqueVisitor;}

    public void setPurchaseQuantity(Integer purchaseQuantity){this.purchaseQuantity = purchaseQuantity;}

    public Integer getPurchaseQuantity(){return this.purchaseQuantity;}

    public void setInternetProtocol(Integer internetProtocol){this.internetProtocol = internetProtocol;}

    public Integer getInternetProtocol(){return this.internetProtocol;}
    @Override
    public String toString() {
        return "CourseStatistic{" +
                "courseStatisticId='" + courseStatisticId + '\'' +
                "courseId='" + courseId + '\'' +
                "pageView='" + pageView + '\'' +
                "uniqueVisitor='" + uniqueVisitor + '\'' +
                "purchaseQuantity='" + purchaseQuantity + '\'' +
                "internetProtocol='" + internetProtocol + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private CourseStatistic set;

        private ConditionBuilder where;

        public UpdateBuilder set(CourseStatistic set){
            this.set = set;
            return this;
        }

        public CourseStatistic getSet(){
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

    public static class QueryBuilder extends CourseStatistic{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> courseStatisticIdList;

        public List<Integer> getCourseStatisticIdList(){return this.courseStatisticIdList;}

        private Integer courseStatisticIdSt;

        private Integer courseStatisticIdEd;

        public Integer getCourseStatisticIdSt(){return this.courseStatisticIdSt;}

        public Integer getCourseStatisticIdEd(){return this.courseStatisticIdEd;}

        private List<Integer> courseIdList;

        public List<Integer> getCourseIdList(){return this.courseIdList;}

        private Integer courseIdSt;

        private Integer courseIdEd;

        public Integer getCourseIdSt(){return this.courseIdSt;}

        public Integer getCourseIdEd(){return this.courseIdEd;}

        private List<Integer> pageViewList;

        public List<Integer> getPageViewList(){return this.pageViewList;}

        private Integer pageViewSt;

        private Integer pageViewEd;

        public Integer getPageViewSt(){return this.pageViewSt;}

        public Integer getPageViewEd(){return this.pageViewEd;}

        private List<Integer> uniqueVisitorList;

        public List<Integer> getUniqueVisitorList(){return this.uniqueVisitorList;}

        private Integer uniqueVisitorSt;

        private Integer uniqueVisitorEd;

        public Integer getUniqueVisitorSt(){return this.uniqueVisitorSt;}

        public Integer getUniqueVisitorEd(){return this.uniqueVisitorEd;}

        private List<Integer> purchaseQuantityList;

        public List<Integer> getPurchaseQuantityList(){return this.purchaseQuantityList;}

        private Integer purchaseQuantitySt;

        private Integer purchaseQuantityEd;

        public Integer getPurchaseQuantitySt(){return this.purchaseQuantitySt;}

        public Integer getPurchaseQuantityEd(){return this.purchaseQuantityEd;}

        private List<Integer> internetProtocolList;

        public List<Integer> getInternetProtocolList(){return this.internetProtocolList;}

        private Integer internetProtocolSt;

        private Integer internetProtocolEd;

        public Integer getInternetProtocolSt(){return this.internetProtocolSt;}

        public Integer getInternetProtocolEd(){return this.internetProtocolEd;}

        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder courseStatisticIdBetWeen(Integer courseStatisticIdSt,Integer courseStatisticIdEd){
            this.courseStatisticIdSt = courseStatisticIdSt;
            this.courseStatisticIdEd = courseStatisticIdEd;
            return this;
        }

        public QueryBuilder courseStatisticIdGreaterEqThan(Integer courseStatisticIdSt){
            this.courseStatisticIdSt = courseStatisticIdSt;
            return this;
        }
        public QueryBuilder courseStatisticIdLessEqThan(Integer courseStatisticIdEd){
            this.courseStatisticIdEd = courseStatisticIdEd;
            return this;
        }


        public QueryBuilder courseStatisticId(Integer courseStatisticId){
            setCourseStatisticId(courseStatisticId);
            return this;
        }

        public QueryBuilder courseStatisticIdList(Integer ... courseStatisticId){
            this.courseStatisticIdList = solveNullList(courseStatisticId);
            return this;
        }

        public QueryBuilder courseStatisticIdList(List<Integer> courseStatisticId){
            this.courseStatisticIdList = courseStatisticId;
            return this;
        }

        public QueryBuilder fetchCourseStatisticId(){
            setFetchFields("fetchFields","courseStatisticId");
            return this;
        }

        public QueryBuilder excludeCourseStatisticId(){
            setFetchFields("excludeFields","courseStatisticId");
            return this;
        }

        public QueryBuilder courseIdBetWeen(Integer courseIdSt,Integer courseIdEd){
            this.courseIdSt = courseIdSt;
            this.courseIdEd = courseIdEd;
            return this;
        }

        public QueryBuilder courseIdGreaterEqThan(Integer courseIdSt){
            this.courseIdSt = courseIdSt;
            return this;
        }
        public QueryBuilder courseIdLessEqThan(Integer courseIdEd){
            this.courseIdEd = courseIdEd;
            return this;
        }


        public QueryBuilder courseId(Integer courseId){
            setCourseId(courseId);
            return this;
        }

        public QueryBuilder courseIdList(Integer ... courseId){
            this.courseIdList = solveNullList(courseId);
            return this;
        }

        public QueryBuilder courseIdList(List<Integer> courseId){
            this.courseIdList = courseId;
            return this;
        }

        public QueryBuilder fetchCourseId(){
            setFetchFields("fetchFields","courseId");
            return this;
        }

        public QueryBuilder excludeCourseId(){
            setFetchFields("excludeFields","courseId");
            return this;
        }

        public QueryBuilder pageViewBetWeen(Integer pageViewSt,Integer pageViewEd){
            this.pageViewSt = pageViewSt;
            this.pageViewEd = pageViewEd;
            return this;
        }

        public QueryBuilder pageViewGreaterEqThan(Integer pageViewSt){
            this.pageViewSt = pageViewSt;
            return this;
        }
        public QueryBuilder pageViewLessEqThan(Integer pageViewEd){
            this.pageViewEd = pageViewEd;
            return this;
        }


        public QueryBuilder pageView(Integer pageView){
            setPageView(pageView);
            return this;
        }

        public QueryBuilder pageViewList(Integer ... pageView){
            this.pageViewList = solveNullList(pageView);
            return this;
        }

        public QueryBuilder pageViewList(List<Integer> pageView){
            this.pageViewList = pageView;
            return this;
        }

        public QueryBuilder fetchPageView(){
            setFetchFields("fetchFields","pageView");
            return this;
        }

        public QueryBuilder excludePageView(){
            setFetchFields("excludeFields","pageView");
            return this;
        }

        public QueryBuilder uniqueVisitorBetWeen(Integer uniqueVisitorSt,Integer uniqueVisitorEd){
            this.uniqueVisitorSt = uniqueVisitorSt;
            this.uniqueVisitorEd = uniqueVisitorEd;
            return this;
        }

        public QueryBuilder uniqueVisitorGreaterEqThan(Integer uniqueVisitorSt){
            this.uniqueVisitorSt = uniqueVisitorSt;
            return this;
        }
        public QueryBuilder uniqueVisitorLessEqThan(Integer uniqueVisitorEd){
            this.uniqueVisitorEd = uniqueVisitorEd;
            return this;
        }


        public QueryBuilder uniqueVisitor(Integer uniqueVisitor){
            setUniqueVisitor(uniqueVisitor);
            return this;
        }

        public QueryBuilder uniqueVisitorList(Integer ... uniqueVisitor){
            this.uniqueVisitorList = solveNullList(uniqueVisitor);
            return this;
        }

        public QueryBuilder uniqueVisitorList(List<Integer> uniqueVisitor){
            this.uniqueVisitorList = uniqueVisitor;
            return this;
        }

        public QueryBuilder fetchUniqueVisitor(){
            setFetchFields("fetchFields","uniqueVisitor");
            return this;
        }

        public QueryBuilder excludeUniqueVisitor(){
            setFetchFields("excludeFields","uniqueVisitor");
            return this;
        }

        public QueryBuilder purchaseQuantityBetWeen(Integer purchaseQuantitySt,Integer purchaseQuantityEd){
            this.purchaseQuantitySt = purchaseQuantitySt;
            this.purchaseQuantityEd = purchaseQuantityEd;
            return this;
        }

        public QueryBuilder purchaseQuantityGreaterEqThan(Integer purchaseQuantitySt){
            this.purchaseQuantitySt = purchaseQuantitySt;
            return this;
        }
        public QueryBuilder purchaseQuantityLessEqThan(Integer purchaseQuantityEd){
            this.purchaseQuantityEd = purchaseQuantityEd;
            return this;
        }


        public QueryBuilder purchaseQuantity(Integer purchaseQuantity){
            setPurchaseQuantity(purchaseQuantity);
            return this;
        }

        public QueryBuilder purchaseQuantityList(Integer ... purchaseQuantity){
            this.purchaseQuantityList = solveNullList(purchaseQuantity);
            return this;
        }

        public QueryBuilder purchaseQuantityList(List<Integer> purchaseQuantity){
            this.purchaseQuantityList = purchaseQuantity;
            return this;
        }

        public QueryBuilder fetchPurchaseQuantity(){
            setFetchFields("fetchFields","purchaseQuantity");
            return this;
        }

        public QueryBuilder excludePurchaseQuantity(){
            setFetchFields("excludeFields","purchaseQuantity");
            return this;
        }

        public QueryBuilder internetProtocolBetWeen(Integer internetProtocolSt,Integer internetProtocolEd){
            this.internetProtocolSt = internetProtocolSt;
            this.internetProtocolEd = internetProtocolEd;
            return this;
        }

        public QueryBuilder internetProtocolGreaterEqThan(Integer internetProtocolSt){
            this.internetProtocolSt = internetProtocolSt;
            return this;
        }
        public QueryBuilder internetProtocolLessEqThan(Integer internetProtocolEd){
            this.internetProtocolEd = internetProtocolEd;
            return this;
        }


        public QueryBuilder internetProtocol(Integer internetProtocol){
            setInternetProtocol(internetProtocol);
            return this;
        }

        public QueryBuilder internetProtocolList(Integer ... internetProtocol){
            this.internetProtocolList = solveNullList(internetProtocol);
            return this;
        }

        public QueryBuilder internetProtocolList(List<Integer> internetProtocol){
            this.internetProtocolList = internetProtocol;
            return this;
        }

        public QueryBuilder fetchInternetProtocol(){
            setFetchFields("fetchFields","internetProtocol");
            return this;
        }

        public QueryBuilder excludeInternetProtocol(){
            setFetchFields("excludeFields","internetProtocol");
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

        public CourseStatistic build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> courseStatisticIdList;

        public List<Integer> getCourseStatisticIdList(){return this.courseStatisticIdList;}

        private Integer courseStatisticIdSt;

        private Integer courseStatisticIdEd;

        public Integer getCourseStatisticIdSt(){return this.courseStatisticIdSt;}

        public Integer getCourseStatisticIdEd(){return this.courseStatisticIdEd;}

        private List<Integer> courseIdList;

        public List<Integer> getCourseIdList(){return this.courseIdList;}

        private Integer courseIdSt;

        private Integer courseIdEd;

        public Integer getCourseIdSt(){return this.courseIdSt;}

        public Integer getCourseIdEd(){return this.courseIdEd;}

        private List<Integer> pageViewList;

        public List<Integer> getPageViewList(){return this.pageViewList;}

        private Integer pageViewSt;

        private Integer pageViewEd;

        public Integer getPageViewSt(){return this.pageViewSt;}

        public Integer getPageViewEd(){return this.pageViewEd;}

        private List<Integer> uniqueVisitorList;

        public List<Integer> getUniqueVisitorList(){return this.uniqueVisitorList;}

        private Integer uniqueVisitorSt;

        private Integer uniqueVisitorEd;

        public Integer getUniqueVisitorSt(){return this.uniqueVisitorSt;}

        public Integer getUniqueVisitorEd(){return this.uniqueVisitorEd;}

        private List<Integer> purchaseQuantityList;

        public List<Integer> getPurchaseQuantityList(){return this.purchaseQuantityList;}

        private Integer purchaseQuantitySt;

        private Integer purchaseQuantityEd;

        public Integer getPurchaseQuantitySt(){return this.purchaseQuantitySt;}

        public Integer getPurchaseQuantityEd(){return this.purchaseQuantityEd;}

        private List<Integer> internetProtocolList;

        public List<Integer> getInternetProtocolList(){return this.internetProtocolList;}

        private Integer internetProtocolSt;

        private Integer internetProtocolEd;

        public Integer getInternetProtocolSt(){return this.internetProtocolSt;}

        public Integer getInternetProtocolEd(){return this.internetProtocolEd;}


        public ConditionBuilder courseStatisticIdBetWeen(Integer courseStatisticIdSt,Integer courseStatisticIdEd){
            this.courseStatisticIdSt = courseStatisticIdSt;
            this.courseStatisticIdEd = courseStatisticIdEd;
            return this;
        }

        public ConditionBuilder courseStatisticIdGreaterEqThan(Integer courseStatisticIdSt){
            this.courseStatisticIdSt = courseStatisticIdSt;
            return this;
        }
        public ConditionBuilder courseStatisticIdLessEqThan(Integer courseStatisticIdEd){
            this.courseStatisticIdEd = courseStatisticIdEd;
            return this;
        }


        public ConditionBuilder courseStatisticIdList(Integer ... courseStatisticId){
            this.courseStatisticIdList = solveNullList(courseStatisticId);
            return this;
        }

        public ConditionBuilder courseStatisticIdList(List<Integer> courseStatisticId){
            this.courseStatisticIdList = courseStatisticId;
            return this;
        }

        public ConditionBuilder courseIdBetWeen(Integer courseIdSt,Integer courseIdEd){
            this.courseIdSt = courseIdSt;
            this.courseIdEd = courseIdEd;
            return this;
        }

        public ConditionBuilder courseIdGreaterEqThan(Integer courseIdSt){
            this.courseIdSt = courseIdSt;
            return this;
        }
        public ConditionBuilder courseIdLessEqThan(Integer courseIdEd){
            this.courseIdEd = courseIdEd;
            return this;
        }


        public ConditionBuilder courseIdList(Integer ... courseId){
            this.courseIdList = solveNullList(courseId);
            return this;
        }

        public ConditionBuilder courseIdList(List<Integer> courseId){
            this.courseIdList = courseId;
            return this;
        }

        public ConditionBuilder pageViewBetWeen(Integer pageViewSt,Integer pageViewEd){
            this.pageViewSt = pageViewSt;
            this.pageViewEd = pageViewEd;
            return this;
        }

        public ConditionBuilder pageViewGreaterEqThan(Integer pageViewSt){
            this.pageViewSt = pageViewSt;
            return this;
        }
        public ConditionBuilder pageViewLessEqThan(Integer pageViewEd){
            this.pageViewEd = pageViewEd;
            return this;
        }


        public ConditionBuilder pageViewList(Integer ... pageView){
            this.pageViewList = solveNullList(pageView);
            return this;
        }

        public ConditionBuilder pageViewList(List<Integer> pageView){
            this.pageViewList = pageView;
            return this;
        }

        public ConditionBuilder uniqueVisitorBetWeen(Integer uniqueVisitorSt,Integer uniqueVisitorEd){
            this.uniqueVisitorSt = uniqueVisitorSt;
            this.uniqueVisitorEd = uniqueVisitorEd;
            return this;
        }

        public ConditionBuilder uniqueVisitorGreaterEqThan(Integer uniqueVisitorSt){
            this.uniqueVisitorSt = uniqueVisitorSt;
            return this;
        }
        public ConditionBuilder uniqueVisitorLessEqThan(Integer uniqueVisitorEd){
            this.uniqueVisitorEd = uniqueVisitorEd;
            return this;
        }


        public ConditionBuilder uniqueVisitorList(Integer ... uniqueVisitor){
            this.uniqueVisitorList = solveNullList(uniqueVisitor);
            return this;
        }

        public ConditionBuilder uniqueVisitorList(List<Integer> uniqueVisitor){
            this.uniqueVisitorList = uniqueVisitor;
            return this;
        }

        public ConditionBuilder purchaseQuantityBetWeen(Integer purchaseQuantitySt,Integer purchaseQuantityEd){
            this.purchaseQuantitySt = purchaseQuantitySt;
            this.purchaseQuantityEd = purchaseQuantityEd;
            return this;
        }

        public ConditionBuilder purchaseQuantityGreaterEqThan(Integer purchaseQuantitySt){
            this.purchaseQuantitySt = purchaseQuantitySt;
            return this;
        }
        public ConditionBuilder purchaseQuantityLessEqThan(Integer purchaseQuantityEd){
            this.purchaseQuantityEd = purchaseQuantityEd;
            return this;
        }


        public ConditionBuilder purchaseQuantityList(Integer ... purchaseQuantity){
            this.purchaseQuantityList = solveNullList(purchaseQuantity);
            return this;
        }

        public ConditionBuilder purchaseQuantityList(List<Integer> purchaseQuantity){
            this.purchaseQuantityList = purchaseQuantity;
            return this;
        }

        public ConditionBuilder internetProtocolBetWeen(Integer internetProtocolSt,Integer internetProtocolEd){
            this.internetProtocolSt = internetProtocolSt;
            this.internetProtocolEd = internetProtocolEd;
            return this;
        }

        public ConditionBuilder internetProtocolGreaterEqThan(Integer internetProtocolSt){
            this.internetProtocolSt = internetProtocolSt;
            return this;
        }
        public ConditionBuilder internetProtocolLessEqThan(Integer internetProtocolEd){
            this.internetProtocolEd = internetProtocolEd;
            return this;
        }


        public ConditionBuilder internetProtocolList(Integer ... internetProtocol){
            this.internetProtocolList = solveNullList(internetProtocol);
            return this;
        }

        public ConditionBuilder internetProtocolList(List<Integer> internetProtocol){
            this.internetProtocolList = internetProtocol;
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

        private CourseStatistic obj;

        public Builder(){
            this.obj = new CourseStatistic();
        }

        public Builder courseStatisticId(Integer courseStatisticId){
            this.obj.setCourseStatisticId(courseStatisticId);
            return this;
        }
        public Builder courseId(Integer courseId){
            this.obj.setCourseId(courseId);
            return this;
        }
        public Builder pageView(Integer pageView){
            this.obj.setPageView(pageView);
            return this;
        }
        public Builder uniqueVisitor(Integer uniqueVisitor){
            this.obj.setUniqueVisitor(uniqueVisitor);
            return this;
        }
        public Builder purchaseQuantity(Integer purchaseQuantity){
            this.obj.setPurchaseQuantity(purchaseQuantity);
            return this;
        }
        public Builder internetProtocol(Integer internetProtocol){
            this.obj.setInternetProtocol(internetProtocol);
            return this;
        }
        public CourseStatistic build(){return obj;}
    }

}
