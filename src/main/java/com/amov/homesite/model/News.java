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
public class News implements Serializable {

    private static final long serialVersionUID = 1548096052661L;


    /**
    * 主键
    * 新闻动态主键
    * isNullAble:0
    */
    private Integer newsId;

    /**
    * 新闻标题
    * isNullAble:1
    */
    private String title;

    /**
    * 内容
    * isNullAble:1
    */
    private String content;

    /**
    * 创建时间
    * isNullAble:0,defaultVal:current_timestamp()
    */
    private java.time.LocalDateTime createTime;

    /**
    * 修改时间
    * isNullAble:0,defaultVal:current_timestamp()
    */
    private java.time.LocalDateTime updateTime;

    /**
    * 新闻类型
    * isNullAble:0,defaultVal:0
    */
    private Integer newsType;

    /**
    * 新闻的预览图
    * isNullAble:1
    */
    private String profileUrl;

    /**
    * 作者
    * isNullAble:1
    */
    private String editorName;

    /**
    * 地址
    * isNullAble:1
    */
    private String location;

    /**
    * 开始时间
    * isNullAble:1
    */
    private java.time.LocalDateTime startDate;

    /**
    * 结束时间
    * isNullAble:1
    */
    private java.time.LocalDateTime endDate;


    public void setNewsId(Integer newsId){this.newsId = newsId;}

    public Integer getNewsId(){return this.newsId;}

    public void setTitle(String title){this.title = title;}

    public String getTitle(){return this.title;}

    public void setContent(String content){this.content = content;}

    public String getContent(){return this.content;}

    public void setCreateTime(java.time.LocalDateTime createTime){this.createTime = createTime;}

    public java.time.LocalDateTime getCreateTime(){return this.createTime;}

    public void setUpdateTime(java.time.LocalDateTime updateTime){this.updateTime = updateTime;}

    public java.time.LocalDateTime getUpdateTime(){return this.updateTime;}

    public void setNewsType(Integer newsType){this.newsType = newsType;}

    public Integer getNewsType(){return this.newsType;}

    public void setProfileUrl(String profileUrl){this.profileUrl = profileUrl;}

    public String getProfileUrl(){return this.profileUrl;}

    public void setEditorName(String editorName){this.editorName = editorName;}

    public String getEditorName(){return this.editorName;}

    public void setLocation(String location){this.location = location;}

    public String getLocation(){return this.location;}

    public void setStartDate(java.time.LocalDateTime startDate){this.startDate = startDate;}

    public java.time.LocalDateTime getStartDate(){return this.startDate;}

    public void setEndDate(java.time.LocalDateTime endDate){this.endDate = endDate;}

    public java.time.LocalDateTime getEndDate(){return this.endDate;}
    @Override
    public String toString() {
        return "News{" +
                "newsId='" + newsId + '\'' +
                "title='" + title + '\'' +
                "content='" + content + '\'' +
                "createTime='" + createTime + '\'' +
                "updateTime='" + updateTime + '\'' +
                "newsType='" + newsType + '\'' +
                "profileUrl='" + profileUrl + '\'' +
                "editorName='" + editorName + '\'' +
                "location='" + location + '\'' +
                "startDate='" + startDate + '\'' +
                "endDate='" + endDate + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private News set;

        private ConditionBuilder where;

        public UpdateBuilder set(News set){
            this.set = set;
            return this;
        }

        public News getSet(){
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

    public static class QueryBuilder extends News{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> newsIdList;

        public List<Integer> getNewsIdList(){return this.newsIdList;}

        private Integer newsIdSt;

        private Integer newsIdEd;

        public Integer getNewsIdSt(){return this.newsIdSt;}

        public Integer getNewsIdEd(){return this.newsIdEd;}

        private List<String> titleList;

        public List<String> getTitleList(){return this.titleList;}


        private List<String> fuzzyTitle;

        public List<String> getFuzzyTitle(){return this.fuzzyTitle;}

        private List<String> rightFuzzyTitle;

        public List<String> getRightFuzzyTitle(){return this.rightFuzzyTitle;}
        private List<String> contentList;

        public List<String> getContentList(){return this.contentList;}


        private List<String> fuzzyContent;

        public List<String> getFuzzyContent(){return this.fuzzyContent;}

        private List<String> rightFuzzyContent;

        public List<String> getRightFuzzyContent(){return this.rightFuzzyContent;}
        private List<java.time.LocalDateTime> createTimeList;

        public List<java.time.LocalDateTime> getCreateTimeList(){return this.createTimeList;}

        private java.time.LocalDateTime createTimeSt;

        private java.time.LocalDateTime createTimeEd;

        public java.time.LocalDateTime getCreateTimeSt(){return this.createTimeSt;}

        public java.time.LocalDateTime getCreateTimeEd(){return this.createTimeEd;}

        private List<java.time.LocalDateTime> updateTimeList;

        public List<java.time.LocalDateTime> getUpdateTimeList(){return this.updateTimeList;}

        private java.time.LocalDateTime updateTimeSt;

        private java.time.LocalDateTime updateTimeEd;

        public java.time.LocalDateTime getUpdateTimeSt(){return this.updateTimeSt;}

        public java.time.LocalDateTime getUpdateTimeEd(){return this.updateTimeEd;}

        private List<Integer> newsTypeList;

        public List<Integer> getNewsTypeList(){return this.newsTypeList;}

        private Integer newsTypeSt;

        private Integer newsTypeEd;

        public Integer getNewsTypeSt(){return this.newsTypeSt;}

        public Integer getNewsTypeEd(){return this.newsTypeEd;}

        private List<String> profileUrlList;

        public List<String> getProfileUrlList(){return this.profileUrlList;}


        private List<String> fuzzyProfileUrl;

        public List<String> getFuzzyProfileUrl(){return this.fuzzyProfileUrl;}

        private List<String> rightFuzzyProfileUrl;

        public List<String> getRightFuzzyProfileUrl(){return this.rightFuzzyProfileUrl;}
        private List<String> editorNameList;

        public List<String> getEditorNameList(){return this.editorNameList;}


        private List<String> fuzzyEditorName;

        public List<String> getFuzzyEditorName(){return this.fuzzyEditorName;}

        private List<String> rightFuzzyEditorName;

        public List<String> getRightFuzzyEditorName(){return this.rightFuzzyEditorName;}
        private List<String> locationList;

        public List<String> getLocationList(){return this.locationList;}


        private List<String> fuzzyLocation;

        public List<String> getFuzzyLocation(){return this.fuzzyLocation;}

        private List<String> rightFuzzyLocation;

        public List<String> getRightFuzzyLocation(){return this.rightFuzzyLocation;}
        private List<java.time.LocalDateTime> startDateList;

        public List<java.time.LocalDateTime> getStartDateList(){return this.startDateList;}

        private java.time.LocalDateTime startDateSt;

        private java.time.LocalDateTime startDateEd;

        public java.time.LocalDateTime getStartDateSt(){return this.startDateSt;}

        public java.time.LocalDateTime getStartDateEd(){return this.startDateEd;}

        private List<java.time.LocalDateTime> endDateList;

        public List<java.time.LocalDateTime> getEndDateList(){return this.endDateList;}

        private java.time.LocalDateTime endDateSt;

        private java.time.LocalDateTime endDateEd;

        public java.time.LocalDateTime getEndDateSt(){return this.endDateSt;}

        public java.time.LocalDateTime getEndDateEd(){return this.endDateEd;}

        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
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

        public QueryBuilder createTimeBetWeen(java.time.LocalDateTime createTimeSt,java.time.LocalDateTime createTimeEd){
            this.createTimeSt = createTimeSt;
            this.createTimeEd = createTimeEd;
            return this;
        }

        public QueryBuilder createTimeGreaterEqThan(java.time.LocalDateTime createTimeSt){
            this.createTimeSt = createTimeSt;
            return this;
        }
        public QueryBuilder createTimeLessEqThan(java.time.LocalDateTime createTimeEd){
            this.createTimeEd = createTimeEd;
            return this;
        }


        public QueryBuilder createTime(java.time.LocalDateTime createTime){
            setCreateTime(createTime);
            return this;
        }

        public QueryBuilder createTimeList(java.time.LocalDateTime ... createTime){
            this.createTimeList = solveNullList(createTime);
            return this;
        }

        public QueryBuilder createTimeList(List<java.time.LocalDateTime> createTime){
            this.createTimeList = createTime;
            return this;
        }

        public QueryBuilder fetchCreateTime(){
            setFetchFields("fetchFields","createTime");
            return this;
        }

        public QueryBuilder excludeCreateTime(){
            setFetchFields("excludeFields","createTime");
            return this;
        }

        public QueryBuilder updateTimeBetWeen(java.time.LocalDateTime updateTimeSt,java.time.LocalDateTime updateTimeEd){
            this.updateTimeSt = updateTimeSt;
            this.updateTimeEd = updateTimeEd;
            return this;
        }

        public QueryBuilder updateTimeGreaterEqThan(java.time.LocalDateTime updateTimeSt){
            this.updateTimeSt = updateTimeSt;
            return this;
        }
        public QueryBuilder updateTimeLessEqThan(java.time.LocalDateTime updateTimeEd){
            this.updateTimeEd = updateTimeEd;
            return this;
        }


        public QueryBuilder updateTime(java.time.LocalDateTime updateTime){
            setUpdateTime(updateTime);
            return this;
        }

        public QueryBuilder updateTimeList(java.time.LocalDateTime ... updateTime){
            this.updateTimeList = solveNullList(updateTime);
            return this;
        }

        public QueryBuilder updateTimeList(List<java.time.LocalDateTime> updateTime){
            this.updateTimeList = updateTime;
            return this;
        }

        public QueryBuilder fetchUpdateTime(){
            setFetchFields("fetchFields","updateTime");
            return this;
        }

        public QueryBuilder excludeUpdateTime(){
            setFetchFields("excludeFields","updateTime");
            return this;
        }

        public QueryBuilder newsTypeBetWeen(Integer newsTypeSt,Integer newsTypeEd){
            this.newsTypeSt = newsTypeSt;
            this.newsTypeEd = newsTypeEd;
            return this;
        }

        public QueryBuilder newsTypeGreaterEqThan(Integer newsTypeSt){
            this.newsTypeSt = newsTypeSt;
            return this;
        }
        public QueryBuilder newsTypeLessEqThan(Integer newsTypeEd){
            this.newsTypeEd = newsTypeEd;
            return this;
        }


        public QueryBuilder newsType(Integer newsType){
            setNewsType(newsType);
            return this;
        }

        public QueryBuilder newsTypeList(Integer ... newsType){
            this.newsTypeList = solveNullList(newsType);
            return this;
        }

        public QueryBuilder newsTypeList(List<Integer> newsType){
            this.newsTypeList = newsType;
            return this;
        }

        public QueryBuilder fetchNewsType(){
            setFetchFields("fetchFields","newsType");
            return this;
        }

        public QueryBuilder excludeNewsType(){
            setFetchFields("excludeFields","newsType");
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

        public QueryBuilder fuzzyEditorName (List<String> fuzzyEditorName){
            this.fuzzyEditorName = fuzzyEditorName;
            return this;
        }

        public QueryBuilder fuzzyEditorName (String ... fuzzyEditorName){
            this.fuzzyEditorName = solveNullList(fuzzyEditorName);
            return this;
        }

        public QueryBuilder rightFuzzyEditorName (List<String> rightFuzzyEditorName){
            this.rightFuzzyEditorName = rightFuzzyEditorName;
            return this;
        }

        public QueryBuilder rightFuzzyEditorName (String ... rightFuzzyEditorName){
            this.rightFuzzyEditorName = solveNullList(rightFuzzyEditorName);
            return this;
        }

        public QueryBuilder editorName(String editorName){
            setEditorName(editorName);
            return this;
        }

        public QueryBuilder editorNameList(String ... editorName){
            this.editorNameList = solveNullList(editorName);
            return this;
        }

        public QueryBuilder editorNameList(List<String> editorName){
            this.editorNameList = editorName;
            return this;
        }

        public QueryBuilder fetchEditorName(){
            setFetchFields("fetchFields","editorName");
            return this;
        }

        public QueryBuilder excludeEditorName(){
            setFetchFields("excludeFields","editorName");
            return this;
        }

        public QueryBuilder fuzzyLocation (List<String> fuzzyLocation){
            this.fuzzyLocation = fuzzyLocation;
            return this;
        }

        public QueryBuilder fuzzyLocation (String ... fuzzyLocation){
            this.fuzzyLocation = solveNullList(fuzzyLocation);
            return this;
        }

        public QueryBuilder rightFuzzyLocation (List<String> rightFuzzyLocation){
            this.rightFuzzyLocation = rightFuzzyLocation;
            return this;
        }

        public QueryBuilder rightFuzzyLocation (String ... rightFuzzyLocation){
            this.rightFuzzyLocation = solveNullList(rightFuzzyLocation);
            return this;
        }

        public QueryBuilder location(String location){
            setLocation(location);
            return this;
        }

        public QueryBuilder locationList(String ... location){
            this.locationList = solveNullList(location);
            return this;
        }

        public QueryBuilder locationList(List<String> location){
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

        public QueryBuilder startDateBetWeen(java.time.LocalDateTime startDateSt,java.time.LocalDateTime startDateEd){
            this.startDateSt = startDateSt;
            this.startDateEd = startDateEd;
            return this;
        }

        public QueryBuilder startDateGreaterEqThan(java.time.LocalDateTime startDateSt){
            this.startDateSt = startDateSt;
            return this;
        }
        public QueryBuilder startDateLessEqThan(java.time.LocalDateTime startDateEd){
            this.startDateEd = startDateEd;
            return this;
        }


        public QueryBuilder startDate(java.time.LocalDateTime startDate){
            setStartDate(startDate);
            return this;
        }

        public QueryBuilder startDateList(java.time.LocalDateTime ... startDate){
            this.startDateList = solveNullList(startDate);
            return this;
        }

        public QueryBuilder startDateList(List<java.time.LocalDateTime> startDate){
            this.startDateList = startDate;
            return this;
        }

        public QueryBuilder fetchStartDate(){
            setFetchFields("fetchFields","startDate");
            return this;
        }

        public QueryBuilder excludeStartDate(){
            setFetchFields("excludeFields","startDate");
            return this;
        }

        public QueryBuilder endDateBetWeen(java.time.LocalDateTime endDateSt,java.time.LocalDateTime endDateEd){
            this.endDateSt = endDateSt;
            this.endDateEd = endDateEd;
            return this;
        }

        public QueryBuilder endDateGreaterEqThan(java.time.LocalDateTime endDateSt){
            this.endDateSt = endDateSt;
            return this;
        }
        public QueryBuilder endDateLessEqThan(java.time.LocalDateTime endDateEd){
            this.endDateEd = endDateEd;
            return this;
        }


        public QueryBuilder endDate(java.time.LocalDateTime endDate){
            setEndDate(endDate);
            return this;
        }

        public QueryBuilder endDateList(java.time.LocalDateTime ... endDate){
            this.endDateList = solveNullList(endDate);
            return this;
        }

        public QueryBuilder endDateList(List<java.time.LocalDateTime> endDate){
            this.endDateList = endDate;
            return this;
        }

        public QueryBuilder fetchEndDate(){
            setFetchFields("fetchFields","endDate");
            return this;
        }

        public QueryBuilder excludeEndDate(){
            setFetchFields("excludeFields","endDate");
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

        public News build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> newsIdList;

        public List<Integer> getNewsIdList(){return this.newsIdList;}

        private Integer newsIdSt;

        private Integer newsIdEd;

        public Integer getNewsIdSt(){return this.newsIdSt;}

        public Integer getNewsIdEd(){return this.newsIdEd;}

        private List<String> titleList;

        public List<String> getTitleList(){return this.titleList;}


        private List<String> fuzzyTitle;

        public List<String> getFuzzyTitle(){return this.fuzzyTitle;}

        private List<String> rightFuzzyTitle;

        public List<String> getRightFuzzyTitle(){return this.rightFuzzyTitle;}
        private List<String> contentList;

        public List<String> getContentList(){return this.contentList;}


        private List<String> fuzzyContent;

        public List<String> getFuzzyContent(){return this.fuzzyContent;}

        private List<String> rightFuzzyContent;

        public List<String> getRightFuzzyContent(){return this.rightFuzzyContent;}
        private List<java.time.LocalDateTime> createTimeList;

        public List<java.time.LocalDateTime> getCreateTimeList(){return this.createTimeList;}

        private java.time.LocalDateTime createTimeSt;

        private java.time.LocalDateTime createTimeEd;

        public java.time.LocalDateTime getCreateTimeSt(){return this.createTimeSt;}

        public java.time.LocalDateTime getCreateTimeEd(){return this.createTimeEd;}

        private List<java.time.LocalDateTime> updateTimeList;

        public List<java.time.LocalDateTime> getUpdateTimeList(){return this.updateTimeList;}

        private java.time.LocalDateTime updateTimeSt;

        private java.time.LocalDateTime updateTimeEd;

        public java.time.LocalDateTime getUpdateTimeSt(){return this.updateTimeSt;}

        public java.time.LocalDateTime getUpdateTimeEd(){return this.updateTimeEd;}

        private List<Integer> newsTypeList;

        public List<Integer> getNewsTypeList(){return this.newsTypeList;}

        private Integer newsTypeSt;

        private Integer newsTypeEd;

        public Integer getNewsTypeSt(){return this.newsTypeSt;}

        public Integer getNewsTypeEd(){return this.newsTypeEd;}

        private List<String> profileUrlList;

        public List<String> getProfileUrlList(){return this.profileUrlList;}


        private List<String> fuzzyProfileUrl;

        public List<String> getFuzzyProfileUrl(){return this.fuzzyProfileUrl;}

        private List<String> rightFuzzyProfileUrl;

        public List<String> getRightFuzzyProfileUrl(){return this.rightFuzzyProfileUrl;}
        private List<String> editorNameList;

        public List<String> getEditorNameList(){return this.editorNameList;}


        private List<String> fuzzyEditorName;

        public List<String> getFuzzyEditorName(){return this.fuzzyEditorName;}

        private List<String> rightFuzzyEditorName;

        public List<String> getRightFuzzyEditorName(){return this.rightFuzzyEditorName;}
        private List<String> locationList;

        public List<String> getLocationList(){return this.locationList;}


        private List<String> fuzzyLocation;

        public List<String> getFuzzyLocation(){return this.fuzzyLocation;}

        private List<String> rightFuzzyLocation;

        public List<String> getRightFuzzyLocation(){return this.rightFuzzyLocation;}
        private List<java.time.LocalDateTime> startDateList;

        public List<java.time.LocalDateTime> getStartDateList(){return this.startDateList;}

        private java.time.LocalDateTime startDateSt;

        private java.time.LocalDateTime startDateEd;

        public java.time.LocalDateTime getStartDateSt(){return this.startDateSt;}

        public java.time.LocalDateTime getStartDateEd(){return this.startDateEd;}

        private List<java.time.LocalDateTime> endDateList;

        public List<java.time.LocalDateTime> getEndDateList(){return this.endDateList;}

        private java.time.LocalDateTime endDateSt;

        private java.time.LocalDateTime endDateEd;

        public java.time.LocalDateTime getEndDateSt(){return this.endDateSt;}

        public java.time.LocalDateTime getEndDateEd(){return this.endDateEd;}


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

        public ConditionBuilder createTimeBetWeen(java.time.LocalDateTime createTimeSt,java.time.LocalDateTime createTimeEd){
            this.createTimeSt = createTimeSt;
            this.createTimeEd = createTimeEd;
            return this;
        }

        public ConditionBuilder createTimeGreaterEqThan(java.time.LocalDateTime createTimeSt){
            this.createTimeSt = createTimeSt;
            return this;
        }
        public ConditionBuilder createTimeLessEqThan(java.time.LocalDateTime createTimeEd){
            this.createTimeEd = createTimeEd;
            return this;
        }


        public ConditionBuilder createTimeList(java.time.LocalDateTime ... createTime){
            this.createTimeList = solveNullList(createTime);
            return this;
        }

        public ConditionBuilder createTimeList(List<java.time.LocalDateTime> createTime){
            this.createTimeList = createTime;
            return this;
        }

        public ConditionBuilder updateTimeBetWeen(java.time.LocalDateTime updateTimeSt,java.time.LocalDateTime updateTimeEd){
            this.updateTimeSt = updateTimeSt;
            this.updateTimeEd = updateTimeEd;
            return this;
        }

        public ConditionBuilder updateTimeGreaterEqThan(java.time.LocalDateTime updateTimeSt){
            this.updateTimeSt = updateTimeSt;
            return this;
        }
        public ConditionBuilder updateTimeLessEqThan(java.time.LocalDateTime updateTimeEd){
            this.updateTimeEd = updateTimeEd;
            return this;
        }


        public ConditionBuilder updateTimeList(java.time.LocalDateTime ... updateTime){
            this.updateTimeList = solveNullList(updateTime);
            return this;
        }

        public ConditionBuilder updateTimeList(List<java.time.LocalDateTime> updateTime){
            this.updateTimeList = updateTime;
            return this;
        }

        public ConditionBuilder newsTypeBetWeen(Integer newsTypeSt,Integer newsTypeEd){
            this.newsTypeSt = newsTypeSt;
            this.newsTypeEd = newsTypeEd;
            return this;
        }

        public ConditionBuilder newsTypeGreaterEqThan(Integer newsTypeSt){
            this.newsTypeSt = newsTypeSt;
            return this;
        }
        public ConditionBuilder newsTypeLessEqThan(Integer newsTypeEd){
            this.newsTypeEd = newsTypeEd;
            return this;
        }


        public ConditionBuilder newsTypeList(Integer ... newsType){
            this.newsTypeList = solveNullList(newsType);
            return this;
        }

        public ConditionBuilder newsTypeList(List<Integer> newsType){
            this.newsTypeList = newsType;
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

        public ConditionBuilder fuzzyEditorName (List<String> fuzzyEditorName){
            this.fuzzyEditorName = fuzzyEditorName;
            return this;
        }

        public ConditionBuilder fuzzyEditorName (String ... fuzzyEditorName){
            this.fuzzyEditorName = solveNullList(fuzzyEditorName);
            return this;
        }

        public ConditionBuilder rightFuzzyEditorName (List<String> rightFuzzyEditorName){
            this.rightFuzzyEditorName = rightFuzzyEditorName;
            return this;
        }

        public ConditionBuilder rightFuzzyEditorName (String ... rightFuzzyEditorName){
            this.rightFuzzyEditorName = solveNullList(rightFuzzyEditorName);
            return this;
        }

        public ConditionBuilder editorNameList(String ... editorName){
            this.editorNameList = solveNullList(editorName);
            return this;
        }

        public ConditionBuilder editorNameList(List<String> editorName){
            this.editorNameList = editorName;
            return this;
        }

        public ConditionBuilder fuzzyLocation (List<String> fuzzyLocation){
            this.fuzzyLocation = fuzzyLocation;
            return this;
        }

        public ConditionBuilder fuzzyLocation (String ... fuzzyLocation){
            this.fuzzyLocation = solveNullList(fuzzyLocation);
            return this;
        }

        public ConditionBuilder rightFuzzyLocation (List<String> rightFuzzyLocation){
            this.rightFuzzyLocation = rightFuzzyLocation;
            return this;
        }

        public ConditionBuilder rightFuzzyLocation (String ... rightFuzzyLocation){
            this.rightFuzzyLocation = solveNullList(rightFuzzyLocation);
            return this;
        }

        public ConditionBuilder locationList(String ... location){
            this.locationList = solveNullList(location);
            return this;
        }

        public ConditionBuilder locationList(List<String> location){
            this.locationList = location;
            return this;
        }

        public ConditionBuilder startDateBetWeen(java.time.LocalDateTime startDateSt,java.time.LocalDateTime startDateEd){
            this.startDateSt = startDateSt;
            this.startDateEd = startDateEd;
            return this;
        }

        public ConditionBuilder startDateGreaterEqThan(java.time.LocalDateTime startDateSt){
            this.startDateSt = startDateSt;
            return this;
        }
        public ConditionBuilder startDateLessEqThan(java.time.LocalDateTime startDateEd){
            this.startDateEd = startDateEd;
            return this;
        }


        public ConditionBuilder startDateList(java.time.LocalDateTime ... startDate){
            this.startDateList = solveNullList(startDate);
            return this;
        }

        public ConditionBuilder startDateList(List<java.time.LocalDateTime> startDate){
            this.startDateList = startDate;
            return this;
        }

        public ConditionBuilder endDateBetWeen(java.time.LocalDateTime endDateSt,java.time.LocalDateTime endDateEd){
            this.endDateSt = endDateSt;
            this.endDateEd = endDateEd;
            return this;
        }

        public ConditionBuilder endDateGreaterEqThan(java.time.LocalDateTime endDateSt){
            this.endDateSt = endDateSt;
            return this;
        }
        public ConditionBuilder endDateLessEqThan(java.time.LocalDateTime endDateEd){
            this.endDateEd = endDateEd;
            return this;
        }


        public ConditionBuilder endDateList(java.time.LocalDateTime ... endDate){
            this.endDateList = solveNullList(endDate);
            return this;
        }

        public ConditionBuilder endDateList(List<java.time.LocalDateTime> endDate){
            this.endDateList = endDate;
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

        private News obj;

        public Builder(){
            this.obj = new News();
        }

        public Builder newsId(Integer newsId){
            this.obj.setNewsId(newsId);
            return this;
        }
        public Builder title(String title){
            this.obj.setTitle(title);
            return this;
        }
        public Builder content(String content){
            this.obj.setContent(content);
            return this;
        }
        public Builder createTime(java.time.LocalDateTime createTime){
            this.obj.setCreateTime(createTime);
            return this;
        }
        public Builder updateTime(java.time.LocalDateTime updateTime){
            this.obj.setUpdateTime(updateTime);
            return this;
        }
        public Builder newsType(Integer newsType){
            this.obj.setNewsType(newsType);
            return this;
        }
        public Builder profileUrl(String profileUrl){
            this.obj.setProfileUrl(profileUrl);
            return this;
        }
        public Builder editorName(String editorName){
            this.obj.setEditorName(editorName);
            return this;
        }
        public Builder location(String location){
            this.obj.setLocation(location);
            return this;
        }
        public Builder startDate(java.time.LocalDateTime startDate){
            this.obj.setStartDate(startDate);
            return this;
        }
        public Builder endDate(java.time.LocalDateTime endDate){
            this.obj.setEndDate(endDate);
            return this;
        }
        public News build(){return obj;}
    }

}
