package test.qxc.com.myapp.module.bean;

import java.util.List;

import test.qxc.com.mylibrary.net.ResponseBean;

/**
 * 类的用途:
 *
 * @author: qinxiaochuan
 * @date: 2017/1/6.
 */

public class TVBean extends ResponseBean {

    private String icon;
    private int pageCount;
    private int page;
    private int size;
    private int total;
    private List<DataBean> data;

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * nick : 菠萝焕
         * avatar : http://image.quanmin.tv/avatar/bd467e24f36279cee3410ab0a706ccc1png?imageView2/2/w/300/
         * follow : 64863
         * uid : 1980174
         * play_at : 2017-01-06 13:37:23
         * screen : 0
         * views : 0
         * intro : 符文天赋歌单在新浪微博:小焕亚索
         * maxViews : 109539
         * videoQuality : 3
         * thumb : http://snap.quanmin.tv/1980174-1483690733-749.jpg?imageView2/2/w/390/
         * position :
         * announcement : 直播时间下午1点到晚上7点周日休息
         * id : 100593
         * video : http://thumb.quanmin.tv/1980174.mp4?t=1483690500
         * slug :
         * category_id : 1
         * cover : 1980174-1483531842-672.jpg
         * status : 2
         * recommend_image :
         * weight : 0
         * start_time : 2017-01-06 14:01:33
         * check : 1
         * category_name : 英雄联盟
         * title : 亚索SOLO赢一把5000点卷我需要对手
         * maxOnline : 3335
         * last_play_at :
         * landscape : 1
         * view : 99379
         * app_shuffling_image : http://image.quanmin.tv/3b87905359d4a53e217df6b3a04eadb1jpg
         * categoryId : 1
         * hidden : false
         * play_status : true
         * love_cover : http://image.quanmin.tv/love/cae93b56b5aeca2b26eca230336b2f94jpg
         * love : http://a.img.shouyin.tv/7YQS101
         */

        private String nick;
        private String avatar;
        private int follow;
        private String uid;
        private String play_at;
        private int screen;
        private String views;
        private String intro;
        private String maxViews;
        private String videoQuality;
        private String thumb;
        private String position;
        private String announcement;
        private String id;
        private String video;
        private String slug;
        private String category_id;
        private String cover;
        private String status;
        private String recommend_image;
        private String weight;
        private String start_time;
        private String check;
        private String category_name;
        private String title;
        private String maxOnline;
        private String last_play_at;
        private String landscape;
        private String view;
        private String app_shuffling_image;
        private String categoryId;
        private boolean hidden;
        private boolean play_status;
        private String love_cover;
        private String love;

        public String getNick() {
            return nick;
        }

        public void setNick(String nick) {
            this.nick = nick;
        }

        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        public int getFollow() {
            return follow;
        }

        public void setFollow(int follow) {
            this.follow = follow;
        }

        public String getUid() {
            return uid;
        }

        public void setUid(String uid) {
            this.uid = uid;
        }

        public String getPlay_at() {
            return play_at;
        }

        public void setPlay_at(String play_at) {
            this.play_at = play_at;
        }

        public int getScreen() {
            return screen;
        }

        public void setScreen(int screen) {
            this.screen = screen;
        }

        public String getViews() {
            return views;
        }

        public void setViews(String views) {
            this.views = views;
        }

        public String getIntro() {
            return intro;
        }

        public void setIntro(String intro) {
            this.intro = intro;
        }

        public String getMaxViews() {
            return maxViews;
        }

        public void setMaxViews(String maxViews) {
            this.maxViews = maxViews;
        }

        public String getVideoQuality() {
            return videoQuality;
        }

        public void setVideoQuality(String videoQuality) {
            this.videoQuality = videoQuality;
        }

        public String getThumb() {
            return thumb;
        }

        public void setThumb(String thumb) {
            this.thumb = thumb;
        }

        public String getPosition() {
            return position;
        }

        public void setPosition(String position) {
            this.position = position;
        }

        public String getAnnouncement() {
            return announcement;
        }

        public void setAnnouncement(String announcement) {
            this.announcement = announcement;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getVideo() {
            return video;
        }

        public void setVideo(String video) {
            this.video = video;
        }

        public String getSlug() {
            return slug;
        }

        public void setSlug(String slug) {
            this.slug = slug;
        }

        public String getCategory_id() {
            return category_id;
        }

        public void setCategory_id(String category_id) {
            this.category_id = category_id;
        }

        public String getCover() {
            return cover;
        }

        public void setCover(String cover) {
            this.cover = cover;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getRecommend_image() {
            return recommend_image;
        }

        public void setRecommend_image(String recommend_image) {
            this.recommend_image = recommend_image;
        }

        public String getWeight() {
            return weight;
        }

        public void setWeight(String weight) {
            this.weight = weight;
        }

        public String getStart_time() {
            return start_time;
        }

        public void setStart_time(String start_time) {
            this.start_time = start_time;
        }

        public String getCheck() {
            return check;
        }

        public void setCheck(String check) {
            this.check = check;
        }

        public String getCategory_name() {
            return category_name;
        }

        public void setCategory_name(String category_name) {
            this.category_name = category_name;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getMaxOnline() {
            return maxOnline;
        }

        public void setMaxOnline(String maxOnline) {
            this.maxOnline = maxOnline;
        }

        public String getLast_play_at() {
            return last_play_at;
        }

        public void setLast_play_at(String last_play_at) {
            this.last_play_at = last_play_at;
        }

        public String getLandscape() {
            return landscape;
        }

        public void setLandscape(String landscape) {
            this.landscape = landscape;
        }

        public String getView() {
            return view;
        }

        public void setView(String view) {
            this.view = view;
        }

        public String getApp_shuffling_image() {
            return app_shuffling_image;
        }

        public void setApp_shuffling_image(String app_shuffling_image) {
            this.app_shuffling_image = app_shuffling_image;
        }

        public String getCategoryId() {
            return categoryId;
        }

        public void setCategoryId(String categoryId) {
            this.categoryId = categoryId;
        }

        public boolean isHidden() {
            return hidden;
        }

        public void setHidden(boolean hidden) {
            this.hidden = hidden;
        }

        public boolean isPlay_status() {
            return play_status;
        }

        public void setPlay_status(boolean play_status) {
            this.play_status = play_status;
        }

        public String getLove_cover() {
            return love_cover;
        }

        public void setLove_cover(String love_cover) {
            this.love_cover = love_cover;
        }

        public String getLove() {
            return love;
        }

        public void setLove(String love) {
            this.love = love;
        }
    }
}
