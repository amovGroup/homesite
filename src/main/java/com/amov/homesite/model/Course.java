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
public class Course implements Serializable {

    private static final long serialVersionUID = 1546593690491L;


    /**
    * 主键
    * 课程主键
    * isNullAble:0
    */
    private Integer courseId;

    /**
    * 价格
    * isNullAble:1,defaultVal:0
    */
    private Integer price;

    /**
    * 课程标题
    * isNullAble:1
    */
    private String title;

    /**
    * 课程分类
    * isNullAble:1
    */
    private String classify;

    /**
    * 课程难度，0:未知 1:初级 2:中级 3:高级
    * isNullAble:1,defaultVal:0
    */
    private Integer difficulty;

    /**
    * 额外索命，比如 （包含开发环境）
    * isNullAble:1
    */
    private String extraIntro;

    /**
    * 课程url
    * isNullAble:1
    */
    private String profileUrl;

    /**
    * 是否是最新课程
    * isNullAble:1,defaultVal:0
    */
    private Integer isTheLatest;


    public void setCourseId(Integer courseId){this.courseId = courseId;}

    public Integer getCourseId(){return this.courseId;}

    public void setPrice(Integer price){this.price = price;}

    public Integer getPrice(){return this.price;}

    public void setTitle(String title){this.title = title;}

    public String getTitle(){return this.title;}

    public void setClassify(String classify){this.classify = classify;}

    public String getClassify(){return this.classify;}

    public void setDifficulty(Integer difficulty){this.difficulty = difficulty;}

    public Integer getDifficulty(){return this.difficulty;}

    public void setExtraIntro(String extraIntro){this.extraIntro = extraIntro;}

    public String getExtraIntro(){return this.extraIntro;}

    public void setProfileUrl(String profileUrl){this.profileUrl = profileUrl;}

    public String getProfileUrl(){return this.profileUrl;}

    public void setIsTheLatest(Integer isTheLatest){this.isTheLatest = isTheLatest;}

    public Integer getIsTheLatest(){return this.isTheLatest;}
    @Override
    public String toString() {
        return "Course{" +
                "courseId='" + courseId + '\'' +
                "price='" + price + '\'' +
                "title='" + title + '\'' +
                "classify='" + classify + '\'' +
                "difficulty='" + difficulty + '\'' +
                "extraIntro='" + extraIntro + '\'' +
                "profileUrl='" + profileUrl + '\'' +
                "isTheLatest='" + isTheLatest + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private Course set;

        private ConditionBuilder where;

        public UpdateBuilder set(Course set){
            this.set = set;
            return this;
        }

        public Course getSet(){
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

    public static class QueryBuilder extends Course{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> courseIdList;

        public List<Integer> getCourseIdList(){return this.courseIdList;}

        private Integer courseIdSt;

        private Integer courseIdEd;

        public Integer getCourseIdSt(){return this.courseIdSt;}

        public Integer getCourseIdEd(){return this.courseIdEd;}

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
        private List<String> classifyList;

        public List<String> getClassifyList(){return this.classifyList;}


        private List<String> fuzzyClassify;

        public List<String> getFuzzyClassify(){return this.fuzzyClassify;}

        private List<String> rightFuzzyClassify;

        public List<String> getRightFuzzyClassify(){return this.rightFuzzyClassify;}
        private List<Integer> difficultyList;

        public List<Integer> getDifficultyList(){return this.difficultyList;}

        private Integer difficultySt;

        private Integer difficultyEd;

        public Integer getDifficultySt(){return this.difficultySt;}

        public Integer getDifficultyEd(){return this.difficultyEd;}

        private List<String> extraIntroList;

        public List<String> getExtraIntroList(){return this.extraIntroList;}


        private List<String> fuzzyExtraIntro;

        public List<String> getFuzzyExtraIntro(){return this.fuzzyExtraIntro;}

        private List<String> rightFuzzyExtraIntro;

        public List<String> getRightFuzzyExtraIntro(){return this.rightFuzzyExtraIntro;}
        private List<String> profileUrlList;

        public List<String> getProfileUrlList(){return this.profileUrlList;}


        private List<String> fuzzyProfileUrl;

        public List<String> getFuzzyProfileUrl(){return this.fuzzyProfileUrl;}

        private List<String> rightFuzzyProfileUrl;

        public List<String> getRightFuzzyProfileUrl(){return this.rightFuzzyProfileUrl;}
        private List<Integer> isTheLatestList;

        public List<Integer> getIsTheLatestList(){return this.isTheLatestList;}

        private Integer isTheLatestSt;

        private Integer isTheLatestEd;

        public Integer getIsTheLatestSt(){return this.isTheLatestSt;}

        public Integer getIsTheLatestEd(){return this.isTheLatestEd;}

        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
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

        public QueryBuilder fuzzyClassify (List<String> fuzzyClassify){
            this.fuzzyClassify = fuzzyClassify;
            return this;
        }

        public QueryBuilder fuzzyClassify (String ... fuzzyClassify){
            this.fuzzyClassify = solveNullList(fuzzyClassify);
            return this;
        }

        public QueryBuilder rightFuzzyClassify (List<String> rightFuzzyClassify){
            this.rightFuzzyClassify = rightFuzzyClassify;
            return this;
        }

        public QueryBuilder rightFuzzyClassify (String ... rightFuzzyClassify){
            this.rightFuzzyClassify = solveNullList(rightFuzzyClassify);
            return this;
        }

        public QueryBuilder classify(String classify){
            setClassify(classify);
            return this;
        }

        public QueryBuilder classifyList(String ... classify){
            this.classifyList = solveNullList(classify);
            return this;
        }

        public QueryBuilder classifyList(List<String> classify){
            this.classifyList = classify;
            return this;
        }

        public QueryBuilder fetchClassify(){
            setFetchFields("fetchFields","classify");
            return this;
        }

        public QueryBuilder excludeClassify(){
            setFetchFields("excludeFields","classify");
            return this;
        }

        public QueryBuilder difficultyBetWeen(Integer difficultySt,Integer difficultyEd){
            this.difficultySt = difficultySt;
            this.difficultyEd = difficultyEd;
            return this;
        }

        public QueryBuilder difficultyGreaterEqThan(Integer difficultySt){
            this.difficultySt = difficultySt;
            return this;
        }
        public QueryBuilder difficultyLessEqThan(Integer difficultyEd){
            this.difficultyEd = difficultyEd;
            return this;
        }


        public QueryBuilder difficulty(Integer difficulty){
            setDifficulty(difficulty);
            return this;
        }

        public QueryBuilder difficultyList(Integer ... difficulty){
            this.difficultyList = solveNullList(difficulty);
            return this;
        }

        public QueryBuilder difficultyList(List<Integer> difficulty){
            this.difficultyList = difficulty;
            return this;
        }

        public QueryBuilder fetchDifficulty(){
            setFetchFields("fetchFields","difficulty");
            return this;
        }

        public QueryBuilder excludeDifficulty(){
            setFetchFields("excludeFields","difficulty");
            return this;
        }

        public QueryBuilder fuzzyExtraIntro (List<String> fuzzyExtraIntro){
            this.fuzzyExtraIntro = fuzzyExtraIntro;
            return this;
        }

        public QueryBuilder fuzzyExtraIntro (String ... fuzzyExtraIntro){
            this.fuzzyExtraIntro = solveNullList(fuzzyExtraIntro);
            return this;
        }

        public QueryBuilder rightFuzzyExtraIntro (List<String> rightFuzzyExtraIntro){
            this.rightFuzzyExtraIntro = rightFuzzyExtraIntro;
            return this;
        }

        public QueryBuilder rightFuzzyExtraIntro (String ... rightFuzzyExtraIntro){
            this.rightFuzzyExtraIntro = solveNullList(rightFuzzyExtraIntro);
            return this;
        }

        public QueryBuilder extraIntro(String extraIntro){
            setExtraIntro(extraIntro);
            return this;
        }

        public QueryBuilder extraIntroList(String ... extraIntro){
            this.extraIntroList = solveNullList(extraIntro);
            return this;
        }

        public QueryBuilder extraIntroList(List<String> extraIntro){
            this.extraIntroList = extraIntro;
            return this;
        }

        public QueryBuilder fetchExtraIntro(){
            setFetchFields("fetchFields","extraIntro");
            return this;
        }

        public QueryBuilder excludeExtraIntro(){
            setFetchFields("excludeFields","extraIntro");
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

        public QueryBuilder isTheLatestBetWeen(Integer isTheLatestSt,Integer isTheLatestEd){
            this.isTheLatestSt = isTheLatestSt;
            this.isTheLatestEd = isTheLatestEd;
            return this;
        }

        public QueryBuilder isTheLatestGreaterEqThan(Integer isTheLatestSt){
            this.isTheLatestSt = isTheLatestSt;
            return this;
        }
        public QueryBuilder isTheLatestLessEqThan(Integer isTheLatestEd){
            this.isTheLatestEd = isTheLatestEd;
            return this;
        }


        public QueryBuilder isTheLatest(Integer isTheLatest){
            setIsTheLatest(isTheLatest);
            return this;
        }

        public QueryBuilder isTheLatestList(Integer ... isTheLatest){
            this.isTheLatestList = solveNullList(isTheLatest);
            return this;
        }

        public QueryBuilder isTheLatestList(List<Integer> isTheLatest){
            this.isTheLatestList = isTheLatest;
            return this;
        }

        public QueryBuilder fetchIsTheLatest(){
            setFetchFields("fetchFields","isTheLatest");
            return this;
        }

        public QueryBuilder excludeIsTheLatest(){
            setFetchFields("excludeFields","isTheLatest");
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

        public Course build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> courseIdList;

        public List<Integer> getCourseIdList(){return this.courseIdList;}

        private Integer courseIdSt;

        private Integer courseIdEd;

        public Integer getCourseIdSt(){return this.courseIdSt;}

        public Integer getCourseIdEd(){return this.courseIdEd;}

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
        private List<String> classifyList;

        public List<String> getClassifyList(){return this.classifyList;}


        private List<String> fuzzyClassify;

        public List<String> getFuzzyClassify(){return this.fuzzyClassify;}

        private List<String> rightFuzzyClassify;

        public List<String> getRightFuzzyClassify(){return this.rightFuzzyClassify;}
        private List<Integer> difficultyList;

        public List<Integer> getDifficultyList(){return this.difficultyList;}

        private Integer difficultySt;

        private Integer difficultyEd;

        public Integer getDifficultySt(){return this.difficultySt;}

        public Integer getDifficultyEd(){return this.difficultyEd;}

        private List<String> extraIntroList;

        public List<String> getExtraIntroList(){return this.extraIntroList;}


        private List<String> fuzzyExtraIntro;

        public List<String> getFuzzyExtraIntro(){return this.fuzzyExtraIntro;}

        private List<String> rightFuzzyExtraIntro;

        public List<String> getRightFuzzyExtraIntro(){return this.rightFuzzyExtraIntro;}
        private List<String> profileUrlList;

        public List<String> getProfileUrlList(){return this.profileUrlList;}


        private List<String> fuzzyProfileUrl;

        public List<String> getFuzzyProfileUrl(){return this.fuzzyProfileUrl;}

        private List<String> rightFuzzyProfileUrl;

        public List<String> getRightFuzzyProfileUrl(){return this.rightFuzzyProfileUrl;}
        private List<Integer> isTheLatestList;

        public List<Integer> getIsTheLatestList(){return this.isTheLatestList;}

        private Integer isTheLatestSt;

        private Integer isTheLatestEd;

        public Integer getIsTheLatestSt(){return this.isTheLatestSt;}

        public Integer getIsTheLatestEd(){return this.isTheLatestEd;}


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

        public ConditionBuilder fuzzyClassify (List<String> fuzzyClassify){
            this.fuzzyClassify = fuzzyClassify;
            return this;
        }

        public ConditionBuilder fuzzyClassify (String ... fuzzyClassify){
            this.fuzzyClassify = solveNullList(fuzzyClassify);
            return this;
        }

        public ConditionBuilder rightFuzzyClassify (List<String> rightFuzzyClassify){
            this.rightFuzzyClassify = rightFuzzyClassify;
            return this;
        }

        public ConditionBuilder rightFuzzyClassify (String ... rightFuzzyClassify){
            this.rightFuzzyClassify = solveNullList(rightFuzzyClassify);
            return this;
        }

        public ConditionBuilder classifyList(String ... classify){
            this.classifyList = solveNullList(classify);
            return this;
        }

        public ConditionBuilder classifyList(List<String> classify){
            this.classifyList = classify;
            return this;
        }

        public ConditionBuilder difficultyBetWeen(Integer difficultySt,Integer difficultyEd){
            this.difficultySt = difficultySt;
            this.difficultyEd = difficultyEd;
            return this;
        }

        public ConditionBuilder difficultyGreaterEqThan(Integer difficultySt){
            this.difficultySt = difficultySt;
            return this;
        }
        public ConditionBuilder difficultyLessEqThan(Integer difficultyEd){
            this.difficultyEd = difficultyEd;
            return this;
        }


        public ConditionBuilder difficultyList(Integer ... difficulty){
            this.difficultyList = solveNullList(difficulty);
            return this;
        }

        public ConditionBuilder difficultyList(List<Integer> difficulty){
            this.difficultyList = difficulty;
            return this;
        }

        public ConditionBuilder fuzzyExtraIntro (List<String> fuzzyExtraIntro){
            this.fuzzyExtraIntro = fuzzyExtraIntro;
            return this;
        }

        public ConditionBuilder fuzzyExtraIntro (String ... fuzzyExtraIntro){
            this.fuzzyExtraIntro = solveNullList(fuzzyExtraIntro);
            return this;
        }

        public ConditionBuilder rightFuzzyExtraIntro (List<String> rightFuzzyExtraIntro){
            this.rightFuzzyExtraIntro = rightFuzzyExtraIntro;
            return this;
        }

        public ConditionBuilder rightFuzzyExtraIntro (String ... rightFuzzyExtraIntro){
            this.rightFuzzyExtraIntro = solveNullList(rightFuzzyExtraIntro);
            return this;
        }

        public ConditionBuilder extraIntroList(String ... extraIntro){
            this.extraIntroList = solveNullList(extraIntro);
            return this;
        }

        public ConditionBuilder extraIntroList(List<String> extraIntro){
            this.extraIntroList = extraIntro;
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

        public ConditionBuilder isTheLatestBetWeen(Integer isTheLatestSt,Integer isTheLatestEd){
            this.isTheLatestSt = isTheLatestSt;
            this.isTheLatestEd = isTheLatestEd;
            return this;
        }

        public ConditionBuilder isTheLatestGreaterEqThan(Integer isTheLatestSt){
            this.isTheLatestSt = isTheLatestSt;
            return this;
        }
        public ConditionBuilder isTheLatestLessEqThan(Integer isTheLatestEd){
            this.isTheLatestEd = isTheLatestEd;
            return this;
        }


        public ConditionBuilder isTheLatestList(Integer ... isTheLatest){
            this.isTheLatestList = solveNullList(isTheLatest);
            return this;
        }

        public ConditionBuilder isTheLatestList(List<Integer> isTheLatest){
            this.isTheLatestList = isTheLatest;
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

        private Course obj;

        public Builder(){
            this.obj = new Course();
        }

        public Builder courseId(Integer courseId){
            this.obj.setCourseId(courseId);
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
        public Builder classify(String classify){
            this.obj.setClassify(classify);
            return this;
        }
        public Builder difficulty(Integer difficulty){
            this.obj.setDifficulty(difficulty);
            return this;
        }
        public Builder extraIntro(String extraIntro){
            this.obj.setExtraIntro(extraIntro);
            return this;
        }
        public Builder profileUrl(String profileUrl){
            this.obj.setProfileUrl(profileUrl);
            return this;
        }
        public Builder isTheLatest(Integer isTheLatest){
            this.obj.setIsTheLatest(isTheLatest);
            return this;
        }
        public Course build(){return obj;}
    }

}
