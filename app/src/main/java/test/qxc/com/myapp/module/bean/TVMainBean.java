package test.qxc.com.myapp.module.bean;

import java.util.List;

import test.qxc.com.mylibrary.net.ResponseBean;

/**
 * 类的用途:
 *
 * @author: qinxiaochuan
 * @date: 2017/1/10.
 */

public class TVMainBean extends ResponseBean {
    public List<?> ad;
    public List<RoomBean> room;

    public static class RoomBean {
        /**
         * category_more :
         * icon :
         * id : 0
         * is_default : 1
         * list : [{"anniversary":1,"avatar":"http://image.quanmin.tv/avatar/51439b9f13fb31c21ba0654bc9a81607jpg?imageView2/2/w/300/","beauty_cover":"","category_id":29,"category_name":"颜值控","category_slug":"love","check":true,"coin":0,"create_at":"2017-01-04 18:07:03","first_play_at":"2016-10-31 22:06:02","follow":3351,"grade":0,"icontext":"","is_shield":false,"last_end_at":"2016-10-31 22:06:02","last_play_at":"2017-01-04 18:05:05","last_thumb":"http://image.quanmin.tv/love/d7d4baad5fe7653ff96069a805fa2546jpg?imageView2/2/w/500/","level":0,"like":24345,"link":"http://www.quanmin.tv/v/8505661","love_cover":"http://image.quanmin.tv/love/b34ae764d24c597e1eb017ad17df06b5jpg","max_view":436,"nick":"大脸爱吃鱼","play_count":84,"play_status":true,"play_true":76,"screen":1,"slug":"","status":1,"thumb":"http://image.quanmin.tv/love/b34ae764d24c597e1eb017ad17df06b5jpg?imageView2/2/w/500/","title":"事到如今，我还是\u2026\u2026","uid":8505661,"video":"http://thumb.quanmin.tv/8505661.mp4?t=1483529400","view":"10542","weight":520},{"anniversary":0,"avatar":"http://image.quanmin.tv/avatar/82fb0b0cea787de216316103fca323bcjpg?imageView2/2/w/300/","beauty_cover":"","category_id":24,"category_name":"NBA2K","category_slug":"nba2k","check":true,"coin":36048,"create_at":"2017-01-04 17:07:38","first_play_at":"2016-12-20 21:16:50","follow":428,"grade":0,"icontext":"","is_shield":false,"last_end_at":"2016-12-20 21:16:50","last_play_at":"2017-01-03 15:13:50","last_thumb":"4128733-1483453083-832.jpg","level":0,"like":0,"link":"http://www.quanmin.tv/v/tuitui","love_cover":"","max_view":564,"nick":"全民TV丶腿腿","play_count":3,"play_status":true,"play_true":602,"screen":0,"slug":"tuitui","status":1,"thumb":"http://snap.quanmin.tv/4128733-1483529523-235.jpg?imageView2/2/w/390/","title":"SS麦基走一走","uid":4128733,"video":"http://thumb.quanmin.tv/4128733.mp4?t=1483529400","view":"50701","weight":74000},{"anniversary":7,"avatar":"http://image.quanmin.tv/avatar/bbaeab0e91b6ed845c0937e024bbd1b9?imageView2/2/w/300/","beauty_cover":"","category_id":3,"category_name":"炉石传说","category_slug":"heartstone","check":true,"coin":540261,"create_at":"2017-01-04 15:05:43","first_play_at":"2016-04-16 12:58:17","follow":12207,"grade":0,"icontext":"","is_shield":false,"last_end_at":"2016-04-16 12:58:17","last_play_at":"2017-01-03 15:08:09","last_thumb":"1912022-1483453145-139.jpg","level":0,"like":1,"link":"http://www.quanmin.tv/v/ged520","love_cover":"","max_view":11775,"nick":"咆哮古尔丹","play_count":293,"play_status":true,"play_true":1062,"screen":0,"slug":"ged520","status":1,"thumb":"http://snap.quanmin.tv/1912022-1483529524-270.jpg?imageView2/2/w/390/","title":"新年快乐竞技场走一走目标全针教","uid":1912022,"video":"http://thumb.quanmin.tv/1912022.mp4?t=1483529400","view":"105968","weight":25948220},{"anniversary":7,"avatar":"http://image.quanmin.tv/avatar/3fa68f1ed6ae23dc9c6007a56912d379jpg?imageView2/2/w/300/","beauty_cover":"","category_id":3,"category_name":"炉石传说","category_slug":"heartstone","check":true,"coin":2882593,"create_at":"2017-01-04 19:16:02","first_play_at":"2016-05-06 19:01:15","follow":201314,"grade":0,"icontext":"","is_shield":false,"last_end_at":"2016-05-06 19:01:15","last_play_at":"2017-01-03 19:14:17","last_thumb":"2821027-1483464541-814.jpg","level":0,"like":6,"link":"http://www.quanmin.tv/v/qiuri","love_cover":"","max_view":43818,"nick":"全民超人秋日丶","play_count":205,"play_status":true,"play_true":5458,"recommend_image":"http://image.quanmin.tv/8e3542b03109abed09dd868d6ef920c3jpg","screen":0,"slug":"qiuri","status":1,"thumb":"http://snap.quanmin.tv/2821027-1483529521-488.jpg?imageView2/2/w/390/","title":"日的直播间","uid":2821027,"video":"http://thumb.quanmin.tv/2821027.mp4?t=1483529400","view":"587530","weight":102314520},{"anniversary":5,"avatar":"http://image.quanmin.tv/avatar/70a37ce87dafaf0bec7628fd5d6a0c62?imageView2/2/w/300/","beauty_cover":"","category_id":1,"category_name":"英雄联盟","category_slug":"lol","check":true,"coin":1011826,"create_at":"2017-01-04 19:16:35","first_play_at":"2016-11-11 18:58:24","follow":177866,"grade":0,"icontext":"","is_shield":false,"last_end_at":"2016-11-11 18:58:24","last_play_at":"2017-01-01 19:13:16","last_thumb":"8832533-1483289020-151.jpg","level":0,"like":0,"link":"http://www.quanmin.tv/v/8832533","love_cover":"","max_view":56646,"nick":"阿怡丶全民","play_count":47,"play_status":true,"play_true":4092,"recommend_image":"http://image.quanmin.tv/68377681dd4e79a8292daaa3c4ee4b36jpg","screen":0,"slug":"","status":1,"thumb":"http://snap.quanmin.tv/8832533-1483529564-704.jpg?imageView2/2/w/390/","title":"阿怡：元旦快乐啊宝宝们","uid":8832533,"video":"http://thumb.quanmin.tv/8832533.mp4?t=1483529400","view":"505092","weight":37122280},{"anniversary":5,"avatar":"http://image.quanmin.tv/avatar/e45f22bf5fbc02f272b1be9de6ed73a6jpg?imageView2/2/w/300/","beauty_cover":"","category_id":1,"category_name":"英雄联盟","category_slug":"lol","check":true,"coin":1041760,"create_at":"2017-01-04 14:12:13","first_play_at":"2015-12-26 13:56:59","follow":279844,"grade":0,"icontext":"","is_shield":false,"last_end_at":"2015-12-26 13:56:59","last_play_at":"2017-01-03 22:26:58","last_thumb":"42416-1483453742-395.jpg","level":0,"like":3,"link":"http://www.quanmin.tv/v/42416","love_cover":"","max_view":38674,"nick":"全民TV蓝猫","play_count":355,"play_status":true,"play_true":15460,"recommend_image":"http://image.quanmin.tv/5789a982cc653069c6f284e983ccc8e8jpg","screen":0,"slug":"","status":1,"thumb":"http://snap.quanmin.tv/42416-1483529522-489.jpg?imageView2/2/w/390/","title":"蓝猫:国服最强盲僧    国服冲击前十！","uid":42416,"video":"http://thumb.quanmin.tv/42416.mp4?t=1483529400","view":"366525","weight":120611080}]
         * name : 精彩推荐
         * screen : 0
         * slug :
         * type : 1
         */

        public String category_more;
        public String icon;
        public int id;
        public int is_default;
        public String name;
        public int screen;
        public String slug;
        public int type;
        public List<ListBean> list;

        public static class ListBean {
            /**
             * anniversary : 1
             * avatar : http://image.quanmin.tv/avatar/51439b9f13fb31c21ba0654bc9a81607jpg?imageView2/2/w/300/
             * beauty_cover :
             * category_id : 29
             * category_name : 颜值控
             * category_slug : love
             * check : true
             * coin : 0
             * create_at : 2017-01-04 18:07:03
             * first_play_at : 2016-10-31 22:06:02
             * follow : 3351
             * grade : 0
             * icontext :
             * is_shield : false
             * last_end_at : 2016-10-31 22:06:02
             * last_play_at : 2017-01-04 18:05:05
             * last_thumb : http://image.quanmin.tv/love/d7d4baad5fe7653ff96069a805fa2546jpg?imageView2/2/w/500/
             * level : 0
             * like : 24345
             * link : http://www.quanmin.tv/v/8505661
             * love_cover : http://image.quanmin.tv/love/b34ae764d24c597e1eb017ad17df06b5jpg
             * max_view : 436
             * nick : 大脸爱吃鱼
             * play_count : 84
             * play_status : true
             * play_true : 76
             * screen : 1
             * slug :
             * status : 1
             * thumb : http://image.quanmin.tv/love/b34ae764d24c597e1eb017ad17df06b5jpg?imageView2/2/w/500/
             * title : 事到如今，我还是……
             * uid : 8505661
             * video : http://thumb.quanmin.tv/8505661.mp4?t=1483529400
             * view : 10542
             * weight : 520
             * recommend_image : http://image.quanmin.tv/8e3542b03109abed09dd868d6ef920c3jpg
             */

            public int anniversary;
            public String avatar;
            public String beauty_cover;
            public int category_id;
            public String category_name;
            public String category_slug;
            public boolean check;
            public int coin;
            public String create_at;
            public String first_play_at;
            public int follow;
            public int grade;
            public String icontext;
            public boolean is_shield;
            public String last_end_at;
            public String last_play_at;
            public String last_thumb;
            public int level;
            public int like;
            public String link;
            public String love_cover;
            public int max_view;
            public String nick;
            public int play_count;
            public boolean play_status;
            public int play_true;
            public int screen;
            public String slug;
            public int status;
            public String thumb;
            public String title;
            public int uid;
            public String video;
            public String view;
            public int weight;
            public String recommend_image;
        }
    }
}
